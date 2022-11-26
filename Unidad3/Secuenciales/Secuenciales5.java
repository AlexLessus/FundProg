/*
   Enunciado:5. Un hospital recibirá el presupuesto de gastos para este año y el director general del
      hospital desea saber la cantidad de dinero que le otorgará a cada una de las secciones del
      hospital, sabiendo que a maternidad le otorgará el 22%, a cirugía el 41%, a medicina
      general el 13% y a medicina interna el resto del presupuesto, respectivamente 
   Prorgamador: ISC Alexis De Jesus Perez Carmona
   Fecha: 18/10/2022
*/

import java.util.Scanner;

public class Secuenciales5{
   public static void main(String args[]){
      Scanner leer = new Scanner(System.in);
      float pres, mate, ciru, meGe, meIn;
      
      System.out.println("Ingrese presupuesto: ");
      pres = leer.nextFloat();
      mate = pres*0.22f;
      ciru = pres*0.41f;
      meGe = pres*0.13f;
      meIn = pres-(mate+ciru+meGe);
      float x = pres
      System.out.printf("Presupuesto para: \n Maternidad: %.2f \n Cirugia: %.2f \n Medicina General: %.2f \n Medicina interna: %.2f \n",mate, ciru, meGe,meIn);
      
      
      System.out.printf("Alexis De Jesus Perez Carmona");
      
   }
}