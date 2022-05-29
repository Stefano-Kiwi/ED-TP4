package Ejercicio4;

import ar.edu.uner.fcad.ed.edlineales.colas.ColaPorEnlaces;
import java.util.Objects;

/**
 *
 * @author stefa
 */
public class ColaElementoColaPrioridad<T> implements Comparable<ColaElementoColaPrioridad<T>> {
    
   private int prioridad;
   private ColaPorEnlaces<T> cola;

    public ColaElementoColaPrioridad(int prioridad, ColaPorEnlaces<T> cola) {
        this.prioridad = prioridad;
        this.cola = cola;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public ColaPorEnlaces<T> getCola() {
        return cola;
    }

    
    
    @Override
    public int compareTo(ColaElementoColaPrioridad<T> o) {
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
        final ColaElementoColaPrioridad<?> other = (ColaElementoColaPrioridad<?>) obj;
        if (this.prioridad != other.prioridad) {
            return false;
        }
        return Objects.equals(this.cola, other.cola);
    }

    @Override
    public String toString() {
        return "ColaElementoColaPrioridad{" + "prioridad=" + prioridad + ", cola=" + cola + '}'+"\n";
    }
   
   
   
}