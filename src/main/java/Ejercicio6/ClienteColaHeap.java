/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio6;
import ar.edu.uner.fcad.ed.arbolesbinariosyheaps.ArbolBinario;
import ar.edu.uner.fcad.ed.arbolesbinariosyheaps.NodoArbolBinario;

/**
 *
 * @author David Zarcó
 */
public class ClienteColaHeap {
    public static void main(String[] args) {
        ColaHeap<String> cola = new ColaHeap();
        cola.enqueue("1");
        cola.enqueue("3");
        cola.enqueue("2");
        cola.enqueue("4");
        cola.enqueue("5");
        cola.enqueue("6");
        cola.enqueue("7");
        cola.enqueue("9");
        cola.enqueue("8");
        cola.enqueue("11");
        cola.enqueue("10");
        cola.enqueue("12");
        System.out.println("COLA: "+cola.toString());
        cola.dequeue();
        System.out.println("COLA: "+cola.toString());
        System.out.println("Front valor: "+cola.getFront());
        System.out.println("Make Empty:");
        cola.makeEmpty();
        System.out.println("COLA esta vacia: "+cola.isEmpty());
        System.out.println("Isfull:"+cola.isFull());
                

    }
    
}
