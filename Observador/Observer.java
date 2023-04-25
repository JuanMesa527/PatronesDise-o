/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observador;

/**
 *
 * @author Juan Camilo Mesa
 */
public class Observer {
    private int id;

    public Observer(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
    
    public void update() {
        System.out.println("La disponibilidad del libro cambio");
    }
    
}
