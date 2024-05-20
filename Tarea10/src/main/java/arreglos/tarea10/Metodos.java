/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arreglos.tarea10;

import java.util.Scanner;

/**
 *
 * @author kevin
 */
public class Metodos {

    Scanner sc = new Scanner(System.in);
    String[][] asientos = new String[7][7];

    public int menu() {
        System.out.println("Llenar estado inicial de los Asientos:      [1]");
        System.out.println("Reservar un asiento                         [2]");
        System.out.println("Ver todos los asientos                      [3]");
        return sc.nextInt();
    }

    public void llenarAsientos() {
        for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; j < asientos[i].length; j++) {
                asientos[i][j] = "vacio";

            }
        }

    }

    public void imprimirAsientos() {
        for (int i = 0; i < asientos.length; i++) {
            System.out.printf("Fila %d\t", i+1);
            for (int j = 0; j < asientos[i].length; j++) {
                System.out.printf("%s\t", asientos[i][j]);

            }
            System.out.println("");
        }
    }

    public void reservarAsiento() {
        int n, m;
        System.out.println("---Reservacion de Asiento---");
        System.out.println("Ingrese la fila del asiento");
        n = sc.nextInt();
        System.out.println("Ingrese la columna del asiento");
        m = sc.nextInt();
        if (asientos[n-1][m-1] != "ocupado") {
            asientos[n-1][m-1] = "ocupado";
            System.out.println("--Asiento Reservado con exito!--");
        } else {
            System.out.println("El asiento ya se encuentra reservado!");
        }

    }

}
