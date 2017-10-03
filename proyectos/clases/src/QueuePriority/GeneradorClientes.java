package QueuePriority;

import java.util.Random;


public class GeneradorClientes {
    
        public void generador(){
         
            //Generador de tipo de clientes:Ingreso 5 clientes, tipos: PRIORITARIO=1 EMPRESARIAL=2 COMUN=3
        Random cliente = new Random();
        int contador,tipo;//contador i, tipo num, 
        
        //Creamos vector
        int vector[]= new int [5];
        
        for(contador=1; contador<vector.length; contador++){
            
            tipo=1+cliente.nextInt(3);
            vector[contador]=tipo;
            
            System.out.println("Tipo de cliente: " + tipo);
        }//https://www.youtube.com/watch?v=Ib7royTVP2k
            
        }
        }
