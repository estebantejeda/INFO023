//Importar Clases a Java

import java.util.*;

//Desigar nombre a algoritmo

public class python_e02{
  public static void main (String args[]){
    
//Llamar librerias a Java
    
    Scanner teclado = new Scanner(System.in);
    
//Declarar Variables
    
    int x;
    int a = 0;
    int b = 0;
    int c;

//Explicacion al usuario de algoritmo
    
    System.out.println("Algoritmo que cuenta cuantos numeros pares e impares ingresa el usuario");
    System.out.println(" ");
    
//Pedir datos al usuario
    
    System.out.println("Ingrese un numero, finalice ingresado el '0'");
    x = teclado.nextInt();
    
    //Verificar si el numero es par o impar
    
    while (x != 0){
      if (x%2 == 0){
        a = a + 1;
      }
      else{
        b = b + 1;  
      }
      
    //Seguir pidiendo numeros al usuario mientras no haya ingresado el '0''  
      
    System.out.println("Ingrese un numero, finalice ingresado el '0'");
    x = teclado.nextInt();
    }
      
//Realizar calculos
    
    c = a + b;
    
//Imprimir datos al usuario
    
    System.out.println("Numeros pares:" +a);
    System.out.println("Numeros impares:" +b);
    System.out.println("Total de numeros ingresados:" +c);

  }
}