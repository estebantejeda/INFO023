//Importar Clases en Java
    
import java.util.*;

//Definir nombre del Algoritmo

public class ayudantia_02{
  public static void main (String args[]){   

//Declarar Variables

    String x, y, z;
    boolean ciclico;

//Definir Variables

    ciclico = true;

//Explicacion de Algoritmo al Usuario
    
    System.out.println("Texto");

//Activar Ciclico
    
    while(ciclico){

//Pedir datos al Usuario
    
      x = verificaEntrada("\nIngrese una frase entre 3 y 12 caracteres. Con menos de 4 espacios");
      System.out.println("Frase Original: " +x);
      y = cambiaPrimeraMayuscula(x);
      System.out.println("Frase con primera letra Mayuscula: " +y);
      z = cambiaVocalesIngresadas(x);
      System.out.println("Frase con vocales cambiadas: ");

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
    int espacio = cuentaEspacio(frase);
    while (frase.length() < 3 || frase.length() > 12 || espacio >= 4){
      System.out.println("Error, la frase ingresada no cumple los requisitos");
      System.out.println(text);
      frase = teclado.nextLine();
      espacio = cuentaEspacio(frase);
    }
    return frase;
  }
  
  //Metodo cuentaEspacio
  
  public static int cuentaEspacio(String frase){
    String minus = " ";
    int contador = 0;
    for (int i = 0; i < frase.length(); i++){
      if (minus.indexOf(frase.charAt(i)) != -1){
        contador++;
      }
    }
    return contador;
  }
  
  //Metodo cambiaPrimeraMayuscula
  
  public static String cambiaPrimeraMayuscula(String frase){
    char letra = frase.charAt(0);
    String letra_m = Character.toString(letra);
    letra_m = letra_m.toUpperCase();
    String frase_m = frase.substring(1, frase.length());
    String frase_f = letra_m.concat(frase_m);
    return frase_f;
  }
  
  //Metodo cambiaVocalesIngresadas
  
  public static String cambiaVocalesIngresadas(String frase){
    char vocal; 
    int vocal_m;
    for (int i = 0; i >= frase.length(); i++){
      vocal = frase.charAt(i);
      if (vocal >= 97 || vocal <= 122 ){
        vocal_m = vocal + 32;
        System.out.println(vocal_m);
        frase.charAt(i) = vocal_m;
      }
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