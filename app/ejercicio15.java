/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package app;
//ejercicio15: aplicacion utilizando switch- case combinando con ciclos repetitivos

import javax.swing.JOptionPane;



public class ejercicio15 {

    
    public static void main(String[] args) {
        // entrada
        int numero = 0;
        int opcion = 0;
        //proceso
        opcion = Integer.parseInt(JOptionPane.showInputDialog("----menu de opciones---"+ "\n"+
                "1. GENERA SECUENCIA ASCEDENTE "+ "\n"+
                "2. GENERA SECUENCIA DESCEDENTE"));
        numero = Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero")) ;
        // proceso de validar secuencia 
        switch (opcion){
            case 1:
                for(int indice = numero +1; indice <11; indice++){
                    JOptionPane.showMessageDialog(null, indice);
                    
                }
                break;
                
            case 2 :
                // presentar decendete
                for(int indice = numero -1 ; indice >=0; indice--){
                    JOptionPane.showMessageDialog(null, indice); 
                }
                break;
                
        }
    }
    
}
