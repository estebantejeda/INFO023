//Importar Clases a Java

import java.util.*;

//Definir nombre de Algoritmo

public class ejercicio_30{
  public static void main (String args[]){
    
//Lamar librerias de Clases
    
    Scanner teclado = new Scanner(System.in);
    
//Declarar Variables
    
    int x;
    
//Explicacion de argoritmo al usuario
    
    System.out.print("Algoritmo que le pide al usuario el ingreso de un numero positivo y determina si este");
    System.out.println("es un numero par o impar");
    
//Pedir datos al usuario
    
    System.out.println("\nIngrese el numero que desea determinar: ");
    x = teclado.nextInt();
    
//Validar datos del usuario
    
    while (x < 0){
      System.out.println("\nError!!, El numero ingresado debe ser positivo.");
      System.out.println("\nIngrese el numero que desea determinar: ");
      x = teclado.nextInt();
    }
    
//Realizar los calculos e imprimir resultado al usuario
    
    if (x%2 == 0){
      System.out.println("El numero ingresado es par");
    }
    else{
      System.out.println("El numero ingresado es impar");
    }
    
  }
}