package Proyecto;
import java.util.Scanner;
public class Proyecto {
    static Scanner leer = new Scanner(System.in);
    static int claves[] = new int[100];
    static String modelos[] = new String[100];
    static float precios[] = new float[100];
    static float diametros[] = new float[100];
    static boolean descuentos[] = new boolean[100];
    static int clave = 0;
    static int contador = 0;
    static int descuento = 0;
    static int index = 0;
    static int opcion = 0;
    public static void main(String args[]){
   
        do {
            System.out.println("\n-- Bienvenido a Sartenazos --");
            System.out.println("[1] - Registrar sarten");
            System.out.println("[2] - Consulta individual");
            System.out.println("[3] - Consulta general");
            System.out.println("[4] - Modificar sarten");
            System.out.println("[5] - Eliminar sarten");
            System.out.println("[6] - Finalizar");
            System.out.print("Elije una opcion [1-6]: ");
            opcion = leer.nextInt();
            switch(opcion) {
                case 1:
                    System.out.println("\n-- Registrar sarten --");
                    System.out.print("Ingresa la clave del sarten: ");
                    clave = leer.nextInt();
                    leer.nextLine();
                    if(enRango(clave) && esValida(clave)) {
                        registrar(clave);
                    }    
                    break;
                case 2: 
                    if(existenElementos()){
                        System.out.println("\n-- Consultar sarten --");
                        System.out.print("Ingresa la clave del sarten: ");
                        clave = leer.nextInt();
                        if(enRango(clave)) {
                            consultar(clave);
                        }
                    }      
                    break;
                case 3: 
                    if(existenElementos()) {
                        System.out.println("\n-- Consulta general --");
                        consultaGeneral();    
                    }
                    break;
                case 4:
                    if(existenElementos()) {
                        System.out.println("\n-- Modificar Datos --");
                        System.out.print("\nIngresa la clave del sarten a modificar: ");
                        clave = leer.nextInt();
                        if(enRango(clave) && esValida(clave))
                            modificar(clave);
                    }
                    break;    
                case 5:
                    if(existenElementos()) {
                        System.out.println("\n-- Eliminar Datos --");
                        System.out.print("\nIngresa la clave del sarten a eliminar: ");
                        clave = leer.nextInt();
                        if(esValida(clave))
                            eliminar(clave);
                    } 
                    break;
                case 6:
                    System.out.println("\n||PROGRAMADORES||");
                    System.out.println("Alexis De Jesus Perez Carmona");
                    System.out.println("Gustavo Valerio Guzman");
                    System.out.println("\nFecha: 26/Nov/2022");
                    break;
                default:
                    System.out.println("\n(!) Opcion no valida, asegurate de colocar un numero dentro del rango permitido");
                    break;
            }    

        }while(opcion != 6);    
    }
    

    static boolean esValida(int clave) {
        for(int i=0; i<contador; i++) {
            if(claves[i] == clave) {
                System.out.println("\n(!) La clave ya ha sido registrada. (!)");
                return false;
            }    
        }
        return true;    
    }

    static boolean enRango(int clave) {        
        if(clave < 1 || clave > 111){            
            System.out.println("\n(!) La clave esta fuera de rango (!)");
            return false;
        }
        return true;
    }
    
    static void elegirDescuento(int descuento, int contador) {
        if(descuento == 1)
            descuentos[contador] = true;
        else if(descuento == 2)
            descuentos[contador] = false;
        else
            System.out.println("\nOpcion fuera del rango.");      
    }

    static int obtenerPosicion(int clave) {
        for(int i=0; i<contador; i++) {
            if(claves[i] == clave) {
                return i;
            }
        }  
        return -1;     
    }

    static boolean existenElementos(){
        if(contador == 0) {
            System.out.println("\nAun no se han registrado sartenes.");
            return false;
        }
        return true;
    }
    
    static void registrar(int clave) {
        claves[contador] = clave;
        System.out.print("Ingresa el modelo del sarten: ");
        modelos[contador] = leer.nextLine();
        System.out.print("Ingresa el precio del sarten: ");
        precios[contador] = leer.nextFloat();
        System.out.print("Ingresa el el diametro del sarten: ");
        diametros[contador] = leer.nextFloat();
        System.out.print("El sarten tendra descuento?: [1. Si  2. No]: ");
        descuento = leer.nextInt();
        elegirDescuento(descuento, contador);
        contador++;   
    }
    //Consulta individual
    static void consultar(int clave){
        index = obtenerPosicion(clave);
        if(index == -1) {
            System.out.println("\nLa clave no ha sido asiganada a un sarten.");
            return;
        }
        String aux = "";
        if(descuentos[index])
            aux = "El sarten tiene descuento.";
        else
            aux = "El sarten no tiene descuento.";
        System.out.printf("\nModelo: %s \n", modelos[index]);
        System.out.printf("Precio: %.2f \n", precios[index]);
        System.out.printf("Diametro: %.2f \n", diametros[index]);
        System.out.printf("Descuento: %s \n", aux);
    }
    //consulta general ordenada
    static void consultaGeneral(){
        int aux;
        String aux1;
        float aux2;
        boolean aux3;
        for(int i=0; i<contador; i++){
            for(int j=0; i<contador-1-i; i++){
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

                aux3 = descuentos[i];
                descuentos[i] = descuentos[i+1];
                descuentos[i+1] = aux3;                 
            }
        }
        String desc = "";
        for(int i=0; i<contador; i++){
            if(descuentos[i])
                desc = "El sarten tiene descuento.";
            else
                desc = "El sarten no tiene descuento.";
            System.out.printf("\nClave       : %d",claves[i]);
            System.out.printf("\nModelo        : %s",modelos[i]);                    
            System.out.printf("\nDiametro       : %.2f cm",diametros[i]);
            System.out.printf("\nPrecio         : $%.2f",precios[i]);
            System.out.printf("\nDescuento      : %s", desc);
            System.out.printf("\n-------------------\n");
        }
    }

    static void modificar(int clave) {        
        index = obtenerPosicion(clave);
        if(index == -1) {
            System.out.println("\nLa clave no ha sido asiganada a un sarten.");
            return;
        }
        String aux = "";
        do {
            if(descuentos[index])
                aux = "El sarten tiene descuento.";
            else
                aux = "El sarten no tiene descuento.";
                        
            System.out.print("-- Datos Actuales --");
            System.out.printf("\n[1] Modelo              : %s",modelos[index]);
            System.out.printf("\n[2] Precio              : %.2f",precios[index]);
            System.out.printf("\n[3] Diametro            : %.2f",diametros[index]);
            System.out.printf("\n[4] Descuento           : %s",aux);
            System.out.print("\n[5] Salir");
            System.out.print("Ingresa la opcion a modificar: ");
            opcion = leer.nextInt();
            switch(opcion) {
                case 1:
                    System.out.print("Ingresa el nuevo modelo: ");
                    modelos[index] = leer.nextLine(); 
                    break;
                case 2:
                    System.out.print("Ingresa el nuevo precio: ");
                    precios[index] = leer.nextFloat();
                    break;
                case 3:
                    System.out.print("Ingresa el nuevo diametro: ");
                    diametros[index] = leer.nextFloat();
                    break;
                case 4:
                    System.out.print("Tendra descuento? [1. Si   2. No]: ");
                    descuento = leer.nextInt();
                    elegirDescuento(descuento, index);
                    break;
                default:
                    System.out.println("(!) Opcion no valida, asegurate de colocar un numero dentro del rango permitido");                     
            }
        }while(true);            
    }

    static void eliminar(int clave){
        index = obtenerPosicion(clave);
        if(index == -1) {
            System.out.println("\nLa clave no ha sido asiganada a un sarten.");
            return;
        }
        String aux = "";
        if(descuentos[index])
            aux = "El sarten tiene descuento.";
        else
            aux = "El sarten no tiene descuento.";
        System.out.printf("Modelo actual        : %s.\n", modelos[index]);
        System.out.printf("Diametro actual      : %.2f.\n", diametros[index]);
        System.out.printf("Precio actual        : %.2f.\n", precios[index]);
        System.out.printf("Descuento            : %s\n", aux);
        System.out.print("¿ESTA SEGURO DE ELIMINAR ESTE SARTEN? [1=SI  2=NO]: ");

        if(leer.nextInt() == 1){
            for(int j=index; j<contador-1; j++){
                claves[j] = claves[j+1];
                modelos[j] = modelos[j+1];
                diametros[j] = diametros[j+1];
                precios[j] = precios[j+1];
                descuentos[j] = descuentos[j+1];
            }
            contador--;
        }
    }
}
