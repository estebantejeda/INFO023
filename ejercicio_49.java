//Importar clases a Java

import java.util.*;

//Definir nombre de algoritmo

public class ejercicio_49{
  public static void main (String args[]){
    
//Importar librerias a Java
    
    Scanner teclado = new Scanner(System.in);
    
//Declarar Variables
    
    int x;
    
//Realizar Excepciones
    
    try{
      System.out.println("Ingrese un numero");
      x = teclado.nextInt();    
      System.out.println("Su numero es: " +x);
    }
    catch(InputMismatchException ex){
      System.out.println("Error, no puede ingresar texto");
    }
    
  }
}