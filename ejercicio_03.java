//Importar clase a Java

import java.util.*;

//Definir nombre a Algoritmo

public class ejercicio_03{
  public static void main (String args[]){
  
//Llamar libreria scanner
    
    Scanner teclado = new Scanner(System.in);
    
//Explicacion de algoritmo al usuario
    
    System.out.print("Algoritmo que pide al usuario tres variables y las almacena. ");
    System.out.println("Luego de esto, le agrega un 0 si es par o un 1 si es impar.");
    System.out.println(" ");
    
//Pedir numeros al usuario
    
    System.out.println("Ingrese el primer numero:");
    int number1 = teclado.nextInt();
    System.out.println("Ingrese el segundo numero:");
    int number2 = teclado.nextInt();
    System.out.println("Ingrese el tercer numero:");
    int number3 = teclado.nextInt();
    
//Realizar calculos
    
    int num1 = number1%2;
    int num2 = number2%2;
    int num3 = number3%2;
    
//Entregar datos al usuario
    
    System.out.println(number1+ " " +num1);
    System.out.println(number2+ " " +num2);
    System.out.println(number3+ " " +num3);
  }
}
