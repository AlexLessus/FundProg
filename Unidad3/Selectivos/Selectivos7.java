/*
   Enunciado: 7. Hacer un algoritmo que permita leer dos números diferentes y los imprima en forma ascendente
   Progamador: Alexis De Jesus Perez Carmona
   Fecha: 20/10/2022
*/
import java.util.Scanner;

public class Selectivos7{
   public static void main(String args[]){
      Scanner leer = new Scanner(System.in);
      int n1, n2;
      System.out.println("Ingrese dos numeros diferentes: ");
      n1 = leer.nextInt();
      n2 = leer.nextInt();
      
      if(n1 > n2){
         System.out.printf("%d, %d \n" ,n2 ,n1);
      }
      else{
         System.out.printf("%d, %d \n",n1 ,n2);
      }
      System.out.print("Alexis De Jesus Perez Carmona");
   }
}