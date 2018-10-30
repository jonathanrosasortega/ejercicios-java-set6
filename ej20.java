/*Realiza un programa que pinte por pantalla una cuba con cierta cantidad de
agua. La capacidad será indicada por el usuario. La cuba se llenará con una
cantidad aleatoria de agua que puede ir entre 0 y la capacidad máxima que
pueda admitir. El ancho de la cuba no varía.

Ejemplo:
Por favor, indique la capacidad de la cuba en litros: 3
*    *
*====*
*====*
******
La cuba tiene una capacidad de 3 litros y contiene 2 litros de agua.
*/
public class ej20 {
	public static void main(String[] args) {
	System.out.println("Introduce la capacidad de la cuba:");
	int capacidad = Integer.parseInt(System.console().readLine());
	int agua = (int)(Math.random()*capacidad+1);
	int j;
	for (int i=capacidad; i>0; i--) {
		System.out.printf("*");
		for (j=1; j<=4; j++) {
			if (i > agua) {
				System.out.print(" ");
			} else {
				System.out.print("=");
			}
		}
		System.out.println("*");
	}
	System.out.printf("******");   
	}
}
