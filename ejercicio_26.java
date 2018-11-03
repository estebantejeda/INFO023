//Importar Clases en Java
     
import java.util.*;
 
//Definir nombre del Algoritmo
 
public class ejercicio_26{
  public static void main (String args[]){
     
//Llamar librerias de Clases 
     
    Scanner teclado = new Scanner(System.in);
    
//Declarar Variables
 
    int x;
 
//Explicacion de Algoritmo al Usuario
     
    System.out.println("Algoritmo que pide un numero al usuario e invierte los digitos");
 
//Pedir datos al Usuario
     
    System.out.println("Ingrese un numero para invertir");
    x = teclado.nextInt();
    
//Realizar calculos
    
    int y = invierte(x);
      
//Entregar datos al usuario
    
    System.out.println("Su numero original: "+x);
    System.out.println("\nSu numero Invertido "+y);
       
  }
  
//Realizar metodos
  
  //Metodo invierte
   
  public static int invierte (int numero){
    int nuevo = 0;
    while (numero > 0){
      nuevo = nuevo*10 + numero%10;
      numero = numero/10;
    }
    return nuevo;
  }
  
}