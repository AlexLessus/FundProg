/*
   Enunciado: 4) En un supermercado se hace una promoción, mediante la cual el cliente obtiene un descuento dependiendo
      de un número que saca de una caja. Si el numero obtenido es menor que 74 el descuento es del 15% sobre el
      total de la compra, si es mayor o igual a 74 el descuento es del 20%. Obtener cuál es el valor del descuento.   Progamador: Alexis De Jesus Perez Carmona
   Fecha: 20/10/2022
*/
import java.util.Scanner;

public class Selectivos4{
   public static void main(String args[]){
      Scanner leer = new Scanner(System.in);
      int num, compra;
      float desc;
      System.out.println("Cual es su numero: ");
      num = leer.nextInt();
      
      System.out.println("Su compra: ");
      compra = leer.nextInt();
      
      if(num < 74){
         desc = compra * 0.15f;
      }
      else{
         desc = compra *0.20f;
      }
      
      
      System.out.printf("Descuento: %.2f \n", desc);
      System.out.print("Alexis De Jesus Perez Carmona");
   }
}