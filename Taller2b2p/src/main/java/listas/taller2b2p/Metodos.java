/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listas.taller2b2p;

import java.util.Scanner;

/**
 *
 * @author KevinR
 */
public class Metodos {

    Scanner entrada;
    NodoL head;
    NodoL tail;
    NodoA raizM;
    NodoA raizH;

    public Metodos() {
        this.entrada = new Scanner(System.in);
        this.head = null;
        this.tail = null;
        this.raizM = null;
        this.raizH = null;
    }

    public int menu() {
        System.out.println("<<Menu Principal>>");
        System.out.println("[1] Ingresar Estudiantes");
        System.out.println("[2] Reporte de varones");
        System.out.println("[3] Reporte de chicas");
        System.out.println("[0] Salir....");
        return entrada.nextInt();
    }

    public NodoL leerDatos() {
        int _Id;
        String _nombre;
        char _sexo;
        float[] notas = new float[4];
        System.out.println("Inserta ID: ");
        _Id = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Insertar nombre:");
        _nombre = entrada.nextLine();
        System.out.println("Insertar sexo: ");
        _sexo = entrada.next().charAt(0);
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Insertar nota " + (i + 1) + ": ");
            notas[i] = entrada.nextFloat();
        }
        NodoL nuevo = new NodoL(_Id, _nombre, _sexo, notas);
        return nuevo;

    }

    public void insertar() {
        NodoL nuevo = leerDatos();
        if (head == null) {
            head = nuevo;
            tail = nuevo;
        } else {
            tail.sig = nuevo;
            tail = nuevo;

        }

    }

    public void llenarLista() {
        int op;
        do {
            System.out.println("[1] Insertar?");
            System.out.println("[2] Salir... ");
            op = entrada.nextInt();
            if (op == 1) {
                insertar();
            }
        } while (op != 2);
        recorrer();
        System.out.println("");
    }

    public NodoA insertarArbol(NodoL info, NodoA actual) {
        if (actual == null) {
            NodoA nuevo = new NodoA(info.id, info.nombre,
                    info.sexo, info.getpromedio());
            return nuevo;
        } else {
            if (info.id < actual.id) {
                actual.izq = insertarArbol(info, actual.izq);

            } else {
                actual.der = insertarArbol(info, actual.der);
            }

        }
        return actual;
    }

    public void reporte(NodoA actual) {
        if (actual != null) {
            reporte(actual.izq);
            if (actual.prom >= 7) {
                System.out.println(actual.nombre + " esta APROBADO/A....");
            }
            reporte(actual.der);
        }
    }

    public void recorrer() {
        NodoL actual = head;
        while (actual != null) {
            System.out.printf(actual.nombre + " :: ");
            if (actual.sexo == 'M') {
                raizM = insertarArbol(actual, raizM);

            } else {
                raizH = insertarArbol(actual, raizH);
            }
            actual = actual.sig;

        }
    }

}
