//Importar Clases en Java

import java.util.*;

//Definir nombre de Algoritmo

public class ponderacion{
  public static void main (String args[]){
    
//Declarar Variables
    
    double pc_nem, pc_ran, pc_len, pc_mat, pc_his, pc_cie, p_cor;
    double po_nem, po_ran, po_len, po_mat, po_his, po_cie;
    double nem_fin, ran_fin, len_fin, mat_fin, his_fin, cie_fin, pun_tot;
    double a;
    
//Declarar Variables
    
    pc_his = 0;
    pc_cie = 0;
    po_his = 0;
    po_cie = 0;
    his_fin = 0;
    cie_fin = 0;
    
//Explicacion de Algoritmo al Usuario
    
    System.out.println("Algoritmo que calcula el puntaje ponderado de la carrera a la que el usuario desee entrar.");
    
//Pedir datos al Usuario a traves de metodos #1
    
    System.out.println("\nIngresa los siguientes datos de tu carrera:\n");
    pc_nem = porcentajePonderado("Porcentaje de NEM");
    pc_ran = porcentajePonderado("Porcentaje de Ranking");
    pc_len = porcentajePonderado("Porcentaje en Lenguaje");
    pc_mat = porcentajePonderado("Porcentaje en Matematica");
    pc_his = porcentajePonderado("Porcentaje en Historia");
    if (pc_his == 0){
      pc_cie = porcentajePonderado("Porcentaje en Ciencias");
    }
    p_cor = porcentajePonderado("Puntaje de Corte");
    
//Comprobar que la suma de los porcentajes sea igual a 100%
    
    a = pc_nem + pc_ran + pc_len + pc_mat + pc_his + pc_cie;
    while (a != 100){
      System.out.println("\nError!!, La suma de los porcentajes no entrega un 100%. Ingrese los datos nuevamente.");
      System.out.println("\nIngresa los siguientes datos de tu carrera:\n");
      pc_nem = porcentajePonderado("Porcentaje de NEM");
      pc_ran = porcentajePonderado("Porcentaje de Ranking");
      pc_len = porcentajePonderado("Porcentaje en Lenguaje");
      pc_mat = porcentajePonderado("Porcentaje en Matematica");
      pc_his = porcentajePonderado("Porcentaje en Historia");
      if (pc_his == 0){
        pc_cie = porcentajePonderado("Porcentaje en Ciencias");
      }
      a = pc_nem + pc_ran + pc_len + pc_mat + pc_his + pc_cie;
    }

//Pedir datos al usuario a traves de metodos #2
    
    System.out.println("\nIngresa los siguientes datos con los puntajes que has obtenido:\n");
    po_nem = puntajeObtenido("NEM");
    po_ran = puntajeObtenido("Ranking");
    po_len = puntajeObtenido("Lenguaje");
    po_mat = puntajeObtenido("Matematica");
    if (pc_his > 0){
      po_his = puntajeObtenido("Historia");
    }
    if (pc_cie > 0){
      po_cie = puntajeObtenido("Ciencias");
    }    
    
//Realizar los Calculos a traves de metodos
    
    nem_fin = calculoPonderacion(pc_nem, po_nem);
    ran_fin = calculoPonderacion(pc_ran, po_ran);
    len_fin = calculoPonderacion(pc_len, po_len);
    mat_fin = calculoPonderacion(pc_mat, po_mat);
    his_fin = calculoPonderacion(pc_his, po_his);
    cie_fin = calculoPonderacion(pc_cie, po_cie);
    
//Realizar calculos
    
    pun_tot = nem_fin + ran_fin + len_fin + mat_fin + his_fin + cie_fin;
    
//Imprimir datos al usuario
    
    System.out.println("\nTu puntaje ponderado es: " +pun_tot+ ".");
    if (pun_tot >= p_cor){
      System.out.println("\n¡Felicidades!, estas entrando a la carrera.");
    }    
    else{
      System.out.println("\nNo te alcanza el puntaje para entrar a la carrera.");
      System.out.println("\nTe faltan: " +(p_cor - pun_tot)+ " puntos para entrar.");
    }
  }
  
//Realizar Metodos
  
  //Metodo datoPonderacion
  
  public static double porcentajePonderado(String text){
    Scanner teclado = new Scanner(System.in);
    System.out.print("¿Cuanto es el " +text+ "?: ");
    int pond = teclado.nextInt();
    while (pond < 0){
      System.out.println("\nError!!, los datos ingresados deben ser Positivos.");
      System.out.print("¿Cuanto es el " +text+ "?: ");
      pond = teclado.nextInt();
    }
    return pond;
  }
  
  //Metodo puntajeObtenido
  
  public static double puntajeObtenido (String text){
    Scanner teclado = new Scanner(System.in);
    System.out.print("¿De cuanto es tu puntaje en " +text+ "?: ");
    double punt = teclado.nextInt();
    while (punt < 0 || punt > 850){
      System.out.println("\nError! el dato ingresado debe ser positivo y menor que 850.");
      System.out.print("¿De cuanto es tu puntaje en " +text+ "?: ");
      punt = teclado.nextInt();
    }
    return punt;
  }
  
  //Metodo calculoPonderacion
  
  public static double calculoPonderacion(double punt_car, double punt_obt){
    double punt_final = (punt_car/100)*punt_obt;
    return punt_final;
  }  
  
}
