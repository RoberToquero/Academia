import java.util.Arrays;
// java.utils.Arrays es necesario para utilizar los métodos Arrays
import java.util.Collections;
//Importa el método para invertir el orden en arrays String
public class Vectores {
    public static void main(String[ ] ar) {
       
        //Inicializar y definir en la misma sentencia
        int conjunto1[] = {300,50,200,100,40};
        //copia en un Array idéntico
        int conjunto2[]=Arrays.copyOf(conjunto1, 5);
        //Muestra el array copiado
        System.out.println(Arrays.toString(conjunto2));
        //Copia en un Array más largo y añade ceros
        int conjunto3[]=Arrays.copyOf(conjunto1, 7);
        System.out.println(Arrays.toString(conjunto3));
        //copia en un Array más corto y recortará valores
        int conjunto4[]=Arrays.copyOf(conjunto1, 3);
        System.out.println(Arrays.toString(conjunto4));
        //Copia del Array desde el indice 2 al indice 4
        int conjunto5[]=Arrays.copyOfRange(conjunto1, 2, 5);
        //Muestra el Array copiado
         System.out.println(Arrays.toString(conjunto5));
        
     }

}
