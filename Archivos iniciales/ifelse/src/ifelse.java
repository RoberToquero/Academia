import javax.swing.JOptionPane;
public class ifelse {
  public static void main(String[ ] arg) {
        String academia=" ";
        while(academia.equalsIgnoreCase("Fray Luis Centro Académico")==false){
             academia= JOptionPane.showInputDialog(null,"¿Cómo se llama la academia donde estudias?","Introducción de datos",3);
                if(academia.equals("")){
                JOptionPane.showMessageDialog(null, "¡¡¡ No has introducido nada!!!","informacion",1);
                }
                else if (academia.equalsIgnoreCase("Fray Luis Centro Académico")){
                JOptionPane.showMessageDialog(null,"¡¡¡Correcto!!!","Información",1);
                }
                else{
                JOptionPane.showMessageDialog(null,"No, te has equivocado.","Información",1);
                }
             
        }     
   }  
}
