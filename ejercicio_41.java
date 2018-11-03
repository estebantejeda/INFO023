//Importar Clases en Java

import java.util.*;

//Definir nombre del Algoritmo

public class ejercicio_41{
  public static void main (String args[]){
    
//Declarar Variables
    
    int w, x, z;
    String y;
    
//Explicacion de Algoritmo al Usuario
    
    System.out.println("Algoritmo que pide al usuario el ingreso de un numero y luego este le imprimira los primeros");
    System.out.println("digitos de las frases que el ingrese dependiendo de su numero");
    
//Pedir datos al usuario
    
    w = defineLargo("\nIngrese el largo de la palabra [Entre '4' y '10']:");
    x = cuantasFrases("\nIngrese el numero de frases a ingresar [> 3]:");
    
//Imprimir datos al usuario
    
    for (int i = 0; i < x; i++){
      y = leeFrase("\nIngrese su frase:");
      z = leeLongitud(y);
      imprimeFrase(y, z, w);
    }
    
  }
  
//Realizar Metodos
  
  //Metodo defineLargo
  
  public static int defineLargo(String text){
    Scanner teclado = new Scanner(System.in);
    int largo;
    do{
      System.out.println(text);
      largo = teclado.nextInt();
    }while (largo < 4 || largo > 10);
    return largo;
  }
  
  //Metodo cuantasFrases
  
  public static int cuantasFrases(String text){
    Scanner teclado = new Scanner(System.in);
    int frases;
    do{
      System.out.println(text);
      frases = teclado.nextInt();
    }while (frases < 3);
    return frases;
  }
  
  //Metodo leeFrase
  
  public static String leeFrase(String text){
    Scanner teclado = new Scanner(System.in);
    String frase;
    System.out.println(text);
    frase = teclado.nextLine();
    while (frase.equals("")){
      System.out.println("Error!, no puede ingresar una frase vacia.");
      System.out.println(text);
      frase = teclado.nextLine();
    }
    return frase;
  }
  
  //Metodo leeLongitud
  
  public static int leeLongitud(String frase){
    int cuenta = frase.indexOf(" ");
    return cuenta;
  }
  
  //Metodo imprimeFrase
  
  public static void imprimeFrase(String frase, int contador, int largo){
    if (contador == -1){
      contador = frase.length();
    }
    if (contador == largo){
      System.out.println("#");
      for (int i = 0; i < largo; i++){
        System.out.print(frase.charAt(i));
      }
      System.out.println("#");
    }
  }
  
}