//Importar Clases en Java
    
import java.util.*;

//Definir nombre del Algoritmo

public class tarea_01{
  public static void main (String args[]){
    
//Declarar Variables

    String y;
    int x, z;
    boolean ciclico;
    
//Definir Variables
    
    ciclico = true;

//Explicacion de Algoritmo al Usuario
    
    System.out.println("Algoritmo que realiza el conocido 'Metodo de Cifrado Cesar'.");
    System.out.print("\nEl metodo consiste en que el usuario escribe una frase para que luego el algoritmo");
    System.out.println(" desplace hacia la derecha o la izquiera del alfabeto la cantidad de numeros que el desee.");
    
//Desplegar Instrucciones
    
    System.out.println("\nInstrucciones:");
    System.out.println("1) El texto a Codificar/Decodificar debera ser siempre en mayuscula.");
    System.out.println("2) El texto a Codificar/Decodificar no debe incluir la letra 'ñ'.");
    System.out.println("3) El texto a Codificar/Decodificar no debera tener signos. En caso de que sean ingresados, estos no seran alterados.");
    System.out.println("4) Los desplazamientos del texto siempre deberan ser positivos.");

//Activar Ciclico
    
    while(ciclico){
    
//Desplegar menu de opciones al usuario
    
      System.out.println("\n¿Que desea hacer?");
      System.out.println("\n1) Cifrar Codigo");
      System.out.println("2) Descifrar Codigo");
    
//Pedir opcion al usuario
    
      x = ingresaValidaOpcion("\nOpcion [1,2]: ");
    
//Entregar la opcion al usuario
    
      switch (x){
        case 1:
          y = pedirFrase("\nIngrese el texto que desee Cifrar:");
          z = pedirDesplazamiento("\nIngrese la cantidad de unidades en la que desea mover su frase [> 0]:");
          cifrarCesar(y, z);
          break;
        case 2:
          y = pedirFrase("\nIngrese el texto que desee Descifrar:");
          z = pedirDesplazamiento("\nIngrese la cantidad de unidades en la que desea mover su frase [> 0]:");
          descifrarCesar(y, z);
          break;
        default:
          break;
      }

//Realizar Ciclico
    
      ciclico = repetirProceso(ciclico);      
    }
    
  }

//Realizar metodos
    
  //Metodo ingresaValidaOpcion
  
  public static int ingresaValidaOpcion(String text){
    Scanner teclado = new Scanner(System.in); 
    System.out.println(text);
    int opcion = teclado.nextInt();
    while (opcion > 2 || opcion < 1){
      System.out.println("Error!, la opcion ingresada no existe. Vuelva a intentarlo.");
      System.out.print(text);
      opcion = teclado.nextInt();
    }
    return opcion;
  }
  
  //Metodo pedirFrase
  
  public static String pedirFrase(String text){
    Scanner teclado = new Scanner(System.in);
    System.out.println(text);
    String frase = teclado.nextLine();
    int mayus = validaMayuscula(frase);
    while (frase.equals("") || mayus >= 1){
      System.out.println("Error!, recuerde leer las instrucciones para no tener errores al codificar.");
      System.out.println(text);
      frase = teclado.nextLine();
      mayus = validaMayuscula(frase);
    }
    return frase;
  }
  
  //Metodo validaMayuscula
  
  public static int validaMayuscula(String frase){
    String minus = "abcdefghijklmnopqrstuvwxyz";
    int contador = 0;
    for (int i = 0; i < frase.length(); i++){
      if (minus.indexOf(frase.charAt(i)) != -1){
        contador++;
      }
    }
    return contador;
  }  
  
  //Metodo pedirDesplazamiento
  
  public static int pedirDesplazamiento(String text){
    Scanner teclado = new Scanner(System.in);
    System.out.println(text);
    int desplazamiento = teclado.nextInt();
    while (desplazamiento < 0){
      System.out.println("Error!, el movimiento solo puede ser positivo.");
      System.out.println(text);
      desplazamiento = teclado.nextInt();
    }
    return desplazamiento;
  }
  
  //Metodo cifrarCesar
  
  public static void cifrarCesar(String frase, int desplazamiento){
    int letra;
    int aux;
    System.out.println("\nFrase Ingresada: " +frase);
    System.out.print("Frase Cifrada: ");
    for(int i = 0; i < frase.length(); i++){
      letra = frase.charAt(i) + desplazamiento;
      if(frase.charAt(i) < 65 || frase.charAt(i) > 90){
      letra = frase.charAt(i);
      }
      while (letra > 90){
        aux =  letra%90;
        letra = 64 + aux;
      }
      char letrac = (char)letra;
      System.out.print(letrac);
    }
    System.out.println("");
  }
  
  //Metodo descifrarCesar
  
  public static void descifrarCesar(String frase, int desplazamiento){
    int letra;
    int aux;
    System.out.println("\nFrase Ingresada: " +frase);
    System.out.print("Frase Descifrada: ");
    for(int i = 0; i < frase.length(); i++){
      letra = frase.charAt(i) - desplazamiento;
      while (letra < 65){
        aux =  65%letra;
        letra = 91 - aux;
      }
      if(frase.charAt(i) < 65 || frase.charAt(i) > 90){
      letra = frase.charAt(i);
      }      
      char letrac = (char)letra;
      System.out.print(letrac);
    }
    System.out.println("");      
  }
  
  //Metodo repetirProceso
  
    public static boolean repetirProceso(boolean ciclico){
      Scanner teclado = new Scanner(System.in);
      System.out.println("\nFinalizar? [s/n]");
      String fin = teclado.nextLine();
      while (!(fin.equalsIgnoreCase("s") || fin.equalsIgnoreCase("n"))){
        System.out.println("\nLa opcion ingresada no es correta, vuelva a intentarlo.");
        System.out.println("Finalizar? [s/n]");
        fin = teclado.nextLine();
      }
      if (fin.equalsIgnoreCase("s")){
        ciclico = false;
      }
      return ciclico;
    }
  
}