/*Realiza un programa que haga justo lo contrario a lo que hace el ejercicio 6.
El programa intentará adivinar el número que estás pensando - un número
entre 0 y 100 - teniendo para ello 5 oportunidades. En cada intento fallido, el
programa debe preguntar si el número que estás pensando es mayor o menor
que el que te acaba de decir.*/
public class ej14 {
	public static void main(String[] args) {
	System.out.println("¡Adivinaré el número (Entre 0 y 100)!");
	
	int numero;
	int intentos = 0;
	boolean acierto = false;
	numero = (int)(Math.random()*101);
	String respuesta;
	String mayor_o_menor;
	int limiteMaximo = 101;
	int limiteMinimo = 0;

	while ((intentos != 5) && (acierto == false)) {
		System.out.printf("Yo digo que tu número secreto es: %d\n", numero);
		System.out.println("¿He acertado?:");
		respuesta = (System.console().readLine());

		switch (respuesta) {
			case "si":
				acierto = true;
			break;
			case "no":
				intentos++;
        System.out.println("Vale, pero ¿Es mayor o menor?:");
				mayor_o_menor = (System.console().readLine());
				switch(mayor_o_menor) {
					case "mayor":
						limiteMinimo = numero+1;
						break;
					case "menor":
						limiteMaximo = numero;
					break;
					default:
					System.out.println("¡No pongas cosas raras!");
				}
				
			break;
		}

		numero = (int)(Math.random()*(limiteMaximo-limiteMinimo)+limiteMinimo);
	} // fin while
	
	if (intentos == 5) {
		System.out.printf("\n¡Vaya! Tú ganas esta vez\n");
	} else if (acierto == true) {
		System.out.println("¡Gano yo!");
	}

    System.out.printf("FIN\n");
   
	}
}
