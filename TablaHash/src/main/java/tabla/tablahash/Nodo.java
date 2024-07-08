/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tabla.tablahash;

/**
 *
 * @author KevinR
 */
public class Nodo {

    int id;
    String nombre;
    Nodo sig;

    public Nodo(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        sig = null;
    }
}
