import java.util.Scanner;
public class Proyecto{
   public static void main(String args[]){
      Scanner get = new Scanner(System.in);
      int claves[] = new int[100];
      String modelos[] = new String[100];
      float diametros[] = new float[100];
      float precios[] = new float[100];
      boolean esAcero[] = new boolean[100];      
      
      String aux1 = "", material = ""; 
      float aux2 =0f;
      boolean aux3;
      int opc = 0, clave=0, cont = 0, change = 0, aux=0, auxiliar=0;     
      boolean esValido = true;
      
      do{
         System.out.println("\n-- BIENVENIDO A SARTENAZOS --\n");
         System.out.println("[1] -- Registrar un nuevo sarten.");
         System.out.println("[2] -- Consultar un sarten individualmente.");
         System.out.println("[3] -- Consulta todos los sartenes.");
         System.out.println("[4] -- Modificar datos de un sarten.");
         System.out.println("[5] -- Bajar o eliminar sarten.");
         System.out.println("[6] -- Finalizar");
         System.out.print("\nOpcion deseada [1-6]: ");
         opc = get.nextInt();
         switch(opc){
            case 1: //Registrar/alta
               esValido = true;
               System.out.println("\n--- Registrar sarten ---");
               if(cont < 100){
                  System.out.print("Ingrese la clave del sarten [1-111]: ");
                  clave = get.nextInt();
                  get.nextLine();
                  
                  //error en clave fuera del rango
                  if(clave < 1 || clave > 111){
                     System.out.println("\nClave no valida.\n");
                     break;
                  }
                  
                  /* verifica que si la clave se encuentra, el if valida que no sea la primera vez que se registra un sarte
                     ya que sera inutil verificar si este esta entre las claves previas si es el primer sarten en ser registrado
                  */  
                  if(cont > 0) {
                     for(int i=0; i<cont; i++) {
                        if(clave == claves[i]) {
                           System.out.println("\nLa clave ya esta en uso.");
                           esValido = false;
                           break;
                        }
                     
                     }
                  }
                          
                  if(esValido){
                     claves[cont] = clave;
                     System.out.print(" - Ingrese el modelo del sarten: ");
                     modelos[cont] = get.nextLine();
                     System.out.print(" - Ingrese el diametro del sarten: ");
                     diametros[cont] = get.nextFloat();
                     System.out.print(" - Ingrese el precio del sarten: ");
                     precios[cont] = get.nextFloat();
                     do {
                        System.out.print(" - Ingrese el material [1. Acero    2. Teflon]: ");
                        auxiliar = get.nextInt();
                        if(auxiliar == 1) {
                           esAcero[cont] = true;
                           break;
                        } else if(auxiliar == 2) {
                           esAcero[cont] = false;
                           break;
                        }
                        System.out.println("\nOpcion no valida, introduce un numero dentro del rango 1-2");      
                     } while(true);
                     cont++;
                  }
               }
               else{
                  System.out.println(" (!) No se cuenta con espacio suficiente para registrar un sarten más (!)");
               }
               break;
               
            case 2: //Consulta individual
               esValido = false;
               if(cont == 0) {
                  System.out.println("\nAun no se ha registrado ningun sarten.\n");
                  break;
               }
               
               System.out.print("Ingresa la clave del sarten:  ");
               clave = get.nextInt();
               
               if(clave < 1 || clave > 111){
                  System.out.println("\nClave no valida");
                  break;
               }       
               for(int i=0; i<cont; i++) {
                  if(clave == claves[i]) {
                     System.out.println("\n-- Datos del sarten --");
                     System.out.printf("\nCLAVE: %d",claves[i]);
                     System.out.printf("\nMODELO: %s",modelos[i]);
                     System.out.printf("\nDIAMETRO: %.2f cm",diametros[i]);
                     System.out.printf("\nPRECIO: $%.2f",precios[i]);
                     if(esAcero[i])
                        material = "Acero";
                     else
                        material = "Teflon";
                     System.out.printf("\nMATERIAL: %s\n",material);                       
                     esValido = true;                      
                     break;
                  }
               }
               if(esValido == false)   
                  System.out.printf("\nNo se encuenta ningun sarten con la clave: %d\n", clave);
               break;
               
            case 3: //Consulta General
               if(cont == 0) {
                  System.out.println("\nAun no se ha registrado ningun sarten.\n");
                  break;
               }
               //Burbuja para ordenar los elementos del arreglo
               for(int i=0; i<cont-1; i++){
                  for(int j=0; j<cont-1-i; j++){
                     if(claves[j] > claves[j+1]){
                        aux = claves[j];
                        claves[j] = claves[j+1];
                        claves[j+1] = aux;
                        
                        aux1 = modelos[j];
                        modelos[j] = modelos[j+1];
                        modelos[j+1] = aux1;
                        
                        aux2 = diametros[j];
                        diametros[j] = diametros[j+1];
                        diametros[j+1] = aux2;
                        
                        aux2 = precios[j];
                        precios[j] = precios[j+1];
                        precios[j+1] = aux2;
                        
                        aux3 = esAcero[j];
                        esAcero[j] = esAcero[j+1];
                        esAcero[j+1] = aux3;                        
                     }
                  }  
               }
               
               System.out.println("\n-- TODOS LOS PRODUCTOS --");
               for(int i=0; i<cont; i++) {
                  if(esAcero[i])
                     material = "Acero";
                  else
                     material = "Teflon";
                  System.out.printf("\nCLAVE: %d",claves[i]);
                  System.out.printf("\nMODELO: %s",modelos[i]);
                  System.out.printf("\nDIAMETRO: %.2f cm",diametros[i]);
                  System.out.printf("\nPRECIO: $%.2f",precios[i]);
                  System.out.printf("\nMATERIAL: %s\n\n",material);                   
               }
               break;
               
            case 4: //Modificar
               esValido = true;
               if(cont == 0) {
                  System.out.println("\nAun no se ha registrado ningun sarten.\n");
                  break;
               }
               System.out.print("\n-- Modificar datos --\n");
               System.out.print("\nIngresa la clave del sarten:  ");
               clave = get.nextInt();
               
               if(clave < 1 || clave > 111){
                  System.out.println("\nClave no valida\n");
                  break;
               } 
               for(int i=0; i<cont; i++) {
                  if(clave == claves[i]) {
                     do {
                  if(esAcero[i])
                     material = "Acero";
                  else
                     material = "Teflon";
                     
                     System.out.printf("\nElige la opcion a modificar\n\n");
                     System.out.printf("[1] - Modelo actual: %s.\n",modelos[i]);
                     System.out.printf("[2] - Diametro actual: %.2f.\n",diametros[i]);
                     System.out.printf("[3] - Precio actual: %.2f.\n",precios[i]);
                     System.out.printf("[4] - Material actual: %s.\n",material);
                     System.out.println("[5] - Terminar");
                     System.out.print("\nOpcion: ");
                     change = get.nextInt();
                        if(change > 0 && change < 6) {
                           switch(change) {
                              case 1:
                                 get.nextLine();
                                 System.out.print("\nIngresa el nuevo modelo: ");
                                 modelos[i] = get.nextLine();
                                 break;
                              case 2:
                                 System.out.print("\nIngresa el nuevo diametro: ");
                                 diametros[i] = get.nextFloat();
                                 break;
                              case 3:
                                 System.out.print("\nIngresa el nuevo precio: ");
                                 precios[i] = get.nextFloat();
                                 break;
                              case 4:
                                 System.out.print("Ingresa el material [1. Acero  2. Teflon ]: ");
                                 auxiliar = get.nextInt();
                                 if(auxiliar == 1) {
                                    esAcero[i] = true;
                                    break;
                                 } else if(auxiliar == 2) {                                                               
                                    esAcero[i] = false;
                                    break;
                                 }
                                 System.out.println("\nIngresa una opcion dentro del rango 1-2\n");                          
                                 break;   
                              case 5:
                                 esValido = false;         
                           }
                        } else {
                           System.out.println("\nAsegurate de elegir una opcion dentro del rango permitido.\n");
                        }
                     }while(esValido);                  
                     break;                     
                  }
               }
               if(esValido)   
                  System.out.printf("\nNo se encuenta ningun sarten con la clave: %d\n", clave);                  
               break;
               
            case 5: //Baja
               if(cont == 0) {
                  System.out.println("\nAun no se ha registrado ningun sarten.\n");
                  break;
               }
               System.out.print("\n-- Eliminar datos --\n");
               System.out.print("\nIngresa la clave del sarten a dar de baja:  ");
               
               clave = get.nextInt();
               if(clave < 1 || clave > 111){
                  System.out.println("\nClave no valida\n");
                  break;
               } 
               
               for(int i=0; i<cont; i++) {
                  if(clave == claves[i]) {
                     if(esAcero[i])
                        material = "Acero";
                     else
                        material = "Teflon";
                     System.out.printf("Modelo actual: %s.\n",modelos[i]);
                     System.out.printf("Diametro actual: %.2f.\n",diametros[i]);
                     System.out.printf("Precio actual: %.2f.\n",precios[i]);
                     System.out.printf("Material actual: %s\n",material);
                     System.out.print("¿ESTA SEGURO DE ELIMINAR ESTE SARTEN? [1=SI  2=NO]: ");
                     change = get.nextInt();
                     if(change == 1){
                        for(int j=i; j<cont-1; j++){
                           claves[j] = claves[j+1];
                           modelos[j] = modelos[j+1];
                           diametros[j] = diametros[j+1];
                           precios[j] = precios[j+1];
                           esAcero[j] = esAcero[j+1];
                        }
                     cont--;
                     }
                     break;
                  }
               }                    
               break;            
            case 6:
               System.out.println("\nPROGRAMADORES");
               System.out.println("Alexis De Jesus Perez Carmona");
               System.out.println("Gustavo Valerio Guzman");
               System.out.println("\nFecha: 26/Nov/2022");
               break;
            default:
               System.out.println("\nOpcion no valida, asegurate de colocar un numero dentro del rango permitido.\n");
               break;
         }
      }while(opc != 6);
   }
}
