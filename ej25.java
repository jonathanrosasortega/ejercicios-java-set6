/*Escribe un programa que muestre por pantalla 100 números enteros separados por un espacio. Los números deben estar generados de forma
aleatoria en un rango entre 10 y 200 ambos incluidos. Los primos deben aparecer entre
almohadillas (p. ej. #19#) y los múltiplos de 5 entre corchetes (p. ej. [25]).*/
public class ej25 {
	public static void main(String[] args) {
	int numero;
	boolean primo = false;
  int j;
	for (int i=1; i<=100; i++) {
		numero = (int)(Math.random()*191)+10;
		
		primo = false;
		for (j=2; j<=(numero/2); j++) {
			if (numero%j == 0) {
				primo = true;
			}
		}

		if (primo == false) {
			System.out.printf("#%d# ", numero);
		} else if (numero%5 == 0) {
			System.out.printf("[%d] ", numero);
		} else {
			System.out.printf("%d ", numero);
		}
	}
	
    System.out.printf("\nFIN\n");
   
	}
}
