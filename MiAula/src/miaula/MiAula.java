/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package miaula;

/**
 *
 * @author kevin
 */
public class MiAula {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Metodos obj = new Metodos(10);
        int opc;
        do {
            opc = obj.menu();
            switch (opc) {
                case 1:
                    obj.insertar();
                    break;
                case 2:
                    obj.presentar();
                    break;
            }

        } while (opc != 0);

    }

}
