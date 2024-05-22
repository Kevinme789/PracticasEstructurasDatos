/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arreglos.tarea11;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author kevin
 */
public class Metodos {

    Scanner sc = new Scanner(System.in);
    int[][] arreglo;

    public int menu() {
        System.out.println("Llenar arreglo         [1]");
        System.out.println("Transponer arreglo     [2]");
        return sc.nextInt();
    }

    public void llenarArreglo() {
        int n;
        System.out.println("Ingrese numero de filas y columnas");
        n = sc.nextInt();
        arreglo = new int[n][n];
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo[i].length; j++) {
                arreglo[i][j] = (int) (Math.random() * 99 + 1);

            }
        }

    }

    public void leerArreglo() {
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo[i].length; j++) {
                System.out.printf("%d\t", arreglo[i][j]);
            }
            System.out.println("");
        }
        System.out.println("");
    }

    public void transponerArreglo() {
        int l, m, aux;
        for (int i = 0; i < arreglo.length; i++) {
            l = arreglo.length - 1 - i;
            for (int j = 0; j < arreglo[i].length-1-i; j++) {
                m = arreglo.length - 1 - j;
                aux = arreglo[m][l];
                arreglo[m][l] = arreglo[i][j];
                arreglo[i][j] = aux;

            }
        }

    }
}
