//Importar Clases en Java
    
import java.util.*;

//Definir nombre del Algoritmo

public class ejercicio_38{
  public static void main (String args[]){
    
//Llamar librerias de Clases  
    
    Scanner teclado = new Scanner(System.in);
    Random aleat = new Random();

//Declarar Variables

    String x, y;

//Explicacion de Algoritmo al Usuario
    
    System.out.println("Algoritmo que pide al usuario el ingreso de una frase. Este lo codifica y lo entrega");

//Pedir datos al Usuario a traves de metodos
    
    x = leeMensaje("Ingrese el mensaje a codificar");

//Realizar calculos
    
    y = codificaFrase(x);
    
//Entregar datos al usuario
    
    System.out.println("Frase Ingresada: " +x);
    System.out.println("Frase Codificada: " +y);
    
  }
  
//Realizar Metodos
  
  //Metodo de leeMensaje
  
  public static String leeMensaje(String text){
    Scanner t = new Scanner(System.in);
    String mensaje = "";
    System.out.println("\n" +text);
    mensaje = t.nextLine();
    while (validaFrase(mensaje) == false){
      System.out.println("\nError, la frase no puede quedar vacia");
      System.out.println(text);
      mensaje = t.nextLine();
    }
    return mensaje;
  }
  
  //Metodo validaFrase
  
  public static boolean validaFrase(String frase){
    boolean validador = false;
    if (frase.length() != 0){
      for (int i = 0; i < frase.length(); i++){
        char letra = frase.charAt(i);
        if (letra != ' '){
          validador = true;
        }
      }
    }
    return validador;
  }
  
  //Metodo codificaFrase
  
  public static String codificaFrase(String frase){
    String codificada = ":";
    char largo = 0;
    for (int i = 0; i < frase.length(); i++){
      largo = frase.charAt(i);
      if (largo != ' '){
        if (i > 0 && frase.charAt(i - 1) != ' '){
          codificada += "," + ((int)largo);
        }
        else{
          codificada += ((int)largo);
        }
      }
      else{
        codificada += " : ";
      }
    }
    codificada += ":";
    return codificada;
  }
  
}