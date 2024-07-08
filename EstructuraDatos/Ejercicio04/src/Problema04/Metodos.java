package Problema04;

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
        System.out.println("[1] Insertar Elemento");
        System.out.println("[2] Invertir e imprimir");
        System.out.println("[0] Salir");
        return entrada.nextInt();
    }

    public boolean listaVacia() {
        return (head == null);
    }

    public Nodo llenar() {
        System.out.println("Ingrese el Elemento: ");
        int nota = entrada.nextInt();
        return new Nodo(nota);
    }

    public void insertar() {
        Nodo nuevo = llenar();
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
            System.out.println("La lista está vacía");
        } else {
            Nodo actual = head;
            while (actual != null) {
                System.out.printf(actual.valor+"::");
                actual = actual.sig;
            }
        }
        System.out.println("");
    }

    public void imprimirInvertido() {
        System.out.println("Lista en orden invertido:");
        imprimirInvertidoRecursivo(head);
        System.out.println();
    }

    private void imprimirInvertidoRecursivo(Nodo nodo) {
        if (nodo == null) {
            return;
        }
        imprimirInvertidoRecursivo(nodo.sig);
        System.out.print(nodo.valor + "::");
    }

}
