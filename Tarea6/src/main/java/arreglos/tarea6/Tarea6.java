/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package arreglos.tarea6;

/**
 *
 * @author kevin
 */
public class Tarea6 {

    public static void main(String[] args) {
        int opc;
        int[] arreglo = {10, 9, 7, 12, 14, 6, 1, 8, 4};
        Metodos m = new Metodos();
        do {
            opc = m.menu();
            switch (opc) {

                case 1:
                    System.out.printf("%s\n\n", m.estaOrdenado(arreglo));
                    break;
                case 2: 
                    arreglo = m.ordenar(arreglo);
                    break;
                case 3: 
                    m.imprimir(arreglo);
                    break;
            }

        } while (opc != 0);
    }
}
