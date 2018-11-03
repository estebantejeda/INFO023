//Importar Clases en Java
    
import java.util.*;

//Definir nombre del Algoritmo

public class desafio_09{
  public static void main (String args[]){
    
//Declarar Variables

    int x;
    double a;

//Explicacion de Algoritmo al Usuario
    
    System.out.print("Algoritmo que pide al usuario el ingreso de las vertices de un poligono y ");
    System.out.println("sus puntos para luego calcular su perimetro");
    
//Realizar los calculos via metodos
    
    x = validaNumeroVertices();
    a = poligono(x);
    
//Imprimir datos al usuario
    
    System.out.println("\El perimetro de la figura ingresada es: " +a);
    
  }    
      
//Realizar Metodos
  
  //Metodo validaNumeroVertices
    
    public static int validaNumeroVertices(){
      Scanner teclado = new Scanner(System.in);
      int v;
      do{
        System.out.println("\nIngrese la cantidad de vertices que tenga el poligono (Debe ser mayor o igual que 3):");
        v = teclado.nextInt();
      }while (v < 3);
      return v;
    }
    
  //Metodo poligono
    
    
    
}