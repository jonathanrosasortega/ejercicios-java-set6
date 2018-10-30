/*Realiza un programa que pinte por pantalla una pecera con un pececito dentro.
Se debe pedir al usuario el ancho y el alto de la pecera, que como mínimo
serán de 4 unidades. No hay que comprobar que los datos se introducen
correctamente; podemos suponer que el usuario los introduce bien. Dentro
de la pecera hay que colocar de forma aleatoria un pececito, que puede estar
situado en cualquiera de las posiciones que quedan en el hueco que forma el
rectángulo.

Ejemplo:
Por favor, introduzca la altura de la pecera (como mínimo 4): 4
Ahora introduzca la anchura (como mínimo 4): 7
*******
*     *
*    &*
*******
*/
public class ej17 {
	public static void main(String[] args) {
	System.out.println("Por favor, introduzca la altura de la pecera (como mínimo 4):");
	int altura = Integer.parseInt(System.console().readLine());
	System.out.println("Ahora introduzca la anchura (como mínimo 4):");
	int anchura = Integer.parseInt(System.console().readLine());
	int j;
	int i;
	int posicionPez = (int)(Math.random()*((altura-2)*(anchura-2))+1);
	int posicion = 0;

	for (i=1; i<=anchura; i++) {
		System.out.print("*");
	} // Pinta la 1ª linea
	System.out.println();
	
	for (i=1; i<=(altura-2); i++) {
		System.out.print("*");
		for (j=1; j<=(anchura-2); j++) {
	      posicion++;
	      if (posicion == posicionPez) {
	        System.out.print("&");
	      } else {
	        System.out.printf(" ");
	      }
	    }
		System.out.println("*");	
	} // Pinta la zona del pez + el pez

	for (i=1; i<=anchura; i++) {
		System.out.print("*");
	} // Pinta la última linea
    System.out.printf("\nFIN\n");   
	}
}