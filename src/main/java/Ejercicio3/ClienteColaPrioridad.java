/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author David Zarcó
 */
public class ClienteColaPrioridad {
    public static void main(String[] args) {
        ColaPrioridad cola = new ColaPrioridad();
        System.out.println("Esta vacia? "+ cola.isEmpty());
        cola.insert(10, "arbol");
        System.out.println("Esta vacia? "+ cola.isEmpty());
        
        
        
    }
    
    
    
}
