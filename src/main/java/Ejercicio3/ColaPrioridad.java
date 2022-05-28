package Ejercicio3;

import ar.edu.uner.fcad.ed.edlineales.ListaEnlazadaNoOrdenada;
import ar.edu.uner.fcad.ed.edlineales.colas.ColaPorEnlaces;


public class ColaPrioridad<T extends Comparable<T>> implements ColaPrioridadInterfaz<T>{
    protected ListaEnlazadaNoOrdenada<ColaPorEnlaces> lista = new ListaEnlazadaNoOrdenada<ColaPorEnlaces>(); 
    
    @Override
    public void insert(int prioridad, T element) {
    if(lista.isEmpty()){
        ColaPorEnlaces cola = new ColaPorEnlaces();
        cola.enqueue(element);
        lista.addToFront(cola);
    }
    
    }

    @Override
    public T max() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void deleteMax() {

    }

    @Override
    public boolean isEmpty() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int size() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   
}
