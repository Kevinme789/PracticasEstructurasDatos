/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package arreglos.arreglos01;

/**
 *
 * @author kevin
 */
public class Arreglos01 {

    public static void main(String[] args) {
        Metodos obj = new Metodos();
        int opc;
        do{
        opc = obj.menu();
        switch (opc){
            case 1:
                obj.leerLleno();
                break;
            case 2:
                obj.leerSig();
                break;
            case 3:
                obj.presentar();
                break;
            default:
                break;
        }
        } while (opc != 0);
    }
}
