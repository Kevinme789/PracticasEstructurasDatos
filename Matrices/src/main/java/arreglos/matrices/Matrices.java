/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package arreglos.matrices;

/**
 *
 * @author kevin
 */
public class Matrices {

    public static void main(String[] args) {
        Metodos m = new Metodos();
        int opc, num, resp;
        do {
            opc = m.menu();
            switch (opc) {
                case 1:
                    m.llenar();
                    break;
                case 2:
                    m.arreglo();
                    break;
                case 3:
                    m.presentar();
                    break;
                case 4:
                    m.presentarOriginal();
                    break;
                case 5:
                    m.transponer();
                    break;
                case 6:
                    m.transponer2();
                    break;
                case 7:
                    m.multiplicar();
                    break;

            }
        } while (opc != 0);
    }
}
