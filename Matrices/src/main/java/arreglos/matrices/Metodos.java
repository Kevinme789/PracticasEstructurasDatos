/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arreglos.matrices;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author kevin
 */
public class Metodos {

    int[][] a;
    int[][] b;
    int[][] c;
    Scanner sc;

    public Metodos() {
        this.a = new int[4][4];
        this.b = new int[4][4];
        this.c = new int[4][4];
        this.sc = new Scanner(System.in);
    }

    public int menu() {
        System.out.println("Ingrese la opcion deseada");
        System.out.println("Llenar arreglo            [1]");
        System.out.println("Ordenar arreglo           [2]");
        System.out.println("Presentar matriz nueva    [3]");
        System.out.println("Presentar matriz original [4]");
        System.out.println("Ordenar matriz original   [5]");
        System.out.println("Ordenar de otra forma     [6]");
        System.out.println("Multiplicar matrices      [7]");
        System.out.println("Llenar matrices aleatorio [8]");
        System.out.println("Presentar determinante    [9]");
        return sc.nextInt();

    }

    public void llenar() {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.println("Ingrese un numero para la posicion [" + i + "] "
                        + "[" + j + "]");
                a[i][j] = sc.nextInt();
            }

        }

    }

    public void arreglo() {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                b[i][j] = a[j][i];
            }

        }

    }

    public void presentar() {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.printf("%d ", b[i][j]);
            }
            System.out.println();

        }

    }

    public void presentarOriginal() {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.printf("%d ", a[i][j]);
            }
            System.out.println();

        }
    }

    public void transponer() {
        int aux;
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a[0].length; j++) {
                aux = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = aux;
            }

        }
    }

    public void transponer2() {
        int aux;
        int l = a.length - 1;
        int k;
        for (int i = 0; i < a.length - 1; i++) {
            k = a.length - 1;
            for (int j = 0 + 1; j < a[0].length - 1 - i; j++) {
                aux = a[i][j];
                a[i][j] = a[k][l];
                a[k][l] = aux;
                k--;
            }
            l--;

        }
    }

    public void llenarMatrices() {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = (int) (Math.random() * 100 + 1);
                b[i][j] = (int) (Math.random() * 100 + 1);
            }
        }
    }

    public void multiplicar() {
        int suma;
        for (int i = 0; i < a.length; i++) {
            for (int l = 0; l < b[0].length; l++) {
                suma = 0;
                for (int j = 0; j < a[0].length; j++) {
                    suma += a[i][j] * b[j][l];
                }
                c[i][l] = suma;
            }
        }
    }

    public int determinante(int[][] x) {
        int s1 = 0, s2 = 0, cont1, cont2, l, k;
        for (int i = 0; i < x.length; i++) {
            l = i;
            k = x.length - 1 - i;
            cont1 = 1;
            cont2 = 1;
            for (int j = 0; j < x[i].length; j++) {
                cont1 *= x[j][i];
                cont2 *= x[j][k];
                if (l < x.length - 1) {
                    l++;
                    k--;

                } else {
                    l = 0;
                    k = 2;
                }

            }
            s1 += cont1;
            s2 += cont2;
        }
        return (s1-s2);
        
    }

}
