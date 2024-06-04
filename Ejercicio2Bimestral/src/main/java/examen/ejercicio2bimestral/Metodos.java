/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen.ejercicio2bimestral;

import java.util.Scanner;

/**
 *
 * @author kevin
 */
public class Metodos {

    int[] A;
    int[] B;
    int[] C;
    Scanner sc = new Scanner(System.in);

    public int menu() {
        System.out.println("Ingrese para llenar los arreglos            [1]");
        System.out.println("Ingrese para darle valor al tercer arreglo  [2]");
        System.out.println("Ingrese para imprimir matrices              [3]");
        System.out.println("Salir...                                    [0]");

        return sc.nextInt();
    }

    public void valorArreglos(int n) {
        A = new int[n];
        B = new int[n];
        for (int i = 0; i < A.length; i++) {
            A[i] = (int) (Math.random() * 100 + 1);
            for (int j = A.length - 1; j > 0; j--) {
                if (A[i] == A[j]) {
                    A[i] = (int) (Math.random() * 15 + 1);
                    j= A.length;
                }

            }
        }
        for (int i = 0; i < B.length; i++) {
            B[i] = (int) (Math.random() * 100 + 1);
            for (int j = B.length - 1; j > 0; j--) {
                if (B[i] == A[j]) {
                    B[i] = (int) (Math.random() * 15 + 1);
                    j= B.length;
                }

            }
        }
    }

    public void resultado() {
        C = new int[A.length];
        for (int i = 0; i < B.length; i++) {
            C[i] = A[i] - B[i];

        }

    }

    public void imprimir() {
        System.out.println("---Primera Matriz---");
        for (int i = 0; i < A.length; i++) {
            System.out.printf("%s\t", A[i]);
        }
        System.out.println("");
        System.out.println("---Segunda Matriz---");
        for (int i = 0; i < B.length; i++) {
            System.out.printf("%s\t", B[i]);
        }
        System.out.println("");
        System.out.println("---Tercera Matriz---");
        for (int i = 0; i < B.length; i++) {
            System.out.printf("%s\t", C[i]);
        }
        System.out.println("");
    }
}
