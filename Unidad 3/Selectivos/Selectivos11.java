/*
   Enunciado: Calcular la utilidad que un trabajador recibe en el reparto anual de 
      utilidadessi este se le asigna como un porsentaje de su salario mensual que 
      depende de su antiguedad en la empresa de acuerdo con la siguente tabla
            tiempo                              Utilidad
         Menos de 1 a�o                   5% del salario
         1 a�o o m�s y menos de 2 a�os    7% del salario
         2 a�o o m�s y menos de 5 a�os    10% del salario
         5 a�o o m�s y menos de 10 a�os   15% del salario
         10 a�o o m�s                     20% del salario
      
   Progamador: Alexis De Jesus Perez Carmona
   Fecha: 25/10/2022
*/
import java.util.Scanner;

public class Selectivos11{
   public static void main(String args[]){
      Scanner leer = new Scanner(System.in);
      int anti, sala;
      float bono, total;
      System.out.println("A�os de antiguedad: ");
      anti = leer.nextInt();
      System.out.println("Introduzca el salario: ");
      sala = leer.nextInt();
      
      if(anti < 1){
         bono = sala * 0.05f;
      }
      else if(anti >= 1 && anti < 2){
         bono = sala * 0.07f;
      }      
      else if(anti >= 2 && anti < 5){
         bono = sala * 0.10f;
      }
      else if(anti >= 5 && anti < 10){
         bono = sala * 0.15f;
      }
      else{
         bono = sala * 0.20f;
      }
      
      System.out.printf("Utilidades: %.2f \n", bono);
      
      
      System.out.print("Alexis De Jesus Perez Carmona");
   }
}