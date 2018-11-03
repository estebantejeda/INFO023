//Importar Clases en Java
    
import java.util.*;

//Definir nombre del Algoritmo

public class pancho_trolazo{
  public static void main (String args[]){
    
//Llamar librerias de Clases  
    
    Scanner teclado = new Scanner(System.in);

//Declarar Variables

    int x;
    int y;
    int z;
    String a;
    
//Explicacion de Algoritmo al Usuario
    
    System.out.println("Algoritmo que determina cuantos penes se puede comer Pancho");
    System.out.println(" ");      
    
//Pedir Datos al Usuario #1
    
    System.out.print("De que tamaño quieres que se la coma Pancho?");
    System.out.println(" [Grande/Mediano/Chico]:");
    System.out.println ("\n* 1 = Grande\n* 2 = Mediano\n* 3 = Chico\n");
    System.out.print("Tamaño:");
    x = teclado.nextInt();
    
//Validar Datos del Usuario
    
    while (x < 1 || x > 3){
      System.out.println("\nError!, ese tamaño de pene no esta definido para Pancho");
      System.out.print("De que tamaño quieres que se la coma Pancho?");
      System.out.println(" [Grande/Mediano/Chico]:");
      System.out.println ("\n* 1 = Grande\n* 2 = Mediano\n* 3 = Chico\n");
      System.out.print("Tamaño:");
      x = teclado.nextInt();      
    }

//Definir Variables
    
    if (x == 1){
      a = ("8====================D");
    }
    else if (x == 2){
      a = ("8===============D");
    }
    else{
      a = ("8==========D");
    }

//Pedir Datos al usuario #2
    
    System.out.println("\nCuantos penes quieres que se coma Pancho?:");
    System.out.print("Cantidad: ");
    y = teclado.nextInt();
    
//Validar Datos del Usuario #2
    
    while (y < 0){
      System.out.println("\nPancho no puede comer penes negativos");
      System.out.println("Cuantos penes quieres que se coma Pancho?:");
      y = teclado.nextInt();        
    }

//Definir Variables #2
    
    z = y;
    
//Imprimir datos al usuario
    
    System.out.println(" ");
    while (y != 0){
      System.out.println(a);
      y = y - 1;
    }
    
//Ver si Pancho quedo con hambre o si necesita mas

    if (z <= 7){
      System.out.println("\nPancho quedo con hambre, parece que quiere mas.");
    }
    else if (z >= 8 && z <= 12 ){
      System.out.println("\nLa Boca de pancho no puede mas, Acabas de dejar a Pancho satisfecho.");
    }
    else{
      System.out.println("\nLa Boca de Pancho no pudo mas, asi que tuvo que saciar su hambre sentandose en ellos.");
      System.out.println("Acabas de dejar a Pancho satisfecho.");      
    }

//Finalizar
    
    System.out.println("\nPero que Trolazo Pancho!!!");
    
  } 
}