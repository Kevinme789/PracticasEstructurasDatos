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
        int[] arreglo = new int[5];
        int i = 0;
        int[] arreglo2 =metodo.finobacci(arreglo,i+1);
        
        metodo.imprimirFinobacci(arreglo2);
    }
}
