/*
   Enunciado: 1. Realizar un programa que lea 5 numeros desde el reclado e imprima la suma y el primedio
   Programador: Alexis De Jesus Perez Carmona
   Fecha: 10/27/2022
*/

import java.util.Scanner;
//break rompe totalmente el ciclo
//continue salta a la siguente iteración
public class Iterativos1{
   public static void main(String args[]){
      Scanner get = new Scanner(System.in);
      
      int suma=0;
      
      for(int i = 0;i<5;i++){
         System.out.print("Ingrese un numero: ");
         suma += get.nextInt();
      }
      float prom = suma/5;
      System.out.printf("Suma: %d \nPromedio: %.1f", suma, prom);
      
       
   }
}