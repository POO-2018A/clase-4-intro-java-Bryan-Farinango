
package ejercicio6;
import java.util.Scanner;

public class Ejercicio6 {

    
    
    
    public static void main(String[] args) {
       
        Scanner ingresar = new Scanner(System.in);
        boolean isSnowing = false;
        boolean isRaining = true;
        double temperature = 0;
        boolean clima = true;
        System.out.print("Esta nevando? responda [si=1 o no=0]:  ");
        int dato1 = ingresar.nextInt();
        if( dato1 == 1){
            isSnowing = true;
        }else if( dato1 == 0){
            isSnowing = false;
        }
        
        System.out.print("Esta lloviendo? responda [si=1 o no=0]: ");
        int dato2 = ingresar.nextInt();
        if( dato2 == 1){
            isRaining = true;
        }else if( dato2 == 0){
            isRaining = false;
        }
        
        System.out.print("Digite la temperatura del clima: ");
        temperature = ingresar.nextDouble();
        
        if( temperature < 10 ){
            clima = true;
        }else if ( temperature >= 10 ){
            clima = false;
        }
        
        if ( isSnowing || isRaining || clima ){
            System.out.println("Nos quedamos en casa! ");
        }else{
            System.out.println("Vamo afuera! ");
        }
        
         }
    
}
