import java.util.Scanner;
public class Unidimencionales7Version2{
   public static void main(String args[]){
      Scanner get = new Scanner(System.in);
      int n[] = new int[7];
      int aux;
      
      System.out.println("Ingrese 7 numeros: ");
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