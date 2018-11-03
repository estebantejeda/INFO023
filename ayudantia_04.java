//Importa librerias a Java

import java.util.*;

//Definir nombre de Algoritmo

public class tutoria_04{
  public static void main(String args[]){
    
//Declarar Variables
    
    String x;
    char y;
    
//Pedir datos al usuario
    
    x = verificaEntrada("\nIngrese una frase sin caracteres 'a', 's', 'd' o 'f'. Y de 8 a 20 caracteres");
    y = extraeLetra(x);
    completaAbecedarioAdelante(y);
    completaAbecedarioInversio(y);
    devuelveNumeroAscii(x);
    
  }
  
//Realizar Metodos
  
  //Metodo verificaEntrada
  
  public static String verificaEntrada(String text){
    Scanner t = new Scanner(System.in);
    System.out.println(text);
    String frase = t.nextLine();
    int contador = cuentaRestricciones(frase);
    while (frase.length() < 8 || frase.length() > 20 || contador > 0){
      System.out.println("Error!, la frase no cumple las condiciones");
      System.out.println(text);
      frase = t.nextLine();
      contador = cuentaRestricciones(frase);
    }
    return frase;
  }
  
  //Metodo cuentaRetricciones
  
  public static int cuentaRestricciones(String frase){
    String minus = "asdf";
    int contador = 0;
    for (int i = 0; i < frase.length(); i++){
      if (minus.indexOf(frase.charAt(i)) != -1){
        contador++;
        
      }
    }
    return contador;
  }  
  
  //Metodo extraeLetra
  
  public static char extraeLetra(String frase){
    int ultima = frase.length() - 1;
    char letra = frase.charAt(ultima);
    return letra;
  }
  
  //Metodo completaAbecedarioAdelante
  
  public static void completaAbecedarioAdelante(char letra){
    if (letra > 65 && letra < 90){
      while (letra < 90){
        System.out.print(letra+ " - ");
        letra++;
      }
      System.out.println(letra);
    }
    else{
      while (letra < 122){
        System.out.print(letra+ " - ");
        letra++;        
      }
      System.out.println(letra);      
    }
  }
  
  //Metodo completaAbecedarioInverso
  
  public static void completaAbecedarioInversio(char letra){
    char contador = 65;
    char contador2 = 97;
    if (letra > 65 && letra < 90){
      while (contador < letra){
        System.out.print(contador+ " - ");
        contador++;
      }
      System.out.println(contador);
    }
    else{
      while (contador2 < letra){
        System.out.print(contador2+ " - ");
        contador2++;        
      }
      System.out.println(contador2);      
    }
  }
  
  //Metodo devuelveNumeroAscii
  
  public static void devuelveNumeroAscii(String frase){
    char letra;
    int letraf = 0;
    for (int i = 0; i < frase.length(); i++){
      letra = frase.charAt(i);
      letraf = (char)letra;
      System.out.print(letraf);
      System.out.print(" - ");
    }
  }
  
  
}