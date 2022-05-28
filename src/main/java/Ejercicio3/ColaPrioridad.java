package Ejercicio3;

import ar.edu.uner.fcad.ed.edlineales.ListaEnlazadaOrdenada;
import ar.edu.uner.fcad.ed.edlineales.colas.ColaPorEnlaces;


public class ColaPrioridad<T extends Comparable<T>> implements ColaPrioridadInterfaz<T>{
    protected ListaEnlazadaOrdenada<ColaElementoColaPrioridad<T>> lista = new ListaEnlazadaOrdenada<>(); 
    
    @Override
    public void insert(int prioridad, T element) {
    boolean existePrioridad = false;
        for (int i = 0; i < lista.size(); i++) {
            if (this.lista.get(i).getPrioridad() == prioridad) {
                this.lista.get(i).getCola().enqueue(element);
                existePrioridad = true;
                break;
            }
        }
        if(!existePrioridad){
            ColaPorEnlaces<T> nuevaCola = new ColaPorEnlaces<T>();
            nuevaCola.enqueue(element);
            lista.add(new ColaElementoColaPrioridad(prioridad, nuevaCola));
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
        return lista.isEmpty();
    }

    @Override
    public int size() {
        return lista.size();
    }

   
}
