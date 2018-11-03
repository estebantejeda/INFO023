//Importar Clases en Java

import java.util.*;

//Definir nombre del Algoritmo

public class ejercicio_42{
  public static void main (String args[]){
    
//Declarar Variables
    
    int x, z;
    String y, w;
    
//Definir Variables
    
    z = 0;
    
//Explicacion de algoritmo al usuario
    
    System.out.println("Algoritmo que pide al usuario el ingreso de una frases y este determina la cantidad de la vocal");
    System.out.println("que el usuario decide buscar");
    
//Pedir datos al usuario
    
    x = numFrases("\nIngrese la cantidad de frases que desea ingresar [> 1]:" );
    y = leeVocal("\nIngrese la vocal que desea contar dentro de sus frases [a, e, i, o, u]");
    
//Realizar Calculos
    
    for (int i = 0; i < x; i++){
     w = leeFrase("\nIngrese la frase a calcular");
     z = z + ocurreVocal(w, y);
    }
    
//Imprimir datos al usaurio
    
    escribeResultados(y, z);
    
  }
  
//Realizar Metodos
  
  //Metodo numFrase();
  
  public static int numFrases(String text){
    Scanner teclado = new Scanner(System.in);
    int frase;
    do{
      System.out.println(text);
      frase = teclado.nextInt();      
    }while (frase < 1);
    return frase;
  }
  
  //Metodo leeVocal
  
  public static String leeVocal(String text){
    Scanner teclado = new Scanner(System.in);
    String vocal;
    System.out.println(text);
    vocal = teclado.nextLine();
    while (! (vocal.equals("a") || vocal.equals("e") || vocal.equals("i") || vocal.equals("o") || vocal.equals("u")) ){
      System.out.println("Error!, se debe ingresar una vocal");
      System.out.println(text);
      vocal = teclado.nextLine();
    }
    return vocal;
  }
  
  //Metodo leeFrase
  
  public static String leeFrase(String text){
    Scanner teclado = new Scanner(System.in);
    String frase;
    System.out.println(text);
    frase = teclado.nextLine();
    while (frase.equals("")){
      System.out.println("Error!!, no ingreso frase");
      System.out.println(text);
      frase = teclado.nextLine();
    }
    return frase;
  }
    
    //Metodo ocurreVocal
    
    public static int ocurreVocal(String frase, String vocal){
      int a = 0;
      int b = 0;
      b = frase.indexOf(vocal, b);
      while (b != -1){
        a++;
        b++;
        b = frase.indexOf(vocal, b);
      }
      return b;
    }
    
    //Metodo escribeResultado
    
    public static void escribeResultados(String vocal, int veces){
      System.out.println("La vocal " +vocal+ " ocurre " +veces+ " veces");
    }
}