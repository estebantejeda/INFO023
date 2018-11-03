//Importar Clases en Java
    
import java.util.*;

//Definir nombre del Algoritmo

public class prueba_08{
  public static void main (String args[]) {
    
//Llamar librerias de Clases  
    
    Scanner teclado = new Scanner(System.in);
    
//Declarar Variables

    long num;    
    
//Pedir datos al usuario
    
    System.out.println("Ingrese un entero no negativo:");
    num = teclado.nextInt();
    extraeCeros(num);
    
  }
  
//Realizar Metodos
  
  //Metodo extraeCeros(num)
  
  public static void extraeCeros(long num){
    int contador = 0;
    if (num%10 == 0){
      System.out.println(num);
    }
    else{
      System.out.println(num);
      extraeCeros(num/10);
    }
  }
  
}