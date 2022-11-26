/*
   Hacer un programa que almacene los nombres de 8 personas ee impima el nombre con mas letras. 
   Suponga que los nombres ingresados tieen diferente cantidad de letras.
*/
import java.util.Scanner;
public class Unidimencionales13{
   public static void main(String args[]){
      Scanner get = new Scanner(System.in);
      String nombres[] = new String[8];
      int mayor = 0;
      System.out.println("Ingrese 8 nombres de personas");
      for(int i=0; i<nombres.length; i++){
         System.out.printf("Nombres[%d]: ", i);
         nombres[i] = get.nextLine();
      }
      for(int i=1; i<nombres.length; i++){            
         if(nombres[i].length() > nombres[mayor].length()){
            mayor = i;
         }
      }
      
      System.out.printf("\nEl nombre con mayor cantidad de letras es \"%s\"j ", nombres[mayor]);
   }
}