/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios.tres;

import java.util.ArrayList;

/**
 *
 * @author SergioxD
 */
public class Venta {
    int type, valor;
    Venta (int type, int valor) {
        this.type= type;
        this.valor= valor;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
}
