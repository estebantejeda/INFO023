//Importar Clases en Java
    
import java.util.*;

//Definir nombre del Algoritmo

public class ejercicio_28{
  public static void main (String args[]){
    
//Llamar librerias de Clases  
    
    Scanner teclado = new Scanner(System.in);

//Declarar Variables

    int S;
    int valor;
    int fallidos = 0;
    boolean sigue = true;

//Explicacion de Algoritmo al Usuario
    
    System.out.println("Algoritmo que genera un numero entre el 1 y el 100 para que el usuario adivine cual numero tiene el programa");

//Realizar calculos utilizando metodos
    
    S = secreto();
    fallidos = 0;
    valor = intento(S);    
    while (valor != 0){
      fallidos++;
      mensajeUsuario(valor,S,fallidos);
      valor = intento(S);
    }
    
//Entregar datos al usuario    
    
    mensajeUsuario(valor, S, fallidos);
    System.out.println("Finalizar? 1 = Si; otro = no: ");
    int fin = teclado.nextInt();
    if (fin == 1){
      sigue = false;
    }
  }
  
  
//Realizar Metodos
  
  //Metodo secreto
  
  public static int secreto(){
    Random azar = new Random();
    return azar.nextInt(101);
  }
 
  //Metodo intento
  
  public static int intento(int sec){
    Scanner teclado = new Scanner(System.in);
    System.out.println("Ingresa tu numero secreto: ");
    int minum = teclado.nextInt();
    int val = 0;
    int valor;
    if (minum == sec){
    valor = 0;
    }
    else if (minum > sec){
      val = 1;
    }
    else{
      val = - 1;
    }
    return val;
  }
  
  //Metodo mensajeUsuario
  
  public static void mensajeUsuario(int val, int sec, int falla){
    if (val == 0){
      System.out.println("Felicitaciones!!!!, Mi numero secreto era" +sec);
      System.out.println("Y lo lograste despues de " +falla+ " intentos fallidos");
    }
    else if(val == 1){
      System.out.println("Tu numero es mayor que el numero secreto!! deber reducirlo");
    }
    else{
      System.out.println("Tu numero es menor que el numero secreto!! debes aumentarlo");
    }
  }
  
}