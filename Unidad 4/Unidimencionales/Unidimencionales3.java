/*
   Hacer un programa que almececne 5 numero s enteros diferentes en un vector
   posteriormente solicite al usuario un numero a buscar y localicelo en el vector
   Imprima "Si existe" y la posision (celda) que pcupa el numero si este se localizó, o imprima "NO EXISTE" y un -1 
   en caso de no localizarlo
*/
import java.util.Scanner;
public class Unidimencionales3{
   public static void main(String args[]){
      Scanner get = new Scanner(System.in);
      int n[] = new int[5];
      int num, celda = -1;
      //Almacenamiento
      System.out.println("Ingrese 5 numeros enteros diferentes");
      for(int i =0; i<5; i++){
         System.out.printf("n[%d]: ", i);
         n[i] = get.nextInt();
      }
      
      //Buscar el numero
      System.out.print("Ingrese el numero a buscar en los numeros ingresados: ");
      num = get.nextInt(); 
      for(int i =0; i<5; i++){
         if(n[i] == num){
            celda = i;
            break;
         }
      }
      
      if(celda != -1){
         System.out.printf("SI EXISTE \nEn la posicion [%d]",celda);
      }
      else{
         System.out.printf("NO EXISTE %d",celda);
      }
      
   }
}