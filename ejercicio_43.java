//Importar Clases en Java
    
import java.util.*;

//Definir nombre del Algoritmo

public class ejercicio_43{
  public static void main (String args[]){

//Declarar Variables

    String x;
    String y;
    boolean ciclico;
    
//Llamar librerias de Clases  
    
    Scanner teclado = new Scanner(System.in);    

//Definir Variables

    ciclico = true;

//Explicacion de Algoritmo al Usuario
    
    System.out.println("Algoritmo que le pide el ingreso al usuario de alguna frase que contenga espacios al incio.");
    System.out.println("El algoritmo recortara la frase que eliminara los espacios de la izquiera");

//Activar Ciclico
    
    while(ciclico){

//Pedir datos al Usuario
    
      x = leeValidaFrase("\nIngrese la frase que desea recortar");
      
//Realizar la accion de eliminar los espacios de la izquiera
      
      y = espaciosIzquierda(x);
      
//Imprimir respuesta al usuario
      
      imprimeAmbasFrases(x, y);

//Realizar Ciclico
    
      ciclico = consulta(ciclico);      
    }
      
  }
  
//Realizar Metodos
  
  //Metodo leeValidaFrase
  
  public static String leeValidaFrase(String text){
    Scanner teclado = new Scanner(System.in);
    System.out.println(text);
    String frase = teclado.nextLine();
    while (frase.equals("")){
      System.out.println("Error!, la frase ingresada no puede estar vacia");
      System.out.println(text);
      frase = teclado.nextLine();
    }
    return frase;
  }
  
  //Metodo espacioIzquierda
  
  public static String espaciosIzquierda(String frase){
    char car;
    int largo = frase.length();
    boolean examina = true;
    while (examina){
      if (largo > 0){
        car = frase.charAt(0);
        if (car == ' '){
          frase.substring(1);
          largo = frase.length();
        }
        else{
          examina = false;
        }
      }
      else{
        examina = false;
      }
    }
    return frase;
  }
  
  //Metodo imprimeAmbasFrases
  
  public static void imprimeAmbasFrases(String x, String y){
    System.out.println("Frase Ingresada: " +x);
    System.out.println("Frase Recortada: " +y);
  }
  
  //Metodo repetirProceso
  
    public static boolean consulta(boolean ciclico){
      Scanner teclado = new Scanner(System.in);
      System.out.println("\nFinalizar? [s/n]");
      String fin = teclado.nextLine();
      while (!(fin.equalsIgnoreCase("s") || fin.equalsIgnoreCase("n"))){
        System.out.println("\nLa opcion ingresada no es correta, vuelva a intentarlo.");
        System.out.println("Finalizar? [s/n]");
        fin = teclado.nextLine();
      }
      if (fin.equalsIgnoreCase("s")){
        ciclico = false;
      }
      return ciclico;
    }
   
}