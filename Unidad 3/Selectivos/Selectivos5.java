/*
   Enunciado: 5) En una escuela la colegiatura de los alumnos se determina según la cantidad de materias que cursan. El
      costo de todas las materias es el mismo. Se ha establecido un programa para estimular a los alumnos, el cual
      consiste en lo siguiente: si el promedio obtenido por un alumno en el último período es mayor o igual que 90,
      se le hará un descuento del 30% en su colegiatura y no se le cobrara el IVA; si el promedio obtenido es menor
      que 90 deberá pagar la colegiatura completa, a la cual se le aplicará un 10% de IVA.
      Obtener cuánto debe pagar un alumno.
   Progamador: Alexis De Jesus Perez Carmona
   Fecha: 20/10/2022
*/
import java.util.Scanner;

public class Selectivos5{
   public static void main(String args[]){
      Scanner leer = new Scanner(System.in);
      float prom, total, pago;
      System.out.println("Ingrese su promedio: ");
      prom = leer.nextFloat();
      System.out.println("Ingrese la cantidad de su colegiatura: ");
      pago = leer.nextFloat();
            
      if(prom >= 90){
         total = pago *0.70f;
      }
      else{
         total = pago*1.10f;
      }
            
      System.out.printf("Total a pagar: %.2f \n", total);
      System.out.print("Alexis De Jesus Perez Carmona");
   }
}