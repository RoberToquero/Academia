import javax.swing.JOptionPane;
public class Ejemplo_Switch {
    public static void main(String[ ] arg) {
        int opcion; // Variable valor de la opción
        float lado, base, altura;
        Object [] figuras={"Cuadrado","Rectángulo","Triángulo"};//Figuras
        opcion=JOptionPane.showOptionDialog(null,"Seleccione una figura:","Cuadro de figuras",-1,3,null,figuras,null);
        if (opcion==-1)
            JOptionPane.showMessageDialog(null,"No se seleccionó ninguna figura","Información",1);
        if (opcion==0)
        {
            lado=Float.parseFloat(JOptionPane.showInputDialog(null,"Indique lado del cuadrado:","Datos",3)); 
            JOptionPane.showMessageDialog(null,"El área es igual a: "+lado*lado+"u²","Cálculo de áreas",1);
        }
        if (opcion==1)
        {
            base=Float.parseFloat(JOptionPane.showInputDialog(null,"Indique base del rectángulo:","Datos",3));
            altura=Float.parseFloat(JOptionPane.showInputDialog(null,"Indique altura del rectángulo:","Datos",3));            
            JOptionPane.showMessageDialog(null,"El área es igual a: "+base*altura+"u²","Cálculo de áreas",1);
        }
        if (opcion==2)
        {
            base=Float.parseFloat(JOptionPane.showInputDialog(null,"Indique base del triángulo:","Datos",3));
            altura=Float.parseFloat(JOptionPane.showInputDialog(null,"Indique altura del triángulo:","Datos",3));            
            JOptionPane.showMessageDialog(null,"El área es igual a: "+(base*altura)/2+"u²","Cálculo de áreas",1);
        }
    }      
}
