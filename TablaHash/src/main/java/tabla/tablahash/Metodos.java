/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tabla.tablahash;

import java.util.Scanner;

/**
 *
 * @author KevinR
 */
public class Metodos {

    Scanner entrada;
    Nodo[] claves;
    int tamanio;

    public Metodos(int _num) {
        this.entrada = new Scanner(System.in);
        this.tamanio = _num;
        this.claves = new Nodo[tamanio];
        for (int i = 0; i < tamanio; i++) {
            claves[i] = null;
        }
    }

    public int menu() {
        System.out.println("[1] Insertar..");
        System.out.println("[2] Listar..");
        System.out.println("[0] Salir...");
        return entrada.nextInt();
    }

    public boolean nodoVacio(Nodo actual) {
        return actual == null;
    }

    public void insertar() {
        int _id;
        String _nombre;
        System.out.println("Digite el Id: ");
        _id = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Digite el nombre: ");
        _nombre = entrada.nextLine();
        insertHash(getHash(getNumero(_nombre)), _id, _nombre);
    }

    public int getNumero(String cadena) {
        int sum = 0;
        for (int i = 0; i < cadena.length(); i++) {
            sum += (int) cadena.charAt(i);
        }
        return sum;
    }

    public int getHash(int num) {
        return num % tamanio;
    }

    public void insertHash(int key, int _Id, String _nombre) {
        Nodo nuevo = new Nodo(_Id, _nombre);
        if (nodoVacio(claves[key])) {
            claves[key] = nuevo;
        } else {
            Nodo actual = claves[key];
            while (!nodoVacio(actual.sig)) {
                actual = actual.sig;
            }

        }
    }

    public void listar() {
        for (int i = 0; i < tamanio; i++) {
            if (!nodoVacio(claves[i])) {
                Nodo actual = claves[i];
                while (!nodoVacio(actual)) {
                    System.out.println(actual.id + " " + actual.nombre + " -> ");
                    actual = actual.sig;
                }
                System.out.println("NUll ");
            }
        }
    }
}
