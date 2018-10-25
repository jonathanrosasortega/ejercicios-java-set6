/*Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos)
separados por espacios. Muestra también el máximo, el mínimo y la media
de esos números.*/
public class ej5 {
	public static void main(String[] args) {
	System.out.println("50 números enteros aleatorios entre 100 y 199 (ambos incluidos)");
	int minimo = 200;
	int maximo = 0;
	int sumatorio = 0;
	int random = 0;

	for (int i=1; i<=50; i++) {
		random = (int)(Math.random()*100)+100;
		System.out.printf("%d ", random);
		sumatorio += random;

		if (random>maximo) {
			maximo = random;
		} else if (random<minimo) {
			minimo = random;
		}
	}

	System.out.printf("\nEl máximo es %d, el mínimo es %d, y la media es %d\n", maximo, minimo, sumatorio/50);
   
	}
}