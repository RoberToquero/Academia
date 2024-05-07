/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalcapitulo4_1;

/**
 *
 * @author COOLBOX_SSD5
 */
import java.util.Scanner;
public class Operaciones {
    int operando1,operando2, suma, resta, producto, div;
    
    public void cargarDatos(){
      Scanner s= new Scanner(System.in);
        System.out.println("Introduce un número");
        operando1=s.nextInt();
        System.out.println("Introduce otro número");
        operando2=s.nextInt();
    }
    public void suma(){
        suma= operando1 + operando2;
    }
    public void resta(){
        resta=operando1-operando2;  
    }
    public void producto(){
        producto=operando1*operando2;  
    }
    public void div(){
        div=operando1/operando2;  
    }
    public void imprimir(){
        System.out.println("la suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La multiplicación es: " + producto);
        System.out.println("La división es: " + div);
    }
    public static void main(String[] args) {
        Operaciones op=new Operaciones();
        op.cargarDatos();
        op.suma();
        op.resta();
        op.producto();
        op.div();
        op.imprimir();
        
       
       
    }
}
