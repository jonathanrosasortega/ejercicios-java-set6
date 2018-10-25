/*Muestra 20 números enteros aleatorios entre 0 y 10 (ambos incluidos) separados por espacios.*/
public class ej4 {
	public static void main(String[] args) {
	System.out.println("20 números enteros aleatorios entre 0 y 10 (ambos incluidos)");
	
	for (int i=1; i<=20; i++) {
		System.out.printf("%d ", (int)(Math.random()*11));
	}
	
    System.out.printf("FIN\n");
   
	}
}