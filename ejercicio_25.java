//Importar Clases en Java
     
import java.util.*;
 
//Definir nombre del Algoritmo
 
public class ejercicio_25{
  public static void main (String args[]){
      
//Explicacion de Algoritmo al Usuario
     
    System.out.println("Algoritmo que despliega de forma alternada signos");
    System.out.println(" ");
  
//Realizar calculos
    
    for (int linea = 0; linea < 5; linea ++){
      asteriscos(10);
      gatoraya(10);        
    }
  }
  
//Realizar Metodos 
  
  //Metodo Asterisco
  
  public static void asteriscos (int ancho){
    for (int col = 0; col < ancho; col++ ){
      if (col == ancho - 1){
        System.out.println("*");
      }
      else{
        System.out.print("* ");
      }
    }
  }
  
  //Metodo GatoRaya
  
  public static void gatoraya (int ancho){
    for (int col = 0; col < ancho/2; col++){
      if (col == ancho/2 - 1){
        System.out.println("# -");
      }
      else{
      System.out.print("# - ");
      }
    }
  }
  
}