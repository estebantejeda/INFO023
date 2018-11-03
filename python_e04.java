//Importar Clases a Java

import java.util.*;

//Definir nombre de algoritmo

public class python_e04{
  public static void main (String args[]){
  
//Llamar clases
    
    Scanner teclado = new Scanner(System.in);
    
//Declarar Variables
    
    int x;
    int a;
    int b;
    int c;
    
//Definir Variables
    
    c = 0;
    
//Explicacion al usuario de algoritmo
    
    System.out.println("Algoritmo que pide un numero positivo al usuario, le entrega");
    System.out.println("la cantidad de divisores y dices cuales son");
    
//Pedir datos al usuario
    
    System.out.println("\nIngrese un numero positivo");
    x = teclado.nextInt();
    
//Validar que el numero ingresado sea positivo
    
    while (x < 0){
      System.out.println("\nError, el numero ingresado debe ser positivo");
      System.out.println("\nIngrese un numero positivo");
      x = teclado.nextInt();      
    }

//Realizar Calculos #1    
    
    a = x;
    
//Realizar Calculos #2
    
    System.out.print("\nLos divisores de " +x+ " son: ");
    while (a != 0){
     b = x/a;
     if (x%a == 0){
       System.out.print(+b+ "  ");
       c = c + 1;         
     }
     a = a - 1;     
    } 
    
//Imprimir informacion al usuario
    
    if (c == 2){
      System.out.println("\nEs un numero primo");
    }
    else{
      System.out.println("\nPosee un total de: " +c+ " Divisores");
    }
    
  }
}