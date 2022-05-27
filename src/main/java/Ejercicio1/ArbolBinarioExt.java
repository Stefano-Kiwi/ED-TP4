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
        boolean hermanos = false;
       NodoArbolBinario<T> aux = null;
       NodoArbolBinario<T> aux2 = null;              
       NodoArbolBinario<T> padre1 = null;
       boolean ayuda = false;
       NodoArbolBinario<T> resultado = raiz;
        
       Izquierdo:
       {
       while(resultado.tieneHijoIzquierdo()){
           aux=resultado.getHijoIzquierdo();
           if(aux.equals(nodo1) || aux.equals(nodo2)){
           padre1=resultado;
           ayuda = true;
           break;
           }
           resultado=resultado.getHijoIzquierdo();
       }
       }
       if (padre1 == null) {
            resultado=raiz;
       while(resultado.tieneHijoDerecho()){
           aux=resultado.getHijoIzquierdo();
           if(aux.equals(nodo1) || aux.equals(nodo2)){
           padre1=resultado;
           ayuda = true;
           break;
           }
           resultado=resultado.getHijoDerecho();
       }
       if (padre1 == null) {
               return false;
           }
       if(ayuda=true && padre1.tieneHijoDerecho()){
          if(padre1.getHijoDerecho().equals(nodo2) || padre1.getHijoDerecho().equals(nodo1)){
           return true;
           } 
         }  
        
       }     
       if(ayuda=true && padre1.tieneHijoDerecho()){
           if(padre1.getHijoDerecho().equals(nodo2) || padre1.getHijoDerecho().equals(nodo1)){
           hermanos = true;    
           }
       }
       return hermanos;
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
            if(aux.first().tieneHijoIzquierdo()){
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
            if(aux.first().tieneHijoIzquierdo()){
                aux.addToRear(aux.first().getHijoDerecho());
            }
            aux.removeFirst();
        }
        return internos;
    }

    @Override
    public ListaEnlazadaNoOrdenada<T> nivel(int nivel) {
        return null;
    }

}
