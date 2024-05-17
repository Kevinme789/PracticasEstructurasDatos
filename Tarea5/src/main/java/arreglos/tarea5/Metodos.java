/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arreglos.tarea5;

/**
 *
 * @author kevin
 */
public class Metodos {

    public int numeroPrimo(int n) {
        if (n <= 2) {
            return n;
        }
        if (n % 2 == 0) {
            return numeroPrimo(n + 1);
        }
        for (int i = n - 1; 1<i; i--) {
            if (n % i == 0) {
                return numeroPrimo(n + 1);
            }

        }

        return n;

    }

    public void imprimir(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.printf("%d,", arreglo[i]);
            if (i % 10 == 0 && i != 0){
                System.out.println("");
            }
        }
    }
}
