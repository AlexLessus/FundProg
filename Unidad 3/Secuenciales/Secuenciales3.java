/*
   Enunciado:3. Hacer un programa que calcule e imprima la cantidad de dinero que una persona pagará
      por concepto de predial. El predial aumentó 3.5% respecto del pago hecho en el año
      anterior   Prorgamador: ISC Alexis De Jesus Perez Carmona
   Fecha: 18/10/2022
*/

import java.util.Scanner;

public class Secuenciales3{
   public static void main(String args[]){
      Scanner leer = new Scanner(System.in);
      float predAnt, pred;
      
      System.out.println("Ingrese su predial anterior: ");
      predAnt = leer.nextFloat();
      
      pred = predAnt + predAnt*(float)0.035;
      
      System.out.printf("Total de este año: %f \n", pred);
      System.out.print("Alexis De Jesus Perez Carmona");
   }
}