/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observador;

import java.util.ArrayList;

/**
 *
 * @author Juan Camilo Mesa
 */
public class Subject implements ISubject {

    //Declarar estructura para manejar suscriptores
    private ArrayList<Observer> observerList; 
    //Atributo con estado
    private boolean flag;
    
    public Subject(){
        observerList= new ArrayList<>();
        flag=false;
    }
    @Override
    public void register(Observer ob) {
        observerList.add(ob);
    }

    @Override
    public void unregister(int id) {
        for (int i = 0; i < observerList.size(); i++) {
            if(observerList.get(i).getId()==id)
                    observerList.remove(i);
        }
    }

    @Override
    public void notifyObservers() {
        for (int i = 0; i < observerList.size(); i++) {
            observerList.get(i).update();
        }
    }
    public boolean getFlag() {
        return flag;
    }
    public void setFlag(boolean flag) {
        //Indica que el estado del flag cambio
        this.flag = flag;
        //Notificar a observadores el cambio de estado
        notifyObservers();
    }
}
