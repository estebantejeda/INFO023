//Importar Librerias

import java.util.*;

//Crear Main

public class AnguloTest{
	public static void main (String args[]){

//Explicacion de Algoritmo al Usuario

		System.out.println("Algorimo que pregunta al usuario grados o Angulo para que este entregue su equivalente.\n");

//Crear Objetos

		Scanner teclado = new Scanner(System.in);
		Angulo angulos[] = new Angulo[5];

//Crear Variables

			//Variables de Clase Angulo

			angulos[0] = new Angulo(00, 0, "0", "1", "0");
			angulos[1] = new Angulo(30, 6, "1/2" ,"v3/2", "v3/3");
			angulos[2] = new Angulo(45, 4, "v2/2", "v2/2", "1");
			angulos[3] = new Angulo(60, 3, "v3/2", "1/2", "v3");
			angulos[4] = new Angulo(90, 2, "1", "0", "Ind");

			//Otras

			int a = 0, b = 0;
			int c = 0, d = 0;
			int x, y;
			String z;

//Pedir Datos al Usuario

		System.out.println("Seleccione la cantidad de preguntas que desee para ejercitar:");
		System.out.print(">");
		y = teclado.nextInt();
		teclado.nextLine();
		System.out.println("");

//Realizar Ciclico

		while ((c+d) != y){

//Elegir Preguntas de Manera Aleatoria	

			a = eligeNumero(5);
			b = eligeNumero(5);

//Realizar Preguntas

			switch(b){
			case 0:
				System.out.println("Cuantos Radianes son "+angulos[a].getGrados()+" Grados?:");
				System.out.print(">");
				System.out.print("PI/");				
				x = teclado.nextInt();
				if (x != angulos[a].getRadianes()){
					d++;
					System.out.println("Incorrecto, la alternativa correcta es: PI/"+angulos[a].getRadianes()+" Radianes\n");
				}
				else{
					c++;
					System.out.println("Respuesta Correcta\n");
				}
				teclado.nextLine();
				break;
			case 1:
				System.out.println("Cuantos Grados son PI/"+angulos[a].getRadianes()+" Radianes?:");
				System.out.print(">");
				x = teclado.nextInt();
				if (x != angulos[a].getGrados()){
					d++;
					System.out.println("Incorrecto, la alternativa correcta es: "+angulos[a].getGrados()+" Grados\n");
				}
				else{
					c++;
					System.out.println("Respuesta Correcta\n");
				}
				teclado.nextLine();
				break;
			case 2:
				System.out.println("Cual es el Seno de: PI/"+angulos[a].getRadianes());
				System.out.print(">");
				z = teclado.nextLine();
				if (!z.equals(angulos[a].getSeno())){
					d++;
					System.out.println("Incorrecto, la alternativa correcta es: "+angulos[a].getSeno()+"\n");
				}
				else{
					c++;
					System.out.println("Respuesta Correcta\n");
				}
				break;
			case 3:
				System.out.println("Cual es el Coseno de: PI/"+angulos[a].getRadianes());
				System.out.print(">");
				z = teclado.nextLine();
				if (!z.equals(angulos[a].getCoseno())){
					d++;
					System.out.println("Incorrecto, la alternativa correcta es: "+angulos[a].getCoseno()+"\n");
				}
				else{
					c++;
					System.out.println("Respuesta Correcta\n");
				}
				break;
			case 4:
				System.out.println("Cual es la Tangente de: PI/"+angulos[a].getRadianes());
				System.out.print(">");
				z = teclado.nextLine();
				if (!z.equals(angulos[a].getTangente())){
					d++;
					System.out.println("Incorrecto, la alternativa correcta es: "+angulos[a].getTangente()+"\n");
				}
				else{
					c++;
					System.out.println("Respuesta Correcta\n");
				}
				break;
			}
		}

//Entregar Datos al Usuario

			System.out.println("Respuestas Correctas: "+c);
			System.out.println("Respuestas Incorrectas: "+d);
			System.out.println("Porcentaje de Acierto: "+(100*c)/(c+d)+"%");

	}

//Realizar Metodos

	//Metodo eligeNumero

	public static int eligeNumero(int num){
		Random aleat = new Random();
		int x = aleat.nextInt(num);
		return x;
	}
	
}