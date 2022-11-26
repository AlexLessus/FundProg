/*
   Hacer un progama que permita almacenar en un arreflo los preciod de 7 productos y permita insertar
   el precio de un nuevo producto en la celda que el usuario elija(0 a 7). imprima el arreglo después de realizar la inserción
*/
import java.util.Scanner;
public class Insercion2{
   public static void main(String args[]){
      Scanner get = new Scanner(System.in);
      float precios[] = new float[8];
      int celda;
      //Almacenamiento
      System.out.println("Ingrese el precio de 7 productos: ");
      for(int i=0; i<precios.length-1; i++){
         System.out.printf("\nprecio[%d]: ", i);
         precios[i] = get.nextFloat();      
      }
      System.out.println("En que celda desea guardar el nuevo precio[0-7]: ");
      celda = get.nextInt();
      //Insercion con la tecnica desplazamiento
      for(int i=precios.length-1; i>celda; i--){
         precios[i] = precios[i-1];
      }  
      
      System.out.println("Ingrese el precio para la celda "+celda);
      precios[celda] = get.nextFloat();
      
      for(int i=0; i<precios.length; i++){
         System.out.printf("\nprecios[%d]: %.2f", i, precios[i]);
      }
      
      
   }
}