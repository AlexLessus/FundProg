/*
   Enunciado:4. Hacer un programa que calcule el promedio obtenido por un alumno sabiendo que cursó
   las materias de matemáticas, ciencias naturales y español.

   Prorgamador: ISC Alexis De Jesus Perez Carmona
   Fecha: 18/10/2022
*/

import java.util.Scanner;

public class Secuenciales4{
   public static void main(String args[]){
      Scanner leer = new Scanner(System.in);
      float c1, c2, c3, prom;
      
      System.out.println("Clase 1 ingrese su clificacion: ");
      c1 = leer.nextFloat();
      System.out.println("Clase 2 ingrese su clificacion: ");
      c2 = leer.nextFloat();      
      System.out.println("Clase 3 ingrese su clificacion: ");
      c3 = leer.nextFloat();
       
      prom = (c1 + c2 + c3)/3;
      
      System.out.printf("Promedio: %.1f \n", prom);
      System.out.printf("Alexis De Jesus Perez Carmona");
      
   }
}