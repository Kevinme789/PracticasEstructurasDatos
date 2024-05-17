/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package arreglos.tarea4;

/**
 *
 * @author kevin
 */
public class Tarea4 {

    public static void main(String[] args) {
        Metodos metodo = new Metodos();
        int[] arreglo1 = {10, 9, 12, 13, 14, 15, 16, 19};
        int[] arreglo2 = new int[8];
        for (int i = 0; i < arreglo1.length; i++) {
            arreglo2[i] = metodo.finobacci(arreglo1[i]);
        }
        metodo.imprimirFinobacci(arreglo2);
    }
}
