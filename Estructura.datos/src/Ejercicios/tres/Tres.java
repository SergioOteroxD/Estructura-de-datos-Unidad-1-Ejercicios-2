/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios.tres;

import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 *
 * @author SergioxD
 */
public class Tres {
    private static ArrayList<Orders> orders = new ArrayList<Orders>();
    private static Orders order;

    public void menu() {
        try (Scanner sn = new Scanner(System.in)) {
            boolean salir = false;
            int opcion; // Guardaremos la opcion del usuario

            while (!salir) {

                System.out.println("1. Nueva orden");
                System.out.println("2. Mostrar pagos");
                System.out.println("3. Mostrar datos");
                System.out.println("4. Salir");

                System.out.println("Escribe una de las opciones");
                opcion = sn.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("Has seleccionado la opcion 1 (Nueva orden)");
                        int tipo, valor, id_vendedor;
                        tipo = Integer.parseInt(JOptionPane
                                .showInputDialog(
                                        "Metodo de pago: \n" + "1) Contado \n" + "2) Cheque \n" + "3) Tarjeta"));
                        if (tipo < 1 || 3 < tipo) {
                            tipo = Integer.parseInt(JOptionPane
                                    .showInputDialog(
                                            "Metodo de pago: \n" + "1) Contado \n" + "2) Cheque \n" + "3) Tarjeta"));
                        }
                        valor = Integer.parseInt(JOptionPane.showInputDialog("Valor de la orden: "));
                        if (valor < 0) {
                            valor = Integer.parseInt(JOptionPane.showInputDialog("Valor de la orden: "));
                        }

                        id_vendedor = Integer.parseInt(JOptionPane
                                .showInputDialog("Ingrese el id del vendedor"));
                        boolean findId = true;
                        if (orders.isEmpty()) {
                            orders.add(new Orders(tipo, valor, id_vendedor));
                        } else {
                            for (int i = 0; i < orders.size(); i++) {
                                if (orders.get(i).getId_vendedor() == id_vendedor) {
                                    orders.get(i).addVenta(tipo, valor, id_vendedor);
                                    findId = false;
                                }
                            }
                            if (findId) {

                                orders.add(order = new Orders(tipo, valor, id_vendedor));

                            }
                        }

                        break;
                    case 2:
                        System.out.println("Has seleccionado la opcion 2 (Mostrar pagos)");
                        System.out.println("tamaño de orders " + orders.size());

                        for (int i = 0; i < orders.size(); i++) {
                            System.out.println("Al mesero " + orders.get(i).getId_vendedor() + " se le debe: "
                                    + getPago(orders.get(i).getId_vendedor()));
                        }
                        // orders.forEach((order1) -> {
                        // System.out.println("Al mesero "+order1.getId_vendedor()+ " se le debe:
                        // "+order1.getPago());
                        // });
                        break;
                    case 3:
                        System.out.println("Has seleccionado la opcion 3");
                        for (int i = 0; i < orders.size(); i++){
                            System.out.println(orders.get(i).getId_vendedor()+" ");
                        }
                        break;
                    case 4:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 4");
                }

            }
        } catch (NumberFormatException | HeadlessException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static double getPago(int id) {
        double pago = 0;
        for (int i = 0; i < orders.size(); i++) {
            if (orders.get(i).getId_vendedor() == id) {
                System.out.println("id vendedor"+orders.get(i).getId_vendedor());
               return orders.get(i).obtenerPago();

            }
        }
        return pago;
    }
}