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
        //Definici�n del ArrayList sin especificar tipo de datos (no recomendado)
       ArrayList matriz=new ArrayList();
       //A�adimos dos datos a la lista
       matriz.add("dato1");
       matriz.add(5);
        System.out.println(matriz);
        //A�adimos un dato en la posici�n 0
        matriz.add(0,7);
        System.out.println(matriz);
        System.out.println(matriz.size());
    }
    
}
