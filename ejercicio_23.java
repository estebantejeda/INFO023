//Importar Clases en Java
    
import java.util.*;

//Definir nombre del Algoritmo

public class ejercicio_23{
  public static void main (String args[]){
    
//Llamar librerias de Clases  
    
    Scanner teclado = new Scanner(System.in);

//Declarar Variables

    int x;
    int y;

//Definir Variables

//Explicacion de Algoritmo al Usuario
    
    System.out.println("Algoritmo que pide al usuario 2 numeros y hace una secuencia numerica descendete o ascendente segun corresponda");

//Pedir datos al Usuario
    
    System.out.println("\nIngrese el primer numero");
    x = teclado.nextInt();
    System.out.println("Ingrese el segundo numero");
    y = teclado.nextInt();    

//Realizar calculos
    
    if (x > y){
      getDescendingSequence(x, y);
    }
    else if (x < y){
      getAscendingSequence(y, x);
    }
    else{
      System.out.println("Son Iguales");
    }
    
  }
  
//Realizar los metodos
    
  //Metodo numerico descendiente 'getDescendingSequence'
  
  public static void getDescendingSequence(int mayor, int menor){
    for (int contador = mayor; contador >= menor; contador--){
      if (contador == menor){
        System.out.println(contador);
      }
      else{
        System.out.print(contador + " - ");
      }
    }
  }
  
  //Metodo numerico ascendiente 'getAscendingSequence'
  
  public static void getAscendingSequence(int menor, int mayor){
    for (int contador = menor; contador <= mayor; contador++){
      if (contador == mayor){
        System.out.println(contador);
      }
      else{
        System.out.print(contador + " - ");
      }
    }
  }
  
}