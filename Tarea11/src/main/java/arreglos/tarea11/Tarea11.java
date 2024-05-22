/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package arreglos.tarea11;

/**
 *
 * @author kevin
 */
public class Tarea11 {

    public static void main(String[] args) {
        int opc;
        Metodos m = new Metodos();
        do{
        opc = m.menu();
        switch (opc){
            case 1:
                m.llenarArreglo();
                break;
            case 2:
                System.out.println("----Arreglo Original----");
                m.leerArreglo();
                m.transponerArreglo();
                System.out.println("----Arreglo transpuesto----");
                m.leerArreglo();
                break;
        }
        }while (opc !=0);
    }
}
