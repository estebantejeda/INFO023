//Importar Clases en Java
    
import java.util.*;

//Definir nombre del Algoritmo

public class ejercicio_19{
  public static void main (String args[]){
    
//Llamar librerias de Clases  
    
    Scanner teclado = new Scanner(System.in);;

//Declarar Variables

    int x;
    long y;
    int a;
    
//Definir Variables

    y = 1;
    
//Explicacion de Algoritmo al Usuario
    
    System.out.println("Programa que calcula el factorial de un numero ingresado por el usuario");
    
//Pedir datos al usuario
    
    System.out.println("\nIngrese un numero positivo para realizar el calculo");
    x = teclado.nextInt();
    
//Validar datos del usuario
    
    while (x < 0){
      System.out.println("Error!, el numero ingresado debe ser positivo");
      System.out.println("\nIngrese un numero positivo para realizar el calculo");
      x = teclado.nextInt();      
    }
      
//Realizar calculos
    
    for (a = 1; a <= x; a++){
      y = y*a;
    }
    
//Imprimir datos al usuario
    
    System.out.println(+y);

  } 
}