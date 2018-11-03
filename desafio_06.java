//Importar Clases en Java
    
import java.util.*;

//Definir nombre del Algoritmo

public class desafio_06{
  public static void main (String args[]){
    
//Llamar librerias de Clases  
    
    Scanner teclado = new Scanner(System.in);

//Declarar Variables
    
    int a;
    int b;
    int x;
    
//Definir Variables
    
    a = 0;
    b = 0;

//Explicacion de Algoritmo al Usuario
    
    System.out.println("Algoritmo que crea un cuadrado de lado definido por el usuario");
    
//Pedir datos al usuario
    
    System.out.println("\nIngrese un numero mayor que 3 represente el lado del cuadrado:");
    x = teclado.nextInt();

//Validar que el numero sea positivo
    
    while (x < 3 ){
      System.out.println("\nError!, el numero debe ser mayor que 3");
      System.out.println("\nIngrese un numero mayor que 3, el cual representara el lado del cuadrado:");
      x = teclado.nextInt();      
    }
    
//Crear Cuadrado
    
    while(a < x){
      while (b < x){
        if(a == 0 || a == x - 1 || b == 0 || b == x - 1 || a == b || a > b){
          System.out.print("* ");
        }
        else{
          System.out.print("  ");
        }
        b = b + 1;
      }
      System.out.println("");
      b = 0;
      a = a + 1; 
    }
    
  } 
}