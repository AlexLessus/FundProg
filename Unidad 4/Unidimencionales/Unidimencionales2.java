/*
   Hacer un programa que almececne 5 numero s enteros diferentes en un vector
   posteriormente solicite al usuario un numero a buscar y localicelo en el vector
   Imprima "Si existe" si se localiza el numero, o imprima "NO EXISTE" en caso de no localizarlo
*/
import java.util.Scanner;
public class Unidimencionales2{
   public static void main(String args[]){
      Scanner get = new Scanner(System.in);
      int n[] = new int[5];
      int num;
      boolean existe = true;
      //Almacenamiento
      System.out.println("Ingrese 5 numeros enteros diferentes");
      for(int i =0; i<5; i++){
         System.out.printf("Numero %d: ", i+1);
         n[i] = get.nextInt();
      }
      
      //Buscar el numero
      System.out.print("Ingrese el numero a buscar en los numeros ingresados: ");
      num = get.nextInt(); 
      for(int i =0; i<5; i++){
         if(n[i] == num){
            existe = true; 
            break;
         }
      }
      
      if(existe){
         System.out.print("SI EXISTE");
      }
      else{
         System.out.print("NO EXISTE");
      }
      
   }
}