import java.util.*;
public class ejercicio_53{
  public static void main (String args[]){
    boolean ciclico = true;
    while(ciclico){
      try{
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un numero entre 2 y 5");
        int x = teclado.nextInt();
        if (x < 2 || x > 5){
          throw new Exception("Objetivo fuera de rango!\nVuelva a intentarlo");
        }
        ciclico = false;
      }
      catch (InputMismatchException ex){
        System.out.println("Debes ingresar un numero!!");
      }
      catch (Exception ex1){
        System.out.println(ex1.getMessage());
      }
    }
  }
}