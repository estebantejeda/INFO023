//Importar Clases en Java

import javax.swing.*;

//Definir nombre del Algoritmo

public class ejercicio_51{
  public static void main(String args[]){
    
//Declarar Variables
    
    String men, fr, bu;
    int pos;
    
//Definir Variables
    
    men = "";
    
//Pedir datos al usuario
    
    fr = JOptionPane.showInputDialog("Ingrese frase a probar:");
    bu = JOptionPane.showInputDialog("Ingrese secuencia a buscar:");

//Realizar busqueda    
    
    pos = fr.indexOf(bu);
    if (pos == -1){
      JOptionPane.showMessageDialog(null, "No se encontro la secuencia en el String!");
    }
    else{
      men = "La secuencia se encuentra a partir de la posicion ";
      men = men.concat(Integer.toString(pos)).concat(" en la frase ingresada");
      JOptionPane.showMessageDialog(null, men);
    }
    
  }
}