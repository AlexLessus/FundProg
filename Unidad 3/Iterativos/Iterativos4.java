/*
   Enunciado: 3. Realizar un programa que reciba 5 numeros enteros e imprima el mayor de ellos
   
   Programador: Alexis De Jesus Perez Carmona
   Fecha: 10/27/2022
*/

import java.util.Scanner;
//break rompe totalmente el ciclo
//continue salta a la siguente iteración
public class Iterativos4{
   public static void main(String args[]){
      Scanner get = new Scanner(System.in);
      int m = 0;
      for(int i = 1;i<=5;i++){
         System.out.println("numero "+i);
         int num = get.nextInt();
         
         if(i==1){
            m = num;
         }
         else if(num > m){
            m = num;
         }
         
      }      
         System.out.println("El mayor es: "+m);
   }
}