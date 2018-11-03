import java.util.*;
import java.io.*;
public class LeeArchivoaArreglo2014{
  public static void main(String args[]) throws IOException{
    String nombre = leeNombreArchivo();
//    String A[] = leeDatosArchivo(nombre);
//    escribeArreglo(A);
  }
  
  public static String leeNombreArchivo() throws IOException{
    String nom = "";
    boolean sigue = true;
    while(sigue){
        nom = leeNombre();
        sigue = intentaLeerArchivo(nom);
    }
    return nom;
  }
  
  public static String leeNombre(){
    Scanner teclado = new Scanner(System.in);
    Exception error1 = new Exception("No ingreso nombre!!");
    boolean sigue = true;
    String nom = "";
    while(sigue){
      try{
        System.out.print("Nombre de su archivo? ");
        nom = teclado.nextLine().trim();
        if(nom.equals("")) throw error1;
        sigue = false;
      }
      catch(Exception ex){
        System.out.println(ex.getMessage());
      }
    }
    return nom;
  }
  
  public static boolean intentaLeerArchivo(String nom) throws IOException{
    boolean sale = false;
    try{
      File documento = new File(nom);
      Scanner lectura = new Scanner(documento);
    }
    catch(FileNotFoundException ex){
      System.out.println("No se encuentra el archivo!!");
      sale = true;
    }
    return sale;
  }
  
}