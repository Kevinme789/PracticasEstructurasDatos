/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package examen.ejercicio1bimestral;

/**
 *
 * @author kevin
 */
public class Ejercicio1Bimestral {

    public static void main(String[] args) {
        int opc, tamanio,f;
        Metodos m = new Metodos();
        do {
            opc = m.menu();
            switch (opc) {
                case 1:
                    System.out.println("Ingrese el tamaño de su matriz: ");
                    tamanio = m.sc.nextInt();
                    m.llenarArreglo(tamanio);
                    break;
                case 2:
                    System.out.println("Ingrese el numero a buscar de la serie");
                    f = m.sc.nextInt();
                    m.finobacci(f);
                    break;
                case 3:
                    m.multiplicarEscalar();
                    break;
                case 4:
                    m.imprimirMatrices();
                    break;
                    
            }

        } while (opc != 0);
    }
}
