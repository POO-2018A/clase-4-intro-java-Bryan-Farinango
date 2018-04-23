

package ejercicio3;

import java.util.Scanner;
public class Ejercicio3 {

    
    public static void main(String[] args) {
        Scanner ingreso = new Scanner(System.in);
        int edad = 0;
        
        System.out.print("Ingrese su edad: ");
        edad = ingreso.nextInt();
        if( edad >= 18){
            System.out.println("Usted ya es mayor de edad");
        }else{
            System.out.println("Usted es menor de edad");
        }
        
      
        
        
        
        
    }
    
}
