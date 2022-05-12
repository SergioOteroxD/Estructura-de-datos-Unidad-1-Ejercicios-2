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
public class Dos {
    static Scanner sn = new Scanner(System.in);

    public static void appUni() {
        int nE;
        System.out.println("cantidad de estudiantes: ");
        nE = sn.nextInt();
        int estudiante[][] = new int[nE][3];
        for (int i = 0; i < nE; i++) {
            for (int e = 0; e < 3; e++) {
                switch (e) {
                    case 0:
                        System.out.println("ingrese la edad del estudiante " + (i + 1));
                        estudiante[i][e] = sn.nextInt();
                        break;

                    case 1:
                        int sexo;
                        System.out.println(
                                "ingrese la sexo del estudiante " + (i + 1) + "\n 1) Masculino" + "\n 2) Femenino");
                        sexo = sn.nextInt();
                        if (sexo < 1 || 2 < sexo) {
                            System.out.println(
                                    "ingrese la sexo del estudiante " + (i + 1) + "\n 1) Masculino"
                                            + "\n 2) Femenino");
                            sexo = sn.nextInt();
                        }
                        estudiante[i][e] = sexo;

                        break;

                    case 2:
                        int carrera;
                        System.out.println("ingrese la carrera del estudiante " + (i + 1) + "\n 1) Ingeniería"
                                + "\n 2) otra carrera");

                        carrera = sn.nextInt();
                        if (carrera < 1 || 2 < carrera) {
                            System.out.println("ingrese la carrera del estudiante " + (i + 1) + "\n 1) Ingeniería"
                                    + "\n 2) otra carrera");
                        }
                        estudiante[i][e] = carrera;

                        break;

                    default:
                        break;
                }

            }
        }
        // Calcular el promedio de edad
        // suma de edades
        int suma = 0;
        for (int i = 0; i < nE; i++) {
            suma = estudiante[i][0] + suma;
        }
        double promedioEdad;
        promedioEdad = suma / nE;
        System.out.println("El promedio de las edades es: " + suma + "/" + nE + ": " + promedioEdad);

        // Calcular porcentaje de hombres
        int cantidadHombre = 0;
        for (int i = 0; i < nE; i++) {
            if (estudiante[i][1] == 1) {
                cantidadHombre++;
            }
        }
        double porcentajeHombre;
        porcentajeHombre = (cantidadHombre * 100) / nE;

        System.out.println("El porcentaje de hombres en la universidad: " + porcentajeHombre);

        // Porcentaje de mujeres que estudian Ingeniería
        int mujerIngenieras=0;
        for (int i = 0; i < nE; i++) {
            if (estudiante[i][1] == 2 & estudiante[i][2] == 1) {
                mujerIngenieras++;
            }
        }
        double porcentajeMujeresIngenieras;
        porcentajeMujeresIngenieras= (mujerIngenieras*100)/nE;
        System.out.println("El porcentaje de mujeres que estudian ingeniería: "+porcentajeMujeresIngenieras);

    }
}
