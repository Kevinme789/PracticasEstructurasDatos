/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arreglos.tarea8;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author kevin
 */
public class Metodos {

    Scanner sc = new Scanner(System.in);
    String[] nombres = {"Kevin", "Juan", "Pepe", "Santiago", "Leandro", "Andy",
        "Wilson", "Fernando", "Felix", "Aldrin", "Anthony", "Simon", "Carol", "Maria",
        "ELiza", "Francisco", "Jose", "Mariana", "Maribel", "Susana"};
    double[] calculo = new double[20];
    double[] matematicas = new double[20];
    double[] historia = new double[20];
    double[] ingles = new double[20];

    public int menu() {
        System.out.println("Establecer las notas de los Alumnos      [1]");
        System.out.println("Ver la media de cada Alumno              [2]");
        System.out.println("Ver la media de cada Asignatura          [3]");
        System.out.println("Ver la media de toda la Clase            [4]");
        return sc.nextInt();
    }

    public void establecerNotas() {
        for (int i = 0; i < calculo.length; i++) {
            calculo[i] = Math.random() * 10 + 1;
            matematicas[i] = Math.random() * 10 + 1;
            historia[i] = Math.random() * 10 + 1;
            ingles[i] = Math.random() * 10 + 1;
        }

    }

    public void mediaAlumno() {
        double promedio;
        for (int i = 0; i < calculo.length; i++) {
            promedio = (calculo[i] + matematicas[i] + historia[i] + ingles[i]) / 4;
            System.out.printf("El estudiante: %s\nTiene una media de: %.2f\n",
                    nombres[i], promedio);
            System.out.println("------------------------------------------------");

        }

    }

    public void mediaAsignaturas() {
        double a1 = 0, a2 = 0, a3 = 0, a4 = 0;
        for (int i = 0; i < calculo.length; i++) {
            a1 = a1 + calculo[i];
            a2 = a2 + matematicas[i];
            a3 = a3 + historia[i];
            a4 = a4 + ingles[i];
        }
        a1 = a1 / calculo.length;
        a2 = a2 / matematicas.length;
        a3 = a3 / historia.length;
        a4 = a4 / ingles.length;
        System.out.printf("La media de la materia de Calculo es: %.2f\nLa media"
                + " de la materia de Matematicas es: %.2f\nLa media de la materia"
                + " de Historia es: %.2f\nLa media de la materia de Ingles es: %.2f\n",
                a1, a2, a3, a4);
    }

    public void mediaGeneral() {
        double media = 0;
        for (int i = 0; i < calculo.length; i++) {
            media = media + calculo[i] + matematicas[i] + ingles[i] + historia[i];
        }
        media = media / 80;
        System.out.printf("La media general de toda la clase es: %.2f\n", media);

    }

}
