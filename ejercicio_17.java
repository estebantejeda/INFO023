//Importar Clases en Java
    
import java.util.*;

//Definir nombre del Algoritmo

public class ejercicio_17{
  public static void main (String args[]){
    
//Llamar librerias a Java    
    
    Scanner teclado = new Scanner(System.in);
    
//Declarar Variables
    
    int l; //Lado
    int f; //Fila
    int c; //Columnas
    
//Explicacion al usuario de algoritmo
    
    System.out.println("Algoritmo que crea un cuadrado de lado designado por el usuario");
    
//Pedir datos al usuario
    
    System.out.println("\nIngrese el lado del cuadrado");
    l = teclado.nextInt();
    
//Validar datos del usuario
    
    while (l < 2){
      System.out.println("Error!, el numero debe ser mayor o igual que 2");
      System.out.println("\nIngrese el lado del cuadrado");
      l = teclado.nextInt();
    }

//Crear el cuadrado    
    
    System.out.println(" ");
    for ( f = 0; f < l; f++){
      for ( c = 0; c < l - 1; c++){
        System.out.print("s ");
      }
      System.out.println("s");
    }
        
  } 
}