/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listas.taller2b2p;
public class NodoL extends Persona {

    float[] notas;
    NodoL sig;

    public NodoL(int _Id, String _nombre, char _sexo, float[] notas) {
        super(_Id, _nombre, _sexo);
        this.notas = notas;
        this.sig = null;
    }

    public float getpromedio() {
        float acum = 0;
        for (float nota : notas) {
            acum += nota;
        }
        return acum / notas.length;
    }

}
