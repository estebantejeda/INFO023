//Importar Clases en Java

import javax.swing.*;

//Definir nombre del Algoritmo

public class ejercicio_52{
  public static void main(String args[]){
    
//Declarar Variables
    
    String nl, fr, bu, salida;    
    
//Pedir datos al usuario
    
    nl = System.getProperty("line.separator");
    fr = JOptionPane.showInputDialog("Ingrese frase:");
    bu = JOptionPane.showInputDialog("Ingrese segunda frase:");

//Imprimir datos al Usuario
    
    salida = fr.concat(nl).concat(bu);
    JOptionPane.showMessageDialog(null, salida);
    
  }
}