/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listas.taller2b2p;
public class NodoA  extends Persona{
    float prom;
    NodoA izq;
    NodoA der;
    public NodoA(int _Id, String _nombre, char _sexo, float _prom){
    super(_Id,_nombre,_sexo);
    this.prom = _prom;
    this.izq = null;
    this.der = null;
    }
    
}
