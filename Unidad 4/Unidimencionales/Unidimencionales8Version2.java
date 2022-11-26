/*
   8. Hacer un programa que permita almacenar un texto (caracter a caracter) en un arreglo de
   caracteres mientras el usuario no presione la tecla enter. Explore dicho arreglo e imprima cuantas 
   letras a o A contiene el arreglo. para facilitar el prigrama suponga que el usuario ingresá el texto sin acentos.
   Programador 
*/
import java.util.Scanner;
public class Unidimencionales8Version2{
   public static void main(String args[]){
      Scanner get = new Scanner(System.in);
      char text[] = new char[10];
      int cont = 0, contA=0;
      char resp = 's';
      System.out.println("Ingrese un texto caracter a caracter: ");
      while(cont <10 && resp == 's'){
         System.out.println(" Ingrese un caracter: ");
         text[cont] = get.nextLine().charAt(0);
         
         if(text[cont] == 'a' || text[cont] == 'A'){
            contA++;
         }
         
         System.out.println("Agregar otro caracter? [1=si]");
         resp = get.nextLine().charAt(0);
         cont++;
      }
      
      System.out.printf("Tiene %d caracteres 'a' o 'A' ", contA);

   }
}