/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arreglos.tarea13;

import java.util.Scanner;

/**
 *
 * @author kevin
 */
public class Metodos {

    Scanner sc = new Scanner(System.in);
    int[][] arreglo;
    String[] alumnos = {"Juan", "Lucia", "Vero", "Carlos"};
    String[] cursos = {"Calculo", "Matematicas", "Historia", "Ciencias", "Logica"};
    String nombre;
    String materia;

    public int menu() {
        System.out.println("Ingrese para darles un valor a las materias   [1]");
        System.out.println("Ingrese para buscar la nota de un estudiante  [2]");
        System.out.println("Imprimir matriz                               [3]");
        System.out.println("Salir                                         [0]");
        return sc.nextInt();
    }

    public void valorMaterias(int f, int c) {
        arreglo = new int[f][c];
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo[i].length; j++) {
                arreglo[i][j] = (int) (Math.random() * 10 + 1);
            }

        }

    }

    public void buscarNota() {
        String n="";
        String m ="";
        int f = 0;
        int c= 0;
        sc.nextLine();
        estudiantes();
        System.out.println("Ingresa el nombre del estudiante");
        nombre = sc.nextLine();
        materias();
        System.out.println("Ingresa la materia de la que quieres consultar");
        materia = sc.nextLine();
        for (int i = 0; i < alumnos.length; i++) {
            if (alumnos[i].equals(nombre)) {
                n = alumnos[i];
                f = i;
            }

        }
        for (int j = 0; j < cursos.length; j++) {
            if (cursos[j].equals(materia)) {
                m = cursos[j];
                c = j;
            }
        }
        System.out.println("El estudiante " + n + " tiene en la materia "+m+" "
                + "una calificacion de "+arreglo[f][c]);

    }

    public void imprimir() {
        System.out.println("---Matriz---");
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo[i].length; j++) {
                System.out.printf("%d\t", arreglo[i][j]);
            }
            System.out.println("");

        }
    }

    public void estudiantes() {
        for (int i = 0; i < alumnos.length; i++) {
            System.out.printf("%s\t", alumnos[i]);
        }
        System.out.println("");
    }

    public void materias() {
        for (int i = 0; i < cursos.length; i++) {
            System.out.printf("%s\t", cursos[i]);
        }
        System.out.println("");
    }
}
