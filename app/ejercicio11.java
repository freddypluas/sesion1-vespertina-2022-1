/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
// ejercicio11: aplicacion para generacion de una venta de producto ór consola
package app;

import java.util.Scanner;

public class ejercicio11 {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String producto ="";
        int cantidad=0;
        double precio = 0.0;
        double subtotal= 0.0;
        double iva= 0.0;
        double total= 0.0;
        //proceso
       System.out.print("Ingrese el producto: ");
        producto = entrada.next();
        System.out.print("cantidad: ");
        cantidad= entrada.nextInt();
        System.out.print("precio: ");
        precio = entrada.nextDouble();
        
        subtotal = cantidad * precio ;
        iva =subtotal * 0.12;
        total= subtotal+iva;
        // salida
        System.out.print("producto "+ producto);
        System.out.print("\n subtotal "+ subtotal);
        System.out.print("\n iva "+ iva);
        System.out.print("\n total "+ total);
        
            
                
    }
    
}
