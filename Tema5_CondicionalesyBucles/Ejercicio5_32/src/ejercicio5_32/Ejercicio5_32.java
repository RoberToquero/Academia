/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5_32;

/**
 *
 * @author COOLBOX_SSD5
 */
import java.util.Arrays;
import javax.swing.JOptionPane;
public class Ejercicio5_32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int corte=0;
        String mensciudades="";
        String ciudades[]=new String[20];
        for(int i =0;i<20;i++){
            ciudades[i]=JOptionPane.showInputDialog(null,"Dime que ciudades has visitado, escriba acabar si desea salir", "Ciudades", 3);
            if(ciudades[i].equalsIgnoreCase("acabar")){
                corte=i;
                break;
            }
        }
        if (corte==0){
            corte=20;
        }
        for(int i=0;i<corte;i++){
              mensciudades=mensciudades+" " + ciudades[i]+ " ";
        }
            JOptionPane.showMessageDialog(null,"Las ciudades que has visitado son: " +mensciudades , "Ciudades", 1); 
    }
}
 
