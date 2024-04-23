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
        int opc, num, posicion;

        do {
            opc = obj.menu();
            switch (opc) {
                case 1:
                    obj.leerLleno();
                    break;
                case 2:
                    obj.leerSig();
                    break;
                case 3:
                    obj.presentar();
                    break;
                case 4:
                    System.out.println("Ingresa el numero a buscar:");
                    num = obj.sc.nextInt();
                    posicion = obj.secuencial(num);
                    if (posicion != -1) {
                        System.out.println("Esta en la posicion: " + posicion);

                    } else {
                        System.out.println("No se encuentra");
                    }
                case 5:
                    System.out.println("Ingresa el numero a eliminar:");
                    num = obj.sc.nextInt();
                    obj.eliminar(num);
                    break;
                case 6:
                    System.out.println("Ingresa el numero a agregar:");
                    num = obj.sc.nextInt();
                    System.out.println("Ingresa la posicion:");
                    posicion = obj.sc.nextInt();
                    obj.agregar(num, posicion);
                    break;
                case 7:
                    System.out.println("Insertar numero: ");
                    num = obj.sc.nextInt();
                    obj.insOrden(num);
                default:
                    break;
            }
        } while (opc != 0);
    }
}
