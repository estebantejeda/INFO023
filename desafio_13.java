//Importar Clases en Java
    
import java.util.*;

//Definir nombre del Algoritmo

public class desafio_13{
  public static void main (String args[]){
    
//Llamar librerias de Clases  
    
    Scanner teclado = new Scanner(System.in);

//Declarar Variables

    String x;
    boolean ciclico;

//Definir Variables

    ciclico = true;

//Explicacion de Algoritmo al Usuario
    
    System.out.println("Algoritmo que lee una frase y tranfiere cada caracter String a un arreglo de Char. Luego se imprime el caracter hacia abajo");

//Activar Ciclico
    
    while(ciclico){

//Pedir datos al Usuario
    
      x = leeValidaFrase("\nIngrese la frase en la cual desee transferir sus String");
      
//Convertir frase a Arreglo
      
      char A[] = convierteFrase(x);
            
//Realizar Ciclico
    
      ciclico = repetirProceso(ciclico);      
    }
      
  }
  
//Realizar Metodos
  
  //Metodo leeValidaFrase
  
    public static String leeValidaFrase(String text){
    Scanner t = new Scanner(System.in);
    System.out.println(text);
    String frase = t.nextLine();
    while (frase.equals("")){
      System.out.println("\nError!!, No ha ingresado texto");
      System.out.println(text);
      frase = t.nextLine();
    }
    return frase;
  }
    
  //Metodo convierteFrase
    
    public static char convierteFrase(String frase){
      int a = frase.length() - 1;
      char A[] = new int[a];
      for (int i = 0; i <= a; i++){
        A[i] = frase.length(i);
      }
      return frase;
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