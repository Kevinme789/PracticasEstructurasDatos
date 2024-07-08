/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listas.avld;

/**
 *
 * @author KevinR
 */
public class Nodo {

    int valor;
    int fe;
    Nodo izq;
    Nodo der;

    public Nodo(int _valor) {
        this.valor = _valor;
        this.fe = 0;
        this.izq = null;
        this.der = null;
    }

}
