/*
   Hacer un programa que almacene en un arreglo los nombres de 7 personas e imprima los nombres de menos de 4 letras
*/
import java.util.Scanner;
public class Unidimencionales12{
   public static void main(String args[]){
      Scanner get = new Scanner(System.in);
      String nombres[] = new String[7];
      System.out.println("Ingrese 7 nombres de personas");
      for(int i=0; i<nombres.length; i++){
         System.out.printf("Nombres[%d]: ", i);
         nombres[i] = get.nextLine();
      }
      System.out.println("Los nombres de menos de 4 letras");
      for(int i=0; i<nombres.length; i++){
         if(nombres[i].length() < 4){
            System.out.printf("Nombres[%d]: %S\n", i, nombres[i]);
         }
      }
      
   }
}