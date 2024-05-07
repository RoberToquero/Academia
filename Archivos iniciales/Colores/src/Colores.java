import javax.swing.JOptionPane;
public class Colores {
  public static void main(String[ ] arg) {
       int valor_opcion; // Variable valor de la opción
       
        valor_opcion=JOptionPane.showOptionDialog(null,"Pulse un boton:","Cuadro de opciones",-1,2,null,null,null);
        //La matriz posibles recoge las opciones que se mostrarán al usuario
        //La opción pos_color[2] marca la opción que saldrá por defecto
        JOptionPane.showMessageDialog(null, "el valor de la opcion elegida es: "+valor_opcion+" ","informacion",1);
       
       }  
}
