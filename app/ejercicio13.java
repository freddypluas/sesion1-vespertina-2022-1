//Ejercicio13: conerciones tipo menu
package app;

import javax.swing.JOptionPane;


public class ejercicio13 {

    
    public static void main(String[] args) {
      // entrada
      char sexo = 'M';
           String numeroEnteroString = "10";
        String numeroDecimalString = "5.5";
         int numeroEnteroConvertido = 0;
        double numeroDecimalConvertido = 0.0;
        String sexoStringConvertido= "";
        int opcion = 0 ;
        //procesos
        
        opcion= Integer.parseInt(JOptionPane.showInputDialog( "---MENU DE OPCIONES---"+ "\n" + "1.CONEVERTIR DE STRING A ENTERO" +"\n" + "2.CONVERTIR DE STRING A DOUBLE" 
                + "\n" + "3.CONVERTIR DE CHAR A STRING")) ;
        
        if(opcion==1){
            numeroEnteroConvertido = Integer.parseInt(numeroEnteroString);
           JOptionPane.showMessageDialog(null, "La conversion es "+numeroEnteroConvertido);
    
        }else if (opcion==2){
            numeroDecimalConvertido= Double.parseDouble(numeroDecimalString);
            JOptionPane.showMessageDialog(null, "La conversion es :"+numeroDecimalConvertido);
            
            
        }else if (opcion==3){
            sexoStringConvertido = String.valueOf(sexo);
            JOptionPane.showMessageDialog(null," La conversion es : "+ sexoStringConvertido);
        
        }
        
      
    }
    
}
