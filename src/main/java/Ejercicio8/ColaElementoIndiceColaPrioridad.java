package Ejercicio8;

import ar.edu.uner.fcad.ed.edlineales.colas.ColaPorEnlaces;
import java.util.Objects;

/**
 *
 * @author DANIEL
 * @param <T>
 */
public class ColaElementoIndiceColaPrioridad<T> implements Comparable<ColaElementoIndiceColaPrioridad<T>> {

    public ColaElementoIndiceColaPrioridad() {
    }

    private int prioridad;
    private ColaPorEnlaces<ElementoIndexado> cola;

    public ColaElementoIndiceColaPrioridad(int prioridad, ColaPorEnlaces<ElementoIndexado> cola) {
        this.prioridad = prioridad;
        this.cola = cola;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public ColaPorEnlaces<ElementoIndexado> getCola() {
        return cola;
    }


    @Override
    public int compareTo(ColaElementoIndiceColaPrioridad<T> o) {
        return Integer.compare(this.prioridad, o.prioridad);
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + this.prioridad;
        hash = 97 * hash + Objects.hashCode(this.cola);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ColaElementoIndiceColaPrioridad<?> other = (ColaElementoIndiceColaPrioridad<?>) obj;
        if (this.prioridad != other.prioridad) {
            return false;
        }
        return Objects.equals(this.cola, other.cola);
    }

    @Override
    public String toString() {
        return "ColaElementoIndiceColaPrioridad{" + "prioridad=" + prioridad + ", cola=" + cola + '}';
    }

  
}
    
