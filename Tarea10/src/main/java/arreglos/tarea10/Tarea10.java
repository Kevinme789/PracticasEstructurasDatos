/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package arreglos.tarea10;

/**
 *
 * @author kevin
 */
public class Tarea10 {

    public static void main(String[] args) {
        Metodos m = new Metodos();
        int opc;
        do{
            opc = m.menu();
        switch(opc){
            case 1:
                m.llenarAsientos();
                break;
            case 2:
                m.imprimirAsientos();
                m.reservarAsiento();
                m.imprimirAsientos();
                break;
            case 3:
                m.imprimirAsientos();
                break;
        
        }
        }while(opc!=0);
    }
}
