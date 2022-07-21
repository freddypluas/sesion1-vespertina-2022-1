/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
//Ejercicio12: coversiones en java
package app;

import javax.swing.JOptionPane;

public class ejercicio12 {

    public static void main(String[] args) {
        //entrada
        String numeroEnteroString = "10";
        String numeroDecimalString = "5.5";
        int numeroEnteroConvertido = 0;
        double numeroDecimalConvertido = 0.0;
        //Proceso
        numeroEnteroConvertido = Integer.parseInt(numeroEnteroString);
        numeroDecimalConvertido = Double.parseDouble(numeroDecimalString);
        
        JOptionPane.showMessageDialog(null, "El numero entero convertido es: "+ numeroDecimalConvertido);
        JOptionPane.showMessageDialog(null, "El numero decimal convertido es: "+ numeroEnteroConvertido);
    }
    
}
