//Importar Clases en Java
    
import java.util.*;

//Definir nombre del Algoritmo

public class desafio_07{
  public static void main (String args[]){
    
//Llamar librerias de Clases  
    
    Scanner teclado = new Scanner(System.in);

//Declarar Variables
    
    int x;
    double a;
    int b;

//Definir Variables
    
    b = 1;
    a = 0;

//Explicacion de Algoritmo al Usuario
    
    System.out.println("Algoritmo que calcula el numero n de terminos de la serie '1/n'");

//Pedir datos al Usuario
    
    System.out.println("\nIngrese el numero que desea para realizar la suma (Debe ser mayor que '1')");
    x = teclado.nextInt();
    
//Validar los datos
    
    while (x < 1){
      System.out.println("Error!, el numero ingresado debe ser mayor que uno");
      System.out.println("\nIngrese el numero que desea para realizar la suma (Debe ser mayor que '1')");
      x = teclado.nextInt();      
    }
    
//Realizar calculos
    
    while (a < x){ 
      a = a + (1.0/b);
      b = b + 1;      
    }

//Imprimir datos al usuario
    
    System.out.println(+b);
    
  } 
}