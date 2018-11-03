//Importar Clases en Java
    
import java.util.*;
import java.io.*;

//Definir nombre del Algoritmo

public class Prueba_09{
  public static void main (String args[]){
    
//Declarar Variables
    
    boolean x;
    String a;
    
//Definir Variables
    
    x = true;
    
//Explicacion de Algoritmo al Usuario
    
    System.out.println("Algoritmo que genera de manera aleatoria numetros entre 0 y 9 para luego formar uno solo con un largo de 10.");
    
//Activar consultaDesicion
    
    while(x){

//Realizar la secuancia
      
      System.out.println("\nGenerando secuencia numerica aleatoria...");
      a = generaSecuenciaNumericaAleatoria();
      System.out.println("'"+a+"'\n");
      resumenSecuencia(a);

//Realizar consultaDesicion
    
      consultaDesicion();
    }
    
  }
  
//Realizar Metodos
  
  //Metodo repetirProceso  
  
  public static String generaSecuenciaNumericaAleatoria(){
    int azar;
    String numero, azarString;
    numero = "";
    Random aleat = new Random();
    for (int i = 0; i < 10; i++){
      azar = aleat.nextInt(10);
      azarString = Integer.toString(azar);
      numero = numero.concat(azarString);
    }
    return numero;
  }
  
  //Metodo resumenSecuencia
  
  public static void resumenSecuencia(String sec){
    int A[] = new int[10];
    int x;
    String iString;
    for (int i = 0; i < 10; i++){
      iString = Integer.toString(i);
      x = buscaOcurrencia(iString, sec);
      A[i] = x;
    }
    for(int j = 0; j < 10; j++){
      String contador = Integer.toString(j);
      System.out.print("'"+contador+"' : "+A[j]+" - ");
    }
  }
  
  //Metodo buscaOcurrencia
  
  public static int buscaOcurrencia(String valor, String sec){
    int contador = 0;
    for (int i = 0; i < sec.length(); i++){
      if (valor.indexOf(sec.charAt(i)) != -1){
        contador++;
      }
    }
    return contador;
  }

  //Metodo consultaDesicion
  
  public static void consultaDesicion(){
    Exception err1 = new Exception("Error!, la opcion ingresada no existe. Vuelva a intentarlo.");
    String resp;
    boolean repetir = true;
    while (repetir);
    try{ 
      Scanner t = new Scanner(System.in);
      System.out.println();
      System.out.println("\nFinalizar? [s/n]");
      resp = t.nextLine();
      if(!(resp.equalsIgnoreCase("s") || resp.equalsIgnoreCase("n"))){
        throw err1;
      }
    }
    catch(Exception ex1){
      System.out.println(ex1.getMessage());
    }
  }
  
}