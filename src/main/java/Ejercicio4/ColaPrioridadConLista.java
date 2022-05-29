package Ejercicio4;

import Ejercicio3.ColaPrioridadInterfaz;
import ar.edu.uner.fcad.ed.edlineales.ListaEnlazadaNoOrdenada;
import ar.edu.uner.fcad.ed.edlineales.colas.ColaPorEnlaces;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author stefa
 */
public class ColaPrioridadConLista<T extends Comparable<T>> implements ColaPrioridadInterfaz<T> {

    protected ListaEnlazadaNoOrdenada<ColaElementoColaPrioridad<T>> lista = new ListaEnlazadaNoOrdenada<>();

    public ColaPrioridadConLista() {
    }

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
        if (!existePrioridad) {
            ColaPorEnlaces<T> nuevaCola = new ColaPorEnlaces<>();
            nuevaCola.enqueue(element);
            lista.addToFront(new ColaElementoColaPrioridad(prioridad, nuevaCola));
        }

        this.ordenarPorPrioridad();
    }

    @Override
    public T max() {
        int maxPrio = 0;
        T maxElemento = null;
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getPrioridad() > maxPrio) {
                maxPrio = lista.get(i).getPrioridad();
                maxElemento = lista.get(i).getCola().getFront();
            }
        }
        
        return maxElemento;
    }

    @Override
    public void deleteMax() {
//        int maxPrio = 0;
//        
//        for (int i = 0; i < lista.size(); i++) {
//            if (lista.get(i).getPrioridad() > maxPrio) {
//                maxPrio = lista.get(i).getPrioridad();
//                
//            }
//        }
        lista.get(lista.size()-1).getCola().dequeue();
        
        
    }

    @Override
    public boolean isEmpty() {
        return lista.isEmpty();
    }

    @Override
    public int size() {
        int tamanio = 0;
        List<T> aux = new ArrayList();
        for (int i = 0; i < lista.size(); i++) {
            while (!lista.get(i).getCola().isEmpty()) {
                aux.add(lista.get(i).getCola().getFront());
                lista.get(i).getCola().dequeue();
            }
            tamanio += aux.size();
            for (int y = 0; y < aux.size(); y++) {
                lista.get(i).getCola().enqueue(aux.get(y));
            }
            aux.clear();
        }

        return tamanio;
    }

    public void ordenarPorPrioridad() {
        List<ColaElementoColaPrioridad<T>> listaAux = new ArrayList();
        for (int i = 0; i < lista.size(); i++) {
            listaAux.add(lista.get(i));
        }
        Collections.sort(listaAux);
        ListaEnlazadaNoOrdenada<ColaElementoColaPrioridad<T>> listaNueva = new ListaEnlazadaNoOrdenada<>();
        for (int i = 0; i < listaAux.size(); i++) {
            listaNueva.addToRear(listaAux.get(i));
        }
        lista = listaNueva;
    }

    @Override
    public String toString() {
        return "ColaPrioridadConLista{" + "lista=" + lista + '}';
    }

}
