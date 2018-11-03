//Importar Clases a Java

import java.util.*;

//Definir nombre de algoritmo

public class python_e01{
  public static void main (String args[]){
    
//Llamar librerias a Java
    
    Scanner teclado = new Scanner(System.in);
    
//Declarar Variables
    
    int x;
    String y;
    int z;
    
//Explicacion al usuario de Algoritmo
    
    System.out.println("Algoritmo que pide al usuario un numero entre el 10 y el 15 para luego repetir");
    System.out.println("una frase la cantidad de veces que el designo");
        
//Pedir numero al usuario
    
    System.out.println("\nIngrese un numero entre 10 y 15");
    x = teclado.nextInt();
    
//Validar datos del usuario
    
    while (x < 10 || x > 15){
      System.out.println("\nError, el numero ingresado debe ser entre 10 y 15");
      System.out.println("Ingrese un numero entre 10 y 15");
      x = teclado.nextInt();
    }
      
//Pedir al usuario el ingreso de una palabra
      
    System.out.println("Ingrese una palabra");
    y = teclado.nextLine();
    
//Imprimir en pantalla
    
    while (x != 0){
      System.out.println(y);
      x = x - 1;
    }
      
  }
}