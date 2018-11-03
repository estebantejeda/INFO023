//Importar Clases en Java
    
import java.util.*;

//Definir nombre del Algoritmo

public class desafio_08{
  public static void main (String args[]){
    
//Llamar librerias de Clases  
    
    Scanner teclado = new Scanner(System.in);

//Declarar Variables

    int x;
    int a;
    int b;
    char le;

//Definir Variables
    
    le = 'a';

//Explicacion de Algoritmo al Usuario
    
    System.out.println("Algoritmo que crea un triangulo con letras");

//Pedir datos al Usuario
    
    System.out.println("\nIngrese el tamaño del triangulo (Debe ser entre 1 y 10)");
    x = teclado.nextInt();
    
//Validar datos del usuario
    
    while (x < 1 || x > 10){
      System.out.println("Error!!, El numero ingresado debe estar entre 1 y 10");
      System.out.println("\nIngrese el tamaño del triangulo (Debe ser entre 1 y 10)");
      x = teclado.nextInt();      
    }
 
//Realizar calculos
    
    for (a = 0; a < x; a++){
      System.out.println(le);
      le++;
      for (b = 0; b < a; b++){
        System.out.print("  ");
      }
    }
       
  } 
}