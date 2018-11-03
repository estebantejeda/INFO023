//Importar Clases en Java
    
import java.util.*;

//Definir nombre del Algoritmo

public class prueba_01{
  public static void main (String args[]){
    
//Llamar librerias de Clases  
    
    Scanner teclado = new Scanner(System.in);
    Random aleat = new Random();

//Declarar Variables
    
    int x;
    int a, b, c, d, e;
    int suma;
    int ingresado;
    int a_1, b_1, c_1, d_1, e_1;
    
//Explicacion de Algoritmo al Usuario
    
    System.out.println("Algoritmo que codifica un numero de 5 digitos ingresado por el usuario");

//Pedir datos al usuario

    System.out.println("Ingrese el numero de 5 digitos que desea codificar");
    x = teclado.nextInt();
    
//Validar datos del usuario
    
    while (x > 99999 ||  x < 9999){
      System.out.println("\nError!, el numero ingresado debe tener 5 digitos, intentelo nuevamente");
      System.out.println("Ingrese el numero de 5 digitos que desea codificar");
      x = teclado.nextInt();
    }

//Almacenar numero ingresado antes de ser alterado
    
    ingresado = x;
    
//Realizar calculos para obtener los numeros de manera individual
    
    a = x%10;
    x = x/10;
    b = x%10;
    x = x/10;
    c = x%10;
    x = x/10;
    d = x%10;
    x = x/10;
    e = x%10;
    
//Designar variables de manera temporal

    a_1 = a;
    b_1 = b;
    c_1 = c;
    d_1 = d;
    e_1 = e;

//Ordenar nuevamente el numero
    
    a = e_1;
    b = d_1;
    c = c_1;
    d = b_1;
    e = a_1;   
   
//Realizar suma de los numeros ingresados
    
    suma = a + b + c + d + e;
     
//Verificar si el numero es mayor que 9 o si es menor a 10
    
    //Si la suma de los digitos es mayor que 10, se resta a cada digito el numero 9
    
    if (suma > 10){
      a = a - 9;
      a = a*-1;
      b = b - 9;
      b = b*-1;
      c = c - 9;
      c = c*-1;
      d = d - 9;
      d = d*-1;
      e = e - 9;
      e = e*-1;      
    }
    
    //Si la suma de los digitos es menor que 10, se resta a cada digito la suma de los numeros
    
    else{
      a = a - suma;
      if (a < 0){
        a = a*-1;
      }
      b = b - suma;
      if (b < 0){
        b = b*-1;
      }
      c = c - suma;
      if (c < 0){
        c = c*-1;
      }
      d = d - suma;
      if (d < 0){
        d = d*-1;
      }
      e = e - suma;
      if (e < 0){
        e = e*-1;
      }      
    }
    
//Reintercambiar los digitos
    
    a_1 = a;
    e_1 = e;
    a = e_1;
    e = a_1;
    b_1 = b;
    d_1 = d;
    b = d_1;
    d = b_1;       
   
//Transformar los digitos a uno solo
    
    a = a*10000;
    b = b*1000;
    c = c*100;
    d = d*10;
    e = e*1;

//Realizar la suma de los digitos con el fin de que quede solo uno
    
    suma = a + b + c + d + e;
  
//Sumar 500 al numero
    
    suma = suma + 500;
    
//Validar si el numero restante tiene 6 o mas digitos
    
    if (suma >= 100000){
      a = x%10;
      suma = a;
    }
    
//Imprimir el numero codificado al usuario
    
    System.out.println("Numero Original: "+ingresado);
    System.out.println("Data Codificada: "+suma);
           
  } 
}
