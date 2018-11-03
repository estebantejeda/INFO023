//Importar Clases a Java

import java.util.*;

//Definir nombre de Algoritmo

public class ejercicio_31{
  public static void main (String args[]){
    
//Lamar librerias de Clases
    
    Scanner teclado = new Scanner(System.in);
    
//Declarar Variables
    
    int a, b, c;
    double d, e;
    double x_1, x_2;
    
//Explicacion de argoritmo al usuario
    
    System.out.print("Algoritmo que determina las raices de cualquier ecuacion de segundo grado que tenga la estructura");
    System.out.println(" 'Ax2 + Bx + C = 0'. Por ende el usuario debera ingresar las variables 'A', 'B' y 'C'.");
    
//Pedir datos al usuario utilizando metodos
    
    a = pedirDatos("'A' (de la forma 'Ax2'):");
    b = pedirDatos("'B' (de la forma 'Bx'):");
    c = pedirDatos("'C':");
    
    
//Calcular Discriminante
    
    d = b*b - (4*a*c);
    
//Realizar los calculos
    
    if (a != 0){
      
      //Soluciones reales y Distintas
      
      if (d > 0){
        x_1 = (-b + Math.sqrt(d))/(2*a);
        x_2 = (-b - Math.sqrt(d))/(2*a);
        System.out.println("x1 = " +x_1);
        System.out.println("x2 = " +x_2);
      }
      else if (d < 0){
        
        //Soluciones Imaginarias
        
        e = Math.sqrt(-d)/2*a;
        x_1 = -b/2*a;
        x_2 = -b/2*a;
        System.out.println("x1= "+x_1+ " + " +e+ "i");
        System.out.println("x2= "+x_2+ " - " +e+ "i");
      }
      else{
        
        //Soluciones Iguales
        
        x_1 = -b/2*a;
        System.out.println("x = " +x_1);
      }
    }
    
    //Cuando 'A' es '0'
    
    else{
      if (b == 0){
        x_1 = -c;
        System.out.println("x = " +x_1);          
      }
      else{
        x_1 = -c/b;
        System.out.println("x = " +x_1);
      }
    }
    
  }
  
//Realizar metodos
  
  //Metodo pedirDatos
  
  public static int pedirDatos(String text){
    int var;
    Scanner teclado = new Scanner(System.in);
    System.out.println("\nIngrese la variable " +text);
    var = teclado.nextInt();
    return var;
  }
  
}