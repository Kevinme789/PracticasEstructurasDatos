/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package arreglos.tarea7;

import java.util.Random;

/**
 *
 * @author kevin
 */
public class Tarea7 {

    public static void main(String[] args) {
        int n;
        int opc;
        Metodos m = new Metodos();
        n = (int) (Math.random() * 20 + 5);
        int[] a = new int[n];
        do {
            opc = m.menu();
            switch (opc) {
                case 1:
                    a = m.llenarArreglo(a);
                    break;
                case 2:
                    m.suma(a);
                    break;
                case 3:
                    m.imprimir(a);
                    break;

            }
        } while (opc != 0);
    }
}
