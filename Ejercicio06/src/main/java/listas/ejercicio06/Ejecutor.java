/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package listas.ejercicio06;

/**
 *
 * @author KevinR
 */
public class Ejecutor {

    public static void main(String[] args) {
        Nodo head = null;
        Metodos obj = new Metodos();
        char letra;
        int opc;
        do {
            opc = obj.menu();
            switch(opc){
                case 1: 
                    System.out.println("Ingrese una letra");
                    letra = obj.entrada.next().charAt(0);
                    obj.insertar(letra);
                    break;
                case 2:
                    head = obj.invertir();
                    System.out.println("Lista Original");
                    obj.recorrer();
                    System.out.println("Lista Modificada");
                    obj.recorrer(head);
            
            }
        } while (opc != 0);
    }
}
