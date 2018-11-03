//Importar Clases en Java
    
import java.util.*;

//Definir nombre del Algoritmo

public class ejercicio_11{
  public static void main (String args[]){
    
//Llamar libreria Scanner  
    
    Scanner teclado = new Scanner(System.in);

//Declarar Variables
    
    int a;
    int b;

//Explicacion de Algoritmo al Usuario
        
    System.out.println("Algoritmo que le pide al usuario 2 numeros e imprime la secuencia");
    System.out.println("desde el menor hasta el mayor");
    System.out.println(" ");

//Pedir datos al usuario
    
    System.out.println("Ingrese el primer numero");
    a = teclado.nextInt();
    System.out.println("Ingrese el segundo numero");
    b = teclado.nextInt();
    
//Realizar calculos
    
    if (a > b){
      while (a != 0){
        System.out.print(b+ " - ");
        b = b + 1;
        a = a- 1;
                           
      }
    }
    
    else{
      while (b > a){
        System.out.print(a+ " - ");
        a = a + 1;
        b = b - 1;
      }
    }
  
  }
}