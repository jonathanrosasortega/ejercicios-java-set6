/*Realiza un programa que pinte por pantalla diez líneas formadas por caracteres. El carácter con el que se pinta cada línea se elige deç
forma aleatoria entre uno de los siguientes: *, -, =, ., |, @. Las líneas deben tener una longitud
aleatoria entre 1 y 40 caracteres.*/
public class ej10 {
	public static void main(String[] args) {
	System.out.println("Lineas de caracteres aleatorias:");
	int caracter;
	int longitud;
	int j;

	for (int i=1; i<=10; i++) {
		caracter = (int)(Math.random()*6);
		longitud = (int)(Math.random()*40)+1;
		for (j=1; j<=longitud; j++) {
			switch (caracter) {
				case 0:
					System.out.print("*");
				break;
				case 1:
					System.out.print("-");
				break;
				case 2:
					System.out.print("=");
				break;
				case 3:
					System.out.print(".");
				break;
				case 4:
					System.out.print("|");
				break;
				case 5:
					System.out.print("@");
				break;
			}
			
		}
    System.out.println();
	}
	
    System.out.printf("\nFIN\n");
   
	}
}
