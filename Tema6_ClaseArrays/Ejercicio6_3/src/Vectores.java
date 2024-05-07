import java.util.Arrays;
// java.utils.Arrays es necesario para utilizar los métodos Arrays
import java.util.Collections;
//Importa el método para invertir el orden en arrays String
public class Vectores {
    public static void main(String[ ] ar) {
        boolean p;
        //Inicializar y definir en la misma sentencia
        String conjunto1[] = {"100", "200", "300", "400", "500"};
        int conjunto2[]={300,50,200,100,40};
        int conjunto3[]={300,50,200,100,40};
        //El array conjunto1 ya está ordenado y se puede mostrar
        System.out.println(Arrays.toString(conjunto1));
        System.out.println("El elemento 300 de conjunto1 ocupa la posición " + Arrays.binarySearch(conjunto1, "300"));
        //Se muestra el array conjunto2 no ordenado
        System.out.println(Arrays.toString(conjunto2));
        System.out.println("El elemento 300 de conjunto2 ocupa la posición " + Arrays.binarySearch(conjunto2, 300));
        //Reordenamos el array conjunto2
        Arrays.sort(conjunto2);
        //Mostramos el array
        System.out.println(Arrays.toString(conjunto2));
        System.out.println("El elemento 300 de conjunto2 ocupa la posición " + Arrays.binarySearch(conjunto2, 300));
       
        
     }

}
