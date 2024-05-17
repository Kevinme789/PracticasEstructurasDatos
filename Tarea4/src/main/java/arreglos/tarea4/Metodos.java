/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arreglos.tarea4;

/**
 *
 * @author kevin
 */
public class Metodos {

    public int finobacci(int arreglo) {
        if (arreglo <= 1) {
            return arreglo;
        }
        return finobacci(arreglo-1)+ finobacci(arreglo-2);

    }

    public void imprimirFinobacci(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.printf("%d,", arreglo[i]);
        }
    }
}
