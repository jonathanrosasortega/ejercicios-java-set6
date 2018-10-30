/*Realiza un programa que genere una secuencia de cinco monedas de curso
legal lanzadas al aire. Las monedas disponibles son de 1 céntimo, 2 céntimos,
5 céntimos, 10 céntimos, 20 céntimos, 50 céntimos, 1 euro y 2 euros. Las dos
posiciones posibles son cara y cruz.

Ejemplo:
2 céntimos - cara
20 céntimos - cruz
50 céntimos - cruz
1 euro - cruz
2 euros - cara
*/
public class ej21 {
	public static void main(String[] args) {
	int moneda;
	int posicion;
	for (int i=1; i<=5; i++) {
		moneda = (int)(Math.random()*8);
		posicion = (int)(Math.random()*2);

		switch (moneda) {
			case 0:
				System.out.print("1 céntimo - ");
			break;
			case 1:
				System.out.print("2 céntimos - ");
			break;
			case 2:
				System.out.print("5 céntimos - ");
			break;
			case 3:
				System.out.print("10 céntimos - ");
			break;
			case 4:
				System.out.print("20 céntimos - ");
			break;
			case 5:
				System.out.print("50 céntimos - ");
			break;
			case 6:
				System.out.print("1 euro - ");
			break;
			case 7:
				System.out.print("2 euros - ");
			break;
		}

		switch (posicion) {
			case 0:
				System.out.println("cara");
			break;
			case 1:
				System.out.println("cruz");
			break;
		}
	}
	
    System.out.printf("FIN\n");
   
	}
}
