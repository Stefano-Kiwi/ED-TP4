package Ejercicio1;

import ar.edu.uner.fcad.ed.arbolesbinariosyheaps.ArbolBinario;
import ar.edu.uner.fcad.ed.arbolesbinariosyheaps.NodoArbolBinario;
import ar.edu.uner.fcad.ed.edlineales.ListaEnlazadaNoOrdenada;
import ar.edu.uner.fcad.ed.edlineales.colas.ColaPorEnlaces;
import ar.edu.uner.fcad.ed.edlineales.iteradores.Iterador;

public class ArbolBinarioExt<T> extends ArbolBinario<T> implements ArbolBinarioExtInterfaz<T> {

    @Override
    public int size() {
        int size = 0;
        Iterador<T> iterador = iteradorPreorden();
        while(iterador.existeSiguiente()==true){
            size++;
            iterador.siguiente();
        }
        return size;
    }

    @Override
    public boolean hermanos(NodoArbolBinario<T> nodo1, NodoArbolBinario<T> nodo2) {
        boolean hermano = false;
        if (nodo1.equals(nodo2)){
            hermano = true;
        {
       return hermano;
    }
       

    @Override
    public ListaEnlazadaNoOrdenada<T> hojas() {
        ListaEnlazadaNoOrdenada<T> hojas = new ListaEnlazadaNoOrdenada();
        ListaEnlazadaNoOrdenada<NodoArbolBinario<T>> aux = new ListaEnlazadaNoOrdenada();
        
        aux.addToFront(raiz);
        while(!aux.isEmpty()){ // Mientras la lista aux todavia tenga elementos
            if(aux.first().getCantidadHijos()==0){
                hojas.addToRear(aux.first().getValor());
            }
            if(aux.first().tieneHijoIzquierdo()){
                aux.addToRear(aux.first().getHijoIzquierdo());
            }
            if(aux.first().tieneHijoDerecho()){
                aux.addToRear(aux.first().getHijoDerecho());
            }
            aux.removeFirst();
        }
        return hojas;
    }

    @Override
    public ListaEnlazadaNoOrdenada<T> internos() {
        ListaEnlazadaNoOrdenada<T> internos = new ListaEnlazadaNoOrdenada();
        ListaEnlazadaNoOrdenada<NodoArbolBinario<T>> aux = new ListaEnlazadaNoOrdenada();
        
        aux.addToFront(raiz);
        while(!aux.isEmpty()){ 
            if(aux.first()!= this.raiz && (aux.first().tieneHijoIzquierdo() || aux.first().tieneHijoDerecho())){
                internos.addToRear(aux.first().getValor());
            }
            if(aux.first().tieneHijoIzquierdo()){
                aux.addToRear(aux.first().getHijoIzquierdo());
            }
            if(aux.first().tieneHijoDerecho()){
                aux.addToRear(aux.first().getHijoDerecho());
            }
            aux.removeFirst();
        }
        return internos;
    }
    

    @Override
    public ListaEnlazadaNoOrdenada<T> nivel(int nivel) {
      ListaEnlazadaNoOrdenada<NodoArbolBinario> arbol = new ListaEnlazadaNoOrdenada();
        ListaEnlazadaNoOrdenada<NodoArbolBinario<T>> aux = new ListaEnlazadaNoOrdenada();
        aux.addToFront(raiz);
        while(!aux.isEmpty()){ 
                arbol.addToRear(aux.first());
            if(aux.first().tieneHijoIzquierdo()){
                aux.addToRear(aux.first().getHijoIzquierdo());
            }
            if(aux.first().tieneHijoDerecho()){
                aux.addToRear(aux.first().getHijoDerecho());
            }
            aux.removeFirst();
        } //Llenar la lista con todos los elementos del arbol.
        
        ListaEnlazadaNoOrdenada<T> nodosNivel = new ListaEnlazadaNoOrdenada();
        NodoArbolBinario <T> auxnodo;
        if (nivel == 0){
            nodosNivel.addToRear(raiz.getValor());
            return nodosNivel;
        }
        arbol.removeFirst(); //remuevo la raiz.
        if (nivel >= 1) {
            while (!arbol.isEmpty()){
                auxnodo = arbol.first();
                if (profundidad(auxnodo) == nivel){
                    nodosNivel.addToRear(auxnodo.getValor());
                }
                arbol.removeFirst();
            }          
        }
      return nodosNivel;
    }
    
    public int profundidad (NodoArbolBinario <T> nodo) {
        int profundidad = 0;
        if (nodo != raiz){
            profundidad = 1 + profundidad(padre(nodo));
        }
        return profundidad;
    }
    
    
    
    
}
