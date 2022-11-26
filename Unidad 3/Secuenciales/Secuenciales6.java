/*
   Enunciado:6. Realice un programa que calcule e imprima el área de un círculo (área = pi * radio^2) 
   Prorgamador: ISC Alexis De Jesus Perez Carmona
   Fecha: 18/10/2022
*/

import java.util.Scanner;

public class Secuenciales6{
   public static void main(String args[]){
      Scanner leer = new Scanner(System.in);      
      float area, radio;
      
      System.out.println("Ingrese el radio: ");
      radio = leer.nextFloat();
      //Cuadrado = Math.pow(n, 2);
      area = (float)Math.pow(radio,2) * 3.1416f;
      System.out.printf("Area = %.2f \n",area);
      
      System.out.print("Alexis De Jesus Perez Carmona");
      
   }
}