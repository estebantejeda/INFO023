//Importar librerias a Java

import java.util.*;

//Definir nombre de algoritmo

public class ejercicio_46{
  public static void main(String args[]){
        
//Declarar Variables
    
    int x, y;
    
//Explicacion al usuario de algoritmo
    
    System.out.println("Algorirmo que pide al usuario el ingreso de un numero y luego le muestra su equivalente en caracter");
    
//Pedir datos al usuario
    
    x = cantidadNumeros("\nIngrese la cantidad de numeros que desea convertir");
    
//Realizar calculos e imprimir datos al usuario
    
    for (int i = 0; i < x; i++){
      realizaConversion("\nIngrese el numero que desea convertir");
    }
    
  }
  
//Realizar Metodos
  
  //Metodo cantidadNumeros
  
  public static int cantidadNumeros(String text){
    Scanner teclado = new Scanner(System.in);
    System.out.println(text);
    int veces = teclado.nextInt();
    while (veces < 0){
      System.out.println("Error!, el numero no puede ser negativo");
      System.out.println(text);
      veces = teclado.nextInt();
    }
    return veces;
  }
  
  //Metodo realizaConversion
  
  public static void realizaConversion(String text){
    Scanner teclado = new Scanner(System.in);
    System.out.print(text);
    int numero = teclado.nextInt();
    while (numero < 0 || numero > 255){
      System.out.println("Error, el numero ingresado sobrepasa los margenes");
      System.out.print(text);
      numero = teclado.nextInt();
    }
    char conversion = (char)numero;
    System.out.println("El equivalente de " +numero+ " es: " +conversion);
  }
  
}