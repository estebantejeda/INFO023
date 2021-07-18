//Importar Clases en Java

import java.util.*;
import java.io.*;

//Definir nombre del Algoritmo

public class colgado{
  public static void main(String args[]) throws IOException{
    
//Declarar Variables
    
    int x, y, z, v, w, t;
    String A[], B[], C[];
    String a, b, c;
    boolean ciclico;
    
//Definir Variables
    
    y = 0;
    v = 6;
    w = 0;
    t = 1;
    a = "";
    c = "";
    ciclico = true;
    
//Explicacion de Algoritmo al Usuario
    
    System.out.println("Algoritmo que ejecuta el juego llamado 'Colgado'. El juego consiste en que el programa le pedira al usuario la cantidad");
    System.out.println("de palabras que desee, luego de esto, debera rellenar la cantidad anteriormente asigana con palabras a su eleccion.");
    System.out.println("Cuando finalice, el algoritmo elegira una palabra al azar y el usuario debera adivinarla.");

//Activar ciclico
    
    while(ciclico){
    
//Desplegar menu de opciones al usuario
      
      System.out.println("\nIngrese una opcion valida:");
      System.out.println("\n1) Crear Palabras");
      System.out.println("2) Cargar Palabras");
      
//Pedir opcion al usuario
      
      x = ingresaValidaOpcion("\nOpcion [1,2]:");
      
//Entregar la opcion al usuario
    
      switch (x){
        case 1:
          a = crearNombreArchivo("\nIngrese el nombre del archivo en el cual desee almacenar las palabras [A-Z, a-z, 0-9, '-', '_']:");
          crearArchivo(a);
          y = cantidadDePalabras("\nIngrese la cantidad de palabras que desea para el juego [1-12]:");
          A = almacenaPalabras(y);
          imprimeArreglo(A, a);
          break;
        case 2:
          a = cargarNombre("\nIngrese el nombre del archivo a cargar");
          y = cuentaCantidadDePalabras(a);
          break;
        default:
          break;
      }
      
//Elegir una palabra al azar
    
      A = arregloDeArchivo(a, y);
      z = generaNumeroAleatorio(y);
      b = A[z];
      w = b.length();
      B = tranformaPalabraArreglo(b);
      
//Iniciar el Juego
      
      C = arregloOculto(w);
      imprimePresentacion(v, w);
      imprimeTablero(B, C, c, w, v);
      while (v > 0 || w > 0 ){
        c = ingresaLetra("\nIngrese una Letra:");
        imprimeTablero(B, C, c, w, v);
        imprimeEstadistica(v, t);
        t++;
      }
      
//Realizar Ciclico
      
      ciclico = repetirProceso(ciclico);
    }
    
  }
  
//Realizar Metodos
  
  //Metodo ingresaValidaOpcion
  
  public static int ingresaValidaOpcion(String text){
    Exception err1 = new Exception("Error!, la opcion ingresada no existe. Vuelva a intentarlo.");
    boolean repetir = true;
    int opcion = 0;
    while (repetir){
      try{
        Scanner t = new Scanner(System.in);
        System.out.println(text);
        opcion = t.nextInt();
        if (opcion < 1 || opcion > 2){
          throw err1;
        }
        repetir = false;
      }
      catch(InputMismatchException ex){
        System.out.println("Error!, debes ingresar un numero. Vuelva a intentarlo.");
      }
      catch(Exception ex1){
        System.out.println(ex1.getMessage());
      }
    }
    return opcion;
  }
  
  //Metodo crearNombreArchivo
  
  public static String crearNombreArchivo(String text){
    String archivo;
    int contador;
    Scanner teclado = new Scanner(System.in);
    System.out.println(text);
    archivo = teclado.nextLine();
    contador = validaFrase(archivo);
    while (contador > 0){
      System.out.println("Error!, la frase ingresada posee caracteres distintos a las letras y numeros. Intentelo nuevamente.");
      System.out.println(text);
      archivo = teclado.nextLine();
      contador = validaFrase(archivo);
    }
    archivo = archivo.concat(".txt");
    return archivo;
  }
  
  //Metodo validaFrase
  
  public static int validaFrase(String frase){
    String minus = "!#$%&/()=?¡[],;.:{} ";
    int contador = 0;
    for (int i = 0; i < frase.length(); i++){
      if (minus.indexOf(frase.charAt(i)) != -1){
        contador++;
      }
    }
    return contador;
  }
  
  //Metodo crearArchivo
  
  public static void crearArchivo(String archivo) throws IOException{
    PrintWriter salida = new PrintWriter(archivo);
  }
  
  //Metodo cantidadDePalabras
  
  public static int cantidadDePalabras(String text){
    boolean repetir = true;
    int cantidad = 0;
    while (repetir){
      try{
        System.out.println(text);
        Scanner t = new Scanner(System.in);
        cantidad = t.nextInt();
        if (cantidad < 1 || cantidad > 12){
          throw new Exception("Error!, esta superando el limite. Vuelva a intentarlo.");
        }
        repetir = false;
      }
      catch (InputMismatchException ex){
        System.out.println("Error!, debes ingresar un numero. Vuelva a intentarlo.");
      }
      catch (Exception ex1){
        System.out.println(ex1.getMessage());
      }
    }
    return cantidad;
  }
  
  //Metodo almacenaPalabras
  
  public static String[] almacenaPalabras(int limite){
    String Arreglo[] = new String[limite];
    int contador;
    Scanner t = new Scanner(System.in);
    for (int i = 0; i < limite; i++){
      System.out.println("\nIngrese la palabra #" +(i+1)+ " [A-Z, a-z]:");
      Arreglo[i] = t.nextLine();
      contador = validaNumero(Arreglo[i]);
      while (contador > 0){
        System.out.println("Error, debe ingresar letras. Vuelva a intentarlo");
        System.out.println("\nIngrese la palabra #" +(i+1)+ " [A-Z, a-z]:");
        Arreglo[i] = t.nextLine();
        contador = validaNumero(Arreglo[i]);
      }
    }
    return Arreglo;
  }
  
  //Metodo validaNumero
  
  public static int validaNumero(String frase){
    String minus = "1234567890!#$%&/()=?¡[]{},;.: ";
    int contador = 0;
    for (int i = 0; i < frase.length(); i++){
      if (minus.indexOf(frase.charAt(i)) != -1){
        contador++;
      }
    }
    return contador;
  }
  
  //Metodo imprimeArreglo
  
  public static void imprimeArreglo(String arr[], String a) throws IOException{
    try{
      PrintWriter pw = new PrintWriter(a);
      for(int i = 0; i < arr.length; i++){
        pw.println(arr[i]);
      }
      pw.close();
    }
    catch(FileNotFoundException ex){
      System.out.println("Error!, no se encuentra el archivo.");
    }
  }
  
  //Metodo cargarNombre
  
  public static String cargarNombre(String text){
    String archivo;
    int contador;
    Scanner teclado = new Scanner(System.in);
    System.out.println(text);
    archivo = teclado.nextLine();
    contador = validaFrase(archivo);
    while (contador > 0){
      System.out.println("Error!, la frase ingresada posee caracteres distintos a las letras y numeros. Intentelo nuevamente.");
      System.out.println(text);
      archivo = teclado.nextLine();
      contador = validaFrase(archivo);
    }
    archivo = archivo.concat(".txt");
    return archivo;
  }
  
  //Metodo cuentaCantidadDePalabras
  
  public static int cuentaCantidadDePalabras(String archivo) throws IOException{
    int contador;
    File documento = new File(archivo);
    Scanner entrada = new Scanner(documento);
    contador = 0;
    while (entrada.hasNextLine()){
      entrada.nextLine();
      contador++;
    }
    entrada.close();
    return contador;
  }
  
  //Metodo arregloDeArchivo
  
  public static String[] arregloDeArchivo(String archivo, int limite) throws IOException{
    String Arreglo[] = new String[limite];
    String linea;
    try{
    File documento = new File(archivo);
    Scanner entrada = new Scanner(documento);
    for (int i = 0; i < limite; i++){
      Arreglo[i] = entrada.nextLine();
     }
    }
    catch (IOException ex){
      System.out.println(ex.getMessage());    
    }
    return Arreglo;
  }
  
  //Metodo generaNumeroAleatorio
  
  public static int generaNumeroAleatorio(int limite){
    Random aleat = new Random();
    int numero = aleat.nextInt(limite);
    return numero;
  }
  
  //Metodo tranformaPalabraArreglo
  
  public static String[] tranformaPalabraArreglo(String palabra){
    int limite = palabra.length();
    String Arreglo[] = new String[limite];
    char letra;
    String letrac;
    for(int i = 0; i < limite; i++){
      letra = palabra.charAt(i);
      letrac = Character.toString(letra);
      Arreglo[i] = letrac;
    }
    return Arreglo;
  }
  
  //Metodo arregloOculto
  
  public static String[] arregloOculto(int largo){
    String Arreglo[] = new String[largo];
    for (int i = 0; i < largo; i++){
      Arreglo[i] = " _ ";
    }
    return Arreglo;
  }
  
  //Metodo imprimePresentacion
  
  public static void imprimePresentacion(int vidas, int longitud){
    System.out.println("\n<---------------  J  U  E  G  O    I  N  I  C  I  A  D  O  --------------->");
    System.out.println("\nVidas: " +vidas);
    System.out.println("Longitud: " +longitud);
  }
  
  //Metodo imprimeTablero
  
  public static void imprimeTablero(String Original[], String Oculto[], String letra, int largo, int vidas){
    System.out.println("");
    System.out.print("<-");
    String espacio = " ";
    for (int i = 0; i < largo; i++){
      if(letra.equalsIgnoreCase(Original[i])){
        letra = espacio.concat(letra).concat(espacio);
        Oculto[i] = letra;
      }
    }
    for (int j = 0; j < largo; j++){
      System.out.print(Oculto[j]);
    }
    System.out.print("->\n");
  }
  
  //Metodo ingresaLetra
  
  public static String ingresaLetra(String text){
    String letra;
    Scanner t = new Scanner(System.in);
    System.out.println(text);
    letra = t.nextLine();
    return letra;
  }
  
  //Metodo imprimeEstadistica
  
  public static void imprimeEstadistica(int vidas, int turnos){
    int puntaje;
    puntaje = vidas*10 - turnos*2;
    System.out.println();
    System.out.println("Turno: " +turnos);
    System.out.println("Vidas: " +vidas);
    System.out.println("Puntaje: " +puntaje);
  }
  
  //Metodo repetirProceso
  
    public static boolean repetirProceso(boolean ciclico){
      Scanner teclado = new Scanner(System.in);
      System.out.println("\nVolver a Jugar? [s/n]");
      String fin = teclado.nextLine();
      while (!(fin.equalsIgnoreCase("s") || fin.equalsIgnoreCase("n"))){
        System.out.println("\nLa opcion ingresada no es valida, vuelva a intentarlo.");
        System.out.println("Finalizar? [s/n]");
        fin = teclado.nextLine();
      }
      if (fin.equalsIgnoreCase("n")){
        ciclico = false;
      }
      return ciclico;
    }
    
    //Metodo imprimeArr
    
    public static void imprimeArr(String Arr[]){
      for (int i = 0; i < Arr.length; i++){
      System.out.print(Arr[i]);
      }
    }
    
}
