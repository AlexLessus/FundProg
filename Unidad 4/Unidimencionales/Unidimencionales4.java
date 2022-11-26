/*
   Hacer un programa que almececne 5 numero s enteros diferentes en un vector
*/
import java.util.Scanner;
public class Unidimencionales4{
   public static void main(String args[]){
      Scanner get = new Scanner(System.in);
      System.out.println("Tamaño del arreglo");
      int n = get.nextInt();
      int arr[] = new int[n];
      
      for(int i=0; i<n; i++){
         System.out.printf("Numero[%d]: ", i);
         arr[i] = get.nextInt();
         for(int t=i; t>0; i--){
            if(arr[i] == arr[t] && i!=1){
               System.out.printf("Numero[%d]: ", i);
               arr[i] = get.nextInt();
            }
         }
      }
      
      
      
      for(int i=0; i<n; i++){
         System.out.printf("arr[%d]: %d",i,arr[i]);
      }
   }
}