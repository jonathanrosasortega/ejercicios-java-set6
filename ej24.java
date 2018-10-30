/*Escribe un programa que, dado un número introducido por teclado, elija al azar
uno de sus dígitos.

Ejemplo 1:
Por favor, introduzca un número entero positivo: 406783
7

Ejemplo 2:
Por favor, introduzca un número entero positivo: 406783
3

Ejemplo 3:
Por favor, introduzca un número entero positivo: 406783
0
*/
public class ej24 {
	public static void main(String[] args) {
	System.out.println("Por favor, introduzca un número entero positivo:");
	int numero = Integer.parseInt(System.console().readLine());
	int auxiliar = numero;
	int digitos = 0;
	int elegido = 0;;

	while (auxiliar%10 > 0) {
		auxiliar /= 10;
		digitos++;
	} //Calcula los dígitos que tiene
	int seleccion = (int)(Math.random()*digitos)+1;// Uno de los digitos al azar

	for (int i=1; i<=seleccion; i++) {
		elegido = numero%10;
		numero /= 10;
	}

    System.out.printf("\n%d\n", elegido);
   
	}
}
