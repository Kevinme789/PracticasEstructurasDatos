/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package arreglos.evaluacionparcial1b;

/**
 *
 * @author kevin
 */
public class EvaluacionParcial1B {

    public static void main(String[] args) {
        Metodos m = new Metodos();
        int opcion;
        do {
            opcion = m.menu();
            switch (opcion) {
                case 1:
                    m.Preguntar();
                    break;
                case 2:
                    m.importar();
                    break;
                case 3:
                    m.aprobados();
            }
        } while (opcion != 0);

    }
}
