//Importar Clases en Java
    
import java.util.*;

//Definir nombre del Algoritmo

public class ejercicio_09{
  public static void main (String args[]){
    
//Llamar libreria Scanner  
    
    Scanner teclado = new Scanner(System.in);

//Explicacion de Algoritmo al Usuario
    
    System.out.println("Algoritmo que pide al usuario 3 numeros y determina cual es el mayor");
    System.out.println(" ");
      
//Pedir datos al usuario
    
    System.out.println("Ingrese el primer numero");
    int a = teclado.nextInt();
    System.out.println("Ingrese el segundo numero");
    int b = teclado.nextInt();
    System.out.println("Ingrese el tercer numero");
    int c = teclado.nextInt();
    
//Realizar calculos y entregar datos al usuario
    
    if (a > b && a > c){
      System.out.println("El numero mayor es: " +a);
    }
    else if (b > a && b > c){
      System.out.println("El numero mayor es: " +b);
    }
    else{
      System.out.println("El numero mayor es: " +c);
    }
    if (a < b && a < c){
      System.out.println("El numero menor es: " +a);
    }
    else if (b < a && b < c){
      System.out.println("El numero menor es: " +b);
    }
    else{
      System.out.println("El numero menor es: " +c);
    } 
   
  } 
}
