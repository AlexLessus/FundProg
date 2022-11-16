/*
   6. Hacer un programa que almacene 10 numeros enteros en un vector. Intercambie los numeros que están en las primeras
   cinco posiciones por los que están en las ultimas 5 posiciones. Imprima el vector. 
   Nota: No debe utilizar vector(es) auxiliar(es).
*/
import java.util.Scanner;
public class undimencionales6{
   public static void main(String args[]){
      Scanner get = new Scanner(System.in);
      int num[] = new int[10];
      int aux, numF = 9;
      for(int i = 0; i<10; i++){
         System.out.printf("numero[%d]: ", i);
         num[i] = get.nextInt();
      }
      for(int i = 0; i<5; i++){
         aux = num[i];
         num[i] = num[numF];
         num[numF] = aux;
         numF--;
      }          
      for(int i = 0; i<10; i++){
         System.out.printf("\nNum[%d]: %d", i, num[i]);
      }
   }
}
