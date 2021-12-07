package com.company;

import java.util.Scanner;

public class P149_SanFermines {    
    
    public static void main(String[] args) {

   	 Scanner sc = new Scanner(System.in);
   	 
	 int velocidadCorredor = 0;
	 int velocidad;
   	 
   	 while (sc.hasNextInt()) {
   		 
   		 int n = sc.nextInt();   	 
   	   	 velocidad = 0;
   	   	 
   		 for (int i = 0; i < n; i++) {
   	 
   		 	final int velocidadToro = sc.nextInt();
   		 
   		 	if (velocidad < velocidadToro) {
   			 	velocidad = velocidadToro;
   		 	}
   		 	
   	 	 }
   	  	 velocidadCorredor = velocidad;
   	   	 System.out.println(velocidadCorredor);
   	 } 
   	 sc.close();
 
   	
    }
}



