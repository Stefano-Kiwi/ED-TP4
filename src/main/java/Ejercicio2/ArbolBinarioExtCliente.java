package Ejercicio2;

import Ejercicio1.ArbolBinarioExt;
import ar.edu.uner.fcad.ed.arbolesbinariosyheaps.NodoArbolBinario;


/**
 *
 * @author stefa
 */
public class ArbolBinarioExtCliente {
    public static void main(String[] args) {
        ArbolBinarioExt<Integer> arbolito = new ArbolBinarioExt<Integer>();
        NodoArbolBinario<Integer> nodo10 = new NodoArbolBinario<Integer>(10);
        NodoArbolBinario<Integer> nodo5 = new NodoArbolBinario<Integer>(5);
        NodoArbolBinario<Integer> nodo8 = new NodoArbolBinario<Integer>(8);
        NodoArbolBinario<Integer> nodo14 = new NodoArbolBinario<Integer>(14);
        NodoArbolBinario<Integer> nodo16 = new NodoArbolBinario<Integer>(16);
        
        arbolito.agregarHijoDerecho(null, nodo10);
        arbolito.agregarHijoDerecho(nodo10, nodo14);
        arbolito.agregarHijoIzquierdo(nodo10, nodo5);
        arbolito.agregarHijoIzquierdo(nodo5, nodo8);
        arbolito.agregarHijoDerecho(nodo5, nodo16);

        
        System.out.println(arbolito);
        System.out.println("Size: "+arbolito.size());
    }
}
