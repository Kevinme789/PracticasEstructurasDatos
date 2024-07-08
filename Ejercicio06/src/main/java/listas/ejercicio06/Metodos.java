
package listas.ejercicio06;

import java.util.Scanner;

public class Metodos {

    Scanner entrada;
    Nodo head;
    Nodo tail;

    public Metodos() {
        this.entrada = new Scanner(System.in);
        this.head = null;
        this.tail = null;
    }

    public int menu() {
        System.out.println("[1] Ingresar un nuevo Nodo");
        System.out.println("[2] Ingresar ordenacion y presentar en pantalla");
        return entrada.nextInt();
    }

    public void insertar(char letra) {
        Nodo nodo = new Nodo(letra);
        if (head == null) {
            head = nodo;
            tail = nodo;
        } else {
            tail.sig = nodo;
            tail = nodo;

        }
    }

   public Nodo invertir() {
        Nodo invertida = null;
        Nodo nuevo2 = head;

        while (nuevo2 != null) {
            Nodo nuevoNodo = new Nodo(nuevo2.letra);
            nuevoNodo.sig = invertida; 
            invertida = nuevoNodo; 
            nuevo2 = nuevo2.sig;
        }

        return invertida; // Devolver la cabeza de la lista invertida
    }

    public void recorrer() {
        Nodo nuevo = head;
        while (nuevo != null) {
            System.out.printf(nuevo.letra + "   ");
            nuevo = nuevo.sig;
        }
        System.out.println("");
    }

    public void recorrer(Nodo _head) {
        Nodo nuevo = _head;
        while (nuevo != null) {
            System.out.printf(nuevo.letra + "   ");
            nuevo = nuevo.sig;
        }
        System.out.println("");
    }
}
