//Importar Clases en Java
    
import java.util.*;

//Definir nombre del Algoritmo

public class ejercicio_20{
  public static void main (String args[]){
    
//Llamar librerias de Clases  
    
    Scanner teclado = new Scanner(System.in);

//Declarar Variables
    
    int x;
    int a;
    int b;

//Definir Variables

//Explicacion de Algoritmo al Usuario
    
    System.out.println("Algoritmo que pide un numero al usuario y lo va haciendo avanzar de manera horizontal y vertical");

//Pedir datos al Usuario
    
    System.out.println("\nIngrese un numero entre 1 y 9");
    x = teclado.nextInt();
    
//Validar datos del usuario
    
    while (x < 1 || x > 9){
      System.out.println("Error!!, el numero ingresado debe estar entre 0 y 9");
      System.out.println("\nIngrese un numero entre 1 y 9");
      x = teclado.nextInt();      
    }
    
//Realizar los calculos
    
    for (a = 1; a <= x; a++){
      System.out.println(+a);
      for (b = 1; b <= a; b++){
        System.out.print("  ");
      }
    }
    System.out.println("");

  }
}