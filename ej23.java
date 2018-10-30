/*Las caras de un dado de poker tienen las siguientes figuras: As, K, Q, J, 7 y 8.
Escribe un programa que genere de forma aleatoria la tirada de cinco dados.

Ejemplo 1:
Q J 7 J As
Ejemplo 2:
K 8 J As 7
*/
public class ej23 {
	public static void main(String[] args) {
	System.out.println("Tirada aleatoria:");
	int dado = 0;

	for (int i=1; i<=5; i++) {
		dado = (int)(Math.random()*6);
		switch (dado) {
			case 0:
				System.out.printf("As ");
			break;
			case 1:
				System.out.printf("K ");
			break;
			case 2:
				System.out.printf("Q ");
			break;
			case 3:
				System.out.printf("J ");
			break;
			case 4:
				System.out.printf("7 ");
			break;
			case 5:
				System.out.printf("8 ");
			break;
		}
	}
	
    System.out.printf("FIN\n");
   
	}
}