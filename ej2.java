/*Realiza un programa que muestre al azar el nombre de una carta de la
baraja francesa. Esta baraja está dividida en cuatro palos: picas, corazones,
diamantes y tréboles. Cada palo está formado por 13 cartas, de las cuales 9
cartas son numerales y 4 literales: 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K y A (que
sería el 1). Para convertir un número en una cadena de caracteres podemos
usar String.valueOf(n).*/
public class ej2 {
	public static void main(String[] args) {
	System.out.println("Muestra cartas aleatorias:");
	String palo="";
	String carta="";

	switch ((int)(Math.random()*4)+1) {
		case 1:
			palo="picas";
		break;
		case 2:
			palo="corazones";
		break;
		case 3:
			palo="diamantes";
		break;
		case 4:
			palo="tréboles";
		break;
		default:
	}
  
  int numCarta = (int)(Math.random()*13)+1;
	switch (numCarta) {
		case 1:
			carta="As";
		break;
		case 11:
			carta="J";
		break;
		case 12:
			carta="Q";
		break;
		case 13:
			carta="K";
		break;
		default:
			carta = String.valueOf(numCarta);
	}
	
	System.out.printf("\nLa carta es un %s de %s\n", carta, palo);

    System.out.printf("FIN\n");
   
	}
}
