/*
   Enunciado: 10. Leer tres numeros diferentes e imprimir el nmero mayor de los tres 
   Progamador: Alexis De Jesus Perez Carmona
   Fecha: 25/10/2022
*/
import java.util.Scanner;

public class Selectivos10{
   public static void main(String args[]){
      Scanner leer = new Scanner(System.in);
      int n1, n2, n3;
      System.out.println("Introduce tres numeros diferentes: ");
      n1 = leer.nextInt();
      n2 = leer.nextInt();
      n3 = leer.nextInt();
      
      if(n1 > n2 && n1 > n3){
         System.out.println("El numero mayor es: " + n1);
      }else if(n2 > n1 && n2 > n3){
         System.out.println("El numero mayor es: " + n2);
      }
      else{
         System.out.println("El numero mayor es: " + n3);
      }
      
      System.out.print("Alexis De Jesus Perez Carmona");
   }
}