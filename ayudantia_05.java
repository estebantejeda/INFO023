//Importar Clases en Java
    
import java.util.*;

//Definir nombre del Algoritmo

public class ayudantia_05{
  public static void main (String args[]){
 
//Declarar Variables
    
   String x;
    
//Pedir datos al usuario
    
   x = verificaEntrada("\nIngrese una frase entre 2 y 16 caracteres. Sin '1', '2', '3' y '4'");
   char A[] = fraseArregloChar(x);
   
  }
  
//Realizar Metodos      
  
   //Metodo repetirProceso
  
  public static String verificaEntrada(String text){
    Scanner teclado = new Scanner(System.in);
    System.out.println(text);
    String frase = teclado.nextLine();
    int contador = cuentaNumeros(frase);
    while (contador > 0 || frase.length() < 2 || frase.length() > 16){
      System.out.println("Error!!, la frase ingresada es valida");
      System.out.println(text);
      frase = teclado.nextLine();
      contador = cuentaNumeros(frase);
    }
    return frase;
  }
  
  //Metodo cuentaNumeros
  
  public static int cuentaNumeros(String frase){
    String minus = "1234";
    int contador = 0;
    for (int i = 0; i < frase.length(); i++){
      if (minus.indexOf(frase.charAt(i)) != -1){
        contador++;
      }
    }
    return contador;
  }
  
  //Metodo fraseArregloChar
  
  public static char[] fraseArregloChar(String frase){
    char lista[] = new char[frase.length()];
    int largo = frase.length();
    for (int i = largo - 1; i >= 0; i--){
      lista[i] = largo;
      j++;
    }
    return frase;
  }

}