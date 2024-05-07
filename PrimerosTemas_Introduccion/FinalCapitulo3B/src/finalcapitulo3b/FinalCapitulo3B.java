/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package finalcapitulo3b;

/**
 *
 * @author COOLBOX_SSD5
 */
public class FinalCapitulo3B {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int num;
       for(int i=0;i<6;i++){
           num=(int)(Math.random()*49 + 1);
           System.out.println(num);
       }
        System.out.println("\n\n");
       int a,b,c;
       a=1;
       b=1;
       c=-12;
       double x=-b+Math.sqrt(Math.pow(b,2)-4*a*c)/2*a;
       double y=-b-Math.sqrt(Math.pow(b,2)-4*a*c)/2*a;
       System.out.println(x);
       System.out.println(y + "\n");
       a=2;
       b=-11;
       c=5;
       x=-b+Math.sqrt(Math.pow(b,2)-4*a*c)/2*a;
       y=-b-Math.sqrt(Math.pow(b,2)-4*a*c)/2*a;
        System.out.println(x);
       System.out.println(y + "\n");
       
    }
    
}
