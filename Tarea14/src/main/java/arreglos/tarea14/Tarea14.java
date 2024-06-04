/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package arreglos.tarea14;

/**
 *
 * @author kevin
 */
public class Tarea14 {

    public static void main(String[] args) {
        Metodos m = new Metodos();

        int opc, num;
        do {

            opc = m.menu();

            switch (opc) {

                case 1 :
                    m.push();
                    break;
                case 2 :
                    m.pop();
                    break;
                case 3 :
                
                    
                    System.out.println("Elemento a eliminar: ");
                    num = m.entrada.nextInt();
                    m.eliminarCliente(num);
                    break;
                
                case 4 :
                    m.recorrer();
                    break;
                
            }
        } while (opc != 0);
    }
}
