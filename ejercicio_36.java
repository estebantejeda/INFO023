//Importar Clases en Java

import java.util.*;

//Definir nombre del Algoritmo

public class ejercicio_36{
 public static void main (String args[]){

//Declarar Variables

  String x;

//Explicacion de algoritmo al usuario

  System.out.println("Algoritmo que pide el ingreso de una frase y este imprimira los caracteres por separados");

//Pedir datos al usuario a traves de metodos

  x = validaDato("\nIngrese una frase:");
  
//Imprimir datos al usuario a traves de metodos
  
  separaFrase(x);

 }

//Realizar Metodos

 //Metodo validaDato
 
 public static String validaDato(String text){
   Scanner teclado = new Scanner(System.in);
   System.out.println(text);
   String frase = teclado.nextLine();
   while (!(frase.length() > 0)){
     System.out.println("Error!, la frase esta vacia");
     System.out.println(text);
     frase = teclado.nextLine();
   }
   return frase;
 }
 
 //Metodo separaFrase
 
 public static void separaFrase(String frase){
   int largo_frase = frase.length();
   for (int i = 0; i < largo_frase; i++){
     if (i == largo_frase - 1){
       System.out.println(frase.charAt(i));
     }
     else{
       System.out.print(frase.charAt(i) + "-");
     }
   }
 }
 
}