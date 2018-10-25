/*Escribe un programa que muestre tres apuestas de la quiniela en tres columnas para los 14 partidos y el pleno al quince (15 filas).
*/
public class ej7 {
	public static void main(String[] args) {
	System.out.println("¡La quiniela!:\n");
	
	System.out.printf("Partido  | 1 | X | 2 |\tPartido  | 1 | X | 2 |\tPartido  | 1 | X | 2 |\n");
	System.out.printf("----------------------\t----------------------\t----------------------\n");
	int apuesta;
	int j;
	for (int i=1; i<=15; i++) {
		for (j=1; j<=3; j++) {
			apuesta = (int)(Math.random()*3)+1;
			switch (apuesta) {
				case 1:
					System.out.printf("Equipo%2d | 1 | - | - |\t", i);
				break;
				case 2:
					System.out.printf("Equipo%2d | - | X | - |\t", i);
				break;
				case 3:
					System.out.printf("Equipo%2d | - | - | 2 |\t", i);
				break;
				default:
			}
		} // fin for j
    System.out.println("\n----------------------\t----------------------\t----------------------");
	} // fin for i
	}
}
