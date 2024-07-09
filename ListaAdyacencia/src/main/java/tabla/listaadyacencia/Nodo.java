/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tabla.listaadyacencia;

/**
 *
 * @author KevinR
 */
public class Nodo {

    String vecino;
    Nodo sig;

    public Nodo(String _vecino) {
        this.vecino = _vecino;
        this.sig = null;
    }
}
