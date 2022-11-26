/*
   Enunciado: 13. Una institución educativa estableció un programa para estimular a los alumnos con buen rendimiento
      académico y que consiste en lo siguiente:
      - Si el promedio es de 9.5 o mas y el alumno es de preparatoria, entonces este podrá cursar 55 unidades y se le
      hará un 25% de descuento.
      - Si el promedio es mayor o igual a 9 pero menor que 9.5 y el alumno es de preparatoria, entonces este podrá
      cursar 50 unidades y se le hará un 10% de descuento.
      - Si el promedio es mayor que 7 y menor que 9 y el alumno es de preparatoria, este podrá cursar 50 unidades
      y no tendrá ningún descuento.
      - Si el promedio es de 7 o menor, el numero de materias reprobadas es de 0 a 3 y el alumno es de
      preparatoria, entonces podrá cursar 45 unidades y no tendrá descuento.
      - Si el promedio es de 7 o menor, el numero de materias reprobadas es de 4 o mas y el alumno es de
      preparatoria, entonces podrá cursar 40 unidades y no tendrá ningún descuento.
      - Si el promedio es mayor o igual a 9.5 y el alumno es de profesional, entonces podrá cursar 55 unidades y se
      le hará un 20% de descuento.
      - Si el promedio es menor de 9.5 y el alumno es de profesional, entonces podrá cursar 55 unidades y no tendrá
      descuento.
      Obtener el total que tendrá que pagar un alumno si la colegiatura para alumnos de profesional es de
      $300 por cada cinco unidades y para alumnos de preparatoria es de $180 por cada cinco unidades.
      
   Progamador: Alexis De Jesus Perez Carmona
   Fecha: 25/10/2022
*/
import java.util.Scanner;

public class Selectivos13{
   public static void main(String args[]){
      Scanner leer = new Scanner(System.in);
      int nivel, prom;
      float total;
      System.out.println("Ingrese su nivel escolar: [1=preparatoria, 2=profecional]");
      nivel = leer.nextInt();
      System.out.println("Ingrese su promedio");
      prom = leer.nextInt();
      
      if(nivel == 1){
         if(prom>=9.5){
            total = 55/5 * 300 * 0.80f;
         }
         else{
            total = 55/5 * 300;
         }
      } 
      else{
         if(prom>=9.5){
            total = 55/5 * 180 * 0.75f;
         }
         else if(prom < 9.5 && prom >= 9){
            total = 50/5 * 180 * 0.90f;
         }
         else if(prom < 9 && prom >= 7){
            total = 50/5 * 180;
         }
         else{
            System.out.println("Materias reprobadas: ");
            int maRe = leer.nextInt();
            if(maRe <=3){
               total = 45/5 * 180;
            }
            else{
               total = 40/5 * 180;
            }
         }
      }
      
      System.out.printf("El total es: %.2f \n", total);
      
      
      System.out.print("Alexis De Jesus Perez Carmona");
   }
}