//Importar Clases en Java

import java.util.*;

//Definir nombre de Algoritmo

public class ejercicio_34{ 
  public static void main(String[] args){ 

//Llamar librerias de Clases  
    
    Scanner teclado = new Scanner(System.in);

//Declarar Variables

    int x;
    int a, b;

//Definir variables

    a = 0;
    b = 0;   

//Explicacion de algoritmo al usuario

    System.out.println("Algoritmo que genera un cuadrado de asteriscos solo por los bordes");

//Pedir datos al usuario

    System.out.println("\nIngrese el lado del cuadrado");
    x = teclado.nextInt();

//Validar datos del usuario

    while (x < 2){
      System.out.println("\nError!!, el numero ingresado debe ser positivo y mayor que 2");
      System.out.println("\nIngrese el lado del cuadrado");
      x = teclado.nextInt();
    }    

//Realizar el cuadrado

    while(a < x){ 
      while(b < x){ 
        if(a == 0 || b == 0 || a == x - 1 || b == x - 1 ){ 
          System.out.print("* "); 
        } 
        else{ 
          System.out.print("  "); 
        } 
        b++; 
      } 
      System.out.println(""); 
      b = 0; 
      a++; 
    } 
  } 
}