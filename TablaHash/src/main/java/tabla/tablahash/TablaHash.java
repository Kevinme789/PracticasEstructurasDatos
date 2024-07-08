/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tabla.tablahash;

/**
 *
 * @author KevinR
 */
public class TablaHash {

    public static void main(String[] args) {
        int opc;
        Metodos obj = new Metodos(16);
        do{
            opc = obj.menu();
        switch(opc){
            
            case 1:
                obj.insertar();
                break;
            case 2: 
                obj.listar();
                break;
        }
        } while (opc != 0);
    }
}
