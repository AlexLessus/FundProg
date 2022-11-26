/*
   Enunciado: Realice un programa que resuelva el siguiente problema: El departamento de transito y vialidad 
         está cobrando multa a los dueños de vehiculos que contaminen, dependiendo de los puntos de contaminación de cada vehiculo
            Hasta 100                  $50
            Mas de 100 y hasta 200     $100
            Mas de 200 y hasta 300     $150
            Mas de 300 y hasta 500     $200
            Mas de 500                 $300
         El programa debe imprimir:
         a) La multa correspondiente a cada veiculo
         b) Cantidad de multas de 50
         c) El dinero que se acumuló por multas de 100
         d) El dinero que se acumuló por todas las multas
   Programador: Alexis De Jesus Perez Carmona
   Fecha: 10/28/2022
*/
import java.util.Scanner;
//break rompe totalmente el ciclo
//continue salta a la siguente iteración
public class Iterativos7{
   public static void main(String args[]){
      Scanner get = new Scanner(System.in);
      int suma=0, suma100=0, cont50=0;
      System.out.println("Desea registrar los puntos contaminantes de un vehiculo? [1=si,2=no]");
      int resp = get.nextInt();
      
      while(resp == 1){
         int multa = 0;
         System.out.println("Ingrese los puntos");
         int p = get.nextInt();
         if(p<=100){
            multa = 50;
            cont50 ++;
         }
         else if(p>=100 && p<=200){
            multa = 100;
            suma100 = suma100 + multa;
         }
         else if(p>200 && p<=300){
            multa = 150;
         }
         else if(p>=300 && p<=500){
            multa = 200;
         }
         else{
            multa = 300;
         }
         System.out.printf("Le corresponde una multa de: %d\n------------------\n",multa );
         suma += multa;
         System.out.println("Desea registrar los puntos contaminantes de un vehiculo? [1=si,2=no]");
         resp = get.nextInt();
      }
      System.out.printf("Multas de 50: %d\nDinero acumulado por multas de 100: %d\nDinero acumulado por todas las multas: %d",cont50, suma100, suma);
   }
}