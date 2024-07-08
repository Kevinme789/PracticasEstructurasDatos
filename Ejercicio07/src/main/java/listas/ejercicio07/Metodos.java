
package listas.ejercicio07;

import java.util.Scanner;

public class Metodos {

    Scanner entrada;
    Nodo head;
    Nodo tail;

    public Metodos() {
        this.entrada = new Scanner(System.in);
        this.tail = null;
        this.head = null;
    }

    public int menu() {
        System.out.println("[1] Ingresar un numero");
        System.out.println("[2] Ingresar ordenacion y recorrer");
        return entrada.nextInt();
    }

    public void llenar() {
        System.out.println("Numero:");
        int num = entrada.nextInt();
        insertar(num);

    }

    public void insertar(int num) {
        Nodo nodo = new Nodo(num);
        if (head == null) {
            head = nodo;
            tail = nodo;
        } else {
            tail.sig = nodo;
            tail = nodo;

        }
    }

    public void recorrer() {
        Nodo nuevo = head;
        while (nuevo != null) {
            System.out.printf(nuevo.valor + ":");
            nuevo = nuevo.sig;
        }
        System.out.println("");
    }

    public void ordenar() {
        Nodo nuevo = head;
        Nodo nuevo2 = head;
        int aux;
        while (nuevo2 != null) {
            tail = nuevo;
            nuevo = head;
            while (nuevo != null) {
                if (nuevo.sig == null) {
                    break;
                }
                if (nuevo.valor > nuevo.sig.valor) {
                    aux = nuevo.valor;
                    nuevo.valor = nuevo.sig.valor;
                    nuevo.sig.valor = aux;
                }

                nuevo = nuevo.sig;
                if (nuevo.sig == null) {
                    break;
                }
            }
            nuevo2 = nuevo2.sig;
        }
        tail = nuevo;

    }
}
