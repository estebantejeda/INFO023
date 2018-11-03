//Importar Clases en Java
    
import java.util.*;

//Definir nombre del Algoritmo

public class ejercicio_35{
  public static void main (String args[]){
    
//Llamar librerias de Clases  
    
    Scanner teclado = new Scanner(System.in);

//Declarar Variables

    String x;

//Definir Variables

//Pedir datos al Usuario
    
    System.out.println("Ingrese palabra 'fin':"); 
    x = teclado.nextLine();

//Validar datos del usuario
    
    while(!x.equals("fin")){
      System.out.println("Ingrese palabra 'fin':");
      x = teclado.nextLine();
  }
    
//Imprimir datos al usuario    
    
    System.out.println("Ingreso \"fin\"");
    
  }
}