/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package observador;

import java.util.Scanner;

/**
 *
 * @author Juan Camilo Mesa
 */
public class ObserverEx {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Subject libro = new Subject();

        int opcion;
        int nObservadores=0;
        while (true) {
            System.out.println("ingrese una opcion:\n"
                    + "1. Registrar una reserva de algun libro\n"
                    + "2. Notificar devolucion de algun libro\n"
                    + "3. Eliminar una reserva");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    //Crear Observadores 
                    Observer reserva = new Observer(nObservadores++);
                    //Registrar un observador
                    System.out.println("Registrando una reserva de algun libro");
                    libro.register(reserva);
                    System.out.println("El numero de id de la reserva es: " + reserva.getId());
                    //Cambiar el estado de flag
                    System.out.println("Estado del libro: " + libro.getFlag());
                    libro.setFlag(false);
                    break;
                case 2:
                    //Cambiar al nuevo estado de flag
                    libro.setFlag(true);
                    System.out.println("Estado del libro actualizado: " + libro.getFlag());
                    break;
                case 3:
                    int id;
                    System.out.println("ingrese el id de la reserva a eliminar");
                    id=sc.nextInt();
                    libro.unregister(id);
                    break;
                default:
                    System.out.println("opcion no valida");
            }
        }
    }
}
