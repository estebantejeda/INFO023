//Importar Clases en Java
    
import java.util.*;

//Definir nombre del Algoritmo

public class ejercicio_24{
  public static void main (String args[]){   

//Declarar Variables

    int x;
    int y;
    int z;
    int a;

//Explicacion de Algoritmo al Usuario
    
    System.out.println("Algoritmo que pide al usuario el ingreso de 3 numeros POSITIVOS y los suma");
    
//Pedir datos al usuario
    
    x = validarPositivo("Ingrese el primer numero");
    y = validarPositivo("Ingrese el segundo numero");
    z = validarPositivo("Ingrese el tercer numero");
      
//Realizar calculos
    
    a = x + y + z;
      
//Entregar datos al usuario
    
    System.out.println("La suma de los numeros es: "+a);      
 
  }
  
//Realizar los metodos
  
  //Metodo para validar si el numero ingresado es positivo
  
  public static int validarPositivo(String mensaje){
    Scanner teclado = new Scanner(System.in); 
    System.out.print(mensaje);
    int numero = teclado.nextInt();
    while (numero < 1){
      System.out.println("Error!!, el numero ingresado debe ser positivo");
      System.out.print(mensaje);
      numero = teclado.nextInt();
    }
    return numero;
  }
  
}