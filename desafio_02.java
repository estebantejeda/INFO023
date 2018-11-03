//Importar Clases en Java
    
import java.util.*;

//Definir nombre del Algoritmo

public class desafio_02{
  public static void main (String args[]){
    
//Llamar libreria Scanner  
    
    Scanner teclado = new Scanner(System.in);
    
//Declarar Variables
    
    int a = 0;
    int x = 0;
    int y = 0;
    int z = 0;

//Explicacion de Algoritmo al Usuario
    
    System.out.print("Algoritmo que pide al usuario la cantidad de numeros que el desee y determina cual");
    System.out.println(" de todos los numeros ingresados es mayor y cual es menor:");
    System.out.println (" ");
    
//Pedir datos al usuario #1
    
    System.out.println("Ingrese la cantidad de numeros que desea (Debe ser mayor que uno):");
    a = teclado.nextInt();
    
//Validar dato del usuario
    
    while (a <= 1){
      System.out.println(" ");
      System.out.println("Error, el numero debe ser mayor que uno");
      System.out.println("Ingrese la cantidad de numeros que desea:");
      a = teclado.nextInt();
    }

//Pedir primer numero al usuario #2
    
    System.out.println(" ");
    System.out.println("Ingrese el primer numero");
    x = teclado.nextInt();
    z = x;
    a = a - 1;
        
//Realizar los calculos
    
    while (a > 0){
      System.out.println("Ingrese el siguiente numero");
      y = teclado.nextInt();
      if (x > y){
        if (z > y){
          z = y;
        }
      }
      else{
        if (z > y){
          z = y;
        }
        x = y;
      }
      a = a - 1;
    }
    
//Entregar datos al usuario
    
    System.out.println("El numero mayor es: " +x);
    System.out.println("El numero menor es: " +z);
    
  }
}