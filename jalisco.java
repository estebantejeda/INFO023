//Importar Clase a Java

import java.util.*;

//Definir nombre de Algoritmo

public class jalisco{
  public static void main (String args[]){
  
//Llamar libreria Scanner
    
    Scanner teclado = new Scanner(System.in);
         
//Explicacion de algoritmo al usuario
    
    System.out.println("Algoritmo que inicia un juego llamado 'Jalisco'");

//Pedir datos al usuario
    
    System.out.print("Ingresa tu Nombre: ");
    String name = teclado.nextLine();
    System.out.print("Ingresa un Numero: ");
    long number = teclado.nextLong();
    
//Realizar calculos
    
    number = number + 1;
      
//Entregar datos al usuario
    
    System.out.println("Hola, " +name+ " te gano!!...");
    System.out.println("Tengo el " +number );
    System.out.println("Chaooo");
      
  }
}