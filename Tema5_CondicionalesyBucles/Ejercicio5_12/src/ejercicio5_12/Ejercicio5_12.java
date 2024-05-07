/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5_12;

/**
 *
 * @author COOLBOX_SSD5
 */
import javax.swing.JOptionPane;
public class Ejercicio5_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion;
        Object [] semaforo={"rojo", "ámbar", "verde"};
        opcion=JOptionPane.showOptionDialog(null,"Escoge una opción: ", "Semáforo", 1,3,null,semaforo,null);
        
        switch(opcion){
            case 0:
            {
                JOptionPane.showMessageDialog(null,"Stop. Tiene que parar", "Rojo", 1);
                break;
            }
            case 1:
                {
                JOptionPane.showMessageDialog(null,"Precaución. No se arriesgue, párese", "Ámbar", 1);
                break;
            }
            case 2:
                {
                JOptionPane.showMessageDialog(null,"Continue. Puede pasar", "Verde", 1);
                break;
            }
            default:
                JOptionPane.showMessageDialog(null,"Por favor, elige una opción válida", "Semáforo", 1);
        }
    }
    
}
