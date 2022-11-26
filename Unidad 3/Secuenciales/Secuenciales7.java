/*5+
   Enunciado:7. Realice un programa que convierta temperaturas de grados centígrados a grados
      fahrenheit (fahrenheit = grados centígrados * 9 / 5 + 32) 
   Prorgamador: ISC Alexis De Jesus Perez Carmona
   Fecha: 18/10/2022
*/

import java.util.Scanner;

public class Secuenciales7{
   public static void main(String args[]){
      Scanner leer = new Scanner(System.in);      
      float cent, fahr;
      
      System.out.println("Ingrese grados centigrados: ");
      cent = leer.nextFloat();
      
      fahr = cent * 9 / 5 + 32;
      System.out.printf("%.1f° centigrados equivalen a: %.1f° Fahrenheit \n", cent, fahr);
      
      System.out.print("Alexis De Jesus Perez Carmona");
      
   }
}