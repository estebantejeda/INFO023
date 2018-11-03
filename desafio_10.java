//Importar Clases en Java

import java.util.*;

//Definir nombre del Algoritmo

public class desafio_10{
  public static void main(String args[]){
    
//Declarar Variables   
    
    int notermino = 1;
    int la = 0, lb = 0, lc = 0;
    boolean escierto = true;
    
//Iniciar Ciclico    
    
    while(notermino == 1){
      
//Pedir datos al usuario a traves de metodos      
      
      la = leaValidaLado("Ingrese primer lado del triangulo: ");
      lb = leaValidaLado("Ingrese segundo lado del triangulo: ");
      lc = leaValidaLado("Ingrese tercer lado del triangulo: ");
      escierto = comparaLados(la,lb,lc);
      escribeResultado(escierto);
      
//Finalizar Ciclico      
      
      notermino = consultaDecision();
    } 
    System.out.println("Hasta pronto!!");
  }
  
//Realizar metodos  
  
  //Metodo leaValidaLado
  
  public static int leaValidaLado (String mensaje){
    Scanner teclado = new Scanner(System.in);
    System.out.println(mensaje);
    int lado = teclado.nextInt();
    while (lado < 1){
      System.out.println("Lado no puede ser 0 o negativo");
      System.out.println(mensaje);
      lado = teclado.nextInt();
    }
    return lado;
  }
  
  //Metodo comparaLados
  
  public static boolean comparaLados (int a, int b, int c){
    boolean soniguales = false;
    if (a == b && a == c){
      soniguales = true;
    }
    return soniguales;
  }
  
  //Metodo escribeResultado
  
  public static void escribeResultado(boolean soniguales){
    if (soniguales){
      System.out.println("Triangulo equilatero");
    }
    else{
      System.out.println("Triangulo no equilatero");
    }
  } 
  
  //Metodo consultaDesicion
  
  public static int consultaDecision(){
    Scanner teclado = new Scanner(System.in);
    System.out.println("Finalizar? 1 = NO; otro = SI");
    int decide = teclado.nextInt();
    return decide;
  }
  
}