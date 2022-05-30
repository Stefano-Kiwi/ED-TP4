package Ejercicio3;

import Ejercicio4.ColaElementoColaPrioridad;
import ar.edu.uner.fcad.ed.edlineales.ListaEnlazadaNoOrdenada;
import ar.edu.uner.fcad.ed.edlineales.colas.ColaPorEnlaces;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class ColaPrioridad<T extends Comparable<T>> implements ColaPrioridadInterfaz<T>{
    protected ColaElementoColaPrioridad<T> [] arreglo = new ColaElementoColaPrioridad[0];

    public ColaPrioridad() {
        
    }
    
    @Override
    public void insert(int prioridad, T element) {
    boolean existePrioridad = false;
        for (int i = 0; i < arreglo.length; i++) {
            if (this.arreglo[i].getPrioridad() == prioridad) {
                this.arreglo[i].getCola().enqueue(element);
                existePrioridad = true;
                break;
            }
        }
        if(!existePrioridad){
            ColaPorEnlaces<T> nuevaCola = new ColaPorEnlaces<>();
            nuevaCola.enqueue(element);
            this.add(new ColaElementoColaPrioridad(prioridad, nuevaCola));
            
           
        }
        this.ordenarPorPrioridad();
    }
    
    @Override
    public T max() {
     int maxPrio = 0;
     T max = null;
        for (int i = 0; i < arreglo.length; i++) {
            if(arreglo[i].getPrioridad()>maxPrio && arreglo[i].getCola().getFront()!=null){
                maxPrio = arreglo[i].getPrioridad();
               max = arreglo[i].getCola().getFront();
            }
        }
     
     return max;
    }

    @Override
    public void deleteMax() {
        T max = this.max();
        for (int i = 0; i < arreglo.length; i++) {
            if(arreglo[i].getCola().getFront()==max){
                arreglo[i].getCola().dequeue();
                if(arreglo[i].getCola().getFront()==null){
                    this.remove(i);
                }
            }
        }
    }

    @Override
    public boolean isEmpty() {
        return arreglo.length == 0;
    }

    @Override
    public int size() {
        return arreglo.length;
    }

   public void add(ColaElementoColaPrioridad valor){
        //Crear nuevoArray con length = array.length + 1
        ColaElementoColaPrioridad [] nuevoArray = new ColaElementoColaPrioridad[arreglo.length + 1];
        //Copiar los valores de array en otro array nuevoArray
        for (int i = 0; i < arreglo.length; i++) {
            nuevoArray[i] = arreglo[i];
        }
        //Poner el nuevo valor en nuevoArray 
        nuevoArray[nuevoArray.length - 1] = valor;        
        //Sobreescribir el valor de array
        this.arreglo = nuevoArray;
    }

   public void remove(int indice){
        //Crear nuevoArray con length = array.length - 1
        ColaElementoColaPrioridad<T> [] nuevoArray = new ColaElementoColaPrioridad[arreglo.length - 1]; 
        
        //Copiar todos los valores menos indice
        int indiceAux = 0;
        for (int i = 0; i < arreglo.length; i++) {
            if (i != indice){
                nuevoArray[indiceAux] = arreglo[i];
                indiceAux++;
            }
        }
        
        //Sobreescribir el array con nuevoArray
        this.arreglo = nuevoArray;
    }
   public void ordenarPorPrioridad() {
        List<ColaElementoColaPrioridad<T>> listaAux = new ArrayList();
        for (int i = 0; i < arreglo.length; i++) {
            listaAux.add(arreglo[i]);
        }
        Collections.sort(listaAux);
        ColaElementoColaPrioridad<T> [] arregloNuevo = new ColaElementoColaPrioridad[listaAux.size()];
        for (int i = 0; i < listaAux.size(); i++) {
            arregloNuevo[i] = (listaAux.get(i));
            
        }
        arreglo = arregloNuevo;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ColaPrioridad{");
        sb.append("arreglo=");
        for (int i = 0; i < arreglo.length; i++) {
            sb.append(arreglo[i].getCola()+"\n");
        }
        sb.append('}');
        return sb.toString();
    }

    
   
   
   
}
