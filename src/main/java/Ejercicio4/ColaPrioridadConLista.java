package Ejercicio4;

import Ejercicio3.ColaPrioridadInterfaz;
import ar.edu.uner.fcad.ed.edlineales.ListaEnlazadaNoOrdenada;
import ar.edu.uner.fcad.ed.edlineales.colas.ColaPorEnlaces;

/**
 *
 * @author stefa
 */
public class ColaPrioridadConLista<T extends Comparable<T>> implements ColaPrioridadInterfaz<T> {
    protected ListaEnlazadaNoOrdenada<ColaElementoColaPrioridad<T>> lista = new ListaEnlazadaNoOrdenada<>(); 
    
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
            lista.addToFront(new ColaElementoColaPrioridad(prioridad, nuevaCola));
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
