/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9_8;

/**
 *
 * @author COOLBOX_SSD5
 */
import javax.swing.JOptionPane;
import java.util.Arrays;

public class Ejercicio9_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean comprobar=false;
        boolean comprobarMayor=false;
        
        int dia=0,mes=0,year=0,dia2=0,mes2=0,year2=0;
        String fecha1="",fecha2="";
        
        while(comprobarMayor==false){
            
            while(comprobar==false){
             JOptionPane.showMessageDialog(null,"Vamos a introducir una fecha, primero el día:","Fechas",3);
             dia= Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce un día: ", "Fechas",3));
             JOptionPane.showMessageDialog(null,"Vamos a introducir una fecha, segundo el mes:","Fechas",3);
             mes= Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce un mes: ", "Dias transcurridos",3));
             JOptionPane.showMessageDialog(null,"Vamos a introducir una fecha, por último el año: ","Fechas",3);
             year= Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce un año: ", "Dias transcurridos",3));
             if(verificarFechas(dia,mes,year)==true){
             fecha1=String.valueOf(dia) + "/"+ String.valueOf(mes)+"/"+ String.valueOf(year);
             JOptionPane.showMessageDialog(null,"La fecha introducida es:  " + fecha1,"Fechas",1);
             comprobar=true;
             }
             else{
                JOptionPane.showMessageDialog(null,"Fecha incorrecta, vuelve a intentarlo","Fechas",2);
             }

            }
            boolean comprobar2=false;
              while(comprobar2==false){
             JOptionPane.showMessageDialog(null,"Introduce una fecha mayor que la primera, primero el día:","Fechas",3);
             dia2= Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce un día: ", "Fechas",3));
             JOptionPane.showMessageDialog(null,"Vamos a introducir una fecha, segundo el mes:","Fechas",3);
             mes2= Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce un mes: ", "Dias transcurridos",3));
             JOptionPane.showMessageDialog(null,"Vamos a introducir una fecha, por último el año: ","Fechas",3);
             year2= Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce un año: ", "Dias transcurridos",3));
             if(verificarFechas(dia2,mes2,year2)==true){
             fecha2=String.valueOf(dia2) + "/"+ String.valueOf(mes2)+"/"+ String.valueOf(year2);
             comprobar2=true;
             }
             else{
                JOptionPane.showMessageDialog(null,"Fecha incorrecta, vuelve a intentarlo","Fechas",2);
             }
            }
        if(verificarMayor(dia,mes,year,dia2,mes2,year2)==true){
            comprobarMayor=true;
        }
            
        }
        JOptionPane.showMessageDialog(null,"Las fechas introducidas son:\n " + fecha1 +"\n"+ fecha2,"Fechas",1);
        int diferenciaDias=calcularDias(dia,mes,year,dia2,mes2,year2);
         JOptionPane.showMessageDialog(null,"Los días de diferencia entre las dos fechas son: " + diferenciaDias,"Fechas",1);
                       
    }
    
    public static boolean verificarFechas(int d, int m, int a){
        boolean x;
       switch(m){
           case 1: 
               if(d>31 && d>0){
                   return x=false;
               }
               break;
           case 2:
               if(d>29 && d>0){
                    return x=false;
               }
               else if(verificarBisiestos(a)==false && d>28 && d>0){
                   return x=false;
               }
               break;
           case 3: 
               if(d>31 && d>0){
                   return x=false;
               }
               break;
           case 4:
               if(d>30 && d>0){
                    return x=false;
               }
               break;
           case 5:
               if(d>31 && d>0){
                    return x=false;
               }
               break;
           case 6:
               if(d>30 && d>0){
                    return x=false;
               }
               break;
           case 7:
               if(d>31 && d>0){
                    return x=false;
               }
               break;
           case 8:
               if(d>31 && d>0){
                    return x=false;
               }
               break;
           case 9:
               if(d>30 && d>0){
                    return x=false;
               }
               break;
           case 10:
               if(d>31 && d>0){
                    return x=false;
               }
               break;
           case 11:
               if(d>30 && d>0){
                   return x=false;
               }
               break;
           case 12:
               if(d>31 && d>0){
                   return x=false;
               }
               break;
           default:
               JOptionPane.showMessageDialog(null,"Solo existen 12 meses","Fechas",2);
               return x=false;
       }
       return x=true;
    }
    public static boolean verificarMayor(int d,int m, int y, int d2, int m2, int y2){
        boolean x;
        if(y2>y){
            return x=true;
        }
        else if(y2==y && m2>m){
            return x=true;
        }
        else if(m2==m && d2>=d){
            return x=true;
        }
        else{
            JOptionPane.showMessageDialog(null,"Fecha incorrecta vuelve a intentarlo","Fecha",2);
            return x=false;
        }
    }
    public static boolean verificarBisiestos(int y){
        boolean x;
        if (y%400==0){
            return x=true;
        }
        else if(y%4==0 && y%100!=0){
            return x=true;
        }
        else{
            return x=false;
        }
    }
    public static int calcularDias(int d1,int m1, int y1, int d2, int m2, int y2){
        int [] meses={0,31,28,31,30,31,30,31,31,30,31,30,31};
        int dias;
        if(d1==d2 && m1==m2 && y1==y2){
            dias=0;
        }
        else if(m1==m2 && y1==y2){
            dias=d2-d1;
        }
        else if(y1==y2){
             dias=meses[m1]-d1;
             for(int i=m1+1;i<m2;i++){
                if(verificarBisiestos(i)==true){
                     meses[2]=29;
                }
                dias=dias+meses[i];
            }
            dias=dias+d2;
        }
        else{
            dias=meses[m1]-d1;

           //Bucle que sirve para contar la cantidad de dias del año1
           for(int i=m1+1;i<=12;i++){
               dias=dias+meses[i];
           }

           //Bucle que sirve para sumar los dias de los años que hay entre el primer y el segundo año

                for(int i=y1+1;i<=y2-1;i++){
                   if(verificarBisiestos(i)==false){
                       dias=dias+365;
                   }
                   else{
                       dias=dias+366;
                   }
               }


           //Bucle que sirve para sumar los dias restantes del último año
           for(int i=m2-1;i>0;i--){
               dias=dias+meses[i];
           }
           dias=dias+d2;
        }
        return dias;
    }
    
    
 
    
}
