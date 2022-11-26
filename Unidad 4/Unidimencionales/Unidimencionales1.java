import java.util.Scanner;
public class Unidimencionales1{
   public static void main(String args[]){
      Scanner get = new Scanner(System.in);
      int n[] = new int[10];
      int suma, mayor, menor;
      
      //Almacenamiento
      System.out.println("Ingrese 10 numeros enteros");
      for(int i=0; i<10; i++){
         System.out.printf("n[%d]; ", i);
         n[i] = get.nextInt();
      }
      //a) Imprimiendo el contenido del arreglo
      for(int i=0; i<10; i++){
         System.out.printf("\nn[%d]: %d", i, n[i]);
      }
      //b) Suma
      suma = 0;
      for(int i=0; i<10; i++){
         suma += n[i];
      }
      System.out.printf("\n la suma de los numeros es: %d \n", suma);
      //c) Promedio
      System.out.printf("\n El promedio de los numeros en el arreglo es: %d \n", suma/10);
      //d) El mayor
      mayor = n[0];
      for(int i=0; i<10; i++){
         if(n[i] > mayor){
            mayor = n[i];
         }
      }
      System.out.printf("\n El mayor de los numeros almacenados es: %d \n", mayor);
      //d) El menor
      menor = n[0];
      for(int i=0; i<10; i++){
         if(n[i] > menor){
            menor = n[i];
         }
      }
      System.out.printf("\n El mayor de los numeros almacenados es: %d \n", menor);
      // menores a 20
      System.out.print("\nNumeros menores a 20:");
      for(int i=0; i<10; i++){
         if(n[i] < 20){
            System.out.printf("\n[%d]: %d", i, n[i]);
         }
      }
      // Numeros pares
      System.out.println("\nNumeros pares");
      mayor = n[0];
      for(int i=0; i<10; i++){
         if(n[i] %2 == 0){
            System.out.printf("n[%d]: %d\n", i, n[i]);
         }
      }
      System.out.printf("\n El mayor de los numeros almacenados es: %d \n", mayor);      
   }
}