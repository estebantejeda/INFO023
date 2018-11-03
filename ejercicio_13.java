//Importar Clases en Java
    
import java.util.*;

//Definir nombre del Algoritmo

public class ejercicio_13{
  public static void main (String args[]){
    
//Llamar librerias de Clases  
    
    Scanner teclado = new Scanner(System.in);

//Declarar Variables
    
    int x;

//Explicacion de Algoritmo al Usuario
    
    System.out.print("Algoritmo que pide al usuario un numero positivo");
    System.out.println(" e imprime una cantidad de asteriscos designados por el usuario");
    
//Pedir datos al usuario
    
    System.out.println("\nIngrese un numero positivo");
    x = teclado.nextInt();
      
//Comprobar que el numero sea positivo
    
    while (x < 0){
      System.out.println("Error!, el numero debe ser positivo");
      System.out.println("\nIngrese un numero positivo");
      x = teclado.nextInt();
    }
    
//Realizar calculos
    
    System.out.println(" ");
    while (x != 1){
      System.out.println(" * ");
      x = x - 1;  
    }     
    System.out.println(" * ");  
      
  } 
}