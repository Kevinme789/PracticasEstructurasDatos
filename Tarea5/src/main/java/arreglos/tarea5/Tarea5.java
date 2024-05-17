/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package arreglos.tarea5;

/**
 *
 * @author kevin
 */
public class Tarea5 {

    public static void main(String[] args) {
        Metodos metodo = new Metodos();
        int[] arreglo2 = new int[100];
        int n = 1;
        System.out.println("Los primeros 100 numeros primos:");
        for (int i = 0; i < arreglo2.length; i++) {
            arreglo2[i] = metodo.numeroPrimo(n);
            n = arreglo2[i]+1;
        }
        metodo.imprimir(arreglo2);
    }
}
