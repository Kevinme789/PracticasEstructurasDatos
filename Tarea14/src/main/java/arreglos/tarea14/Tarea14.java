/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package arreglos.tarea14;

/**
 *
 * @author kevin
 */
public class Tarea14 {

    public static void main(String[] args) {
        int opc, num;
        Metodos m = new Metodos();
        do {
            opc = m.menu();
            switch (opc) {
                case 1:
                    m.push();
                    break;
                case 2:
                    m.pop();
                    break;
                case 3:
                    System.out.println("Elemento a retirar:");

            }
        } while (opc != 0);
    }
}
