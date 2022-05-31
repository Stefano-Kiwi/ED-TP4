/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Ejercicio8;

/**
 *
 * @author DANIEL
 * @param <T>
 */
public class ElementoIndexado <T> {

 private int indice;
 private T elemento;

    public ElementoIndexado() {
    }

 
 
    public ElementoIndexado(int indice, T elemento) {
        this.indice = indice;
        this.elemento = elemento;
    }

    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }

    public T getElemento() {
        return elemento;
    }

    public void setElemento(T elemento) {
        this.elemento = elemento;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + this.indice;
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
        final ElementoIndexado<?> other = (ElementoIndexado<?>) obj;
        return this.indice == other.indice;
    }

    @Override
    public String toString() {
        return "ElementoIndexado{" + "indice=" + indice + ", elemento=" + elemento + '}';
    }
 
 
}
