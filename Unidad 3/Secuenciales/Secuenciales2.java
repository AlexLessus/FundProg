/*
   Enunciado:2. Hacer un programa que calcule e imprima el área de un rectángulo (área = base * altura).
   Prorgamador: ISC Alexis De Jesus Perez Carmona
   Fecha: 18/10/2022
*/

import java.util.Scanner;

public class Secuenciales2{
   public static void main(String args[]){
      Scanner leer = new Scanner(System.in);
      int area, base, altura;
      
      System.out.println("Ingrese la base: ");
      base = leer.nextInt();
      System.out.println("Ingrese la altura: ");
      altura = leer.nextInt();
      
      area = base * altura;
      
      System.out.println("El area es: "+ area);
      System.out.print("Alexis De Jesus Perez Carmona");
   }
}