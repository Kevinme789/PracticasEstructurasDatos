/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arreglos.tarea9;

import java.util.Scanner;

/**
 *
 * @author kevin
 */
public class Metodos {

    Scanner sc = new Scanner(System.in);
    String[] clientes = {"Eduardo", "Miguel", "Jonathan", "Emiliano", "Marco",
        "Melissa", "Sara", "Maribel"};
    int[][] dias = new int[8][6];
    String[] nombres;
    int num = 0;
    int n = 0;

    public int menu() {
        System.out.println("Para generar los dias:               [1]");
        System.out.println("Clientes que obtendran descuento:    [2]");
        return sc.nextInt();
    }

    public void generarDias() {
        for (int i = 0; i < clientes.length; i++) {
            num = 0;
            for (int j = 0; j < dias[i].length; j++) {
                dias[i][j] = (int) (Math.random() * 2 + 0);
                System.out.printf("%d\t", dias[i][j]);
                num = num + dias[i][j];
            }
            if (2 < num) {
                n = n + 1;
            }
            System.out.println("");

        }
    }

    public void clientesDescuento() {
        nombres = new String[n];
        n = 0;
        for (int i = 0; i < dias.length; i++) {
            num = 0;
            for (int j = 0; j < dias[i].length; j++) {
                num = num + dias[i][j];
            }
            if (2 < num) {
                nombres[n++] = clientes[i];
            }

        }
    }

    public void imprimir() {
        System.out.println("Los siguientes clientes obtendran un descuento del"
                + " 20%:");
        for (int i = 0; i < nombres.length; i++) {
            System.out.printf("%s\t", nombres[i]);
        }
        System.out.println("");
    }

}
