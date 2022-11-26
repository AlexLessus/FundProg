/*
   Enunciado: 1. Un obrero necesit calcular su salario semanal, el cual se obtiene de la sig. manera:
   -Si trabaja 40 horas o menos se le paga 16$ la hora
   -Si trabaja las de 40 horas se le paga 16$ por cad una de las primeras 16 horas y 20 por vada hora extra
   Progamador: Alexis De Jesus Perez Carmona
   Fecha: 20/10/2022
*/
import java.util.Scanner;

public class Selectivos1{
   public static void main(String args[]){
      Scanner leer = new Scanner(System.in);
      float horas, salario, extra=0;
      System.out.println("Ingrese sus horas: ");
      horas = leer.nextFloat();
      
      if(horas>40){
         extra = horas - 40; 
         salario = 16 * 40 + 20 * extra;
      }
      else
         salario = 16*horas;
      
      System.out.printf("Salario semanal: %.2f \n Horas extra: %.2f \n", salario, extra);
      System.out.print("Alexis De Jesus Perez Carmona");
   }
}