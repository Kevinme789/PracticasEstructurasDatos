/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package arreglos.tarea9;

/**
 *
 * @author kevin
 */
public class Tarea9 {

    public static void main(String[] args) {
        Metodos m = new Metodos();
        int opc;
        do {
            opc = m.menu();
            switch (opc) {
                case 1:
                    m.generarDias();
                    break;
                case 2:
                    m.clientesDescuento();
                    m.imprimir();
            }
        } while (opc != 0);
    }
}
