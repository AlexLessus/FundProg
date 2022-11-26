import java.util.Scanner;
public class Unidimencionales5{
   public static void main(String args[]){
      Scanner get = new Scanner(System.in);
      int num[] = new int[10];
      int impar[] = new int[5];
      int cont = 0;
      for(int i = 0; i<10; i++){
         System.out.printf("numero[%d]: ", i);
         num[i] = get.nextInt();
      }
      
      for(int i = 1; i<10; i+=2){
         impar[cont] = num[i];
         cont++;
      }
      
      for(int i = 0; i<5; i++){
         System.out.printf("\nposImpar[%d]: %d", i, impar[i]);
         
      }
      
      
   }
}
