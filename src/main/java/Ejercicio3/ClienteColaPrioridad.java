
package Ejercicio3;
import Ejercicio4.*;


public class ClienteColaPrioridad {
    public static void main(String[] args) {
        // ESTO PARA LA COLA PRIORIDAD HECHA CON ARRAY
        System.out.println("---------- Cola de Prioridad hecha con Array Desordenado: ------------");

        
        ColaPrioridad colaArray = new ColaPrioridad();
        System.out.println("Esta vacia? "+ colaArray.isEmpty());
        colaArray.insert(10, "arbol");
        colaArray.insert(5, "auto");
        colaArray.insert(16, "Mbappe");
        colaArray.insert(1, "gato");
        System.out.println("Tamanio de la cola:");
        System.out.println("toString: "+colaArray);
        System.out.println("El valor maximo es:"+colaArray.max());
        colaArray.deleteMax();
        System.out.println("El nuevo valor maximo es:"+colaArray.max());
        System.out.println("toString: "+colaArray);
        
        
        
        
        
    
        


        
        // ESTO PARA LA COLA PRIORIDAD HECHA CON LISTA NO ORDENADA
        System.out.println("---------- Cola de Prioridad hecha con Lista No Ordenada: ------------");
     ColaPrioridadConLista colaLista = new ColaPrioridadConLista();
     colaLista.insert(1, "pikachu");
     colaLista.insert(1, "pichu");
     colaLista.insert(11, "voltorb");
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
