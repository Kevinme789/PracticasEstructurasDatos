/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package examen.ejercicio2bimestral;

/**
 *
 * @author kevin
 */
public class Ejercicio2Bimestral {

    public static void main(String[] args) {
        int opc, tamanio, f;
        Metodos m = new Metodos();
        do {
            opc = m.menu();
            switch (opc) {
                case 1:
                    System.out.println("Ingrese el tamaño de sus matrices: ");
                    tamanio = m.sc.nextInt();
                    m.valorArreglos(tamanio);
                    break;
                case 2:
                    m.resultado();
                    break;
                case 3:
                    m.imprimir();
                    break;

            }

        } while (opc != 0);
    }
}
