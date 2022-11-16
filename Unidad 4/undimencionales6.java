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
