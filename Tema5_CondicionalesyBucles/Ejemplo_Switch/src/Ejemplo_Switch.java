import javax.swing.JOptionPane;
public class Ejemplo_Switch {
    public static void main(String[ ] arg) {
        int opcion; // Variable valor de la opci�n
        float lado, base, altura;
        Object [] figuras={"Cuadrado","Rect�ngulo","Tri�ngulo"};//Figuras
        opcion=JOptionPane.showOptionDialog(null,"Seleccione una figura:","Cuadro de figuras",-1,3,null,figuras,null);
        if (opcion==-1)
            JOptionPane.showMessageDialog(null,"No se seleccion� ninguna figura","Informaci�n",1);
        if (opcion==0)
        {
            lado=Float.parseFloat(JOptionPane.showInputDialog(null,"Indique lado del cuadrado:","Datos",3)); 
            JOptionPane.showMessageDialog(null,"El �rea es igual a: "+lado*lado+"u�","C�lculo de �reas",1);
        }
        if (opcion==1)
        {
            base=Float.parseFloat(JOptionPane.showInputDialog(null,"Indique base del rect�ngulo:","Datos",3));
            altura=Float.parseFloat(JOptionPane.showInputDialog(null,"Indique altura del rect�ngulo:","Datos",3));            
            JOptionPane.showMessageDialog(null,"El �rea es igual a: "+base*altura+"u�","C�lculo de �reas",1);
        }
        if (opcion==2)
        {
            base=Float.parseFloat(JOptionPane.showInputDialog(null,"Indique base del tri�ngulo:","Datos",3));
            altura=Float.parseFloat(JOptionPane.showInputDialog(null,"Indique altura del tri�ngulo:","Datos",3));            
            JOptionPane.showMessageDialog(null,"El �rea es igual a: "+(base*altura)/2+"u�","C�lculo de �reas",1);
        }
    }      
}
