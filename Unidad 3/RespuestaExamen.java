import java.util.Scanner;
public class RespuestaExamen{
   public static void main(String args[]){
      Scanner get = new Scanner(System.in);
      int litrosRestantes = 2301, resp, cantidad, litrosVendidos=0;
      float desc=0, pago, pagoFinal, dineroObtenido=0, dineroDesc=0;
      final float precio = 43.90f;
      
      System.out.println("Desea registrar una compra? [1=si]");
      resp = get.nextInt();
       
      while(resp == 1){
         System.out.println("====\nCantidad de litros de alcohol: ");
         cantidad = get.nextInt();
         if(cantidad > litrosRestantes){
            System.out.println("No hay suficiente alcohol :(\n-------------\n");
            continue;
         }
         litrosRestantes -= cantidad;
         litrosVendidos += cantidad;
         
         pago = cantidad * precio;
         if(cantidad >= 7){
            desc = pago * 0.08f;
         }
         pagoFinal = pago - desc;
         dineroObtenido += pagoFinal;
         dineroDesc += desc;
         
         System.out.printf("--------\nCliente\nCantidad de litros de alcohol que compró el cliente: %d", cantidad, pago, desc);
         System.out.printf("\nPago antes del descuento que debede hacer el cliente por la compra del alcohol: %.2f", pago);  
         System.out.printf("\nDescuento que debe hacerse al cliente por la compra del alcohol: %.2f$", desc);
         System.out.printf("\nPago después de descuento que debe hacer el cliente por la compra del alcohol: %.2f$\n====\n", pagoFinal);
         
         
         if(litrosRestantes <= 0)
            break;
         
         System.out.println("Desea registrar otra compra? [1=si]");
         resp = get.nextInt();
      }
      System.out.printf("------\nFinal del dia\nCantidad de litros de alcohol vendidos: %d", litrosVendidos);
      System.out.printf("\nDinero obtenido por la venta del alcohol: %.2f$", dineroObtenido);   
      System.out.printf("\nDinero que se dejó de percibir por los descuentos en la venta del alcohol: %.2f$", dineroDesc);  
      System.out.printf("\nCantidad de litros de alcohol que quedaron el en tanque de alcohol: %d", litrosRestantes);    
      System.out.println("\n++++\n Perez Carmona Alexis De Jesus\n++++");
   }
}