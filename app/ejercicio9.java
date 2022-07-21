/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
//Ejercicio9: Aplicacion que permita validar el lugar de votacion, la edad, la mesa de un proceso de elecciones
//Presidenciales

package app;

public class ejercicio9 {

    
    public static void main(String[] args) {
        
   boolean edad= true;
   boolean lugar_de_votacion =true;
   boolean mesa = true;
   //proceso
 
        if(edad == true){
           
            if(lugar_de_votacion == true){
                if(mesa == true){
                    System.out.println("es su mesa correcta  ");
                }else {
                    System.out.println("No se encuentra en su mesa designada");
                }
            }else {
                System.out.println("No se encuentra en el lugar de votacion designado");
            }
        }else {
            System.out.println("No cumples con la edad requerida para realizar el proceso de votacion");
        }
    }
}
    
   
      
    
    

