/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arreglos.tarea12;

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
        System.out.println("Ingrese para darles un valor a las materias   [1]");
        System.out.println("Imprimir matriz                               [2]");
        System.out.println("Salir                                         [0]");
        return sc.nextInt();
    }

    public void valorMaterias(int f, int c) {
        arreglo = new int[f][c];
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo[i].length; j++) {
                arreglo[i][j] = (int) (Math.random() * 10 + 1);
            }

        }

    }

    public void imprimir() {
        System.out.println("---Matriz---");
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo[i].length; j++) {
                System.out.printf("%d\t", arreglo[i][j]);
            }
            System.out.println("");

        }
    }

}
