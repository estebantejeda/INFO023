//Importar Clases a Java

import java.util.*;

//Definir nombre de Algoritmo

public class ejercicio_32{
  public static void main (String args[]){
    
//Llamar libreria de Clases
    
    Scanner teclado = new Scanner(System.in);
    
//Declarar Variables
    
    int x;
    
//Explicacion de Algoritmo al Usuario
    
    System.out.println("Algoritmo que le pide un numero al usuario y despliega su tabla de multiplicar en pantalla");
    
//Pedir datos al usuario
    
    System.out.println("\nIngrese un numero en pantalla del 2 al 12");
    x = teclado.nextInt();
    
//Validar datos del usuario
    
    while (x < 2 || x > 12){
      System.out.println("\nError, el numero ingresado debe estar entre 2 y 12");
      System.out.println("\nIngrese un numero en pantalla del 2 al 12");
      x = teclado.nextInt();
    }
    
//Realizar los calculos e imprimir resultados en pantalla
    
    System.out.println("");
    for (int a = 1; a <= 12; a++){
      System.out.println(x+ " X " +a+ " = " +(a*x));
    }
    
  }
}