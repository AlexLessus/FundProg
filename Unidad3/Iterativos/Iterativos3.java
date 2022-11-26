/*
   Enunciado: 3. Realizar un programa que imprima la secuencia de despegue de una aeronave: 10,9,8,7,6,5,4,3,2,1,¡¡¡¡Despegamos!!!
   Programador: Alexis De Jesus Perez Carmona
   Fecha: 10/27/2022
*/

import java.util.Scanner;
//break rompe totalmente el ciclo
//continue salta a la siguente iteración
public class Iterativos3{
   public static void main(String args[]){
      Scanner get = new Scanner(System.in);
      for(int i = 10;i>0;i--){
         System.out.println(i);
      }      
         System.out.println("¡¡¡Despegamos!!");
   }
}