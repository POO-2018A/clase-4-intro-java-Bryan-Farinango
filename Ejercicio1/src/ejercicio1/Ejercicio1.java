
package ejercicio1;
import java.util.Scanner;

 
public class Ejercicio1 {

    
    public static void main(String[] args) {
        
        System.out.println("CONVERTIR DE FAHREMHEIT A CELIUS");
        
        Scanner ingresar = new Scanner(System.in);
        double fahrenheit = 0;
        
        System.out.print("Ingresar el numero a convertir: ");
        fahrenheit = ingresar.nextDouble();
        
        double celcius = ((fahrenheit - 32)*5)/9;
        System.out.println("El resultado de la conversion es: " + celcius);
        
        
       
   
    }
    
}
