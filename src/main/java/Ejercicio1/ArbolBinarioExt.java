package Ejercicio1;

import ar.edu.uner.fcad.ed.arbolesbinariosyheaps.ArbolBinario;
import ar.edu.uner.fcad.ed.arbolesbinariosyheaps.NodoArbolBinario;
import ar.edu.uner.fcad.ed.edlineales.ListaEnlazadaNoOrdenada;
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
       ArbolBinario<T> res1 = null;
       ArbolBinario<T> res2 = null;
       if(res1.padre(nodo1).equals(res2.padre(nodo2))) {  
            hermanos = true;
            return hermanos;
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
