//Importar Clases en Java
    
import java.util.*;

//Definir nombre del Algoritmo

public class prueba_02{
  public static void main (String args[]){
    
//Llamar librerias de Clases  
    
    Scanner teclado = new Scanner(System.in);

//Declarar Variables

    int a;
    int b; 
    int c;
    int d;
    int l_1;
    int l;
    
//Definir Variables #1
    
    d = 0;
            
//Explicacion de Algoritmo al Usuario
    
    System.out.print("Algoritmo que pide al usuario un numero positivo impar mayor a 4");
    System.out.println(" e imprime un rectangulo hueco de lado designado por el usuario");

//Pedir datos al usuario #1
    
    System.out.println("\nIngrese el alto del rectangulo (Debe ser mayor que 4 e impar)");
    a = teclado.nextInt();
      
//Comprobar que el numero sea positivo#1
    
    while (a%2 == 0 || a <= 4){
      System.out.println("Error!, el numero debe ser un impar mayor que 4");
      System.out.println("\nIngrese el lado del cuadrado");
      a = teclado.nextInt();
    }

//Pedir datos al usuario #2
    
    System.out.println("\nIngrese el largo del rectangulo (Debe ser mayor que 4 e impar)");
    l = teclado.nextInt();
      
//Comprobar que el numero sea positivo #2
    
    while (l%2 == 0 || l <= 4){
      System.out.println("Error!, el numero debe ser un impar mayor que 4");
      System.out.println("\nIngrese el largo del cuadrado");
      l = teclado.nextInt();
    }
    
//Definir Variables #2
    
    l_1 = l;
    b = a;
    c = b - 2;

//Realizar calculos e imprimir al usuario el cuadrado
    
    System.out.println(" ");

    //Realizar la primera linea
    
    while (l != 0){
      System.out.print(" * ");
      l = l - 1;
    }
    System.out.println(" ");    
    
    //Imprimir el cuerpo del cuadrado
    
    while (c != 0){
      while (d != l - 1){
        if (d == 0){
          System.out.print(" * ");
        }
        else{
          System.out.print("   ");
        }
        l = l + 1;
      }
      System.out.print(" * ");
      System.out.println(" ");
      c = c - 1;
      d = 0;
    }
    
    //Definir Variables #3
    
    l = l_1;
    
    //Realizar la ultima linea
    
    while (l != 0){
      System.out.print(" * ");
      l = l - 1;
    }
    System.out.println(" ");    
        
  } 
}