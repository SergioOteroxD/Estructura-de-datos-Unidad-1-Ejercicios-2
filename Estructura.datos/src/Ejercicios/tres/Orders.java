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
public class Orders {
    private static ArrayList<Venta> ventas = new ArrayList<Venta>();
    private static Venta venta;
    private int id_vendedor;

    Orders(int type, int valor, int id) {
        addVenta(type, valor, id);
    }

    public void addVenta(int type, int valor, int id) {
        setId_vendedor(id); 
        ventas.add(new Venta(type, valor));
        // System.out.println("tamaño de ventas "+ ventas.size());

    }

    public double obtenerPago() {
        double pago = 0;
        int tipo;
        int valor;
        System.out.println("tamaño de ventas "+ ventas.size());
        for (int i = 0; i < ventas.size(); i++) {
            tipo = ventas.get(i).type;
            valor= ventas.get(i).valor;
            pago = (valor*0.7)+pago;
            if(tipo==1){
                pago = (valor*0.15)+pago;
            }else if(tipo==2){
                pago = (valor*0.1)+pago;
            }else{
                pago = (valor*0.05)+pago;
            }
        }
        return pago;
        
    }

    public int getId_vendedor() {
        return id_vendedor;
    }

    public void setId_vendedor(int id_vendedor) {
        this.id_vendedor = id_vendedor;
    }
}
