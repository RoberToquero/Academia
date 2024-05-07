/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listadinamica2;

/**
 *
 * @author COOLBOX_SSD5
 */
import java.util.ArrayList;
public class ListaDinamica2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Definición del ArrayList sin especificar tipo de datos (no recomendado)
       ArrayList matriz=new ArrayList();
       //Añadimos dos datos a la lista
       matriz.add("dato1");
       matriz.add(5);
        System.out.println(matriz);
        //Añadimos un dato en la posición 0
        matriz.add(0,7);
        System.out.println(matriz);
        System.out.println(matriz.size());
    }
    
}
