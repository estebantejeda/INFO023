//Importar Librerias a Java

import java.util.*;

//Clear Main

public class interrogacion{
    public static void main(String [] args){

//Declarar Variables

    int x;

//Desplegar Programa

    x = ingresaNumero();
    iniciaBucle(x);

}

//Crear Metodos

    //Metodo ingresaNumero

    public static int ingresaNumero(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Numero de veces: ");
        int x = sc.nextInt();
        return x;
    }

    //Metodo iniciaBucle

    public static void iniciaBucle(int x){
        for (int i = 0; i < x ; i++){
            bucle("¿", i+1);
            bucle("?", i+1);
            System.out.println("");
        }
    }

    //Metodo bucle

    public static void bucle(String signo, int limite){
        while(limite != 0){
            System.out.print(signo);
            limite--;
        }
    }

}
