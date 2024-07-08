/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listas.avld;

import java.util.Scanner;

/**
 *
 * @author KevinR
 */
public class Metodos {

    Scanner entrada;
    Nodo raiz;
    boolean h;

    public Metodos() {
        this.entrada = new Scanner(System.in);
        this.raiz = null;
        this.h = false;
    }

    public int menu() {
        System.out.println("[1] Insertar");
        System.out.println("[2] Buscar");
        System.out.println("[3] Eliminar");
        System.out.println("[4]Recorrer");
        System.out.println("[0] Salir...");
        return entrada.nextInt();
    }

    public boolean nodoVacio(Nodo actual) {
        return actual == null;
    }

    public Nodo rotacionII(Nodo actual, Nodo n1) {
        actual.izq = n1.der;
        n1.der = actual;
        if (n1.fe == -1) {
            actual.fe = 0;
            n1.fe = 0;

        } else {
            actual.fe = -1;
            n1.fe = 1;
        }
        return n1;

    }

    public Nodo rotacionID(Nodo actual, Nodo n1) {
        Nodo n2 = n1.der;
        actual.izq = n2.der;
        n2.der = actual;
        n1.der = n2.izq;
        n2.izq = n1;
        if (n2.fe == 1) {
            n1.fe = -1;

        } else {
            n1.fe = 0;
        }
        if (n2.fe == -1) {
            actual.fe = 1;
        } else {
            actual.fe = 0;
        }
        return n2;

    }

    public Nodo rotacionDD(Nodo actual, Nodo n1) {
        actual.der = n1.izq;
        n1.izq = actual;
        if (n1.fe == 1) {
            actual.fe = 0;
            n1.fe = 0;

        } else {
            actual.fe = -1;
            n1.fe = 1;
        }
        return n1;
    }

    public Nodo insertarAVL(int num, Nodo actual) {
        if (nodoVacio(actual)) {
            Nodo nuevo = new Nodo(num);
            h = true;
            return nuevo;
        } else if (num < actual.valor) {
            actual.izq = insertarAVL(num, actual.izq);
            if (h) {
                switch (actual.fe) {
                    case -1:
                        Nodo n1 = actual.izq;
                        if (n1.fe == -1) {
                            actual = rotacionDD(actual, n1);
                        } else {
                            actual = rotacionDI(actual, n1);
                            h = false;
                        }
                        break;
                    case 0:
                        actual.fe = -1;
                        break;
                    case 1:
                        actual.fe = 0;
                        h = false;
                }
            }
        } else {
            if (h) {
                switch (actual.fe) {
                    case -1:
                        Nodo n1 = actual.izq;
                        if (n1.fe == -1) {
                            actual = rotacionII(actual, n1);
                        } else {
                            actual = rotacionID(actual, n1);
                            h = false;
                        }
                        break;
                    case 0:
                        actual.fe = 1;
                        break;
                    case 1:
                        actual.fe = 0;
                        h = false;
                }
            }

        }
        return actual;

    }

}
