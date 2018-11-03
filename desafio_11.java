//Importar Clases a Java

import java.util.*;

//Definir nombre de algoritmo

public class desafio_11{
  public static void main (String args[]){
  
//Llamar clases
    
    Scanner teclado = new Scanner(System.in);
    
//Declarar Variables
    
    int x;
    int a;
    int b;
    int c;
    int d;
    
//Definir Variables
    
    c = 0;
    
//Explicacion al usuario de algoritmo
    
    System.out.println("Algoritmo que pide un numero positivo al usuario, y dice");
    System.out.println(" si son perfectos.");
    
//Pedir datos al usuario
    
    System.out.println("\nIngrese un numero positivo");
    x = teclado.nextInt();
    
//Validar que el numero ingresado sea positivo
    
    while (x < 0){
      System.out.println("\nError, el numero ingresado debe ser positivo");
      System.out.println("\nIngrese un numero positivo");
      x = teclado.nextInt();      
    } 

//Definir Variables #2 
    
    a = x;
    
//Calcular Divisores
    
    while (a != 0){
      b = x/a;
      if (x%a == 0){
        c = c + b;
      }
      a = a - 1;
    }
      
//Realizar calculos
    
    c = c - x;
    
//Calcular si son perfectos o no
    
    if (c == x){
      System.out.println(x+ " es un numero perfecto");
    }
    else{
      System.out.println(x+ " no es un numero perfecto");
    }
    
  }
}
