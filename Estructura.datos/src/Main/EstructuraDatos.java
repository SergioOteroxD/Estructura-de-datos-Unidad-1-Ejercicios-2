/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.Scanner;

import Ejercicios.Dos;
import Ejercicios.Uno;

/**
 *
 * @author SergioxD
 */
public class EstructuraDatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; // Guardaremos la opcion del usuario

        while (!salir) {

            System.out.println("1. Ejercicio 1 (calculadora)");
            System.out.println("2. Ejercicio 2 (universidad)");
            System.out.println("3. Ejercicio 3");
            System.out.println("4. Ejercicio 4");

            System.out.println("Escribe una de las opciones");
            opcion = sn.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Has seleccionado la opcion 1 (calculadora)");
                    Uno a = new Uno();
                    a.menu();
                    break;
                case 2:
                    System.out.println("Has seleccionado la opcion 2 (universidad)");
                    Dos b = new Dos();
                    b.appUni();
                    break;
                case 3:
                    System.out.println("Has seleccionado la opcion 3");
                    break;
                case 4:
                    salir = true;
                    break;
                default:
                    System.out.println("Solo números entre 1 y 4");
            }

        }
    }

}
