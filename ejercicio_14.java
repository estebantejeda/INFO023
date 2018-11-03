//Importar Clases en Java
    
import java.util.*;

//Definir nombre del Algoritmo

public class ejercicio_14{
  public static void main (String args[]){
    
//Llamar librerias de Clases  
    
    Scanner teclado = new Scanner(System.in);

//Declarar Variables
    
    float x;
    int a;
    float b;
    float c;

//Definir Variables #1
    
    a = 0;

//Explicacion de Algoritmo al Usuario
    
    System.out.println("Algoritmo que le pide al usuario que ingrese sus notas y este las promedia.");
    System.out.println("El programa finaliza con '0'");
    
//Pedir datos al usuario
    
    System.out.println("\nIngrese sus notas");
    x = teclado.nextInt();
    
//Definir variables #2
    
    b = x;
    
//Validar datos
    
    while (x != 0){
      System.out.println("\nIngrese sus notas");
      x = teclado.nextInt();
      b = b + x;
      a = a + 1;
    }
    
//Realizar calculos
    
    c = b/a;
    
//Imprimir datos al usuario
    
    System.out.println("El promedio de sus notas es: "+c);
      
  } 
}