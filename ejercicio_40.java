//Importar Clases en Java

import java.util.*;

//Definir nombre del Algoritmo

public class ejercicio_40{
  public static void main (String args[]){

//Declarar Variables
    
    int x;
    
//Explicacion al usuario de algoritmo
    
    System.out.println("Algoritmo que pide al usuario el ingreso de frases y este cuenta cuantas a ingresado.");
    System.out.println("Se finaliza con enter sin el ingreso de caracteres.");
    
//Pedir datos al usuario
    
    x = cuentaFrases("\nIngrese Frase");

//Imprimir resultado al usuario
    
    imprimeCuenta(x);
    
  }
  
//Metodos
  
  //Metodo cuentaFrase
  
  public static int cuentaFrases(String text){
    Scanner teclado = new Scanner(System.in);
    System.out.println(text);
    String frase = teclado.nextLine();
    int contador = 0;
    while (frase.length() > 0){
      System.out.println(text);
      frase = teclado.nextLine();
      contador++;
    }
    return contador;
  }
  
  //Metodo imprimeCuenta
  
  public static void imprimeCuenta(int contador){
    if (contador == 0){
      System.out.println("No ingreso frases");
    }
    else{
      System.out.println("El numero de frases ingresadas es de: " +contador);
    }
  }
  
} 