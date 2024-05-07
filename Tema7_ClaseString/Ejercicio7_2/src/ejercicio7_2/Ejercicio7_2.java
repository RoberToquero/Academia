/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7_2;

/**
 *
 * @author COOLBOX_SSD5
 */
public class Ejercicio7_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Inserta tu correo electrónico: ");
         String email="pp@hotmail.com";
         
        int punto= email.indexOf(".");
        int ultimasPosiciones = email.length()-(punto+1);
        System.out.println(ultimasPosiciones);
        
        if(email.indexOf("@")== email.lastIndexOf("@") &&  punto!=-1 && ultimasPosiciones==3 || ultimasPosiciones==2){ 
             System.out.println("El correo es correcto");
        } 
        else{
            System.out.println("El correo no es correcto, por favor pruebe otra vez");
        }
      
       
        
       
            
        
    }  
}
