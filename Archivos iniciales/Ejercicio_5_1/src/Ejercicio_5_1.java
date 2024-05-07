import javax.swing.JOptionPane;
public class Ejercicio_5_1 {
    public static void main(String[ ] arg) {
        int num1,num2;
        String mayor;
        String mensaje="Número mayor";
        JOptionPane.showMessageDialog(null,"Comparación de números: "+mensaje+" ","Información",1);
    num1=Integer.parseInt(JOptionPane.showInputDialog(null,"indique un numero","datos",3));
    num2=Integer.parseInt(JOptionPane.showInputDialog(null,"indique un segundo numero","datos",3));
    mayor=(num1>num2)?"mayor":"menor";
    JOptionPane.showMessageDialog(null, "el primer numero es "+mayor+" que el segundo ","INFORMACION",3);
    }
}
