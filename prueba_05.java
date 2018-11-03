//Importar Clases en Java
    
import java.util.*;

//Definir nombre del Algoritmo

public class prueba_05{
  public static void main (String args[]){

//Declarar Variables

    String x, y;
    boolean ciclico;

//Explicacion de Algoritmo al Usuario
    
    System.out.println("Algoritmo que pide al usuario el ingreso de una frase para luego invertirla");
    
//Activar buscaOperadoresNumericos
    
    ciclico = true;
    while (ciclico){

//Pedir datos al Usuario
    
    x = leeFrase("\nIngrese una frase valida");
    y = invierteFrase(x);
    imprimeFrases(x, y);
    ciclico = buscaOperadoresNumericos(y);
         
    }
  }
  
//Realizar Metodos
  
  //Metodo leeFrase
  
  public static String leeFrase(String text){
    Scanner teclado = new Scanner(System.in);
    System.out.println(text);
    String frase = teclado.nextLine();
    while (frase.equals("")){
      System.out.println("Error!, no puede ingresar una frase vacia");
      System.out.println(text);
      frase = teclado.nextLine();
    }
    frase = eliminaBlancosDerecha(frase);
    return frase;
  }
  
  //Metodo eliminaBlancosDerecha
  
  public static String eliminaBlancosDerecha(String frase){
    String frasefinal = "";
    int largo = frase.length();
    int contador = 0;
    String ultima = frase.substring(largo - 1, largo);
    int x = 2;
    int y = 1;
    while (ultima.equals(" ")){
      ultima = frase.substring(largo - x, largo - y);
      contador++;
      x++;
      y++;
    }
    frasefinal = frase.substring(0, largo - contador);
    return frasefinal;
  }
  
  //Metodo invierteFrase
  
  public static String invierteFrase(String frase){
    String letra;
    String frasefinal = "";
    int largo = frase.length();
    while (largo > 0){
      letra = frase.substring(largo - 1, largo);
      frasefinal = frasefinal.concat(letra);
      largo--;
    }
    return frasefinal;
  }
  
  //Metodo imprimeFrases
  
  public static void imprimeFrases(String frase_1, String frase_2){
    System.out.println("Frase Original: " +frase_1);
    System.out.println("Frase Invertida: " +frase_2);
  }
  
  //Metodo buscaOperadoresNumericos
  
  public static boolean buscaOperadoresNumericos(String frase){
    String minus = "+-*/";
    boolean ciclico = true;
    int contador = 0;
    for (int i = 0; i < frase.length(); i++){
      if (minus.indexOf(frase.charAt(i)) != -1){
        contador++;
      }
    }
    if (contador > 0){
        ciclico = false;
    }
    return ciclico;    
  }
  
}