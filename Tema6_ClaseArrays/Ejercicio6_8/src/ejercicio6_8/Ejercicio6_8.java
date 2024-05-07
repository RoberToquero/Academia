/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6_8;

/**
 *
 * @author COOLBOX_SSD5
 */
import javax.swing.JOptionPane;
import java.util.ArrayList;
public class Ejercicio6_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean condicion=true;
        ArrayList<String> opciones = new ArrayList();
        do{
            int seleccion=Integer.parseInt(JOptionPane.showInputDialog(null, "1.- Introducir datos\n2.- Modificar datos\n3.- Eliminar datos\n4.- Buscar datos\n5.- Mostrar datos\n6.- Salir", "OPCIONES",3));
            if (seleccion>=1 && seleccion<=6){
                switch(seleccion){
                    case 1:
                        String opcion1=JOptionPane.showInputDialog(null,"Introduzca el nombre completo del cliente", "Clientes", 3);
                         opciones.add(opcion1);
                         break;
                    case 2:
                        String opcion2=JOptionPane.showInputDialog(null,"Introduzca el dato a modificar", "Clientes", 3);
                        if (opciones.indexOf(opcion2)!=-1){
                            opciones.set(opciones.indexOf(opcion2),JOptionPane.showInputDialog(null,"Introduzca el nuevo dato", "Clientes", 3));
                        }
                        
                        else{
                            JOptionPane.showConfirmDialog(null, "¡No existe el dato a modificar!", "clientes",-1,1);
                        }
                        break;
                    case 3:
                        String opcion3=JOptionPane.showInputDialog(null,"Introduzca el dato a eliminar", "Clientes", 3);
                        opciones.remove(opcion3);
                        break;
                    case 4: 
                         String opcion4=JOptionPane.showInputDialog(null,"Introduzca el dato a buscar", "Clientes", 3);
                         JOptionPane.showMessageDialog(null,"Datos en posición: " + opciones.indexOf(opcion4) + ":" + opcion4, "Clientes", 0);
                         break;
                    case 5:
                        String mensaje="";
                        for(int i =0;i<opciones.size();i++){
                           mensaje = mensaje + "Número posición " + i + ": " + opciones.get(i) + "\n";
                        }
                         JOptionPane.showMessageDialog(null, mensaje, "Clientes", 1);
                         
                         break;
                    case 6:
                        condicion=false;
                        break;
                }
            }
            else{
                JOptionPane.showConfirmDialog(null,"Opción inválida", "Mensaje", -1,0);
            }
        }while(condicion==true);
    }
    
}
