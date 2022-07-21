/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
//Ejercicios: Aplicacion que valide el medio de pago en efectivo y de documentos en la venta
package app;

public class ejercicio8 {

    
    public static void main(String[] args) {
        String vehiculo="FORD-F150";
        boolean licencia= true;
        boolean efectivo= true;
        
        //proceso
        if(licencia==true){
            // if-anidacion
            if(efectivo==true){
                //salida
                System.out.print("se ejecuta la venta del vehiculo:"+ vehiculo);
            }
            else {
                System.out.print("cumple con la licencia, pero no cumple el efectivo , no se ejecuta la venta");
            } 
        }else{
                   System.out.print("no cumple con el requisito principal (LICENCIA)"); 
                    }
            
        }
        
    }
    

