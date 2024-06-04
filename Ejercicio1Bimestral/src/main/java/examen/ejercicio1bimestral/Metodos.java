/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen.ejercicio1bimestral;

import java.util.Scanner;

/**
 *
 * @author kevin
 */
public class Metodos {

    Scanner sc = new Scanner(System.in);
    int[][] A;
    int[][] B;
    int serie = 0;

    public int menu() {
        System.out.println("Ingrese para llenar el arreglo         [1]");
        System.out.println("Ingrese para conseguir el num escalar  [2]");
        System.out.println("Ingrese para multiplicar la matriz     [3]");
        System.out.println("Ingrese para imprimir matrices         [4]");
        System.out.println("Salir...                               [0]");

        return sc.nextInt();
    }

    public void llenarArreglo(int n) {
        A = new int[n][n];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                A[i][j] = (int) (Math.random() * 15 + 1);
            }

        }
    }

    public void finobacci(int f) {
        int aux2 = 1;
        for (int i = 0; i < f; i++) {

            int aux = serie;
            serie = aux2;
            aux2 = aux + aux2;
        }
        System.out.println("Numero Escalar: " + serie);

    }

    public void multiplicarEscalar() {
        B = new int[A.length][A[0].length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                B[i][j] = A[i][j] * serie;
            }

        }
    }

    public void imprimirMatrices() {
        System.out.println("---Matriz Original---");
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                System.out.printf("%s\t", A[i][j]);
            }
            System.out.println("");
        }
        System.out.println("---Matriz multiplicada por escalar---");
        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < B[i].length; j++) {
                System.out.printf("%s\t", B[i][j]);
            }
            System.out.println("");
        }

    }
}
