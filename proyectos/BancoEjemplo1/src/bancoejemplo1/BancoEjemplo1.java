/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancoejemplo1;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author ASUS
 */
public class BancoEjemplo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       

//se declaran las 3 colas
        Queue <Banco> cola1  =new LinkedList <Banco>();
        Queue <Banco> cola2  =new LinkedList <Banco>();
        Queue <Banco> cola3  =new LinkedList <Banco>();

//se declaran los 3 métodos que se encargan de atender a un cliente

 public void atender_caja1(){
        Banco c1 = cola1.remove();
        taSalida.setText("Atendiendo a: "+ c1.getNombres()+"\n");
       
        taCaja1.setText("");
        Iterator it = cola1.iterator();
        
        while(it.hasNext()){
        Banco es = (Banco) it.next();
        taCaja1.append(es.getNombres()+"\n");
          }
        }

public void atender_caja2(){   
        Banco c2 = cola2.remove();
        taSalida.setText("Atendiendo a: "+ c2.getNombres()+"\n");
        
        taCaja2.setText("");
        Iterator itx = cola2.iterator();
        
        while(itx.hasNext()){
        Banco x = (Banco) itx.next();
        taCaja2.append(x.getNombres()+"\n");
          }
        }

public void atender_caja3(){
        Banco c3 = cola3.remove();
        taSalida.setText("Atendiendo a: "+ c3.getNombres()+"\n");
        
        taCaja3.setText("");
        Iterator it2 = cola3.iterator();
        
        while(it2.hasNext()){
        Banco x2 = (Banco) it2.next();
        taCaja3.append(x2.getNombres()+"\n");
        }
        }

//método encargado de "cerrar el banco" imprimiendo en un textArea cuantos clientes se atendieron

 public void cerrar(){
    String clientes=tfClientes.getText();
    int Tc=Integer.parseInt(clientes);
                    
    taCaja1.setText("");    
    taCaja2.setText("");   
    taCaja3.setText("");   
    taSalida.setText("Se atendieron a: \n"+Tc+" Clientes");
    tfClientes.setText("");
    }

//botón abrir

//se declara un arreglo con 65 nombres
String nombres[]={"Juan", "Pedro", "Alberto", "Rodrigo", "Fernando", 
                        "Francisco", "Luis", "Angel", "Susana", "Cecilia",
                        "Lucita","Karina","Antuan","Sergio", "Maria","Guadalupe",
                        "Antonio","Alfonso","Victor","Rebeca","Teresa", "Esperanza",
                        "Margarita","Claudia","Manuel","Enrique","Pablo",
                        "Alfredo","Armando","Humberto", "Rocio","Berenice","Ana",
                        "Mayra","Janette","Gerardo","Carlos","Oscar","Isabel",
                        "David","Maria","Angeles","Patricia","Imelda","Gustavo",
                        "Guillermo","Guillermina","Juana","Rosa","Melissa",
                        "Paola","Marisol","Martha","Graciela","Elizabeth",
                        "Josefina","Elena","Lizeth","Andrea","Raquel","Carolina",
                        "Concepcion","Javier","Mario","Ivan"};
        
//aquí se define el total de clientes basándose en el valor agregado al text field
String clientes=tfClientes.getText();
int Tc=Integer.parseInt(clientes);
 
//ciclo que agrega aleatoriamente, clientes en diferentes cajas       
for (int i=1; i<=Tc; i++){
   int posicion = (int)(Math.random() *64);
   String Naleatorios = nombres[posicion]; 
                              
   int Caja=(int)(Math.random()*3+1);
                              
if (Caja==1){
       taCaja1.append(Naleatorios+"\n"); 
       Banco c1= new Banco();                             
       c1.setNombres(Naleatorios);
       cola1.add(c1); 
}                           
                              
if (Caja==2){
      taCaja2.append(Naleatorios+"\n");
      Banco c2= new Banco();
      c2.setNombres(Naleatorios);
      cola2.add(c2);
    }
                              
if (Caja==3){
      taCaja3.append(Naleatorios+"\n");
      Banco c3= new Banco();
      c3.setNombres(Naleatorios);
      cola3.add(c3);
        }          
    } 


//botón atender

//tratando de que no se quedarán turnos sin atender clientes se agregaron diferentes casos

//elije a la cola que se atenderá suponiendo que solo hay una caja aquí especificamos diferente
//caja se puede interpretar por el programa a un cliente de una cola es por ello el 3

int Caja=(int)(Math.random()*3+1);
       System.out.println(Caja);
       
//aquí comienza a evaluar con el valor obtenido si hay algún cliente en la cola 1 lo atiende en caso
//de no ser así, se crea otro aleatorio, ya sea para caja 2 o 3, lo atiende en caso contrario realiza
//lo mismo ej. si no hay en cola 1 y después sale cola 2 y tampoco hay solo quedaría atender de la 3 
                                
                                              if (Caja==1){                         
       try { 
           atender_caja1();
       }catch(NoSuchElementException c){
              
            
        int C1=(int)(Math.random()*2+1);
        
        if (C1==1){     
        try {
            atender_caja2();
        }catch(NoSuchElementException b){
              
              try{
                  atender_caja3();
               } catch(NoSuchElementException a){
              cerrar();
            }
          }
        }           
        if (C1==2){                            
        try{
            atender_caja3();
        } catch(NoSuchElementException a){
              try {
                  atender_caja2();
              }catch(NoSuchElementException b){

                  cerrar();
          }
        }                       
      }   
    }
  }

//igual que en el caso anterior atiende caja 2, no hay, elige entre 1 y 3, si sale uno y no hay se pasa
//a la siguiente

                                 if (Caja==2){     
        try {
            atender_caja2();
        }catch(NoSuchElementException b){
             
        int C2=(int)(Math.random()*2+1);
        
        if (C2==1){
            try {
                atender_caja1();
            }catch(NoSuchElementException c){
             
                try{
                atender_caja3();
            } catch(NoSuchElementException a){
              
                cerrar();
        }
        }
        }
              if (C2==2){                            
        try{
            atender_caja3();
        } catch(NoSuchElementException a){
             
              try {
                  atender_caja1();
              }catch(NoSuchElementException c){
             
              cerrar();
          }
        }                       
      }   
    }
  }                         

//exactamente lo mismo que los anteriores

                                 if (Caja==3){                            
        try{
         atender_caja3();   
        } catch(NoSuchElementException a){
              
        int C3=(int)(Math.random()*2+1);
        
        if (C3==1){
            try {
                atender_caja1();
            }catch(NoSuchElementException c){
              
              try {
                  atender_caja2();
              }catch(NoSuchElementException b){
              
              cerrar();
          }
        }
     }
        if (C3==2){
        try {
            atender_caja2();
        }catch(NoSuchElementException b){
              
              try {
                  atender_caja1();
              }catch(NoSuchElementException c){
             
              cerrar();
            }
          }
        }
      }
     }
    }
    
}
