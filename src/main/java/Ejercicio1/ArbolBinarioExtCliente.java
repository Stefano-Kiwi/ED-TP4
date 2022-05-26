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
        NodoArbolBinario<Integer> nodo1 = new NodoArbolBinario<Integer>(1);
        NodoArbolBinario<Integer> nodo2 = new NodoArbolBinario<Integer>(2);
        NodoArbolBinario<Integer> nodo3 = new NodoArbolBinario<Integer>(3);
        NodoArbolBinario<Integer> nodo4 = new NodoArbolBinario<Integer>(4);
        NodoArbolBinario<Integer> nodo5 = new NodoArbolBinario<Integer>(5);
        NodoArbolBinario<Integer> nodo6 = new NodoArbolBinario<Integer>(6);
        NodoArbolBinario<Integer> nodo7 = new NodoArbolBinario<Integer>(7);
        
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
        System.out.println("Hermanos: "+arbolito.hermanos(nodo2, nodo3));
        System.out.println("Nodos hojas: "+arbolito.hojas());
        System.out.println("Nodos internos: "+arbolito.internos());
        System.out.println("Nodos en el nivel 2: "+arbolito.nivel(2));
    }
}
         
