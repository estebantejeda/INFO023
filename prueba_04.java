//Importar Clases en Java
    
import java.util.*;

//Definir nombre del Algoritmo

public class prueba_04{
  public static void main (String args[]){
    
//Declarar Variables
    
    String a;
    int x, b, c;
    
//Definir Variables
    
    b = 0;
    x = 0;
    c = 0;
    
//Explicacion al usuario de algoritmo
    
    System.out.println("Algoritmo que pide al usuario el ingreso de frases con un minimo de 10 caracteres");
    System.out.println("El programa calculara cuantas vocales tienen las frases y se detendras cuanto supere las 40");
    
//Pedir datos al usuario
    
    for (int i = 0; c < 40; i++){
      a = leeValidaFrase("\nIngrese una frase [Minimo 10 caracteres]");
      x = cuentaVocales(a);
      c += x;
      b++;
    }
    
//Imprimir datos al usuario
    
    escribeResultados(c, b);
    
  }
  
//Realizar Metodos
  
  //Metodo leeValidaFrase
  
  public static String leeValidaFrase(String text){
    String frase;
    int a = 0;
    Scanner teclado = new Scanner(System.in);
    System.out.println(text);
    frase = teclado.nextLine();
    a = cuentaCar(frase, " ");
    while (frase.equals("") || frase.length() < (10+a)){
      System.out.println("Error!, no ha ingreado una frase o  la frase contiene menos de 10 caracteres");
      System.out.println(text);
      frase = teclado.nextLine();
    }
    return frase;
  }
  
  //Metodo cuentaVocales
  
  public static int cuentaVocales(String frase){
    int contador = 0;
    contador = cuentaCar(frase, "a");
    contador += cuentaCar(frase, "e");
    contador += cuentaCar(frase, "i");
    contador += cuentaCar(frase, "o");
    contador += cuentaCar(frase, "u");
    return contador;
  }
  
  //Metodo cuentaCar
  
  public static int cuentaCar(String frase, String vocal){
    int a = 0;
    int b = 0;
    a = frase.indexOf(vocal, a);
    while (a != -1){
      b++;
      a++;
      a = frase.indexOf(vocal, a);
    }
    return b;
  }
  
  //Metodo escribeResultados
  
  public static void escribeResultados(int vocales, int frases){
    System.out.println("\nSe contaron " +vocales+ " vocales en " +frases+ " frases");
  }
  
}