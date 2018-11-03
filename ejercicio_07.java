//Importar Clases en Java
    
import java.util.*;

//Definir nombre del Algoritmo

public class ejercicio_07{
  public static void main (String args[]){
    
//Definir Variables
    
    int a = 6;
    int b = 8;
    int c = 10;
    double pi = 3.14;
      
//Realizar calculos
    
    int P = a + b + c;
    int A = (b*a)/2;
    double Ac = pi*(c*c);    
    
//Explicacion de Algoritmo al Usuario
    
    System.out.println("Area: " +A);
    System.out.println("Perimetro: " +P);
    System.out.println("Area de Circunferencia: " +Ac);
  
  }
}
