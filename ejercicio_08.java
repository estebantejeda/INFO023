//Importar Clases en Java
    
import java.util.*;

//Definir nombre del Algoritmo

public class ejercicio_08{
  public static void main (String args[]){
    
//Llamar libreria Scanner  
    
    Scanner teclado = new Scanner(System.in);

//Explicacion de Algoritmo al Usuario
    
    System.out.print("Algoritmo que pide la edad al usuario y le indica si es un joven,");
    System.out.println(" adulto o adulto mayor.");
    System.out.println(" ");
      
//Pedir datos al usuario
    
    System.out.println("Ingrese su edad");
    int x = teclado.nextInt();
    
//Entragar datos al usuario
    
    if (x < 18 ){
      System.out.println("Eres Joven");
    }
    else if (x <= 65){
        System.out.println("Eres Adulto");
      }
    else{
        System.out.println("Eres Adulto Mayor");
      }

    }
  } 
