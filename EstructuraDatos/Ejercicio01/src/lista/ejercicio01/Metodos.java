package lista.ejercicio01;

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
        System.out.println("[1] Insertar notas y obtener su promedio");
        System.out.println("[0] Salir....");
        return entrada.nextInt();
    }

    public boolean listaVacia() {
        return (head == null);
    }

    public Nodo leerNotas(int n) {
        float[] notas = new float[n];
        Nodo nuevo;

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Ingrese calificacion " + (i + 1) + ": ");
            notas[i] = entrada.nextFloat();
        }
        nuevo = new Nodo(getPromedio(notas));
        return nuevo;
    }

    public void insertar() {
        System.out.println("Ingrese el numero de notas a ingresar:");
        Nodo nuevo = leerNotas(entrada.nextInt());
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
            System.out.println("La lista esta vacia");
        } else {
            Nodo nuevo = head;
            while (nuevo != null) {
                System.out.println("Promedio: " + nuevo.notas);
                nuevo = nuevo.sig;
            }
        }
    }
    public float getPromedio(float[] notas) {
        if (notas == null) {
            throw new NullPointerException("No se ingreso ninguna calificacion..");
        }
        float suma = 0;
        for (float nota : notas) {
            suma += nota;
        }
        return suma / notas.length;
    }
}
