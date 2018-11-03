//Importar Clases en Java

import java.util.*;

//Definir nombre del Algoritmo

public class ejercicio_22{
  public static void main (String args[]){
    
//Llamar librerias de Clases  
    
    Scanner teclado = new Scanner(System.in);
    
//Declarar Variables
    
    int x;
    
//Definir Variables
    
//Explicacion de Algoritmo al Usuario
    
    System.out.println("Algoritmo que pide un numero al usuario y entrega su mes correspondiente");
    
//Pedir y Validar datos al Usuario
    
    do{
      System.out.println("Ingrese el numero (Entre '1' y '12'):");
      x = teclado.nextInt();
    }while (x < 1 || x > 12);

//Iniciar el Switch
    
    switch(x){
      case 1:
        System.out.println("Enero");
        break;
      case 2:
        System.out.println("Febrero");
        break;
      case 3:
        System.out.println("Marzo");
        break;
      case 4:
        System.out.println("Abril");
        break;
      case 5:
        System.out.println("Mayo");
        break;
      case 6:
        System.out.println("Junio");
        break;        
      case 7:
        System.out.println("Julio");
        break;
      case 8:
        System.out.println("Agosto");
        break;
      case 9:
        System.out.println("Sedtiembre");
        break;
      case 10:
        System.out.println("Octubre");
        break;
      case 11:
        System.out.println("Noviembre");
        break;
      case 12:
        System.out.println("Diciembre");
        break;
      default:
        break;
    }
    
  } 
}