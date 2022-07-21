/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
// Ejercicio6: Aplicaion que valide el servicio de parquimetro de vehiculos
//equals = para comparaciones
package app;
public class ejercicio6 {
    public static void main(String[] args) {
        //entrada
        String vehiculo="auto";
        // PROCESO
        if(vehiculo.equals("auto")|| vehiculo.equals("SUV")|| vehiculo.equals("camion")){
            //Salida
            System.out.print("Tiene acceso al parquimetro");
        }else {
             System.out.print("NO Tiene acceso al parquimetro");
        }
        
    }
    
}
