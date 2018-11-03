//Importar libreria a Java
    
import java.util.*;

//Definir nombre del Algoritmo

public class ejercicio_02{
  public static void main (String args[]){
    
//Llamar libreria scanner
    
    Scanner teclado = new Scanner(System.in);
    
//Pedir datos al usuario
    
    System.out.print("Que edad tienes? ");
    int edad = teclado.nextInt();
    System.out.println("Tu edad: " +edad+ " años");
    
  } 
}
