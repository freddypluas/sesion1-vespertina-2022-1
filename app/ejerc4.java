/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
//
//En una empresa pagan según las horas trabajadas y una tarifa fija por hora. Si la
//cantidad de horas trabajadas en una semana es mayor a 40, la tarifa se
//incrementa en un 35% para las horas extras. Escribe una acción principal que
//solicite la identificación de 5 empleados, el monto cancelado por hora, y la
//cantidad de horas trabajadas por cada uno, llame a acciones/funciones que
//calculen el salario semanal por horas trabajadas (<=40) y los ingresos por
//concepto de horas extras, y finalmente informe los resultados en la acción
//principal.
package app;
import java.util.Scanner;

public class ejerc4 {

  
  
    public static void main(String[] args) {
       int horas ;
       int horas_extras;
       int leer_horas ;
       double  pago;
       double  leer_pago;
       double pago_extra;
       double sueldo;
       Scanner entrada = new Scanner(System.in);
       
       System.out.print("ingrese las horas trabajadas" );
       horas = entrada.nextInt();
       
       System.out.print("ingresa el pago por hora" );
       pago = entrada.nextInt();
       
       if ( horas<=40 ){
            horas_extras = horas - 40 ;
            pago_extra = pago * 1.5;
             sueldo = (40*pago) + (horas_extras * pago_extra);
           
       }else {
           sueldo = horas * pago ;
       } 
       
       System.out.print("el sueldo por horas  "+horas +"trabajadas"+sueldo );
       
       
    }
    
}
