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
        
        arbolito.agregarHijoIzquierdo(null, nodo1);
        arbolito.agregarHijoDerecho(nodo1, nodo3);
        arbolito.agregarHijoIzquierdo(nodo1, nodo2);
        arbolito.agregarHijoIzquierdo(nodo2, nodo4);
        arbolito.agregarHijoDerecho(nodo2, nodo5);
        arbolito.agregarHijoIzquierdo(nodo3, nodo6);
        arbolito.agregarHijoDerecho(nodo3, nodo7);
        System.out.println(arbolito);
        System.out.println("Size: "+arbolito.size());
        System.out.println("RAIZ: "+arbolito.raiz());
        System.out.println("Hermanos: "+arbolito.hermanos(nodo7, nodo2));
    }
}
         
