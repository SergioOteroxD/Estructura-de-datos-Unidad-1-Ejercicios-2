/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios.cuatro;

/**
 *
 * @author SergioxD
 */
public class Servicio {

    private static int tipo;
    private static int jornada;
    private static int valor;

    Servicio(int tipo, int jornada, int valor) {
        this.tipo = tipo;
        this.jornada= jornada;
        this.valor= valor;
    }


    public int getTipo() {
        return tipo;
    }

    public static void setTipo(int tipo) {
        Servicio.tipo = tipo;
    }

    public static int getJornada() {
        return jornada;
    }

    public static void setJornada(int Jornada) {
        Servicio.jornada = Jornada;
    }

    public int getValor() {
        return valor;
    }

    public static void setValor(int valor) {
        Servicio.valor = valor;
    }

}
