package Ejercicio8;

import ar.edu.uner.fcad.ed.edlineales.ListaEnlazadaNoOrdenada;
import ar.edu.uner.fcad.ed.edlineales.colas.ColaPorEnlaces;
import ar.edu.uner.fcad.ed.edlineales.ListaEnlazadaNoOrdenada;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author stefa
 */
public class ColaPrioridadIndexada<T extends Comparable<T>> implements ColaPrioridadIndexadaInterfaz<T> {

    ListaEnlazadaNoOrdenada<ColaElementoIndiceColaPrioridad> lista = new ListaEnlazadaNoOrdenada();

    @Override
    public void insert(T elemento, int prioridad, int indice) {
        var element = new ElementoIndexado(indice, elemento);
        boolean existePrioridad = false;
        for (int i = 0; i < lista.size(); i++) {
            if (this.lista.get(i).getPrioridad() == prioridad) {
                this.lista.get(i).getCola().enqueue(elemento);
                existePrioridad = true;
                break;
            }
        }
        if (!existePrioridad) {
            ColaPorEnlaces<ElementoIndexado> nuevaCola = new ColaPorEnlaces<>();
            nuevaCola.enqueue(element);
            lista.addToFront(new ColaElementoIndiceColaPrioridad(prioridad, nuevaCola));
        }

        this.ordenarPorPrioridad();
    }

    public void ordenarPorPrioridad() {
        List<ColaElementoIndiceColaPrioridad<T>> listaAux = new ArrayList();
        for (int i = 0; i < lista.size(); i++) {
            listaAux.add(lista.get(i));
        }
        Collections.sort(listaAux);
        ListaEnlazadaNoOrdenada<ColaElementoIndiceColaPrioridad> listaNueva = new ListaEnlazadaNoOrdenada<>();
        for (int i = 0; i < listaAux.size(); i++) {
            listaNueva.addToRear(listaAux.get(i));
        }
        lista = listaNueva;
    }

    @Override
    public void change(int indice, T item) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean contains(int indice) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(int indice) {
          List<ElementoIndexado> aux = new ArrayList();
           ElementoIndexado <T> auxnodo = new ElementoIndexado();
        for (int i = 0; i < lista.size(); i++){
                    lista.get(i).getCola().dequeue();      
             }
        }

    @Override
    public T min() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int minIndex() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean isEmpty() {
        return lista.isEmpty();
    }

    @Override
    public int size() {
        int tamanio = 0;
        ListaEnlazadaNoOrdenada<ColaElementoIndiceColaPrioridad> aux = new ListaEnlazadaNoOrdenada();
        aux=lista; 
        for (int i = 0; i < lista.size(); i++) {
            while (!aux.get(i).getCola().isEmpty()) {
                tamanio++;
                aux.get(i).getCola().dequeue();
            }
        }
        return tamanio;
    }

    @Override
    public String toString() {
        return "ColaPrioridadIndexada{" + "lista=" + lista + '}';
    }
    

}

