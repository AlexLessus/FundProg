/*
   Enunciado: 9. Una fruteria ofrece las manzanas con descuento según la siguienet tabla:
         Num de kilos comprados           % Descuento
            Hasta 2                          0%
            Más de 2 y hasta 5               10%
            Más de 5 y hasta 10              15%
            Más de 10                        20%
         Determinar cúanto pagará una persona que compre manzanas es una frutería. 
   Progamador: Alexis De Jesus Perez Carmona
   Fecha: 25/10/2022
*/
import java.util.Scanner;

public class Selectivos9{
   public static void main(String args[]){
      Scanner leer = new Scanner(System.in);
      int nManzana, pManzana;
      float desc, total;
      System.out.println("Numero de manzanas: ");
      nManzana = leer.nextInt();
      System.out.println("Precio por manzana: ");
      pManzana = leer.nextInt();
      total = nManzana * pManzana;
      if(nManzana <= 2){
         desc = 0;
      }
      else if(nManzana > 2 && nManzana <= 5){
         desc = total * 0.10f;
      }
      else if(nManzana > 5 && nManzana <= 10){
         desc = total * 0.15f;
      }
      else{
         desc = total * 0.20f;
      }
      System.out.printf("Total: %.2f \n", total - desc);
      System.out.print("Alexis De Jesus Perez Carmona");
   }
}