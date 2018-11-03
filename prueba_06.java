//Importar Clases

import java.util.*;

//Definir nombre del algoritmo

public class prueba_06{
  public static void main(String args[]){

//Declarar Variables
    
    int x, y;
    String nom;
    
//Definir Variables
    
    nom = "trans.txt";
    
//Generar numeros aleatorios para fila y columna
    
    x = generaNumero();
    y = generaNumero();
    int A[][] = creaArregloEnteros(x, y);
    int B[][] = trasponeArreglo(A[][]);
    escribeArregloTraspuesto(B[][], String nom);
    
  }
  
//Realizar Metodos
  
  //Metodo generaNumero
  
  public static int generaNumero(){
    Random aleat = new Random();
    int num = aleat.nextInt(5)+1;
    return num;
  }
  
  //Metodo creaArregloEnteros
  
  public static int[][] creaArregloEnteros(int f, int c){
    Random aleat = new Random();
    System.out.println("Arreglo al azar Original:");
    int Arreglo[][] = new int [f][c];
    for (int i = 0; i < f; i++){
      for (int j = 0; j < c; j++){
        Arreglo[i][j] = aleat.nextInt(40)+10;
        System.out.print(Arreglo[i][j]);
        System.out.print(" ");
      }
      System.out.println();
    }
    return Arreglo;
  }
 
  //Metodo trasponeArreglo
  
  public static int[][] trasponeArreglo(A[][]){
  System.out.println("Arreglo al azar Traspuesto:");
  }
  
  //Metodo escribeArregloTraspuesto
  
  public static void escribeArregloTraspuesto(int[][], String nom){
    
  }
  
}