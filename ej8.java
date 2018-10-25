/*Modifica el programa anterior para que la probabilidad de que salga un 1 sea
de 1/2, la probabilidad de que salga x sea de 1/3 y la probabilidad de que salga
2 sea de 1/6. Pista: 1/2 = 3/6 y 1/3 = 2/6.*/
public class ej8 {
	public static void main(String[] args) {
	System.out.println("¡La quiniela tramposa!:\n");
	
	System.out.printf("Partido  | 1 | X | 2 |\tPartido  | 1 | X | 2 |\tPartido  | 1 | X | 2 |\n");
	System.out.printf("----------------------\t----------------------\t----------------------\n");
	int apuesta;
	int j;
	for (int i=1; i<=15; i++) {
		for (j=1; j<=3; j++) {
			apuesta = (int)(Math.random()*6)+1;
			if ((apuesta == 1) || (apuesta == 2) || (apuesta == 3)) {
				System.out.printf("Equipo%2d | 1 | - | - |\t", i);
			} else if ((apuesta == 4) || (apuesta == 5)) {
				System.out.printf("Equipo%2d | - | X | - |\t", i);
			} else if (apuesta == 6) {
				System.out.printf("Equipo%2d | - | - | 2 |\t", i);
			}
		} // fin for j
		System.out.println("\n----------------------\t----------------------\t----------------------");
	} // fin for i 
	}
}
