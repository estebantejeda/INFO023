//Importar Clases en Java

import java.util.*;

//Definir nombre a algoritmo

public class ejercicio_04{
  public static void main (String args[]){
  
//Llamar libreria Scanner
    
    Scanner teclado = new Scanner(System.in);
    
//Definir Variables
    
    double eur = 773.219;
    double clp = 0;
    
//Explicacion al usuario de algoritmo
      
    System.out.print("Algorimo que convierte Euros en Pesos Chilenos ");
    System.out.println("(EUR to CLP)");
    System.out.println(" ");
    
//Pedir datos al usuario
    
    System.out.println("Ingrese la cantidad de Euros que desea convertir");
    int number = teclado.nextInt();
      
//Realizar Calculo
    
    clp = number*eur;
      
//Entregar variable al usuario
      
    System.out.println("Los " +number+ " euros equivalen a: " +clp+ " Pesos Chilenos");
   
  }  
}
