/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package miaula;

/**
 *
 * @author kevin
 */
public class Alumno extends Persona {

    float[] calif;

    public Alumno(int _id, String _nombre, char _sexo, float[] notas) {
        super(_id, _nombre, _sexo);
        this.calif = notas;
    }

}
