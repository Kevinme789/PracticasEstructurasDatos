/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package listas.avld;

/**
 *
 * @author KevinR
 */
public class AVLD {

    public static void main(String[] args) {
        int opc, num;
        Metodos obj = new Metodos();
        do {
            opc = obj.menu();
            switch (opc) {
                case 1:
                    System.out.println("Elemento a insertar: ");
                    num = obj.entrada.nextInt();
                    obj.raiz = obj.insertarAVL(num, obj.raiz);
                    break;
                case 2:
                    System.out.println("Elemento a Buscar: ");
                    num = obj.entrada.nextInt();
                    obj.buscarAVL(num, obj.raiz);
                    break;
                case 3:
                    System.out.println("Elemento a Eliminar: ");
                    num = obj.entrada.nextInt();
                    obj.eliminarAVL(num, obj.raiz);
            }
        } while (opc != 0);

    }
}
