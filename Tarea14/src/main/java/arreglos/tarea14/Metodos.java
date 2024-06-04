/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arreglos.tarea14;

import java.util.Scanner;

/**
 *
 * @author kevin
 */
public class Metodos {

    Scanner entrada;
    int[] myCola;
    int ev;

    public Metodos() {
        this.entrada = new Scanner(System.in);
        this.myCola = new int[10];
        this.ev = 0;
    }

    public int menu() {
        System.out.println("Ingresar nuevo cliente      [1]");
        System.out.println("Atender cliente             [2]");
        System.out.println("Retirarse de la cola        [3]");
        return entrada.nextInt();
    }

    public boolean colaLlena() {
        return (ev == myCola.length);
    }

    public boolean colaVacia() {
        return (ev == 0);
    }

    public void desplazarIzq(int pos) {
        for (int i = pos; i < ev; i++) {
            myCola[i] = myCola[i + 1];
        }

    }

    public void push() {
        if (!colaLlena()) {
            System.out.println("Ingrese la cedula del cliente:");
            myCola[ev] = entrada.nextInt();
            ev++;
        } else {
            System.out.println("Cola llena....");
        }
    }

    public void pop() {
        if (!colaVacia()) {
            System.out.println(myCola[0] + " ATENDIDO");
            desplazarIzq(0);
            ev--;
        } else {
            System.out.println("Cola vacia...");
        }
    }
    public int secuencial(int n) {
     
        for (int i = 0; i < ev; i++) {
            
            if (n == myCola[i]) {
                
                return i;
                
            }
        }
        
        return -1;
    }
    
    public void eliminarCliente(int n) {
        
        int pos = secuencial(n);
        
        if (pos != -1) {
            
            desplazarIzq(pos);
            ev--;
            System.out.println(" Cliente Retirado... ");
        } else {
            System.out.println("El cliente ingresado no existe..");
        }
            
    }
    
    public void recorrer() {
        
        for (int i = 0; i < ev; i++) {
            
            System.out.println(myCola[ev] + " ");
            
        }
    }

}
