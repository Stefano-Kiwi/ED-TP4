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
        NodoArbolBinario<Integer> nodo8 = new NodoArbolBinario<Integer>(8);
        NodoArbolBinario<Integer> nodo9 = new NodoArbolBinario<Integer>(9);
        NodoArbolBinario<Integer> nodo10 = new NodoArbolBinario<Integer>(10);
        NodoArbolBinario<Integer> nodo11 = new NodoArbolBinario<Integer>(11);
        NodoArbolBinario<Integer> nodo12 = new NodoArbolBinario<Integer>(12);
        NodoArbolBinario<Integer> nodo13 = new NodoArbolBinario<Integer>(13);
        NodoArbolBinario<Integer> nodo14 = new NodoArbolBinario<Integer>(14);
        NodoArbolBinario<Integer> nodo15 = new NodoArbolBinario<Integer>(15);
        NodoArbolBinario<Integer> nodo16 = new NodoArbolBinario<Integer>(16);

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
        
         arbolito.agregarHijoDerecho(nodo15, nodo16);
        
        
        System.out.println("ARBOL: "+arbolito);
        System.out.println("Size: "+arbolito.size());
        System.out.println("RAIZ: "+arbolito.raiz());
        System.out.println("Hermanos: "+arbolito.hermanos(arbolito.padre(nodo2),arbolito.padre(nodo15)));
        System.out.println("Nodos hojas: "+arbolito.hojas());
        System.out.println("Nodos internos: "+arbolito.internos());
        System.out.println("Nodos en el nivel 3: "+arbolito.nivel(3));

    }
}
         
