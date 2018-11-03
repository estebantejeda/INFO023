//Importar Clases en Java

import java.util.*;
  
//Definir nombre del Algoritmo

public class ejercicio_37{
  public static void main(String args[]){
    
//Importar librerias a Java
    
    Scanner t = new Scanner(System.in);
    
//Pedir datos utilizando metodos
    
    String x = leeValidaFrase("Ingrese frase a probar:");
    String y = leeValidaFrase("Ingrese secuencia a buscar");
    int a = cuentaOcurrecia(x, y);
    imprimeResulado(a);    
    
  }
  
//Realizar metodos
  
  //Metodo leeValidaFrase
  
  public static String leeValidaFrase(String text){
    Scanner t = new Scanner(System.in);
    System.out.println(text);
    String frase = t.nextLine();
    while (frase.equals("")){
      System.out.println("\nNo ha ingresado texto");
      System.out.println(text);
      frase = t.nextLine();
    }
    return frase;
  }
  
  //Metodo cuentaOcurrencia
  
  public static void cuentaOcurrencia(String frase, String busca){
    int pos = 0;
    int cont = 0;
    pos = frase.indexOf(busca, pos);
    while (pos != -1){
      cont ++;
      pos = pos + 1;
      pos = frase.indexOf(busca, pos);
    }
    return cont;
  }
  
}