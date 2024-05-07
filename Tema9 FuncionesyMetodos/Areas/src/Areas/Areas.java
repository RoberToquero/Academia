/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Areas;

/**
 *
 * @author COOLBOX_SSD5
 */
import javax.swing.JOptionPane;
public class Areas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Object [] opciones={"Cuadrado", "Rectángulo", "Triángulo"};
        int repetir=0;
        while(repetir==0){
            int figura= JOptionPane.showOptionDialog(null, "Elige una figura geométrica", "Calcular área", 1, 3, null, opciones, null);
            if(figura==0){
                area1();   
            }
            else if(figura==1){
                area2();
            }
            else if(figura==2){
                area3();
            }
          repetir=JOptionPane.showOptionDialog(null, "¿Quieres volver a jugar?", "Juego", 0, 3, null, null, null);
        }
        
    }
    public static void area1(){
        int lado=Integer.parseInt(JOptionPane.showInputDialog(null,"Introduce la medida del lado","Cuadrado",3));
        double areaCuadrado=Math.pow(lado, 2);
        JOptionPane.showMessageDialog(null, "El área del cuadrado es: " + areaCuadrado, "Área del cuadrado", 1);
    }
    public static void area2(){
        int base=Integer.parseInt(JOptionPane.showInputDialog(null,"Introduce el valor de la base","Rectángulo",3));
        int altura=Integer.parseInt(JOptionPane.showInputDialog(null,"Introduce el valor de la altura","Rectángulo",3));
        double areaRectangulo=base*altura;
        JOptionPane.showMessageDialog(null, "El área del rectángulo es: " + areaRectangulo , "Área del rectángulo", 1);
    }
    public static void area3(){
        int base=Integer.parseInt(JOptionPane.showInputDialog(null,"Introduce el valor de la base","Triángulo",3));
        int altura=Integer.parseInt(JOptionPane.showInputDialog(null,"Introduce el valor de la altura","Triángulo",3));
        double areaTriangulo=base*altura/2;
        JOptionPane.showMessageDialog(null, "El área del rectángulo es: " + areaTriangulo , "Área del triángulo", 1);
    }
    
}
