/*
   Enunciado 10: Realizar un programa que calcule e imprima el promedio de cada uno de los 
      diez alumnos que cursan la materia de fundamentos de programación de dicha materia se deben 
      leer las calificaciones de las cinco unidades que integran. Al final informar el promedio 
      general del grupo y la cantidad de alumnos que aprobaron (prom >=70) y la cantidad de 
      alumnos que reprobaron(prom < 70)
   Programador: Alexis De Jesus Perez Carmona
   Fecha: 10/28/2022
*/
import java.util.Scanner;
public class Iterativos11{
   public static void main(String args[]){
      Scanner get = new Scanner(System.in);
      float desc=0, totalDesc=0, pago=0;
      int mes;
      for(int i = 1; i<=10; i++){
         System.out.printf("%d - Ingrese el numero de mes de su vuelo: ", i);
         mes = get.nextInt();
         System.out.print("Ingrese el monto a pagar: ");
         pago = get.nextInt();

         switch(mes){
            case 1:
            case 2:
            case 3:
               desc = pago * 0.30f;
               break;
            case 4:
            case 5:
            case 6:
               desc = pago * 0.20f;
               break;
            case 7:
            case 8:
               desc = pago * 0.10f;
               break;
            case 9:
            case 10:
            case 11:
               desc = pago * 0.25f;
               break;
            case 12:
               desc = pago;
               break;
            default:
               System.out.println("Mes invalido");
         }
         totalDesc += desc;
         System.out.printf("Descuento: %.2f$ \nCantidad a pagar: %.2f$ \n====\n", desc, pago-desc);
      }
      
      
      System.out.printf("Total de hechos hechos: %.2f\n", totalDesc);
      System.out.println("Alexis De Jesus Perez Carmona") ;  
   }
}