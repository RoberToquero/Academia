/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5_14;

/**
 *
 * @author COOLBOX_SSD5
 */
import javax.swing.JOptionPane;
public class Ejercicio5_14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int edad;
       Object[] opciones={"Menor de 10 a�os","De 10 a 18 a�os","De 18 a 90 a�os","Mayor de 90 a�os"}; 
        edad=JOptionPane.showOptionDialog(null,"Seleccione su edad", "Opciones de edad", 1, 3, null, opciones, null);
       switch(edad){
           case 0:
           {
               JOptionPane.showMessageDialog(null,"Eres un ni�o casi programador", "Edades", 1);
               break;
           }
           case 1:
           {
               JOptionPane.showMessageDialog(null,"Eres un joven con futuro en Java", "Edades", 1);
               break;
           }
           case 2:
           {
               JOptionPane.showMessageDialog(null,"Eres un adulto aprendiendo Java a fondo", "Edades", 1);
               break;
           }
           case 3:
           {
               JOptionPane.showMessageDialog(null,"Nunca es tarde para empezar con Java", "Edades", 1);
               break;
           }
           default:
           {
               JOptionPane.showMessageDialog(null,"Opci�n no v�lida", "Edades", 2);
           }
       }
    }
    
}
