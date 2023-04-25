/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.DecoratorPattern;

/**
 *
 * @author Juan Camilo Mesa
 */
public class ConcreteComponent extends Component {

    @Override
    public String doJob(String medio) {
        return "Estimado usuario, nos comunicamos con usted mediante "+medio+" registrado con el fin de notificarle \n"
                + "que el dia de mañana vence el plazo del prestamo de su libro/revista y debe realizar la devolucion";
    }
}
