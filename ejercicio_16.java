//Importar Clases en Java
    
import java.util.*;

//Definir nombre del Algoritmo

public class ejercicio_16{
  public static void main (String args[]){
    
//Llamar librerias de Clases  
    
    Scanner teclado = new Scanner(System.in);
    Random aleat = new Random();

//Declarar Variables
    
    int a;
    int b;
    int x;

//Definir Variables
    
    a = aleat.nextInt(11)+1;
    b = 1;

//Explicacion de Algoritmo al Usuario
    
    System.out.println("Algoritmo que genera un numero aleatorio entre el 1 y el 10, para que luego es usuario intente");
    System.out.println("adivinar el numero que se genero");
    
//Pedir datos al usuario
    
    System.out.println("\n¿Que número tengo?");
    x = teclado.nextInt();
    
//Validar los datos del usuario
    
    while (x != a){
      System.out.println("\nNo era el numero que estaba pensando, intentalo nuevamente");
      System.out.println("¿Que número tengo?");
      x = teclado.nextInt();
      b = b + 1;
    }
    
//Imprimir al usuario que gano
    
    System.out.println("\nHaz Ganado!!");
    System.out.println("Numero de intentos: "+b);

  } 
}