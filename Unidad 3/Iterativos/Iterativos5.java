/*
   Enunciado: 3. Realizar un programa que reciba 5 numeros enteros e imprima el mayor de ellos
   
   Programador: Alexis De Jesus Perez Carmona
   Fecha: 10/27/2022
*/

import java.util.Scanner;
//break rompe totalmente el ciclo
//continue salta a la siguente iteración
public class Iterativos5{
   public static void main(String args[]){
      Scanner get = new Scanner(System.in);
      int a=0,b=0,c=0,r=0;
     
      for(int i = 0; i<=10; i++){
         System.out.println("Ingrese la calificacion:");
         int cal = get.nextInt();
         if(cal > 90 && cal <= 100){
            a++;
         }
         else if(cal > 80 && cal <= 90){
            b++;
         }
         else if(cal > 70 && cal <= 80){
            c++;
         }
         else if(cal < 70){
            r++;
         }
      }
      System.out.printf("Cantidad de alumnos con: \n A: %d\n B: %d\n C: %d\n R: %d",a,b,c,r);
   }
}