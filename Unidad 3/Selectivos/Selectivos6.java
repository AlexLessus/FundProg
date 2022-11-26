/*
   Enunciado: 6. Una fábrica ha sido sometida a un programa de control de contaminación para lo cual se efectúa una
      revisión de los puntos IMECA generados por la fábrica. El programa de control de contaminación consiste en
      medir los puntos IMECA que emite la fábrica en cinco días de una semana y si el promedio es superior a los
      170 puntos entonces tendrá la sanción de parar su producción por una semana y una multa del 50% de las
      ganancias de los días medidos. Si el promedio obtenido de puntos IMECA es de 170 o menor entonces no
      tendrá ni sanción ni multa. El dueño de la fábrica desea saber:
      a) Si hubo o no sanción.
      b) El valor de la multa.
   Progamador: Alexis De Jesus Perez Carmona
   Fecha: 20/10/2022
*/
import java.util.Scanner;

public class Selectivos6{
   public static void main(String args[]){
      Scanner leer = new Scanner(System.in);
      int d1,d2,d3,d4,d5,puntos;
      System.out.println("Ingrese su puntuacion IMECA dia 1: ");
      d1 = leer.nextInt();
      System.out.println("Ingrese su puntuacion IMECA dia 2: ");
      d2 = leer.nextInt();
      System.out.println("Ingrese su puntuacion IMECA dia 3: ");
      d3 = leer.nextInt();      
      System.out.println("Ingrese su puntuacion IMECA dia 4: ");
      d4 = leer.nextInt();
      System.out.println("Ingrese su puntuacion IMECA dia 5: ");
      d5 = leer.nextInt();
      puntos = d1 + d2 + d3 + d4 + d5;
      if(puntos <= 170){
         System.out.println("No hay sancion");
      }
      else{
         float g1,g2,g3,g4,g5, ganancias; 
         System.out.println("Ingrese la ganacia del dia 1: ");
         g1 = leer.nextFloat();
         System.out.println("Ingrese la ganacia del dia 2: ");
         g2 = leer.nextFloat();
         System.out.println("Ingrese la ganacia del dia 3: ");
         g3 = leer.nextFloat();
         System.out.println("Ingrese la ganacia del dia 4: ");
         g4 = leer.nextFloat();
         System.out.println("Ingrese la ganacia del dia 5: ");
         g5 = leer.nextFloat();
         ganancias = g1 + g2 + g3 + g4 + g5;
         System.out.printf("Su multa es de: %.2f \n", ganancias*0.5);         
      }
      System.out.print("Alexis De Jesus Perez Carmona");
   }
}