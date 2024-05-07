/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numerosentre;

/**
 *
 * @author COOLBOX_SSD5
 */
import javax.swing.JOptionPane;
public class Numeros {

    /**
     * @param args the command line arguments
     */ 
    public static void main(String[] args) {
        boolean datosvalidos=false;
        String cadena1="", cadena2="";
        Numeros validar=new Numeros();
        while(datosvalidos==false){
            cadena1=JOptionPane.showInputDialog(null,"Número de inicio...", "NÚMEROS COMPRENDIDOS", 3);
            cadena2=JOptionPane.showInputDialog(null,"Número de final...", "NÚMEROS COMPRENDIDOS", 3);
            //Protección contra botón cancelar, pulsar X y datos en blanco
            if((cadena1==null) || (cadena2==null) || cadena1.equals("") || cadena2.equals("")||
                    validar.Cadenanaturales(cadena1)==false || validar.Cadenanaturales(cadena2)==false){
                JOptionPane.showMessageDialog(null, "Los valores introducidos no son válidos.\n Se escribieron datos en blanco\n" +
                 "o se pulsó X o el botón cancelar", "NÚMEROS COMPRENDIDOS", 1);
            }
            else{
                datosvalidos=true;
            }   
        }
       //Llamada al método para realizar el cálculo
       Numeros entre = new Numeros();
       entre.comprendidos(Integer.parseInt(cadena1), Integer.parseInt(cadena2));
    }
    public void comprendidos(int n1, int n2){
        String cadena="";
        if(n2>=n1){
            for(int i=n1;i<n2;i++){
            cadena=cadena+"\n"+i;
            }   
        }
        else{
            for(int i=n1-1;i>n2;i--){
                cadena=cadena+"\n"+i;
            }
        }
        JOptionPane.showMessageDialog(null,"Los valores comprendidos entre "+n1 + " y " + n2 +" son:\n" + cadena,"NÚMEROS COMPRENDIDOS", 1);
    }  
    public boolean Cadenanaturales(String dato){
        boolean esnumero=true;
        byte caracteres[]=new byte[dato.length()];
        caracteres=dato.getBytes();
        /*Aprovechando que el método String getBytes genera un Array con el número
        código ASCII de los componentes de la cadena, se genera dicho array y se compara con el código ASCII
        de los caracteres numéricos de 0 a 9 que en el código ASCII están comprendidos entre 48 y 57*/
        for(int i =0;i<dato.length();i++){
            if(caracteres[i]<48 || caracteres[i]>57){
                //No es un número y se puede romper el bucle
                esnumero=false;
                break;
            }
        }
        return esnumero;
    }
}
