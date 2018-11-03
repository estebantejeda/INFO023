//Importar Clases a Java

import java.util.*;

//Definir nombre de algoritmo

public class ejercicio_48{
  public static void main(String args[]){
    
//Llamar libreria de Clases
    
    Scanner teclado = new Scanner(System.in);
    
//Pedir datos al Usuario
    
    System.out.println("Ingrese su numero de partida: ");
    long A = teclado.nextInt();
    long C[] = new long[10];
    
//Realizar calculos
    
    cuadradosEnteros(C, A);
    
//Entregar solucion al usuario
    
    imprime(C);
    
  }
  
//Realizar Metodos
  
  //Metodo cuadradosEnteros
  
  public static void cuadradosEnteros(long c[], long a){
    for (int i = 0; i < 10; i++){
      c[i] = (long)Math.pow(a + i,2);
    }
  }
  
  //Metodo imprime
  
  public static void imprime(long c[]){
    for (int i = 0; i < 10; i++){
    System.out.println(c[i]);
    }
  }
  
}