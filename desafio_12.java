//Importar Clases en Java
    
import java.util.*;

//Definir nombre del Algoritmo

public class desafio_12{
  public static void main (String args[]){
    
//Llamar librerias de Clases  
    
    Scanner teclado = new Scanner(System.in);

//Declarar Variables

    int a;

//Definir Variables
    
    a = 5;

//Explicacion de Algoritmo al Usuario
    
    System.out.print("Algoritmo que pide al usuario el ingreso de un numero y determina si este es");
    System.out.println("binario, ternario u octal.");
    
//Desplegar menu a traves de metodos        
      
    menu(a);    
      
  }
  
//Realizar Metodos
  
  //Metodo de menu
 
  public static void menu(int resul){
    Scanner teclado = new Scanner(System.in);
    
    //Menu que visualiza el usuario
    
    System.out.println("");
    System.out.println("0 - Ingreso del numero");
    if (resul != 5){
      System.out.println("1 - Validar si es Binario");
      System.out.println("2 - Validar si es Ternario");
      System.out.println("3 - Validar si es Octal");
    }
    System.out.println("4 - Fin");
    
    //Pedir opcion del menu al usuario
    
    System.out.print("\nNumero:");
    resul = teclado.nextInt();
    
    //Validar datos del usuario
    
    while (resul < 0 || resul > 4 ){
      System.out.println("Error!!, el numero ingresado no esta en la lista");
      System.out.print("\nNumero:");
      resul = teclado.nextInt();
    }
    
    //Menu interno con Switch                         
    
    switch(resul){
      case 0:
        System.out.println("Ingrese el numero que desea comprobar");
        int num = teclado.nextInt();
        while (num < 0){
          System.out.println("Error!, el numero ingresado debe ser positivo");
          num = teclado.nextInt();
        }
        break;
      case 1:
        break;
      case 2:
        break;
      case 3:
        break;
      case 4:
        break;
      default:
        break;
    }    
  }
  
  //Metodo binario
  
  
  
}