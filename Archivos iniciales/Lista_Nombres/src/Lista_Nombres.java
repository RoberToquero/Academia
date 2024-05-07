import java.util.ArrayList;
public class Lista_Nombres {
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList();
        nombres.add("Ana");
        nombres.add("Luisa");
        nombres.add("Felipe");
        nombres.add("Antonio");
        nombres.add("Manuel");
        nombres.add("Vicente");
        nombres.add("Cristina");
        nombres.add("María");
        nombres.add("Cristina");
        System.out.println("1 La lista es una lista vacía?");
        System.out.println(nombres.isEmpty());
        System.out.println("2. Si no está vacía que tamaño tiene");
        System.out.println(nombres.size());
        System.out.println("3. Qué elemento ocupa la posición 2?");
        System.out.println(nombres.get(2));
        System.out.println("Vicente, ¿Es un elemento de la lista?");
        System.out.println(nombres.contains("Vicente"));
        System.out.println("Cuál es la primera coincidencia del elemento Luisa?");
        
    }
}
