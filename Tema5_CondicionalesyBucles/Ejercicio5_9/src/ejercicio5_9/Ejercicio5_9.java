/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5_9;

import javax.swing.JOptionPane;

/**
 *
 * @author COOLBOX_SSD5
 */
public class Ejercicio5_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int repetir=0;
        while(repetir==0){
        int num1=Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce un n�mero", "Divisi�n", 3));
        int num2=Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce un n�mero", "Divisi�n", 3));
        double division=(double)num1/(double)num2;
        if(num2!=0){
            JOptionPane.showMessageDialog(null,"La divisi�n es: " + division, "Divisi�n", 1);
            }
        
        else{
            JOptionPane.showMessageDialog(null,"La operaci�n no puede realizarse ", "Divisi�n", 2);
        }
        repetir=JOptionPane.showOptionDialog(null, "�Quieres volver a jugar?", "Juego", 1, 3, null, null, null);
    }
    
    }
}
