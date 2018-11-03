//Importar Clases en Java

import java.util.*;

//Definir nombre del Algoritmo

public class ejercicio_33{
 public static void main (String args[]){

//Lamar libreria de Clases

  Scanner teclado = new Scanner(System.in);

//Declarar Variables

  int x;

//Explicacion de algoritmo al usuario

  System.out.print("Algoritmo que pide al usuario el ingreso de un numero positivo mayor que 2");
  System.out.println("para formar un cuadrado relleno con asteriscos");

//Pedir datos al usuario

  System.out.println("\nIngrese el tamaño del cuadrado");
  x = teclado.nextInt();

//Validar datos del usuario

  while (x < 2){
   System.out.println("Error!!, el numero ingresado debe ser mayor que 2");
   System.out.println("\nIngrese el tamaño del cuadrado");
   x = teclado.nextInt();
  }

//Realizar el Cuadrado de lado definido por el usuario

  System.out.println("");
  for (int i= 0; i < x; i++){
   for (int j = 1; j < x; j++){
    System.out.print(" * ");
   }
   System.out.println(" * ");
  }
  
 }
}