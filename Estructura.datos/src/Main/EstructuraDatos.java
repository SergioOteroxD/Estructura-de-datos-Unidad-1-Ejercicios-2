/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.Scanner;

import javax.swing.JOptionPane;

import Ejercicios.Dos;
import Ejercicios.Uno;
import Ejercicios.tres.Tres;

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
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Digite la opcion que quiere ejecutar\n"
            + "1. Ejercicio 1 (Calculadora)\n"
            + " 2. Ejercicio 2 (Universidad)\n"
            + " 3. Ejercicio 3 (Restaurante)\n"
            + " 4. Ejercicio 4\n"
            + " 5. Ejercicio 5\n"
            + " 6. SALIR"));

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
                    Tres tres = new Tres();
                    tres.menu();
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
