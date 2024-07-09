/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tabla.listaadyacencia;

import java.util.Scanner;

/**
 *
 * @author KevinR
 */
public class Metodos {

    Scanner sc;
    String[] ciudades;
    Nodo[] vecinos;
    int tamanio;

    public Metodos(int lim) {
        this.sc = new Scanner(System.in);
        this.tamanio = lim;
        this.ciudades = new String[tamanio];
        this.vecinos = new Nodo[tamanio];
        for (int i = 0; i < lim; i++) {
            vecinos[i] = null;
        }

    }

    public void insCiudades() {
        ciudades[0] = "GUA";
        ciudades[1] = "GUE";
        ciudades[2] = "MEX";
        ciudades[3] = "VER";
        ciudades[4] = "OAX";
        ciudades[5] = "MER";

        /* for (int i = 0; i < tamanio; i++) {
            System.out.println("Inserte ciudad: "+i);
            ciudades[i] = sc.nextLine();
        }
         */
    }

    public void insVecinos() {
        int opc, num;
        for (int i = 0; i < tamanio; i++) {
            System.out.println("Insertar vecinos para " + ciudades[i] + ":");
            do {
                for (int j = 0; j < tamanio; j++) {
                    if (j != i) {
                        System.out.println(ciudades[j] + "[" + j + "]: ");
                    }
                }
                num = sc.nextInt();
                insertaLista(num, i);
                System.out.println("Otra? Si[1] No[0]");
                opc = sc.nextInt();
            } while (opc != 0);

        }
    }

    public void insertaLista(int num, int i) {
        Nodo nuevo = new Nodo(ciudades[num]);
        if (vecinos[i] == null) {
            vecinos[i] = nuevo;
        } else {
            Nodo actual = vecinos[i];
            while (actual.sig != null) {
                actual = actual.sig;
            }
            actual.sig = nuevo;
        }
    }
    public void listar(){
        for (int i = 0; i < tamanio; i++) {
            System.out.print(ciudades[i]+" limita con: ");
            Nodo actual = vecinos[i];
            while(actual != null){
                System.out.print(actual.vecino+" -> ");
                actual = actual.sig;
            
            }
            System.out.println("NULL");
        }
    }

}
