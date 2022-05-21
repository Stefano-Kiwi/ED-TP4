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
       } // AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
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
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ListaEnlazadaNoOrdenada<T> internos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ListaEnlazadaNoOrdenada<T> nivel(int nivel) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
