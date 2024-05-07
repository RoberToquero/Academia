import javax.swing.JOptionPane;
public class Confirmaciones {
    public static void main(String[] args)
    {
         int opciones;
         opciones=JOptionPane.showConfirmDialog(null,"¿Estás aprendiendo Java?","Cuadro de Confirmación",1,3,null);
         if (opciones==0)
            JOptionPane.showMessageDialog(null,"Pulsaste el botón Sí.","Información",1);
         else if (opciones==1)
            JOptionPane.showMessageDialog(null,"Pulsaste el botón No.","Información",1);
         else
            JOptionPane.showMessageDialog(null,"Cerraste el cuadro de diálogo sin contestar.","Información",1); 
         }
    
}