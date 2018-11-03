//Importar Clases en Java
    
import java.util.*;

//Definir nombre del Algoritmo

public class desafio_05{
  public static void main (String args[]){
    
//Llamar librerias de Clases  
    
    Random aleat = new Random();

//Declarar Variables

    int x_1;
    int y_1;
    int x_2;
    int y_2;
    int x_3;
    int y_3;
    float p_AB;
    float p_BC;
    float p_CA;
    
//Explicacion de Algoritmo al Usuario
    
    System.out.println("Algoritmo que crea tres puntos de manera aleatoria entre 1 a 5 y compruba si son colineales o no");
    
//Definir Variables (Generar puntos de manera aleatoria)
    
    x_1 = aleat.nextInt(6);
    y_1 = aleat.nextInt(6);
    x_2 = aleat.nextInt(6);
    
    //Validar que x_1 no sea igual a x_2
    
    while (x_1 == x_2){
      x_2 = aleat.nextInt(6);
    }    
    y_2 = aleat.nextInt(6);
    x_3 = aleat.nextInt(6);
    
    //Validar que x_2 no sea igual a x_3
    
    while (x_2 == x_3 || x_3 == x_1){
      x_3 = aleat.nextInt(6);
    }        
    y_3 = aleat.nextInt(6);
    
//Imprimir en pantalla las coordenadas de los puntos
    
    System.out.println("\nPuntos A, B y C:");
    System.out.print("\nA: ");
    System.out.println("("+x_1+","+y_1+")");
    System.out.print("B: ");
    System.out.println("("+x_2+","+y_2+")");      
    System.out.print("C: ");
    System.out.println("("+x_3+","+y_3+")");

//Realizar calculos de pendiente
    
    p_AB = (y_2 - y_1)/(x_2 - x_1);
    p_BC = (y_3 - y_2)/(x_3 - x_2);
    p_CA = (y_3 - y_1)/(x_3 - x_1);
    
//Imprimir en pantalla las pendientes
    
    System.out.println("\nPendientes:");
    System.out.print("\nAB: ");
    System.out.println(+p_AB);
    System.out.print("BC: ");
    System.out.println(+p_BC);     
    System.out.print("CA: ");
    System.out.println(+p_CA);

//Ver si las pendientes son iguales para comprobar que los puntos sean colineales
    
    if (p_AB == p_BC && p_BC == p_CA && p_CA == p_AB){
      System.out.println("\nLos puntos son colineales");
    }
    else{
      System.out.println("\nLos puntos no son colineales");
    }
    
  } 
}