/*
   Enunciado: 12, En una tienda de descuento se efectúa una promoción en la cual se hace un descuento sobre el valor de la
      compra total según el color de la bolita que el cliente saque al pagar en caja. Si la bolita es de color blanco no
      se le hará descuento alguno, si es verde se le hará un 10% de descuento, si es amarilla un 25%, si es azul un
      50% y si es roja un 100%. Determinar la cantidad final que el cliente deberá pagar por su compra. Se sabe que
      solo hay bolitas de los colores mencionados.
      
   Progamador: Alexis De Jesus Perez Carmona
   Fecha: 25/10/2022
*/
import java.util.Scanner;

public class Selectivos12{
   public static void main(String args[]){
      Scanner leer = new Scanner(System.in);
      int comp, clr;
      float total=0;
      System.out.println("Ingresa el valor de la compra: ");
      comp = leer.nextInt();
      System.out.println("Que color te tocó: [1=blanco, 2=verde, 3=amarillo, 4=azul, 5=rojo]");
      clr = leer.nextInt();
      
      switch(clr){
         case 1:
            total = comp;
            break;
         case 2:
            total = comp * 0.90f;
            break;
         case 3:
            total = comp * 0.75f;
            break;
         case 4:
            total = comp * 0.50f;
            break;
         case 5:
            total = comp * 0f;
            break;    
         default:
            System.out.println("Valor invalido");
            break;     
      }
      
      System.out.printf("El total es: %.2f \n", total);
      
      
      System.out.print("Alexis De Jesus Perez Carmona");
   }
}