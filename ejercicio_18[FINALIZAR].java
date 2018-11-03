//Importar Clases en Java
    
import java.util.*;

//Definir nombre del Algoritmo

public class ejercicio_18{
  public static void main (String args[]){
    
//Llamar librerias a Java    
    
    Scanner teclado = new Scanner(System.in);
    
//Definir Variables
    
    int x;
    int y;
    int a;
    
//Declarar Variables
    
    a = 200;
    
//Explicacion al usuario de algoritmo
    
    System.out.println("Algoritmo que pide donaciones solo de $50 y $100, hasta llegar a los $200");
    
//Pedir datos al usuario
    
    System.out.println("\nIngrese el monto de la donacion");
    x = teclado.nextInt();
    
//Validar datos del usuario
    
    while (x != 50 && x != 100){
      System.out.println("Error!, solo se adminten donaciones de $50 y $100");
      System.out.println("\nIngrese el monto de la donacion");
      x = teclado.nextInt();
    }

//Definir Variables    
    
    y = a - x;
    
//Realizar calculos    
    
    while (y > 0){
      System.out.println("\nIngrese el monto de la donacion");
      x = teclado.nextInt();
      while (x != 50 && x != 100){
        System.out.println("Error!, solo se adminten donaciones de $50 y $100");
        System.out.println("\nIngrese el monto de la donacion");
        x = teclado.nextInt();
      }
       y = a - x;
       }
           if (y == 0){
         System.out.println("Llegamos a la meta");
       }
       else {
         System.out.println("Llegamos a la meta");
         System.out.println("Su vuelto:" +y);
    }
        
  } 
}