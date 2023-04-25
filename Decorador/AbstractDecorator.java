/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.DecoratorPattern;

/**
 *
 * @author Juan Camilo Mesa
 */
public class AbstractDecorator extends Component {

    protected Component componente;

    @Override
    public String doJob(String medio) {
        if (componente != null) {
            return componente.doJob(medio);
        }
        return "";
    }

    public void setComponente(Component componente) {
        this.componente = componente;
    }

}
