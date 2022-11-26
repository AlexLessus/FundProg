/*
   Enunciado: 1. Hacer un programa que pueda convertir kilogramos a gramos
   Prorgamador: ISC Alexis De Jesus Perez Carmona
   Fecha: 18/10/2022
*/

import java.util.Scanner;

public class Secuenciales1{
   public static void main(String args[]){
      Scanner leer = new Scanner(System.in);
      float kg, gr;
      System.out.println("Ingrese los kilogramos: ");
      kg = leer.nextFloat();
      
      gr = kg*1000;
      //Printf es para formato, %(f para floar, %d para enteros
      System.out.printf("%.2f kilogramos equivale a %.1f gramos \n", kg, gr);
      System.out.print("Alexis De Jesus Perez Carmona");
   }
}