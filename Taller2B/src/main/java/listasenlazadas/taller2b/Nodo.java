/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listasenlazadas.taller2b;

/**
 *
 * @author kevin
 */
public class Nodo{
    alumno alum;
    Nodo sig;

    public Nodo(int id, String nombre, char sexo, float[] notas) {
        this.alum  = new alumno(id,nombre,sexo,notas);
        this.sig = null;
    }

}
