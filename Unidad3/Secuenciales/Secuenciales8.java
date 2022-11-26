/*5+
   Enunciado:8. Realice un programa que calcule el salario semanal final que recibirá un trabajador,
      sabiendo que el salario se obtiene de lo que ganó diariamente (de lunes a sábado) y un bono
      correspondiente al 13% de lo que ganó.   
   Prorgamador: ISC Alexis De Jesus Perez Carmona
   Fecha: 18/10/2022
*/

import java.util.Scanner;

public class Secuenciales8{
   public static void main(String args[]){
      Scanner leer = new Scanner(System.in);      
      float d1,d2,d3,d4,d5,semana,total,bono;
      
      System.out.println("Salario semanal \n Dia 1: ");
      d1 = leer.nextFloat();
      System.out.println("Salario semanal \n Dia 2: ");
      d2 = leer.nextFloat();
      System.out.println("Salario semanal \n Dia 3: ");
      d3 = leer.nextFloat();
      System.out.println("Salario semanal \n Dia 4: ");
      d4 = leer.nextFloat();      
      System.out.println("Salario semanal \n Dia 5: ");
      d5 = leer.nextFloat();
      semana = d1+d2+d3+d4+d5;
      bono = semana * 0.13f;
      total = semana + bono;
      
      System.out.printf("Bono: %.2f \nSalario total de la semana: %.2f \n",bono,total);
      
      System.out.print("Alexis De Jesus Perez Carmona");
      
   }
}