/*Realiza un programa que pinte por pantalla una serpiente con un “serpenteo”
aleatorio. La cabeza se representará con el carácter @ y se debe colocar
exactamente en la posición 13 (con 12 espacios delante). A partir de ahí,
el cuerpo irá serpenteando de la siguiente manera: se generará de forma
aleatoria un valor entre tres posibles que hará que el siguiente carácter se
coloque una posición a la izquierda del anterior, alineado con el anterior o una
posición a la derecha del anterior. La longitud de la serpiente se pedirá por
teclado y se supone que el usuario introducirá un dato correcto.
Ejemplo:
Por favor, introduzca la longitud de la serpiente en caracteres contando la cabeza: 6
  @
 *
  *
   *
  *
  *
*/
public class ej22 {
	public static void main(String[] args) {
	System.out.println("Por favor, introduzca la longitud de la serpiente en caracteres contando la cabeza:");
	int longitud = Integer.parseInt(System.console().readLine());
	int posicion;
	int j;
	System.out.println("            @");
	for (int i=2; i<=longitud; i++) {
		System.out.print("           ");
		posicion = (int)(Math.random()*3)+1;
		for(j=1; j<=posicion; j++) {
			if (j==posicion) {
				System.out.println("*");
			} else {
				System.out.print(" ");
			}
		}
	}
    System.out.printf("FIN\n");
   
	}
}
