/*Igual que el ejercicio anterior pero con la baraja española. Se utilizará la baraja
de 40 cartas: 2, 3, 4, 5, 6, 7, sota, caballo, rey y as.*/
public class ej3 {
	public static void main(String[] args) {
	System.out.println("Muestra cartas aleatorias:");
	String palo="";
	String carta="";

	switch ((int)(Math.random()*4)+1) {
		case 1:
			palo="bastos";
		break;
		case 2:
			palo="oros";
		break;
		case 3:
			palo="espadas";
		break;
		case 4:
			palo="copas";
		break;
		default:
	}

  int numCarta = (int)(Math.random()*10)+1;
	switch (numCarta) {
		case 1:
			carta="As";
		break;
		case 8:
			carta="sota";
		break;
		case 9:
			carta="caballo";
		break;
		case 10:
			carta="rey";
		break;
		default:
			carta = String.valueOf(numCarta);
	}
	
	System.out.printf("\nLa carta es un %s de %s\n", carta, palo);
   
	}
}
