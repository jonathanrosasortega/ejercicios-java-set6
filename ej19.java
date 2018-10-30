/*Escribe un programa que muestre 50 números enteros aleatorios comprendidos entre el -100 y el 200 ambos incluidos y separados por espacios. Muestra
luego el máximo de los pares el mínimo de los impares y la media de todos los
números generados.*/
public class ej19 {
	public static void main(String[] args) {
	int parMaximo = -500;
	int imparMinimo = 500;
	int sumatorio = 0;

	for (int i=0; i<50; i++) {
		int numero = (int)(Math.random()*301)-100;
		System.out.printf("%d ", numero);
		sumatorio += numero;

		if ((numero%2==0) && (numero>parMaximo)) {
			parMaximo = numero;
		}

		if ((numero%2==1) && (numero<imparMinimo)) {
			imparMinimo = numero;
		}
	}
	System.out.printf("\nEl máximo de los pares es %d\n", parMaximo);
	System.out.printf("El mínimo de los impares es %d\n", imparMinimo);
	System.out.printf("La media de todos es %d\n", sumatorio/50);
    System.out.printf("FIN\n");
   
	}
}
