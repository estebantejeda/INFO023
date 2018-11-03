//Importar Clases en Java
    
import java.util.*;

//Definir nombre del Algoritmo

public class desafio_01{
  public static void main (String args[]){
    
//Llamar libreria Scanner  
    
    Scanner teclado = new Scanner(System.in);
    
//Definir Variables
    
    int A = 500;
    int B = 100;
    int C = 50;
    int D = 10;
    int E = 5;
    int F = 1;

//Explicacion de Algoritmo al Usuario
    
    System.out.print("Algoritmo que pide al usuario una cantidad de dinero determinado,");
    System.out.println(" y el programa imprimira la cantidad de monedas de $500, $100, $50, $10, $5 y $1.");
    System.out.println(" ");
      
//Pedir datos al usuario
    
    System.out.println("Ingrese una cantidad de dinero que desea: ");
    int x = teclado.nextInt();
    
//Validar datos
    
    while (x<0){
      System.out.println("Error, el numero ingresado debe ser positivo: ");
      System.out.println(" ");
      System.out.println("Ingrese una cantidad de dinero que desea: ");
      x = teclado.nextInt();
    }
    
//Realizar calculos   
    
    int a = x/A;
    x = x%A;
    int b = x/B;
    x = x%B;
    int c = x/C;
    x = x%C;
    int d = x/D;
    x = x%D;
    int e = x/E;
    x = x%E;
    int f = x/F;
    x = x%F;
    
//Entegar datos al usuario
    
    System.out.println("Monedas de $500: " +a);
    System.out.println("Monedas de $100: " +b);
    System.out.println("Monedas de $50: " +c);
    System.out.println("Monedas de $10: " +d);
    System.out.println("Monedas de $5: " +e);
    System.out.println("Monedas de $1: " +f);
   
  }
}   
