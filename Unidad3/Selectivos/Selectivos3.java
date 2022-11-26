/*
   Enunciado: 3.Calcular el total que una persona debe pagar en un a llantera, si se compran menos de
       5 llantas el precio de cada llanta es de 800$ y de 700$ si se compran 5 o mas.
   Progamador: Alexis De Jesus Perez Carmona
   Fecha: 20/10/2022
*/
import java.util.Scanner;

public class Selectivos3{
   public static void main(String args[]){
      Scanner leer = new Scanner(System.in);
      int llantas;
      float total;
      System.out.println("Cantidad de llantas: ");
      llantas = leer.nextInt();
      
      if(llantas < 5){
         total = 800*llantas;
      }
      else{
         total = 700*llantas;
      }
      
      System.out.printf("Total: %.2f \n", total);
      System.out.print("Alexis De Jesus Perez Carmona");
   }
}