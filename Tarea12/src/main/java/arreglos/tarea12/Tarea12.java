/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package arreglos.tarea12;

/**
 *
 * @author kevin
 */
public class Tarea12 {

    public static void main(String[] args) {
        int opc, f, c;
        Metodos m = new Metodos();
        do {
            opc = m.menu();
            switch (opc) {
                case 1:
                    System.out.println("Ingrese el numero de filas que tendra la matriz");
                    f = m.sc.nextInt();
                    System.out.println("Ingrese el numero de columnas que tendra la matriz");
                    c = m.sc.nextInt();
                    m.valorMaterias(f, c);
                    break;
                case 2:
                    m.imprimir();
            }
        } while (opc != 0);
    }
}
