//Importar Clases en Java
    
import java.util.*;

//Definir nombre del Algoritmo

public class ayudantia_03{
  public static void main (String args[]){
    
//Llamar librerias de Clases  
    
    Scanner teclado = new Scanner(System.in);
    Random aleat = new Random();

//Declarar Variables

    String x;
    boolean ciclico;

//Definir Variables

    ciclico = true;

//Activar Ciclico
    
    while(ciclico){

//Pedir datos al Usuario
    
      x = verificaEntrada("\nIngrese una frase. No debe repetir mas de 4 veces un caracter. [Entre 4 y 16 Caracteres]");

//Realizar Ciclico
    
      ciclico = repetirProceso(ciclico);      
    }
      
  }
  
//Realizar Metodos
  
  //Metodo verificaEntrada
  
  public static String verificaEntrada(String text){
    Scanner teclado = new Scanner(System.in);
    System.out.println(text);
    String frase = teclado.nextLine();
    int contador = repetirCaracter(frase);
    if (frase.length() > 16 || frase.length() < 4 || contador > 0){
      System.out.println("Error!, el codigo ingresado debe no cumple con los requisitos");
      System.out.println(text);
      frase = teclado.nextLine();
    }
    return frase;
  }
  
  //Metodo repetirCaracter
  
  public static int repetirCaracter(String frase){
    int letra_u;
    int letra_d;
    int contador;
    int contador_f;
    for (int i = 0; i >= frase.length(); i++){
      letra_u = Character.toString(frase.charAt(i));
      for (int j = 1; j >= frase.length(); j++){
        letra_d = Character.toString(frase.charAt(j));
        if (letra_u.equalsIgnoreCase(letra_d)){
          contador++;
        }
        if (contador >= 4){
          contador_f = 1;
        }
      }
      contador = 0;
    }
    return contador_f;
  }
  
  //Metodo repetirProceso
  
    public static boolean repetirProceso(boolean ciclico){
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