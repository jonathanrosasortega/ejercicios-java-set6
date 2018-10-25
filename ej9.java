/*Realiza un programa que vaya generando números aleatorios pares entre 0
y 100 y que no termine de generar números hasta que no saque el 24. El
programa deberá decir al final cuántos números se han generado.*/
public class ej9 {
	public static void main(String[] args) {
	int numero = 0;
	int contador = 0;
	do {
		numero = (int)(Math.random()*50)*2;
		System.out.printf("%d ", numero);
		contador++;
	} while (numero != 24);
	System.out.printf("\n\nSe han generado %d números\n", contador);
	
    System.out.printf("FIN\n");
   
	}
}
