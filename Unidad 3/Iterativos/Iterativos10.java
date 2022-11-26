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
public class Iterativos10{
   public static void main(String args[]){
      Scanner get = new Scanner(System.in);
      float unidad=0, prom=0, sumGen=0, promGen;
      int contA=0, contR=0;
      for(int i = 1; i<=10; i++){
         unidad = 00;
         prom = 0;
         System.out.println("Alumno " + i); 
         for(int u = 0; u<5; u++){
            System.out.printf("Calificacion unidad %d:", u+1);
            unidad += get.nextInt();
         }
         prom = unidad/5;
         sumGen += prom;
         if(prom >= 70){
            contA++;
         }
         else{
            contR++;
         }
         System.out.printf("Promedio del alumno %d: %.2f \n ===== \n", i, prom);
      }
      promGen = sumGen / 10;
      
      System.out.printf("Promedio general %.2f:\n Aprobados: %d\nReprobados: %d\n", promGen, contA, contR);
      System.out.println("Alexis De Jesus Perez Carmona") ;  
   }
}