/*
   Enunciado 10: Realizar un programa que calcule e imprima el promedio de cada uno de los 
      diez alumnos que cursan la materia de fundamentos de programación de dicha materia se deben 
      leer las calificaciones de las cinco unidades que integran. Al final informar el promedio 
      general del grupo y la cantidad de alumnos que aprobaron (prom >=70) y la cantidad de 
      alumnos que reprobaron(prom < 70)
   Programador: Alexis De Jesus Perez Carmona
   Fecha: 10/28/2022
*/
import java.util.Scanner;
public class Iterativos12{
   public static void main(String args[]){
      Scanner get = new Scanner(System.in);
      float n1=0, n2=0, n3=0;
      boolean diferentes= false;
      
      
      for(int i = 0; i<3 ; i++){
         System.out.println("Ingrese 3 numeros diferentes");
         n1 = get.nextFloat();
         n2 = get.nextFloat();
         if(n1!=n2){
            n3 = get.nextInt();
            if(n3 != n1 && n3 != n2){
               break;
            }
            else{
               i=0;
            }
         }
         else{
            i=0;
         }
      }
      
      if(n1 < n2 && n1 < n3){
         System.out.println("El menor es: " + n1);
      }
      else if(n2 < n1 && n2 < n3){
         System.out.println("El menor es: " + n2);         
      }
      else{
         System.out.println("El menor es: " + n3);         
      }

      System.out.println("Alexis De Jesus Perez Carmona") ;  
   }
}