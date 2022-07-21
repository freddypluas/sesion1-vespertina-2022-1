/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package app;



public class ejercicio10 {

   
    public static void main(String[] args) {
       //entrada
       String empleado ="jose davila";
       String cargo="jefe de sistema";
       int numeroHoras=15;
       double pagoHora =15.0;
       double sueldo =0.0;
       double iess=0.0;
       double netoRecibir=0.0;
       
       //proceso
       sueldo = pagoHora * numeroHoras ;
       iess= sueldo* 0.095;
       netoRecibir= sueldo- iess;
       System.out.print("Empleado: " +empleado );
       System.out.print("\n cargo: " +cargo);
       System.out.print("\n El neto a recibir es : " +netoRecibir);
       
    }
    
}
