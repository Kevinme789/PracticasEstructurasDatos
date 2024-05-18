/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arreglos.tarea6;

import java.util.Scanner;

/**
 *
 * @author kevin
 */
public class Metodos {

    Scanner sc = new Scanner(System.in);

    public int menu() {
        System.out.println("Para determinar si el arreglo esta ordenado    [1]");
        System.out.println("Para ordenar el arreglo                        [2]");
        System.out.println("Imprimir arreglo                               [3]");
        System.out.println("Salir                                          [0]");
        return sc.nextInt();

    }

    public String estaOrdenado(int[] a) {

        for (int i = 0; i < a.length - 1; i++) {
            if (a[i + 1] < a[i]) {
                return "El arreglo no esta ordenado";
            }

        }
        return "El arreglo esta ordenado...";

    }

    public int[] ordenar(int[] a) {
        int aux;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - 1; j++) {
                if (a[j + 1] < a[j]) {
                    aux = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = aux;
                }
            }

        }
        return a;
    }

    public void imprimir(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.printf("%d,", a[i]);
        }
        System.out.println("");
    }
}
