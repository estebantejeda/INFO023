//Importar Clases en Java
    
import java.util.*;

//Definir nombre del Algoritmo

public class ejercicio_15{
  public static void main (String args[]){
    
//Llamar librerias de Clases  
    
    Scanner teclado = new Scanner(System.in);
    Random aleat = new Random();    

//Explicacion al usuario de algorimo
    
    System.out.println("Algoritmo que crea 10 notas de manera aleatoria entre 1 y 7 para luego promediarlos:");
    
//Declarar y Definir Variables
 
    int a = aleat.nextInt(80)+10;
    int b = aleat.nextInt(80)+10;
    int c = aleat.nextInt(80)+10;
    int d = aleat.nextInt(80)+10;
    int e = aleat.nextInt(80)+10;
    int f = aleat.nextInt(80)+10;
    int g = aleat.nextInt(80)+10;
    int h = aleat.nextInt(80)+10;
    int i = aleat.nextInt(80)+10;
    int j = aleat.nextInt(80)+10;
    int x = 10;
    double y;      
      
//Realizar calculos
    
    y = (a + b + c + d + e + f + g + h + i + j)/10;
    y = y/10;
    
//Imprimir datos al usuario
    
    System.out.println("\nEl promedio de notas es: "+y);
          
  } 
}