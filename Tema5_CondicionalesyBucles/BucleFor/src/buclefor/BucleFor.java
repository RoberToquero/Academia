/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buclefor;

/**
 *
 * @author COOLBOX_SSD5
 */
import javax.swing.JOptionPane;
public class BucleFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String [] cyl={"�vila", "Burgos", "Le�n", "Palencia", "Salamanca", "Segovia", "Soria", "Valladolid", "Zamora"};
        String texto="";
        for(int i =0;i<cyl.length;i++){
            //Acumulamos el texto nuevo con el texto anterior e introducimos un salto de l�nea
            texto= texto + cyl[i]+"\n";
            JOptionPane.showMessageDialog(null, "Las provincias de nuestra regi�n son :\n" + texto,"Informaci�n", 1);
        }
       
    }
    
}
