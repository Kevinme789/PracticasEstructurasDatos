/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package miaula;

import java.util.Scanner;

/**
 *
 * @author kevin
 */
public class Metodos {

    Scanner entrada;
    Alumno[] miAula;
    int ev;

    public Metodos(int lim) {
        this.entrada = new Scanner(System.in);
        this.miAula = new Alumno[lim];
        this.ev = 0;
    }

    public int menu() {
        System.out.println("Insertar          [1]");
        System.out.println("Eliminar          [2]");
        System.out.println("Reporte varones   [3]");
        System.out.println("Reporte mujeres   [4]");
        System.out.println("Listar            [5]");
        System.out.println("Salir             [0]");
        return entrada.nextInt();
    }

    public boolean aulaVacia() {
        return (ev == 0);
    }

    public boolean aulaLlena() {
        return (ev == miAula.length);
    }

    public void insertar() {
        if (!aulaLlena()) {
            miAula[ev] = LeeDatos();
            ev++;

        } else {
            System.out.println("No hay espacio....");
        }
    }

    public Alumno LeeDatos() {
        int id;
        String nombre;
        char sexo;
        float[] notas = new float[3];
        System.out.println("Ingrese su Id");
        id = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese nombre");
        nombre = entrada.nextLine();
        System.out.println("Ingrese sexo");
        sexo = entrada.next().charAt(0);
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Ingrese calificacion " + (i + 1));
            notas[i] = entrada.nextFloat();
        }
        Alumno nuevo = new Alumno(id, nombre, sexo, notas);
        return nuevo;
    }

    public void presentar() {
        if (!aulaVacia()) {
            for (int i = 0; i < ev; i++) {
                System.out.println("Id: " + miAula[i].id);
                System.out.println("Nombre: " + miAula[i].nombre);
                System.out.println("Sexo: " + miAula[i].sexo);
                System.out.println("Nota 1: " + miAula[i].calif[0]);
                System.out.println("Nota 2: " + miAula[i].calif[1]);
                System.out.println("Nota 3: " + miAula[i].calif[2]);
                System.out.println("======================");
            }

        } else {
            System.out.println("Aula Vacia...");
        }
    }
}
