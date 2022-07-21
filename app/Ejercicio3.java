/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package app;
// Ejercicio3: Aplicacion que permita vereficar si un numero es multiplo de 7

public class Ejercicio3 {

    public static void main(String[] args) {
        //entrada
        int numero=7;
        int residuo=0;
        
        //proceso
        residuo=numero%7;
        
        //salida
        if(residuo==0){
           System.out.println("El numero es multiplo de 7");
       }else{
           System.out.println("El numero no es multiple de 7");
       }
    }
    
}
