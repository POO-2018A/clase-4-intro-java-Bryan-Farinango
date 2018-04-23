
package ejercicio4;
import java.util.Scanner;



public class Ejercicio4 {

    
    public static void main(String[] args) {
        
        System.out.println("VERIFICAR SI ES PAR O IMPAR");
        Scanner ingresar = new Scanner(System.in);
        
        System.out.print("Ingrese el numero a verificar: ");
        double numero = ingresar.nextDouble();
    
        if( numero%2 == 0 ){
            System.out.println("El numero que usted ingreso es par ");
        }else{
            System.out.println("El numero que usted ingreso es impar");
        }
        
      
        
        
    }
    
}
