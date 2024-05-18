/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arreglos.tarea7;

import java.util.Random;

import java.util.Scanner;

/**
 *
 * @author kevin
 */
public class Metodos {

    Scanner sc = new Scanner(System.in);

    public int menu() {
        System.out.println("Llenar arreglo                                 [1]");
        System.out.println("Suma de numeros pares e impares                [2]");
        System.out.println("Imprimir arreglo                               [3]");
        System.out.println("Salir                                          [0]");
        return sc.nextInt();
    }

    public int[] llenarArreglo(int[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 99 + 1);
        }
        return a;

    }

    public void suma(int[] a) {
        int par = 0;
        int impar = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                par = par + a[i];
            } else {
                impar = impar + a[i];
            }
        }
        System.out.printf("Suma de numeros impares: %d\n", impar);
        System.out.printf("Suma de numeros pares: %d\n", par);
    }

    public void imprimir(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (i % 5 == 0) {
                System.out.println("");
            }
            System.out.printf("%d\t", a[i]);
        }

        System.out.println("");
    }

}
