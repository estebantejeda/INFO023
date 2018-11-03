//Importar Clases a Java

import java.util.*;

//Definir nombre del algoritmo

public class ejercicio_47{
  public static void main(String args[]){
    
//Declarar Variables
    
    String x;
    
//Explicacion de algoritmo al usuario
    
    System.out.println("Algoritmo que pide al usuario el ingreso de cualquier frase, y este agrega la letra siguiente del abecedario");
    
//Pedir datos al usuario
    
    x = validaFrase("\nIngrese la frase que desea transformar. (En caso de ser mayuscula se transformara a minuscula)");
    fraseNueva(x);
    
  }
  
//Realizar Metodos
  
  //Metodo validaFrase
  
  public static String validaFrase(String text){
    Scanner teclado = new Scanner(System.in);
    System.out.println(text);
    String frase = teclado.nextLine();
    frase = frase.toLowerCase();
    int contador = soloLetras(frase);
    while (contador > 0){
      System.out.println("Error!, la frase contiene mas caracteres ademas de letras");
      System.out.println(text);
      frase = teclado.nextLine();
      frase = frase.toLowerCase();
      contador = soloLetras(frase);
    }
    return frase;
  }
  
  //Metodo soloLetras
  
  public static int soloLetras(String frase){
    int letra;
    int contador = 0;
    for (int i = 0; i < frase.length(); i++){
      letra = frase.charAt(i);
      if (letra > 122 || letra < 97){
        contador++;
      }
      if (letra == 32){
        contador--;
      }
    }
    return contador;
  }
  
  //Metodo fraseNueva
  
  public static void fraseNueva(String frase){
    int letra;
    char letra_f;
    System.out.print("Frase transformada: ");
    for (int i = 0; i < frase.length(); i++){
      letra = frase.charAt(i) + 1;
      if (letra == 33){
      letra--;
      }
      if (letra == 123){
        letra = 97;
      }
      letra_f = (char)letra;
      System.out.print(letra_f);
    }
    System.out.println("");
  }
  
}