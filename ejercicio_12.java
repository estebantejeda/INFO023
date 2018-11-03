//Importar Clases a Java

import java.util.*;

//Designar nombre a algoritmo

public class ejercicio_12{
  public static void main (String args[]){
    
//Importar libreria Scanner
    
    Scanner teclado = new Scanner(System.in);
    Random aleat = new Random();
    
//Declarar Variables
    
    int a;
    int b;
    int x;

//Definir Variables llamando a clase random
    
    a = aleat.nextInt(20)+1;
    b = aleat.nextInt(20)+1;
    
//Comprobar que el primer numero es mayor que el segundo
    
    while (a < b){
    a = aleat.nextInt(20)+1;      
    }
    
//Explicacion de algoritmo al usuario
    
    System.out.println("Algoritmo que le pide al usuario que ingrese el resultado de la resta de dos numeros");
    System.out.println(" ");
   
//Pedir resultado al usaurio
    
    System.out.println("Ingrese el resultado");
    System.out.println(+a+ " - " +b);
    x = teclado.nextInt();
    
//Comprobar si el resultado es el correcto
    
    while (x != a-b){
      System.out.println("Error, el resultado es incorrecto. Intenta otra vez");
      System.out.println(" ");
      System.out.println("Ingrese el resultado");
      
      //Volver a generar numeros aleatorios
      
      a = aleat.nextInt(20)+1;
      b = aleat.nextInt(20)+1;
      
      //Comprobar que el primer numero sea mayor que el segundo
      
      while (a < b){
        a = aleat.nextInt(20)+1;      
    }
      
      //Solicitar respuesta al usuario
      
      System.out.println(+a+ " - " +b);
      x = teclado.nextInt();      
    }
    
//Felicitar al usuario
      
    System.out.println ("Correcto!");
    
  }
}
