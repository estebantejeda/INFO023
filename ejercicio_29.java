//Importar Clases en Java
    
import java.util.*;

//Definir nombre del Algoritmo

public class ejercicio_29{
  public static void main (String args[]){
    
//Llamar librerias de Clases  
    
    Scanner teclado = new Scanner(System.in);
    Random aleat = new Random();

//Declarar Variables

    int N;
    int R;

//Explicacion de Algoritmo al Usuario
    
    System.out.println("Algoritmo que le entrega al usuario dos numeros los cuales se deben multiplicar. El usuario debe entregar el resultado");

//Generar numeros a traves de metodos
    
    N = numerito();
    
//Pedir al usuario la respuesta a traves de metodos
    
    R = consulta(N);
   
//Evaluar respuesta de estudiante
    
    evalua(R,N);   
  
  }   
    
//Realizar Metodos
  
  //Metodo numerito
    
    public static int numerito(){
      Random aleat = new Random();
      int num = aleat.nextInt(19)+2;
      return num;
    }
    
 //Metodo consulta
    
    public static int consulta(int num){
      Scanner teclado = new Scanner(System.in);
      System.out.println("¿Cuanto es 7 X "+num+ " ?");
      int resp = teclado.nextInt();
      return resp;
    }
    
 //Metodo evalua
    
    public static void evalua (int a, int b){
      if (7*b == a){
        System.out.println("La respuesta es correcta!!, Excelente!!");
      }
      else{
        System.out.println("A estudiar de nuevo");
      }
    }
}