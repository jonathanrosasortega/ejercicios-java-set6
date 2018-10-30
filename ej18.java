/*Sinestesio y Casilda van a pintar los tres dormitorios de su casa, quieren
sustituir el color blanco por colores más alegres. Realiza un programa que
genere de forma aleatoria una secuencia de tres colores aleatorios (uno para
cada dormitorio) de tal forma que no se repita ninguno. Los colores entre los
que debe elegir el programa son los siguientes: rojo, azul, verde, amarillo,
violeta y naranja.*/
public class ej18 {
	public static void main(String[] args) {
	System.out.println("");
	int color1 = (int)(Math.random()*6);
	int color2;
	int color3;

	do {
		color2 = (int)(Math.random()*6);
	} while (color2 == color1);

	do {
		color3 = (int)(Math.random()*6);
	} while ((color3 == color1) || (color3 == color2));
	
	switch (color1) {
		case 0:
			System.out.print("rojo ");
		break;
		case 1:
			System.out.print("azul ");
		break;
		case 2:
			System.out.print("verde ");
		break;
		case 3:
			System.out.print("amarillo ");
		break;
		case 4:
			System.out.print("violeta ");
		break;
		case 5:
			System.out.print("naranja ");
		break;
	}

	switch (color2) {
		case 0:
			System.out.print("rojo ");
		break;
		case 1:
			System.out.print("azul ");
		break;
		case 2:
			System.out.print("verde ");
		break;
		case 3:
			System.out.print("amarillo ");
		break;
		case 4:
			System.out.print("violeta ");
		break;
		case 5:
			System.out.print("naranja ");
		break;
	}

	switch (color3) {
		case 0:
			System.out.print("rojo ");
		break;
		case 1:
			System.out.print("azul ");
		break;
		case 2:
			System.out.print("verde ");
		break;
		case 3:
			System.out.print("amarillo ");
		break;
		case 4:
			System.out.print("violeta ");
		break;
		case 5:
			System.out.print("naranja ");
		break;
	}
    System.out.printf("FIN\n");
   
	}
}