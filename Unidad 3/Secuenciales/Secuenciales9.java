/*5+
   Enunciado:9. Hacer un programa que permita calcular e imprimir la tabla de un número entero
      introducido por el teclado. Ejemplo, si el número introducido fuera un cinco:
      5 X 1 = 5
      5 X 2 = 10
      ...
      5 X 10 = 50
   Prorgamador: ISC Alexis De Jesus Perez Carmona
   Fecha: 18/10/2022
*/

import java.util.Scanner;

public class Secuenciales9{
   public static void tablas(int num){
      System.out.println("\n---- Tabla del "+num+" -----");
      for(int i = 1; i <= 10; i++){      
      
         System.out.printf("%d * %d = %d\n",num,i,num*i);
         
      }
   }
   public static void main(String args[]){
      Scanner leer = new Scanner(System.in);      
      int num;
      
      System.out.print("Tabla del: ");
      num = leer.nextInt();
      
      System.out.printf("%d * 1 = %d \n",num,num);
      System.out.printf("%d * 2 = %d \n",num,num*2);
      System.out.printf("%d * 3 = %d \n",num,num*3);
      System.out.printf("%d * 4 = %d \n",num,num*4);
      System.out.printf("%d * 5 = %d \n",num,num*5);
      System.out.printf("%d * 6 = %d \n",num,num*6);
      System.out.printf("%d * 7 = %d \n",num,num*7);
      System.out.printf("%d * 8 = %d \n",num,num*8);
      System.out.printf("%d * 9 = %d \n",num,num*9);
      System.out.printf("%d * 10 = %d \n",num,num*10);


      //tablas(num);
      
      System.out.print("Alexis De Jesus Perez Carmona");
      
   }
}