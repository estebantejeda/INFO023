//Importar Clases en Java
    
import java.util.*;

//Definir nombre del Algoritmo

public class prueba_03{
  public static void main (String args[]){

//Declarar Variables

    int x, y, z;
    String v, w;
    boolean ciclico = true;
    
//Iniciar Ciclico
    
    while (ciclico){
    
//Explicacion de Algoritmo al Usuario
    
      System.out.println("Algoritmo que genera un cuadrado similar al de una tablero de ajedrez:");

//Pedir datos al Usuario utilizando metodos
    
    //Pedir filas, columnas y lado del cuadrado
    
      x = leeDimension("\nNumero de filas del tablero", 1, 10);
      y = leeDimension("\nNumero de columnas del tablero", 1, 10);
      z = leeDimension("\nLado del cuadrado", 2, 6);
    
    //Pedir caracteres para el relleno del cuadrado
    
      v = leeRelleno("Primer cuadrado");
      w = leeRelleno("Segundo cuadrado");
    
//Realizar el tablero
      
      tablero(x, y, v, w, z); 
      
//Activar Ciclico
      
      repiteProceso(ciclico);
    }
    
  }    
  
//Realizar Metodos
  
  //Metodo leeDimension
    
    public static int leeDimension(String text, int min, int max){
      Scanner teclado = new Scanner(System.in);
      System.out.println(text);
      int resul = teclado.nextInt();
      while (resul < min || resul > max){
        System.out.println("Error!!, el numero ingresado debe encontrarse entre " +min+ " y " +max);
        System.out.println(text);
        resul = teclado.nextInt();
      }
      return resul;
    }
    
  //Metodo leeRelleno
    
    public static String leeRelleno(String text){
      Scanner teclado = new Scanner(System.in);
      System.out.println("Caracter de relleno de " +text);
      String caract = teclado.nextLine();
      return caract;
    }
    
  //Metodo tablero

    public static void tablero(int fil, int col, String carct1, String caract2, int lar){
      int c = 0;
      int d = 0;
      while (c < fil){
        while (d < col){
          if (c == 0 || d == 0 || d == col - 1 || c == fil - 1){
            System.out.print("* ");
          }
          else{
            System.out.print("  ");
          }
          d++;
        }
        System.out.println("");
        d = 0;
        c++;
      }
    }
    
  //Metodo dibujaLinea
    
    public static void dibujaLinea(int lar, String caract){     
    }
    
  //Metodo repiteProceso
    
    public static boolean repiteProceso(boolean ciclico){
      Scanner teclado = new Scanner(System.in);
      System.out.println("Finalizar? [1 = SI | Otro = NO]");
      int fin = teclado.nextInt();
      if (fin == 1){
        ciclico = false;
      }
      return ciclico;
    }
    
}