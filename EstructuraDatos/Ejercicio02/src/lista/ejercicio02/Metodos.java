package lista.ejercicio02;

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
        System.out.println("[1] Insertar un Valor");
        System.out.println("[2] Eliminar mayor e imprimir");
        System.out.println("[0] Salir");
        return entrada.nextInt();
    }

    public boolean listaVacia() {
        return (head == null);
    }

    public Nodo insertarValor() {
        System.out.println("Ingrese el Elemento: ");
        int valor = entrada.nextInt();
        return new Nodo(valor);
    }

    public void insertar() {
        Nodo nuevo = insertarValor();
        if (listaVacia()) {
            head = nuevo;
            tail = nuevo;
        } else {
            tail.sig = nuevo;
            tail = nuevo;
        }
    }

    public void reporte() {
        if (listaVacia()) {
            System.out.println("La lista está vacía...");
        } else {
            Nodo nuevo = head;
            System.out.println("--Lista Original--");
            while (nuevo != null) {
                System.out.printf(nuevo.valor + "::");
                nuevo = nuevo.sig;
            }
            System.out.println("");
            eliminar();
            nuevo = head;
            System.out.println("--Lista Modificada--");
            while (nuevo != null) {
                System.out.printf(nuevo.valor + "::");
                nuevo = nuevo.sig;
            }
            System.out.println("");
        }
    }

    public void eliminar() {
        if (listaVacia()) {
            System.out.println("La lista está vacía");
            return;
        }
        Nodo previoMax = null;
        Nodo nodoMax = head;
        Nodo previo = null;
        Nodo actual = head;

        while (actual != null) {
            if (actual.valor > nodoMax.valor) {
                nodoMax = actual;
                previoMax = previo;
            }
            previo = actual;
            actual = actual.sig;
        }

        if (previoMax == null) {
            head = nodoMax.sig;
        } else {
            previoMax.sig = nodoMax.sig;
        }

        if (nodoMax == tail) {
            tail = previoMax;
        }
    }

}
