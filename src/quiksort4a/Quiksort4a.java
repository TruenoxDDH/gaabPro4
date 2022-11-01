/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiksort4a;

import java.util.Scanner;

/**
 *
 * @author David
 */
public class Quiksort4a {

    public static void quicksort(int A[], int izq, int der) {

  int pivote=A[izq]; 
  int i=izq;         
  int j=der;        
  int aux;
 
  while(i < j){                                                             
     while(A[i] <= pivote && i < j) i++; 
     while(A[j] > pivote) j--;           
     if (i < j) {                                          
         aux= A[i];                     
         A[i]=A[j];
         A[j]=aux;
     }
   }
   
   A[izq]=A[j];                                      
   A[j]=pivote;     
   
   if(izq < j-1)
      quicksort(A,izq,j-1);          
   if(j+1 < der)
      quicksort(A,j+1,der);          
   
}
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner valor = new Scanner(System.in);
        System.out.println("Ingresa El numero de elmentos que se van a idendentificar");
        int sca = valor.nextInt();
        int [] A= new int [sca];
        System.out.println("ingresa los valores a ordenar");
        for (int i = 0; i < sca; i++) {
            A[i]= valor.nextInt();
            
        }
          System.out.println("Resultado");
        quicksort(A,0,A.length-1);
        for (int i = 0; i < sca; i++) {
            System.out.println(+A[i]);
            
        }
    }
    
}
