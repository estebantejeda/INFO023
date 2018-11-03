//Importar Clases en Java
    
import java.util.*;

//Definir nombre del Algoritmo

public class ejercicio_45{
  public static void main (String args[]){
    
//Definir Variables

    int filas = validaNumero("Ingres el numero de filas");
    int col = validaNumero("Ingres el numero de columnas");
    int Azar[][] = crearArregloAzar(filas, col);
    imprimeArreglo(Azar);
  }
  
//Realizar Metodos
  
  //Metodo validaNumero
  
  public static int validaNumero(String text){
    Scanner teclado = new Scanner(System.in);
    System.out.println(text);
    int x = teclado.nextInt();
    while (x <= 0){
      System.out.println("Error!, el numero ingresado no puede ser negativo");
      System.out.println(text);
      x = teclado.nextInt();
    }
    return x;
  }
  
  //Metodo crearArregloAzar
  
  public static int[][] crearArregloAzar(int x, int y){
    Random aleat = new Random();
    int arr[][] = new int [x][y];
    for (int i = 0; i < x; i++){
      for (int j = 0; j < y; j++){
        arr[i][j] = aleat.nextInt(10);
      }
    }
    return arr;
  }

  //Metodo imprimeArreglo
  
  public static void imprimeArreglo(int arr[][]){
    int x = arr.length;
    int y = arr[0].length;
    for (int i = 0; i < x; i++){
      for (int j = 0; j < y - 1; j++){
        System.out.print(arr[i][j] + " ");
      }
      System.out.println(arr[i][y-1]);
    }
  }
}