//Importar Clases en Java

import java.util.*;

//Definir nombre del Algoritmo

public class ejercicio_39{
  public static void main(String args[]){
    
//Declarar y definir variables
    
    int x;
    String frase = "";
    String busca = "";
    
//Llamar librerias de Clases      
    
    Scanner teclado = new Scanner(System.in);

//Explicacion al usuario de algoritmo
    
    System.out.println("\nAlgoritmo que le pide al usuario el ingreso de una frase y este buscara cuantas veces se repite");
    
//Pedir datos al usuario    
    
    x = leeValidaNumeroFrases("\nIngrese la cantidad de frases que usara");
    
//Limpiar Buffer    
    
    teclado.nextLine();
    
//Realizar calculos    
    
    for(int i = 0; i < x; i++){
      System.out.print("Ingrese frase "+(i+1)+": ");
      frase = teclado.nextLine();
      while(frase.equals("")){
        System.out.println("Ingreso no valido");
        System.out.print("Ingrese frase "+(i+1)+": ");
        frase = teclado.nextLine();
      }
      System.out.print("Palabra a buscar? ");
      busca = teclado.nextLine();
      while(busca.equals("")){
        System.out.println("Ingreso no valido");
        System.out.print("Palabra a buscar? ");
        busca = teclado.nextLine();
      }
      if(frase.indexOf(busca)!= -1){
        System.out.println("La palabra \""+busca+"\" se encuentra en la frase");
      }
      else{
        System.out.println("La palabra \""+busca+"\" no se encuentra en la frase");
      }
    }
  }
  
//Realizar metodos  
  
  //Metodo leeValidaNumeroFrases
  
  public static int leeValidaNumeroFrases(String text){
    Scanner t = new Scanner(System.in);
    System.out.println(text);
    int numeroFrase = t.nextInt();
    while (numeroFrase < 1){
      System.out.println("\nError!, el numero ingresado debe ser mayor que '1'");
      System.out.println(text);
      numeroFrase = t.nextInt();
    }
    return numeroFrase;
  }
  
  //Metodo leeValidaFrase
  
  //Metodo buscaOcurrencia
  
  //Metodo imprimeResultado
  
}