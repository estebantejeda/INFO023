//Importar Clases en Java
    
import java.util.*;

//Definir nombre del Algoritmo

public class desafio_04{
  public static void main (String args[]){
    
//Llamar librerias de Clases  
    
    Scanner teclado = new Scanner(System.in);

//Declarar Variables

    int a;
    int b; 
    int c;
    int d;
    
//Definir Variables #1
    
    d = 0;
            
//Explicacion de Algoritmo al Usuario
    
    System.out.print("Algoritmo que pide al usuario un numero positivo");
    System.out.println(" e imprime un cuadrado hueco de lado designado por el usuario");

//Pedir datos al usuario
    
    System.out.println("\nIngrese el lado del cuadrado (Debe ser mayor que 2)");
    a = teclado.nextInt();
      
//Comprobar que el numero sea positivo
    
    while (a <= 2){
      System.out.println("Error!, el numero debe ser mayor que 2");
      System.out.println("\nIngrese el lado del cuadrado");
      a = teclado.nextInt();
    }

//Definir Variables #2
    
    b = a;
    c = b - 2;

//Realizar calculos e imprimir al usuario el cuadrado
    
    System.out.println(" ");

    //Realizar la primera linea
    
    while (a != 0){
      System.out.print(" * ");
      a = a - 1;
    }
    System.out.println(" ");    
    
    //Imprimir el cuerpo del cuadrado
    
    while (c != 0){
      while (d != b - 1){
        if (d == 0){
          System.out.print(" * ");
        }
        else{
          System.out.print("   ");
        }
        d = d + 1;
      }
      System.out.print(" * ");
      System.out.println(" ");
      c = c - 1;
      d = 0;
    }
    
    //Definir Variables #3
    
    a = b;
    
    //Realizar la ultima linea
    
    while (a != 0){
      System.out.print(" * ");
      a = a - 1;
    }
    System.out.println(" ");    
        
  } 
}