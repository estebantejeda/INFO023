//Importar Clases a Java

import java.util.*;

//Definir nombre de algoritmo

public class python_e03{
  public static void main (String args[]){
    
//Llamar librerias a Java
    
    Scanner teclado = new Scanner(System.in);
    
//Declarar Variables
    
    int i;
    int x = 0;
    
//Explicacion al usuario de algoritmo
    
    System.out.println("Algoritmo que resuelve una suma de forma '(2 + i)'");
    System.out.println(" ");
    
//Pedir datos al usuario
    
    System.out.println("Ingrese un numero positivo");
    i = teclado.nextInt();
    
//Verificar que el numero sea positivo
    
    while (i < 0){
    System.out.println("\nError, el numero debe ser positivo");
    System.out.println("Ingrese un numero positivo");
    i = teclado.nextInt();    
    }
    
//Realizar calculos
    
    while (i != 0){
      x = x + (2 + i);
      i = i - 1;        
    }
    
//Imprimir datos al usuario
    
    System.out.println("Su resultado es:" +x);
      
  }
}