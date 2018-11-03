//Importar Clases en Java
    
import java.util.*;
import java.io.*;

//Definir nombre del Algoritmo

public class prueba_07{
  public static void main (String args[]) throws IOException{
    
//Declarar Variables
    
    String A[], B[][];
    String a;
    int x, y;
    
//Definir Variables
    
    a = "Texto.txt";
    
//Explicacion de Algoritmo al usuario
    
    System.out.println("Algoritmo que lee un archivo de texto determinado y desordenado para luego reordenarlo y sumar los numeros que se encuentran");
    System.out.println("de manera horizontal, desplazando los resultados a un nuevo archivo");
    
//Contar la cantidad de lineas del archivo
    
    x = leeNumeroLineas(a);
    A = leeArchivo(a, x);
    y = leeLineaMasNumeros(A);
    B = leeNumeros(A, y);
    imprimeNumero(B);
    escribeSuma(B, a);
    
  }
  
//Realizar Metodos
  
  //Metodo leeNumeroLineas
  
  public static int leeNumeroLineas(String archivo) throws IOException{
    int contador = 0;
    try{
      File documento = new File(txt);
      Scanner entrada = new Scanner(documento);
      while (entrada.hasNextLine()){
        entrada.nextLine();
        contador++;
      }
      entrada.close();  
    }
    catch (IOException ex){
      System.out.println(ex.getMessage());
    }
    return contador;
  }
  
  //Metodo leeArchivo
  
  public static String[] leeArchivo(String archivo, int linea) throws IOException{
    String Arreglo[] = new String[linea];
    int contador = 0;
    try{
      File documento = new File(archivo);
      Scanner entrada = new Scanner(documento);
      while(entrada.hasNextLine()){
        String lineas = entrada.nextLine();
        System.out.println(lineas);
        Arreglo[contador] = lineas;
        contador++;
      }
    }
    catch (IOException ex){
      System.out.println(ex.getMessage());
    }
    return Arreglo;
  }
  
  //Metodo leeLineaMasNumeros
  
  public static int leeLineaMasNumeros(String Arreglo[]){
    int cont = 0;
    char espacio = ' ';
    boolean esp = false;
    for (int i = 0; i < Arreglo.length; i++){
      for (int j = 0; j < Arreglo[i].length(); j++){
        if (B[i].charAt != (int)espacio){
          esp = true
        }
        if (esp){
          if(Arreglo[i] == int(espacio)){
            esp = false;
            cont++;
          }
        }
        if ((Arreglo[i].length()-1).charAt != int(espacio)){
          cont++;
        }
      }
    }
  }
  
  //Metodo leeNumero
  
  public static String[][] leeNumero(int Arreglo[], int col){
    
  }
  
  //Metodo imprimeNumeros
  
  public static void imprimeNumeros(int Arreglo[][]){
    
  }
  
  //Metodo escribeSumas
  
  public static 
  
}