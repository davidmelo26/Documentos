package QueuePriority;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class ColadePrioridad {
    
    public static void main(String[] args){
        
        
       PriorityQueue cliente = new PriorityQueue();

     
        int op;
        Scanner opcion = new Scanner(System.in);
        
        do{
            System.out.println("\n Menu \n"
                    + "Escoger opcion: \n"
                    + " 1. Ingreso de clientes\n"
                    + " 2. Colas disponibles\n"
                    + " 3. Salir\n"
                    + "Escribe la opcion: ");
            //Guardar opcion escogida
            op=opcion.nextInt();
            
           switch (op) {
               case 1:
                   System.out.println("Primer opcion: Ingreso de clientes: \n\n");
                   //Generador de tipo de clientes:Ingreso 5 clientes, tipos: PRIORITARIO=1 EMPRESARIAL=2 COMUN=3
                   Random persona = new Random();
                   int contador,tipo;//contador i, tipo num, 
                   //Creamos vector 5 clientes
                   int vector[]= new int [5];
                   for(contador=0; contador<vector.length; contador++){
                       
                       tipo=1+persona.nextInt(3);
                       vector[contador]=tipo;
                       System.out.println("Tipo de cliente: " + tipo);
                       
                   }                           //https://www.youtube.com/watch?v=Ib7royTVP2k
                   for(contador=0; contador<vector.length; contador++){
                       System.out.print(vector[contador] + ", ");//Vector
                       cliente.add(vector[contador]);// Se añaden los clientes a la cola
                       
                   }          
                   System.out.println("\n Clientes en cola" + Arrays.toString(vector));//Convertir los tipos en un vector
                   
                   
                
                   //System.out.println(cliente.isEmpty());
                   
                   
                   
                   System.out.println("El inicio de la cola Prioritaria: " + cliente.peek());
                   int tamanio =cliente.size();
                   while(!cliente.isEmpty()){
                       System.out.println("Atendido en caja Prioritaria: " + cliente.remove());
                   }
                   
                   
//cliente.peek();
                   //cliente.element();
                   
                   //cliente.poll();
                   //cliente.remove();
                   
                   
                   
                   //https://www.youtube.com/watch?v=uwrMPpDFZ3o
                   break;
               case 2:
                   System.out.println("segunda opcion");
                   break;
               case 3:
                   System.out.println("tercer opcion");
                   break;
               default:
                   break;
           }
        }while(op!=3);
        
    }
}

