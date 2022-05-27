/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

import ar.edu.uner.fcad.ed.arbolesbinariosyheaps.NodoArbolBinario;

/**
 *
 * @author David Zarcó
 */
public class ArbolBinarioExtCliente {
    public static void main(String[] args) {
       
        ArbolBinarioExt<Integer> arbolito = new ArbolBinarioExt<Integer>();
        NodoArbolBinario<Integer> nodo1 = new NodoArbolBinario<Integer>(10);
        NodoArbolBinario<Integer> nodo2 = new NodoArbolBinario<Integer>(5);
        NodoArbolBinario<Integer> nodo3 = new NodoArbolBinario<Integer>(8);
        NodoArbolBinario<Integer> nodo4 = new NodoArbolBinario<Integer>(14);
        NodoArbolBinario<Integer> nodo5 = new NodoArbolBinario<Integer>(16);
        NodoArbolBinario<Integer> nodo6 = new NodoArbolBinario<Integer>(69);
        NodoArbolBinario<Integer> nodo7 = new NodoArbolBinario<Integer>(420);
        NodoArbolBinario<Integer> nodo8 = new NodoArbolBinario<Integer>(19);
        NodoArbolBinario<Integer> nodo9 = new NodoArbolBinario<Integer>(29);
        NodoArbolBinario<Integer> nodo10 = new NodoArbolBinario<Integer>(39);
        NodoArbolBinario<Integer> nodo11 = new NodoArbolBinario<Integer>(49);
        NodoArbolBinario<Integer> nodo12 = new NodoArbolBinario<Integer>(59);
        NodoArbolBinario<Integer> nodo13 = new NodoArbolBinario<Integer>(99);
        NodoArbolBinario<Integer> nodo14 = new NodoArbolBinario<Integer>(89);
        NodoArbolBinario<Integer> nodo15 = new NodoArbolBinario<Integer>(79);
   

        arbolito.agregarHijoIzquierdo(null, nodo1);
        
        arbolito.agregarHijoIzquierdo(nodo1, nodo2);
        arbolito.agregarHijoDerecho(nodo1, nodo3);

        arbolito.agregarHijoIzquierdo(nodo2, nodo4);
        arbolito.agregarHijoDerecho(nodo2, nodo5);

        arbolito.agregarHijoIzquierdo(nodo3, nodo6);
        arbolito.agregarHijoDerecho(nodo3, nodo7);

        arbolito.agregarHijoIzquierdo(nodo4, nodo8);
        arbolito.agregarHijoDerecho(nodo4, nodo9);

        arbolito.agregarHijoIzquierdo(nodo5, nodo10);
        arbolito.agregarHijoDerecho(nodo5, nodo11);

        arbolito.agregarHijoIzquierdo(nodo6, nodo12);
        arbolito.agregarHijoDerecho(nodo6, nodo13);

        arbolito.agregarHijoIzquierdo(nodo7, nodo14);
        arbolito.agregarHijoDerecho(nodo7, nodo15);
        
        System.out.println("ARBOL: "+arbolito);
        System.out.println("Size: "+arbolito.size());
        System.out.println("RAIZ: "+arbolito.raiz());
        System.out.println("Hermanos: "+arbolito.hermanos(nodo2, nodo3));
        System.out.println("Hermanos: "+arbolito.hermanos(nodo3, nodo2));
        System.out.println("Hermanos: "+arbolito.hermanos(nodo4, nodo5));
        System.out.println("Hermanos: "+arbolito.hermanos(nodo6, nodo7));
        System.out.println("Hermanos: "+arbolito.hermanos(nodo8, nodo9));
        System.out.println("Hermanos: "+arbolito.hermanos(nodo10, nodo11));
    }
}
         
