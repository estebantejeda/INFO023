//Importar Librerias

import java.util.*;

//Crear Main

public class Main{
    public static void main(String[] args) {

//Explicacion de Algoritmo al Usuario

        System.out.println("Algoritmo que calcula la nota de cada estudiante dependiendo de la escala y el puntaje maximo");

//Pedir Datos al Usuario

        int porc = pedirDato("\nIngrese porcentaje de exigencia requerido para aprobar");
        int min = pedirDato("\nIngrese la nota mínima");
        int max = pedirDato("\nIngrese la nota máxima");
        int aprob = pedirDato("\nIngrese la nota mínima para aprobar");
        int punt = pedirDato("\nIngrese puntaje de la prueba");
        int inc = pedirDato("\nIngrese el incremento de puntaje que se mostrará en pantalla");

//Calclar Datos del Usuario

        System.out.println("");
        for (int i = 0; i <=punt ; i+=inc){
            double nota = entregaNota(aprob, min, max, punt, i, porc);
            System.out.printf("Con %d puntos se obtien un %.1f%n", i, nota);
        }
        if(!(punt%inc == 0)){
            System.out.printf("Con %d puntos se obtien un %d,0%n", punt, max);
        }

    }

//Crear Metodos

    //Metodo pedirDato

    public static int pedirDato(String text){
        Scanner t = new Scanner(System.in);
        System.out.print(text+"\n> ");
        int a = t.nextInt();
        return a;
    }

    //Metodo entregaNota

    public static double entregaNota(int aprob, int min, int max, int punt, int x, int porc){
        double pje_aprob = ((double)(porc*punt)/100);
        double y;
        if(x <= pje_aprob){
            y = calculaNota(min, aprob, 0, pje_aprob, x);
        }
        else{
            y = calculaNota(aprob, max, pje_aprob, punt, x);
        }
        return y;
    }

    //Metodo calculaNota

    public static double calculaNota(double y_1, double y_2, double x_1, double x_2, double x){
        double m = ((double)(y_2 - y_1)/(x_2-x_1));
        double y = m*(x-x_1) + y_1;
        return y;
    }

}
