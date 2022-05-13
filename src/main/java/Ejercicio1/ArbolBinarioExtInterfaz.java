package Ejercicio1;

import ar.edu.uner.fcad.ed.arbolesbinariosyheaps.NodoArbolBinario;
import ar.edu.uner.fcad.ed.edlineales.ListaEnlazadaNoOrdenada;

/**
 *
 * @author stefa
 */
public interface ArbolBinarioExtInterfaz <T>{
    
    /** Indica la cantidad de elementos almacenados en la estructura. */
    public int size();
    /** Indica si dos nodos son hermanos*/
    public boolean hermanos(NodoArbolBinario<T> nodo1, NodoArbolBinario<T> nodo2);
    /** Devuelve todos los nodos hoja de la estructura*/
    public ListaEnlazadaNoOrdenada<T> hojas();
    /** Devuelve todos los nodos que no son raíz ni hoja*/
    public ListaEnlazadaNoOrdenada<T> internos();
    /** Devuelve todos los nodos que pertenecen al nivel pasado por parámetro.*/
    public ListaEnlazadaNoOrdenada<T> nivel(int nivel);
}
