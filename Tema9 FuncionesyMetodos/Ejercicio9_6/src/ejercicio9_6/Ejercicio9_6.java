/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9_6;

/**
 *
 * @author COOLBOX_SSD5
 */
import javax.swing.JOptionPane;
public class Ejercicio9_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Object [] castilla= {"Ávila","Burgos","León","Palencia","Salamanca","Segovia","Soria","Valladolid","Zamora"}; 
      boolean repetir=true;
      do{
         temperaturas(JOptionPane.showOptionDialog(null, "Pulse sobre una provincia: ", "Cuadro de opciones", 1,3,null,castilla,null));
         int n=repeticion();
         if (n==1){
             repetir=false;
         }
      
      }while(repetir==true);
   
           
    }
    public static void temperaturas(int n){
       Object [][] temperaturas={{"10ºC","10ºC","11ºC","12ºC","12ºC","12ºC","11ºC","12ºC","13ºC"},
                 {"1130m","890m","916m","758m","790m","1005m","1082m","735m","656m"}};
       JOptionPane.showMessageDialog(null, "Su temperatura y altitud son:\n " + temperaturas[0][n] + "\n"+temperaturas[1][n],"Cuadro de opciones",3);
    }
    public static int repeticion(){
         int x=JOptionPane.showConfirmDialog(null,"¿DESEA REPETIR?","Cuadro de opciones", 0,3);
         return x;
    }
    
}
