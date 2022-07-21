/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package app;
// Ejercico4: aplicacion que valide que dos numero son pares
public class ejercicio4 {

    public static void main(String[] args) {
        //entrada
        int numero1=2;
          int numero2=4;
            int residuo1 =0;
              int residuo2 =0;
              //proceso
              residuo1=numero1%2;
              residuo2=numero2%2;
              //salida
              if(residuo1==0 && residuo2==0){
                    System.out.println("Los dos numero son pares");
       }else{
           System.out.println("Los dos numero no son pares");
              }
        
    }
    
}
