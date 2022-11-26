/*
   Enunciado: 2.Hacer un programa que calcule el total a pagar poe la compra de camisas. Si se 
      compran tres camisas o más se aplica un descuento del 20% sobre el total de la compre 
      y si son menos de tres camisas un descuento del 10% todas las camisas tienen el mismo precio
   Progamador: Alexis De Jesus Perez Carmona
   Fecha: 20/10/2022
*/
import java.util.Scanner;

public class Selectivos2{
   public static void main(String args[]){
      Scanner leer = new Scanner(System.in);
      float cantidad, precio, total, desc;
      System.out.println("Cantidad de camisas: ");
      cantidad = leer.nextFloat();
      System.out.println("Precio por camisa: ");
      precio = leer.nextFloat();
      
      total = cantidad * precio;
      if(cantidad >= 3){
         desc = total * 0.80f;
      }
      else{
         desc = total * 0.90f;
      }
      System.out.printf("Total: %.2f \n", desc);
      System.out.print("Alexis De Jesus Perez Carmona");
   }
}