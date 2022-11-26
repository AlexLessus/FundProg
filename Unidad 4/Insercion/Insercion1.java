/*
   Hacer un progama que permita almacenar en un arreflo los preciod de 7 productos y permita insertar
   el precio de un nuevo producto en la celda 4. imprima el arreglo después de realizar la inserción
*/
import java.util.Scanner;
public class Insercion1{
   public static void main(String args[]){
      Scanner get = new Scanner(System.in);
      float precios[] = new float[8];
      
      //Almacenamiento
      System.out.println("Ingrese el precio de 7 productos: ");
      for(int i=0; i<precios.length-1; i++){
         System.out.printf("\nprecio[%d]: ", i);
         precios[i] = get.nextFloat();      
      }
      //Insercion con la tecnica desplazamiento
      for(int i=7; i>4; i--){
         precios[i] = precios[i-1];
      }  
      System.out.println("Ingrese el precio para la celda 4: ");
      precios[4] = get.nextFloat();
      
      for(int i=0; i<precios.length-1; i++){
         System.out.printf("\nprecios[%d]: %.2f", i, precios[i]);
      }
      
      
   }
}