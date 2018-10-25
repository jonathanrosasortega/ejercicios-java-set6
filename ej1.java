/*Escribe un programa que muestre la tirada de tres dados. Se debe mostrar
también la suma total (los puntos que suman entre los tres dados).*/
public class ej1 {
	public static void main(String[] args) {
	System.out.println("Tirada de 3 dados:");
	int puntos = 0;
	int dado;

	for (int i=1; i<=3; i++) {
		dado = (int)(Math.random()*6)+1;
		puntos += dado;
		System.out.printf("\nDado nº %d: %d\n", i, dado);
	}

	System.out.printf("Los 3 dados suman %d puntos\n", puntos);
   
	}
}
