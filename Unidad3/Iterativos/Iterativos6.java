/*
   Enunciado: Hacer un programa que reciba N numeros entero desde el teclado e imprima>
         a) la suma de lista numeros introducidos
         b) El promedio de los numeros introducidos 
         c) El menor de los numeros introducidos
   Programador: Alexis De Jesus Perez Carmona
   Fecha: 10/28/2022
*/

import java.util.Scanner;
public class Iterativos6{
   public static void main(String args[]){
      Scanner get = new Scanner(System.in);
      int resp, n, suma=0, cont=0, men=0;
      float  prom=0;
      System.out.println("Desea ingresar un numero? [1=si, 2=no]");
      resp = get.nextInt();
      while(resp==1){
         cont++;
         System.out.println("Ingrese el numero:");
         n = get.nextInt();
         suma += n;
         
         if(cont==1){
            men = n;
         }
         else if(n < men){
            men = n;
         }
         System.out.println("Desea ingresar otro numero? [1=si, 2=no]");
         resp = get.nextInt();
      }
      if(cont != 0){
      prom = suma / cont;
      System.out.printf("Suma: %d\nPromedio: %.2f\nEl numero menor: %d\n",suma, prom, men);
      }
      else{
      System.out.println("No se introdujo ningun numero");
      }
      System.out.print("Alexis De Jesus Perez Carmona");
   }
}