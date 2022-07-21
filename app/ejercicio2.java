/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
// ejerecicio2: vereficar que un numero sea par-impar
package app;


public class ejercicio2 {
    public static void main(String[] args) {
       // entrada 
       int numero=4;
       int residuo=0;
      
       //proceso
       residuo=numero%2;
       
       //salida
       if(residuo==0){
           System.out.println("El numero es par");
       }else{
           System.out.println("El numero es impar");
       }
    }
    
}
