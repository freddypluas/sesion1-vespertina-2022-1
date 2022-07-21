/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
//Ejercicio 14 : aplicacion que permita la cantidad de vocales y cosonantes

package app;

import javax.swing.JOptionPane;


public class ejercicio14 {

   
    public static void main(String[] args) {
    // entrada
        String palabra ="";
    int longitud= 0;
    int contadorVocales =0;
    int contadorConsonantes= 0;
    //proceso
     palabra = JOptionPane.showInputDialog("Ingrese la palabra");
     // length  obtiene la cantidad de caracteres de una string (palabra)
     longitud = palabra.length();
     for(int  indice =0; indice< longitud; indice++){ 
         //condicion 
         if(palabra.charAt(indice)=='a'|| palabra.charAt(indice)=='e'|| palabra.charAt(indice)=='i'|| palabra.charAt(indice)=='o'
                 || palabra.charAt(indice)=='u'){
         contadorVocales++;
     } else{
              contadorConsonantes++;
             }  
     
           
    }   
               
             
    JOptionPane.showMessageDialog(null, "la cantidad de vocales es:"+contadorVocales);
    JOptionPane.showMessageDialog(null, "la cantidad de consonantes es:"+contadorConsonantes);
    
    
    
    }
}
