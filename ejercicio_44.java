//Importar Clases en Java
    
import java.util.*;

//Definir nombre del Algoritmo

public class ejercicio_44{
  public static void main(String args[]){
    
//Declarar Variables
    
    int A[] = new int[10];
    
//Definir Variables
    
    int mult = 2;
    
//Realizar Calculos
    
    System.out.println("\ni - N\n");
    for (int i = 0; i < 10; i++){
      A[i] = mult;
      System.out.println(i + " - " + A[i]);
      mult = mult+2;
    }
    
  }
}