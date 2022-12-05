import java.util.Scanner;
public class UNI5_PROGRAMA_EQUIPO15{
   static Scanner get = new Scanner(System.in);
   public static void main(String args[]){
      int claves[] = new int[100];
      String modelos[] = new String[100];
      float diametros[] = new float[100];
      float precios[] = new float[100];
      boolean descuentos[] = new boolean[100];
      int opc = 0, clave=0, cont = 0, change = 0, aux=0;     


      do{
         opc = menu();
         switch(opc){
            case 1: 
               System.out.print("Ingrese la clave del sarten [1-111]: ");
               clave = get.nextInt();
               validacion(clave, cont, claves);
            break;
            case 6:
               System.out.println("\nPROGRAMADORES");
               System.out.println("Alexis De Jesus Perez Carmona");
               System.out.println("Gustavo Valerio Guzman");
               System.out.println("\nFecha: 02/Dic/2022");
            break;
            default:
               System.out.println("\nOpcion no valida, asegurate de colocar un numero dentro del rango permitido.\n");
            break;
         }
      }while(opc != 6);
   }
   
   static int menu(){
      System.out.println("\n-- BIENVENIDO A SARTENAZOS --\n");
      System.out.println("[1] -- Registrar un nuevo sarten.");
      System.out.println("[2] -- Consultar un sarten individualmente.");
      System.out.println("[3] -- Consulta todos los sartenes.");
      System.out.println("[4] -- Modificar datos de un sarten.");
      System.out.println("[5] -- Bajar o eliminar sarten.");
      System.out.println("[6] -- Finalizar");
      System.out.print("\nOpcion deseada [1-6]: ");
      return get.nextInt();
   }
   
   static boolean validacion(int clave, int cont, int claves[]){
      if(cont < 100){
         if(clave < 1 || clave > 111){
            System.out.println("\nClave no valida.\n");
            return false;
         }
         /* verifica que si la clave se encuentra, el if valida que no sea la primera vez que se registra un sarte
         ya que sera inutil verificar si este esta entre las claves previas si es el primer sarten en ser registrado
         */  
         if(cont > 0) {
            for(int i=0; i<cont; i++) {
               if(clave == claves[i]) {
                  System.out.println("\nLa clave ya esta en uso.");
                  return false;
               }         
           }
         }
      }else{
         System.out.println(" (!) No se cuenta con espacio suficiente para registrar un sarten más (!)");
         return true;
      }
      return false;     
   } 
}