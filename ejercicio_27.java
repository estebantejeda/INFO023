//Importar Clases en Java
    
import java.util.*;

//Definir nombre del Algoritmo

public class ejercicio_27{
  public static void main (String args[]){
    
//Llamar librerias de Clases  
    
    Scanner teclado = new Scanner(System.in);

//Declarar Variables

    int x;
    int a;
    int b;
    int c;
    
//Definir Variables

//Explicacion de Algoritmo al Usuario
    
    System.out.print("Algoritmo que pide al usuario el ingreso de un numero, imprime el digito mayor y");
    System.out.println(" el menor para luego sumarlo.");

//Pedir datos al Usuario
    
    System.out.println("\nIngrese un numero: ");
    x = teclado.nextInt();
    
//Realizar calculos con metodos
    
    a = nmayor(x);
    b = nmenor(x);
    c = sumador(a,b);
    
//Entregar datos al usuario
    
    System.out.println("El numero mayor es: " +a);
    System.out.println("El numero menor es: " +b);
    System.out.println("La suma de ambos numeros es: " +c);
      
  }
  
//Realizar Metodos
  
  //Metodo nmayor
  
  public static int nmayor (int num){
    int mayor = 0;
    while(num > 0){
      if (num%10 > mayor){
        mayor = num%10;
      }
      num = num/10;
    }
    return mayor;
  }
 
  //Metodo nmenor
  
  public static int nmenor (int num){
    int menor = 9;
    while(num > 0){
      if (num%10 < menor){
        menor = num%10;
      }
      num = num/10;
    }
    return menor;
  }
  
  //Metodo sumador
  
  public static int sumador (int mayor, int menor){
    return mayor+menor;
  }
  
}