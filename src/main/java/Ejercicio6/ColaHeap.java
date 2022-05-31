package Ejercicio6;
 
import ar.edu.uner.fcad.ed.arbolesbinariosyheaps.Heap;
import ar.edu.uner.fcad.ed.arbolesbinariosyheaps.NodoArbolBinario;
import ar.edu.uner.fcad.ed.edlineales.ListaEnlazadaNoOrdenada;
import ar.edu.uner.fcad.ed.edlineales.NodoLista;
import ar.edu.uner.fcad.ed.edlineales.colas.Cola;



public class ColaHeap <T extends Comparable<? super T>> implements Cola <T>{ 
    
    protected Heap<NodoColaHeap<T>> heap;
    
    public ColaHeap (){
        this.heap=new Heap();
    }
    
    @Override
    public boolean isEmpty() {        
    return (heap.raiz()==null);
    }

    @Override
    public boolean isFull() {
       return false;
    }

    @Override
    public T getFront() {
    return (heap.raiz().valor);
    }

    @Override
    public void dequeue() {
        heap.removeMin();
    }

    @Override
    public void enqueue(T t) {
        NodoColaHeap<T> nuevoNodo = new NodoColaHeap(t);
        heap.addElement(nuevoNodo);     
        
    }

    @Override
    public void makeEmpty() {
        while(!heap.isEmpty()){
        heap.removeMin();
        }
    }

    @Override
    public String toString() {
        return "ColaHeap{" + "heap=" + heap + '}';
    }
   

}
