//Importar Librerias a Java
    
import java.util.*;
import java.io.*;

//Crear Clase Main

public class Plantilla{
  public static void main (String args[]){
    
//Crear Objetos
    
    Scanner teclado = new Scanner(System.in);
    Random aleat = new Random();

//Declarar Variables

    int x;
    boolean ciclico;

//Definir Variables

    ciclico = true;

//Explicacion de Algoritmo al Usuario
    
    System.out.println("Texto");

//Activar Ciclico
    
    while(ciclico){

//Pedir datos al Usuario
    


//Realizar Ciclico
    
      ciclico = repetirProceso(ciclico);      
    }
      
  }
  
//Realizar Metodos
  
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
