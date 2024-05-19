/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package arreglos.tarea8;

/**
 *
 * @author kevin
 */
public class Tarea8 {

    public static void main(String[] args) {
        Metodos m = new Metodos();
        int opc;
        do {
            opc = m.menu();
            switch (opc) {
                case 1:
                    m.establecerNotas();
                    break;
                case 2:
                    m.mediaAlumno();
                    break;
                case 3:
                    m.mediaAsignaturas();
                    break;
                case 4:
                    m.mediaGeneral();
                    break;

            }
        } while (opc != 0);
    }
}
