/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio6;

/**
 *
 * @author David Zarcó
 */
class NodoColaHeap<T> implements Comparable<NodoColaHeap<T>> {
    private static int ULTIMO_ORDEN = -1;
    protected T valor;
    protected Integer orden;
    
    public  NodoColaHeap (T valor){
    this.valor = valor;
    this.orden = ++ULTIMO_ORDEN;
    }    

    @Override
    public int compareTo(NodoColaHeap<T> o) {
        return Integer.compare(this.orden, o.orden);
    }

    @Override
    public String toString() {
        return "NodoColaHeap{" + "valor=" + valor + ", orden=" + orden + '}';
    }
    
}
