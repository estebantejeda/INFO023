//Importar Clases en Java
    
import java.util.*;

//Definir nombre del Algoritmo

public class ayudantia_01{
  public static void main (String args[]){

//Importar librerias
    
    Scanner teclado = new Scanner(System.in);
    
//Declarar Variables

    String x, y, a, b;
    char c;
    int d;
    boolean z, ciclico;

//Definir Variables
    
    a = "";
    b = "";
    c = 0;
    d = ' ';
    ciclico = true;

//Explicacion de Algoritmo al Usuario
    
    System.out.println("Algoritmo que pide el ingreso al usuario de dos frases. Si ambas frases tienen sus ultimos tres caracteres iguales");
    System.out.println("se podra buscar una palabra a eleccion del usuario para ver si esta contenida dentro de la primera frase.");
    System.out.println("De caso contrario, el algoritmo pedira el ingreso de una letra y dirá en que posicion de la segunda frase se encuentra.");

//Activar Ciclico
    
    while(ciclico){

//Pedir datos al Usuario
    
      x = verificaEntrada("\nIngrese la primera frase sin espacios, de largo menor a 5 y con mas de 4 vocales");
      y = verificaEntrada("\nIngrese la segunda frase sin espacios, de largo menor a 5 y con mas de 4 vocales");
      z = comparaTresUltimas(x, y);
      if (z){
        a = fraseAComparar("\nIngrese una frase a comparar con la primera entrada");
        b = verificaSubPalabra(x, a);
      }
      else{
        c = letraAComparar("\nIngrese una letra a comparar");
        d = buscaLetra(y, c);
      }
      //e = retornaVocales(x);
      //f = retornaVocales(y);
      
//Entregar datos al usuario
      
      System.out.println("\nPrimera Frase Ingresada: " +x);
      System.out.println("Segunda Frase Ingresada: " +y);
      if (z){
        System.out.println("Palabra a comparar con la primera frase: " +a);
        System.out.println(b);
      }
      else{
        System.out.println("Letra a comparar con la segunda frase: " +c);
        if (d >= 0){
          System.out.println("La letra se encuentra en la posicion: " +d);
        }
        else{
          System.out.println("La letra buscada no se encuentra dentro de la segunda frase");
        }
      }
      //System.out.println("Primera frase sin Vocales: " +e);
      //System.out.println("Segunda frase sin Vocales: " +f);
      
      
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
    int espacio = verificaEspacio(frase);
    int vocales = verificaVocales(frase);
    while (frase.length() < 5 || espacio > 0 || vocales < 4 || frase.equals("")){
      System.out.println("Error!, la frase ingresada no es valida");
      System.out.println(text);
      frase = teclado.nextLine();
      espacio = verificaEspacio(frase);
      vocales = verificaVocales(frase);
    }
    return frase;
  }
  
  //Metodo verificaEspacio
  
  public static int verificaEspacio(String frase){
    String minus = " ";
    int contador = 0;
    for (int i = 0; i < frase.length(); i++){
      if (minus.indexOf(frase.charAt(i)) != -1){
        contador++;
      }
    }
    return contador;
  }  

  //Metodo verificaVocales
  
  public static int verificaVocales(String frase){
    String minus = "aeiou";
    int contador = 0;
    for (int i = 0; i < frase.length(); i++){
      if (minus.indexOf(frase.charAt(i)) != -1){
        contador++;
      }
    }
    return contador;
  }   
  
  //Metodo comparaTresUltimas
  
  public static boolean comparaTresUltimas(String frase_u, String frase_d){
    boolean compara;
    int largo_u = frase_u.length() - 3;
    int largo_d = frase_d.length() - 3;
    String acortado_u = frase_u.substring(largo_u, frase_u.length());
    String acortado_d = frase_d.substring(largo_d, frase_d.length());
    if (acortado_u.equalsIgnoreCase(acortado_d)){
      compara = true;
    }
    else{
      compara = false;
    }
    return compara;
  }
  
  //Metodo fraseAComparar
  
  public static String fraseAComparar(String text){
    Scanner teclado = new Scanner(System.in);
    System.out.println(text);
    String comparar = teclado.nextLine();
    while (comparar.equals("")){
      System.out.println("Error!, no ingresar una frase vacia");
      System.out.println(text);
      comparar = teclado.nextLine();
    }
    return comparar;
  }
  
  //Metodo verificaSubPalabra
 
  public static String verificaSubPalabra(String frase, String subfrase){
    int contador = 0;
    String x;
    for (int i = 0; i < frase.length(); i++){
      if (subfrase.indexOf(frase.charAt(i)) != -1){
        contador++;
      }
    }
    if (contador > 0){
      x = "La subpalabra se encuentra en la frase ingresada";
    }
    else{
      x = "La subpalabra buscada no existe";
    }
    return x;
  }
  
  //Metodo letraAComparar
  
  public static char letraAComparar(String text){
    Scanner teclado = new Scanner(System.in);
    System.out.println(text);
    String letra = teclado.nextLine();
    while(letra.length() > 1 || letra.equals("")){
      System.out.println("Error!, no ha ingresado una letra o ha ingresado mas de una");
      System.out.println(text);
      letra = teclado.nextLine();
    }
    char letra_char = letra.charAt(0);
    return letra_char;
  }
  
  //Metodo buscaLetra
  
  public static int buscaLetra(String frase, char letra){
    String letra_string = Character.toString(letra);
    int posicion = frase.indexOf(letra_string);
    return posicion;
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