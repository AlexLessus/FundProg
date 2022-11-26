import java.util.Scanner;
public class Proyecto{
   public static void main(String args[]){
      Scanner get = new Scanner(System.in);
      int claves[] = new int[100];
      String modelos[] = new String[100];
      float diametros[] = new float[100];
      float precios[] = new float[100];      
      
      int opc = 0, clave=0, cont = 0;     
      boolean flag = true;
      do{
         cont++;
         System.out.println("\n[1] --Registrar");
         System.out.println("[2] --Consulta Individual");
         System.out.println("[3] --Consulta general");
         System.out.println("[4] --Modificar");
         System.out.println("[5] --Baja");
         System.out.println("[6] --Finalizar");
         opc = get.nextInt();
         switch(opc){
            case 1: //Registrar/alta
               System.out.println("\n==== Registrar sarten ====");
               if(cont < 100){
                  System.out.print("Ingrese el codigo[1-111]: ");
                  clave = get.nextInt();
                  get.nextLine();
                  if(clave < 1 && clave > 111){
                     System.out.println("Clave no valida");
                     break;
                  }//error en clave fuera del rango
                  if(clave == claves[clave]){
                     System.out.println("La clave ya ha sido registrada");
                     flag = false;
                     break;
                  }
                  
                  if(flag){
                     claves[clave] = clave;
                     System.out.print(" -Ingrese el modelo: ");
                     modelos[clave] = get.nextLine();
                     System.out.print(" -Ingrese el diametro del sarten: ");
                     diametros[clave] = get.nextFloat();
                     System.out.print(" -Ingrese el precio: ");
                     precios[clave] = get.nextFloat();
                     flag = true;
                  }
               }
               else{
                  System.out.println(" (!) Espacio insuficiente (!)");
               }
               break;
            case 2: //Consulta individual
               
               break;
            case 3: //Consulta General
               
               break;
            case 4: //Modificar
               
               break;
            case 5: //Baja
               
               break;
            case 6: //Finalizar
            
               break;
            default:
            
               break;
         }
      }while(opc != 6);
   }
}