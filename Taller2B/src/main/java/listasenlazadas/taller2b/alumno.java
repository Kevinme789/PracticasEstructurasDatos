/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listasenlazadas.taller2b;

/**
 *
 * @author kevin
 */
public class alumno extends persona {

    float[] notas;

    public alumno(int id, String nombre, char sexo, float[] notas) {
        super(id, nombre, sexo);
        this.notas = notas;
    }

    public float getPromedio() {
        float sum = 0;
        for (float nota : notas) {
            sum += nota;

        }
        return (sum / 3);

    }

}
