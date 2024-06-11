/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listasenlazadas.taller2b;

import java.util.Scanner;

/**
 *
 * @author kevin
 */
public class Metodos {

    Scanner sc;
    Nodo head;
    Nodo tail;

    public Metodos() {
        this.sc = new Scanner(System.in);
        this.head = null;
        this.tail = null;

    }

    public int menu() {
        System.out.println("       MENU PRINCIPAL");
        System.out.println("Insertar Estudiante        [1]:");
        System.out.println("Insertar Ordenado          [2]:");
        System.out.println("Recorrer Lista             [3]:");
        System.out.println("Eliminar elemento          [4]:");
        System.out.println("Salir                      [0]:");
        return sc.nextInt();
    }

    public boolean listaVacia() {
        return (head == null);
    }

    public Nodo leerEstudiante() {
        Nodo nuevo;
        String nombre;
        float[] notas = new float[3];
        System.out.println("Ingrese el nombre del Estudiante:");
        nombre = sc.nextLine();
        System.out.println("Ingrese sexo del Estudiante: ");
        char sexo = sc.nextLine().charAt(0);
        System.out.println("Ingrese el Id del estudiante: ");
        int id = sc.nextInt();
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Ingrese la nota " + (i + 1 )+ ":");
            notas[i] = sc.nextFloat();

        }
        sc.nextLine();
        nuevo = new Nodo(id,nombre,sexo,notas);
        return nuevo;

    }

    public void insertar() {
        Nodo nuevo = leerEstudiante();
        if (listaVacia()) {
            head = nuevo;
            tail = nuevo;
            
        }

    }
    public void listar(){
    if (!listaVacia()) {
            Nodo actual = head;
            while (actual != null) {
                System.out.print(actual.alum + "   ");
                actual = actual.sig;
            }
            System.out.println("");
        } else {
            System.out.println("La lista esta vacia");
        }
    }
    
    
    
    

    public void eliminar(int num) {
        if (listaVacia()) {
            System.out.println("No hay elementos a eliminar....");
        } else {
            if (num == head.valor) {
                head = head.sig;
                if (head == null) {
                    tail = null;
                }
            } else {
                Nodo actual = head;
                while ((actual.sig != null) && (num != actual.sig.valor)) {
                    actual = actual.sig;
                    if (actual.sig != null) {
                        actual.sig = actual.sig.sig;
                        if (actual.sig == null) {
                            tail = actual;
                        }
                    } else {
                        System.out.println("El numero no existe...");
                    }
                }
            }
        }
    }

}
