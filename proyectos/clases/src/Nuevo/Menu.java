/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nuevo;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Menu {
    public static void main(String[] args){
        
        int op=0,a, b,r;
        Scanner tecla = new Scanner(System.in);
        
        do{
            System.out.println("1. opcion");
            System.out.println("2 opcion");
            System.out.println("3 opcion");
            
            op=tecla.nextInt();
            
            if(op==1){
                System.out.println("Primer opcion");
                
            }else if(op==2){
                System.out.println("segunda opcion");
                
            }else if(op==3){
                System.out.println("tercer opcion");
                
            }
        }while(op!=3);
        }
}
