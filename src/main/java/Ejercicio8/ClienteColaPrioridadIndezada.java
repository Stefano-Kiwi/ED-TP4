package Ejercicio8;

/**
 *
 * @author DANIEL
 */

public class ClienteColaPrioridadIndezada {
    public static void main (String [] args) {
        
    ColaPrioridadIndexada cola = new ColaPrioridadIndexada();
    
    cola.insert("Lapiz", 1, 1); //elemento,prioridad,indice.
    cola.insert("Camara", 9, 2); //elemento,prioridad,indice.
    cola.insert("Taza", 6, 3); //elemento,prioridad,indice.
    cola.insert("Pelota", 2, 4); //elemento,prioridad,indice.
    cola.insert("Fubol", 9, 5); //elemento,prioridad,indice.
    cola.insert("Tomate", 2, 6); //elemento,prioridad,indice.
    cola.insert("Globo", 3, 7); //elemento,prioridad,indice.
    cola.insert("Dubu", 2, 8); //elemento,prioridad,indice.
    cola.insert("Teclado", 1, 9); //elemento,prioridad,indice.
    cola.insert("Cafe", 1, 10); //elemento,prioridad,indice.
    cola.insert("Almohada", 7, 11); //elemento,prioridad,indice.
    cola.insert("Pizarron", 9, 12); //elemento,prioridad,indice.
    cola.insert("Oso", 5, 13); //elemento,prioridad,indice.
    cola.insert("Torta", 6, 14); //elemento,prioridad,indice.
    cola.insert("Te", 2, 15); //elemento,prioridad,indice.
    }   
}