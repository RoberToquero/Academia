import javax.swing.JOptionPane;
public class Met_Colores {
     static Object[] pos_color ={"Rojo", "Amarillo", "Verde", "Azul"}; //Posibles opciones
  public static void main(String[ ] arg) {
      Met_Colores eleccion = new Met_Colores();
       int n = elegir();
       JOptionPane.showMessageDialog(null, "El cuadro elegido es " + pos_color[n],null,1,null);
       }  
   public static int elegir(){
       int valor_opcion;//Variable valor de la opción
       valor_opcion=JOptionPane.showOptionDialog(null,"Pulse botón: ","Cuadro de opciones", -1,2,null,pos_color,null);
       return valor_opcion;
   }
}
