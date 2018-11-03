//Importar Clases en Java
    
import java.util.*;

//Definir nombre del Algoritmo

public class desafio_03{
  public static void main (String args[]){
    
//Llamar librerias de Clases  
    
    Scanner teclado = new Scanner(System.in);

//Declarar Variables

    int a;
    int b;
    int c;
            
//Explicacion de Algoritmo al Usuario
    
    System.out.print("Algoritmo que pide al usuario un numero positivo");
    System.out.println(" e imprime un cuadrado de lado designado por el usuario");

//Pedir datos al usuario
    
    System.out.println("\nIngrese el lado del cuadrado");
    a = teclado.nextInt();
      
//Comprobar que el numero sea positivo
    
    while (a < 2){
      System.out.println("Error!, el numero debe ser positivo");
      System.out.println("\nIngrese un numero positivo");
      a = teclado.nextInt();
    }

//Definir Variables
    
    b = a;
    c = a;
    b = b;
    

//Realizar calculos e imprimir al usuario el cuadrado
    
    System.out.println(" ");
    while (a != 0){
      System.out.print(" * ");
      a = a - 1;
    }
    System.out.println(" ");
    
    while (b != 0){
      System.out.print(" ");
      if (b > 0){
        System.out.print("*");
      }
      else{
        System.out.print("*");
      }
      b = b - 1;        
    }
    
  } 
}