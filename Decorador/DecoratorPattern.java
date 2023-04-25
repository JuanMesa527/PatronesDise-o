/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.DecoratorPattern;

import java.util.Scanner;

/**
 *
 * @author Juan Camilo Mesa
 */
public class DecoratorPattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String medio = "";
        int opcion;
        
        while (true) {
            System.out.println("Ingrese una opcion\n"
                    + "1. enviar notificacion de devolucion\n"
                    + "2. salir");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    ConcreteComponent notificacion = new ConcreteComponent();
                    notificacion.doJob(medio);
                    System.out.println("seleccione el medio para la notificacion\n"
                            + "1. correo electronico\n"
                            + "2. sms\n"
                            + "3. whatsapp\n"
                            + "4. cancelar");
                    opcion = sc.nextInt();
                    switch (opcion) {
                        case 1:
                            System.out.println("ingrese el correo a notificar: ");
                            medio = sc.next();
                            ConcreteDecoratorEmail email = new ConcreteDecoratorEmail();
                            email.setComponente(notificacion);
                            System.out.println(email.doJob(medio));
                            break;
                        case 2:
                            System.out.println("ingrese el numero telefonico a notificar: ");
                            medio = sc.next();
                            ConcreteDecoratorSms sms = new ConcreteDecoratorSms();
                            sms.setComponente(notificacion);
                            System.out.println(sms.doJob(medio));
                            break;
                        case 3:
                            System.out.println("ingrese el numero telefonico asociado al whatsapp a notificar: ");
                            medio = sc.next();
                            ConcreteDecoratorWha wha = new ConcreteDecoratorWha();
                            wha.setComponente(notificacion);
                            System.out.println(wha.doJob(medio));
                            break;
                        case 4:
                            break;
                        default:
                            System.out.println("opcion no valida");
                    }
                    break;
                case 2:
                    System.exit(0);
                    break;
                default:
                    System.out.println("opcion no valida");
            }
        }
    }
}
