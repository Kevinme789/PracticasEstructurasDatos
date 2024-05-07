/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arreglos.evaluacionparcial1b;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author kevin
 */
public class Metodos {

    Scanner sc;
    String nombre;
    double calculo;
    double programacion;
    double logica;
    File archivo;
    int cont;
    String[] nombrea;
    float[] calculoa;
    float[] programaciona;
    float[] logicaa;

    public Metodos() {
        this.sc = new Scanner(System.in);
        this.archivo = new File("Aula.txt");
        this.cont = 0;
    }

    public int menu() {
        int op;
        System.out.println("Para guardar un estudiante     [1]");
        System.out.println("Almacenar datos                [2]");
        System.out.println("Imprimir aprobados             [3]");
        System.out.println("Salir                          [0]");
        op = sc.nextInt();
        return op;
    }

    public void Preguntar() {

        sc.nextLine();
        System.out.println("Ingrese su nombre: ");
        nombre = sc.nextLine();
        calculo = calculo();
        programacion = programacion();
        logica = logica();
        guardar();
        cont = cont + 1;

    }

    public void guardar() {
        FileWriter escribir;
        String cadena = String.format("%d\n%s\n"
                + "%.2f\n%.2f\n"
                + "%.2f\n", cont,
                nombre, calculo, programacion, logica);
        PrintWriter linea;
        if (!archivo.exists()) {
            try {
                archivo.createNewFile();
            } catch (Exception e) {
            }
        }
        try {
            escribir = new FileWriter(archivo, true);
            linea = new PrintWriter(escribir);
            linea.println(cadena);
            linea.close();
        } catch (Exception e) {

        }

    }

    public double calculo() {
        double nt1;
        double nt2;
        double nt3;
        System.out.println("Ingrese la nota numero uno de Calculo");
        nt1 = sc.nextDouble();
        System.out.println("Ingrese la nota numero dos de Calculo");
        nt2 = sc.nextDouble();
        System.out.println("Ingrese la nota numero tres de Calculo");
        nt3 = sc.nextDouble();
        return (nt1 + nt2 + nt3) / 3;
    }

    public double programacion() {
        double nt1;
        double nt2;
        double nt3;
        System.out.println("Ingrese la nota numero uno de Programacion");
        nt1 = sc.nextDouble();
        System.out.println("Ingrese la nota numero dos de Programacion");
        nt2 = sc.nextDouble();
        System.out.println("Ingrese la nota numero tres de Programacion");
        nt3 = sc.nextDouble();
        return (nt1 + nt2 + nt3) / 3;
    }

    public double logica() {
        double nt1;
        double nt2;
        double nt3;
        System.out.println("Ingrese la nota numero uno de Logica");
        nt1 = sc.nextDouble();
        System.out.println("Ingrese la nota numero dos de Logica");
        nt2 = sc.nextDouble();
        System.out.println("Ingrese la nota numero tres de Logica");
        nt3 = sc.nextDouble();
        return (nt1 + nt2 + nt3) / 3;
    }

    public void importar() {
        FileReader leer;
        BufferedReader almacenamiento;
        String cadena = "";
        nombrea = new String[cont + 1];
        calculoa = new float[cont + 1];
        programaciona = new float[cont + 1];
        logicaa = new float[cont + 1];
        String basura;
        try {
            leer = new FileReader(archivo);
            almacenamiento = new BufferedReader(leer);
            for (int i = 0; i <= cont; i++) {

                cadena = almacenamiento.readLine();
                basura = cadena;
                cadena = almacenamiento.readLine();
                nombrea[i] = cadena;
                cadena = almacenamiento.readLine();
                calculoa[i] = Float.parseFloat(cadena);
                cadena = almacenamiento.readLine();
                programaciona[i] = Float.parseFloat(cadena);
                cadena = almacenamiento.readLine();
                logicaa[i] = Float.parseFloat(cadena);

            }
            almacenamiento.close();
            leer.close();
        } catch (Exception e) {
            System.out.println("Error");
            System.out.println(nombrea[0]);
            System.out.println(programaciona[0]);
            System.out.println(logicaa[0]);
            System.out.println(calculoa[0]);

        }
    }

    public void aprobados() {
        for (int i = 0; i <= cont; i++) {
            if (calculoa[i] >= 7) {
                System.out.printf("El estudiante %s APROBO CALCULO\n\n", nombrea[i]);
            }
            if (programaciona[i] >= 7) {
                System.out.printf("El estudiante %s APROBO PROGRAMACION\n\n", nombrea[i]);
            }
            if (logicaa[i] >= 7) {
                System.out.printf("El estudiante %s APROBO LOGICA\n\n", nombrea[i]);
            }
        }

    }
}
