/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package listas.ejercicio08;

/**
 *
 * @author KevinR
 */
public class Ejercicio08 {

    public static void main(String[] args) {
        Nodo head = null;
        Metodos obj = new Metodos();
        char letra;
        int opc;
        do {
            opc = obj.menu();
            switch (opc) {
                case 1:
                    System.out.println("Ingrese una letra");
                    letra = obj.entrada.next().charAt(0);
                    obj.insertar(letra);
                    break;
                case 2:
                    System.out.println("Lista Original");
                    obj.recorrer(obj.head);
                    obj.particionar();
                    System.out.println("Primera Lista Particionada");
                    obj.recorrer(obj.head2);
                    System.out.println("Segunda Lista Particionada");
                    obj.recorrer(obj.head3);

            }
        } while (opc != 0);
    }
}
