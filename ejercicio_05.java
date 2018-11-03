//Importar Clases a libreria

import java.util.*;

//Designar nombre a algoritmo

public class ejercicio_05{
  public static void main (String args[]){
    
//Llamar a clase Scanner
    
  Scanner teclado = new Scanner(System.in);
  
//Definir Variables
  
  int resul = 0;

//Breve explicacion al usuario de Algoritmo
  
  System.out.println("Algoritmo que le pide al usuario el ingreso de un numero");
  System.out.println("y luego multiplica los 5 numeros consecutivos");
  System.out.println(" ");
    
//Pedir datos al usuario
  
  System.out.println("Ingrese el primer numero");
  int number = teclado.nextInt();
  
//Realizar calculos
  
  resul = number*(number+1)*(number+2)*(number+3)*(number+4);
  
//Entregar datos al usuario
  
  System.out.println(+resul);
 
  }
}
