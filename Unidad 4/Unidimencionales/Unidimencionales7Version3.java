import java.util.Scanner;
public class Unidimencionales7Version3{
   public static void main(String args[]){
      Scanner get = new Scanner(System.in);
      final int TAM_ARREGLO = 7;
      int n[] = new int[TAM_ARREGLO];
      int aux;
      
      System.out.printf("Ingrese %d numeros: \n", TAM_ARREGLO);
      for(int i = 0; i<n.length; i++){
         System.out.printf("n[%d]: ", i);
         n[i] = get.nextInt();
      }
      for(int i=0; i<n.length-1; i++){
         for(int j=0; j<n.length-1-i; j++){
            if(n[j] > n[j+1]){
               aux = n[j];
               n[j] = n[j+1];
               n[j+1] = aux;
            }
         }  
      }
      System.out.print("\nLos numeros ordenados ascendentemente son: ");
      for(int i = 0; i<n.length; i++){
         System.out.printf("n[%d]: %d\n", i, n[i]);
         
      }
   }
}