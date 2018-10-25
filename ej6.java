/*Escribe un programa que piense un número al azar entre 0 y 100. El usuario
debe adivinarlo y tiene para ello 5 oportunidades. Después de cada intento
fallido, el programa dirá cuántas oportunidades quedan y si el número introducido es menor o mayor que el número secreto.*/
public class ej6 {
	public static void main(String[] args) {
	System.out.println("¡Adivina el número (Entre 0 y 100)!");
	int numero;
	int intentos = 0;
	int secreto = (int)(Math.random()*101);
	boolean acierto = false;

	while ((intentos != 5) && (acierto == false)) {
		System.out.println("Introduce un número:");
		numero = Integer.parseInt(System.console().readLine());

		if (numero<secreto) {
			System.out.println("El número secreto es mayor");
			intentos++;
		} else if (numero>secreto) {
			System.out.println("El número secreto es menor");
			intentos++;
		} else if (numero == secreto) {
			acierto = true;
		}
	}
	
	if (intentos == 5) {
		System.out.printf("\n¡Fallaste! El número secreto era %d\n", secreto);
	} else if (acierto == true) {
		System.out.println("¡Felicidades, has acertado!");
	}
	
    System.out.printf("FIN\n");
   
	}
}
