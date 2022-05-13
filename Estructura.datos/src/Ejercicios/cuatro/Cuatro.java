/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios.cuatro;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 *
 * @author SergioxD
 */

// 4. Una gasolinera presta 4 clases de servicios. Por cada servicio que preste
// se tienen los siguientes datos:
// • Clase de servicio prestado (valores del 1 al 4)
// • Jornada en que se prestó el servicio (M: Mañana, T: Tarde)
// • y el valor del Servicio.
// Al final del día se requiere determinar e imprimir:
// • El valor producido por cada clase de servicio
// • El número de veces que se prestó cada servicio
// • El servicio que más veces se prestó y si éste se prestó más en la mañana o
// en la tarde.

public class Cuatro {
    public static ArrayList<Servicio> service = new ArrayList<Servicio>();

    public static void menu() {
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; // Guardaremos la opcion del usuario

        while (!salir) {

            System.out.println("1. Adñadir servicio");
            System.out.println("2. Mostar Datos");
            System.out.println("3. Salir");

            System.out.println("Escribe una de las opciones");
            opcion = sn.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Has seleccionado la opcion Adñadir servicio");

                    int tipo = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el tipo de servicio del 1 al 4"));
                    if (tipo < 1 || 4 < tipo) {
                        tipo = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el tipo de servicio del 1 al 4"));
                    }

                    int valor = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el valor del servicio"));
                    if (valor < 1) {
                        valor = Integer.parseInt(JOptionPane
                                .showInputDialog("Ingresa el valor del servicio (Debe ser positivo idiota)"));
                    }

                    int jornada = Integer.parseInt(
                            JOptionPane.showInputDialog("Ingresa la jornada \n" + "1) Mañana \n" + "2) Tarde "));
                    if (jornada < 1 || 2 < jornada) {
                        jornada = Integer.parseInt(
                                JOptionPane.showInputDialog("Ingresa la jornada \n" + "1) Mañana \n" + "2) Tarde "));
                    }
                    int indice = service.size();
                    service.add(indice, new Servicio(tipo, jornada, valor));

                    int valorByServicio = 0;

                    for (int i = 0; i < service.size(); i++) {
                        System.out.println(i + "dentro del for, tipo: " + service.get(i).getTipo() + " valor: "
                                + service.get(i).getValor());

                        if (service.get(i).getTipo() == 1) {
                            System.out.println("dentro del if: " + i);
                            valorByServicio = service.get(i).getValor() + valorByServicio;
                        }
                    }

                    System.out.println("_________________________________________________");

                    break;
                case 2:
                    System.out.println("Has seleccionado Mostrar Datos");

                    // • El valor producido por cada clase de servicio
                    // System.out.println("numero de servicios creados: " + service.size());
                    // System.out.println("tipo: " + service.get(0).getTipo() + " valor: " +
                    // service.get(0).getValor());
                    // System.out.println("tipo: " + service.get(1).getTipo() + " valor: " +
                    // service.get(1).getValor());
                    // System.out.println("tipo: " + service.get(2).getTipo() + " valor: " +
                    // service.get(2).getValor());

                    // for (int i = 0; i < service.size(); i++) {
                    // System.out.println("dentro del for, tipo: " + service.get(i).getTipo() + "
                    // valor: "
                    // + service.get(i).getValor());

                    // if (service.get(i).getTipo() == 1) {
                    // System.out.println("dentro del if: ");
                    // valorByServicio = service.get(i).getValor() + valorByServicio;
                    // }
                    // }
                    // System.out.println("El servicio numero 1 a generado: " + valorByServicio);

                    System.out.println("_________________________________________________");

                    break;
                case 3:
                    salir = true;

                default:
                    System.out.println("Solo números entre 1 y 5");
            }

        }
    }

}
