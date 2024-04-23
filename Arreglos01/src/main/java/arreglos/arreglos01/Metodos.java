/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arreglos.arreglos01;

import java.util.Scanner;

/**
 *
 * @author kevin
 */
public class Metodos {

    Scanner sc;
    int[] myArray;
    int ev;

    public Metodos() {
        this.sc = new Scanner(System.in);
        this.myArray = new int[10];
        this.ev = 0;

    }

    public int menu() {
        System.out.println("Insertar lleno                 [1]");
        System.out.println("Insertar en espacio libre      [2]");
        System.out.println("Presentar                      [3]");
        System.out.println("Buscar numero                  [4]");
        System.out.println("Eliminar numero                [5]");
        System.out.println("Agregar numero                 [6]");
        System.out.println("Insertar en orden              [7]");
        System.out.println("Salir                          [0]");
        return sc.nextInt();
    }

    public void leerLleno() {
        for (int i = 0; i < myArray.length; i++) {
            System.out.println("Inserte elemento de posicion " + (i + 1));
            myArray[i] = sc.nextInt();

        }
        ev = myArray.length;
    }

    public void leerSig() {
        if (ev < myArray.length) {
            System.out.println("Inserte elemento: ");
            myArray[ev] = sc.nextInt();
        } else {
            System.out.println("Arreglo lleno");
        }
    }

    public void presentar() {
        for (int i = 0; i < ev; i++) {
            System.out.printf(myArray[i] + ", ");

        }
        System.out.println();
    }

    public int secuencial(int num) {
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == num) {
                return i;
            }

        }
        return -1;

    }

    public void eliminar(int num) {
        int pos = secuencial(num);
        if (pos != -1) {
            desplazarIzquierda(pos);
            ev--;

        } else {
            System.out.println("El elemento no existe...");
        }
    }

    public void desplazarIzquierda(int pos) {
        for (int i = pos; i < ev - 1; i++) {
            myArray[i] = myArray[i + 1];
        }
    }

    public void agregar(int num, int pos) {
        if (ev != myArray.length) {
            desplazarDerecha(pos);
            myArray[pos] = num;
            ev++;

        } else {
            System.out.println("Arreglo lleno");
        }
    }

    public void desplazarDerecha(int pos) {
        for (int i = ev; pos < i; i--) {
            myArray[i] = myArray[i - 1];

        }
    }

    public void insOrden(int num) {
        int pos = 0;
        if (ev < myArray.length) {
            while ((pos < ev) && (myArray[pos] < num)) {
                pos++;
            }
            desplazarDerecha(pos);
            myArray[pos] = num;
            ev++;
        } else {
            System.out.println("Arreglo lleno.....");
        }

    }
}
