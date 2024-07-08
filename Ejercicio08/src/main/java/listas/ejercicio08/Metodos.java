
package listas.ejercicio08;

import java.util.Scanner;

public class Metodos {

    Scanner entrada;
    Nodo head;
    Nodo tail;
    Nodo head2, head3;
    Nodo tail2, tail3;

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

   public void particionar() {
        Nodo nuevo = head;
        int contador = 1;

        while (nuevo != null) {
            Nodo siguiente = nuevo.sig;  
            nuevo.sig = null;
            if (contador % 2 != 0) {
                if (head2 == null) {
                    head2 = nuevo;
                    tail2 = nuevo;
                } else {
                    tail2.sig = nuevo;
                    tail2 = nuevo;
                }
            } else {
                if (head3 == null) {
                    head3 = nuevo;
                    tail3 = nuevo;
                } else {
                    tail3.sig = nuevo;
                    tail3 = nuevo;
                }
            }

            nuevo = siguiente;  
            contador += 1;
        }
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
