
package Ejercicio3;
import Ejercicio4.*;


public class ClienteColaPrioridad {
    public static void main(String[] args) {
        // ESTO PARA LA COLA PRIORIDAD HECHA CON ARRAY
//        
//        ColaPrioridad cola = new ColaPrioridad();
//        System.out.println("Esta vacia? "+ cola.isEmpty());
//        cola.insert(10, "arbol");
//        System.out.println("Esta vacia? "+ cola.isEmpty());
//        
        
        
        
        
        
        
    
        
        
        // ESTO PARA LA COLA PRIORIDAD HECHA CON LISTA NO ORDENADA
        
     ColaPrioridadConLista colaLista = new ColaPrioridadConLista();
     colaLista.insert(1, "pikachu");
     colaLista.insert(1, "pichu");
     colaLista.insert(10, "voltorb");
     colaLista.insert(10, "arcanine");
     colaLista.insert(20, "eevee");
     colaLista.insert(20, "flareon");
     colaLista.insert(20, "vaporeon");
     colaLista.insert(20, "sylveon");
     colaLista.insert(18, "nidorina");
     colaLista.insert(2, "charmander");
     colaLista.insert(2, "charmilion");
     colaLista.insert(2, "charizard");
     colaLista.insert(3, "bulbasaur");
     colaLista.insert(4, "wartortle");
     colaLista.insert(4, "blastoise");
       
        System.out.println("ColaLista: "+colaLista); // SE IMPRIMEN NUMEROS DEBIDO AL METODO .get() de ListaEnlazadaNoOrdenada
        System.out.println("Cantidad de elementos en colaLista:"+colaLista.size());
        System.out.println("Elemento con mayor prioridad: "+colaLista.max());
        colaLista.deleteMax();
        System.out.println("Lista al eliminar el elemento con mayor prioridad(quito eevee): "+colaLista);
        
    }
    
    
    
}
