package interfaz;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import mundo.Clientes;

public class InterfazApp {

    public static void main(String[] args) {
        
         Scanner leer = new Scanner(System.in);
        //Declaración de la cola
        Queue ClientesEnFila = new LinkedList<Clientes>();
        
        //Instancias de Clientes
        Clientes carmen = new Clientes("carmen");
        Clientes julian = new Clientes("Julian");
        Clientes fabian = new Clientes("Fabian");
        Clientes carlos = new Clientes("Carlos");
        Clientes hilda = new Clientes("Hilda");
        
        //Añadir a los clientes a la cola
        ClientesEnFila.add(carmen);
        ClientesEnFila.add(julian);
        ClientesEnFila.add(fabian);
        ClientesEnFila.add(carlos);
        ClientesEnFila.add(hilda);
        
        //Llamamos a la función que desarrolla el ejercicio
        atencion(ClientesEnFila);
    }
    
    public static void atencion(Queue ClientesEnFila){
        
        //Comprobamos que la cola no esté vacia
        if(ClientesEnFila.isEmpty()){
            System.out.println("NO HAY CLIENTES QUE ATENDER");
        }
        
        //Atendemos mientras haya clientes en la cola
        while(!ClientesEnFila.isEmpty()){
            //Creamos una variable para almacenar el nombre del cliente actual y otra para el # de clientes faltantes
            Clientes clienteActual = (Clientes) ClientesEnFila.poll();
            int clientesRestantes = ClientesEnFila.size();
            
            //Avisamos que el cliente ha sido atentido y actualizamos al usuario los clientes faltantes
            System.out.println(clienteActual.getNombre() + " ha sido atendido");
            System.out.println("Quedan " + ClientesEnFila.size() + " Por atender \n");
        }
        //confirmamos al usuario que la cola está vacía
        System.out.println("La cola está vacía: " + ClientesEnFila.isEmpty());
    }
}
