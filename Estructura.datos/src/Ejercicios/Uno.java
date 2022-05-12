/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author SergioxD
 */
public class Uno {
    public static void menu() {

        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; // Guardaremos la opcion del usuario

        while (!salir) {

            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");

            System.out.println("Escribe una de las opciones");
            opcion = sn.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Has seleccionado la opcion sumar");
                    int a, b;
                    System.out.println("Dato 1: ");
                    a = sn.nextInt();
                    System.out.println("Dato 2: ");
                    b = sn.nextInt();
                    sumar(a, b);
                    break;
                case 2:
                    System.out.println("Has seleccionado la restar");
                    int c, d;
                    System.out.println("Dato 1: ");
                    c = sn.nextInt();
                    System.out.println("Dato 2: ");
                    d = sn.nextInt();
                    restar(c, d);
                    break;
                case 3:
                    System.out.println("Has seleccionado la multiplicar");
                    int e, f;
                    System.out.println("Dato 1: ");
                    e = sn.nextInt();
                    System.out.println("Dato 2: ");
                    f = sn.nextInt();
                    multiplicar(e, f);
                    break;
                case 4:
                    System.out.println("Has seleccionado la dividir");
                    int g, h;
                    System.out.println("Dato 1: ");
                    g = sn.nextInt();
                    System.out.println("Dato 2: ");
                    h = sn.nextInt();
                    if(h<0){
                        throw new ArithmeticException("el denominador no puede ser cero");
                    }
                    dividir(g, h);
                    break;
                case 5:
                    salir = true;
                    break;
                default:
                    System.out.println("Solo números entre 1 y 5");
            }

        }
    }

    public static void sumar(int a, int b) {
        int c;
        c = a + b;
        System.out.println("la suma es igual a: " + c);
    }

    public static void restar(int a, int b) {
        int c;
        c = a - b;
        System.out.println("la suma es igual a: " + c);
    }

    public static void multiplicar(int a, int b) {
        int c;
        c = a * b;
        System.out.println("la suma es igual a: " + c);
    }

    public static void dividir(int a, int b) {
        int c;
        c = a / b;
        System.out.println("la suma es igual a: " + c);
    }
}
