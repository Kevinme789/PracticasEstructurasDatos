/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arreglos.tarea3;

/**
 *
 * @author kevin
 */
public class Metodo {

    int[] a = {10, 16, 14, 11, 3, 8, 4, 12, 16, 5};

    public void obtenerFactorial() {
        int[] b = new int[10];
        for (int i = 0; i < a.length; i++) {

            b[i] = factorial(a[i]);
            System.out.println("Factorial de " + a[i] + " : " + b[i]);
        }

    }

    public int factorial(int a) {
        if (a == 1) {
            return 1;
        }
        return a * factorial(a - 1);

    }

}
