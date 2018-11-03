//Importar Clases en Java
    
import java.util.*;

//Definir nombre del Algoritmo

public class ejercicio_10{
  public static void main (String args[]){
    
//Llamar libreria Scanner  
    
    Scanner teclado = new Scanner(System.in);
    
//Declarar variables
    
    int x = 0;
    int c = 1;

//Explicacion de Algoritmo al Usuario
    
    System.out.print("Algoritmo que le pide un numero positivo al usuario y muestra en pantalla");
    System.out.println("una secuencia descendente hasta el '0'");
    System.out.println(" ");
      
//Pedir datos al usuario
      
    System.out.println("Ingrese un numero mayor que 1");
    x = teclado.nextInt();
    System.out.println(" ");
    
//Validar los datos
    
    while (x <= 1){
      System.out.println("Error!, el numero debe ser mayor a uno");
      System.out.println("Ingrese un numero mayor que 1");
      x = teclado.nextInt();
      c = c + 1;
      
      if (c == 3){
      while (x <= 1){
        System.out.println("Oye, tranquilo viejo!!");
        System.out.println("Ingrese un numero mayor que 1");
        x = teclado.nextInt();
        c = c + 1;
        
        if (c == 6){
        while (x <= 1){
          System.out.println("Pero que trolazo Pancho!!");
          System.out.println("Ingrese un numero mayor que 1");
          x = teclado.nextInt();
          c = c + 1;
      }
     }
    }
   }    
  }     
  
//Realizar calculos
    
    while (x >= 1){
      System.out.print(+x+ " - ");
      x = x - 1;        
    }
    System.out.print(x);
    System.out.println(" ");
    
  } 
}