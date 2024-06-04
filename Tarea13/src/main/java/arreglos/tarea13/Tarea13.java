/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package arreglos.tarea13;

/**
 *
 * @author kevin
 */
public class Tarea13 {

    public static void main(String[] args) {
        int opc;
        Metodos m = new Metodos();
        do {
            opc = m.menu();
            switch (opc) {
                case 1:
                    m.valorMaterias(4, 5);
                    break;
                case 2:
                    m.buscarNota();
                    break;
                case 3:
                    m.imprimir();

                    break;
            }
        } while (opc != 0);
    }
}
