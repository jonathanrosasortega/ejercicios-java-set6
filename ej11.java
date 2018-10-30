/*Escribe un programa que muestre 20 notas generadas al azar. Las notas deben
aparecer de la forma: suspenso, suficiente, bien, notable o sobresaliente. Al
final aparecerá el número de suspensos, el número de suficientes, el número
de bienes, etc.*/
public class ej11 {
	public static void main(String[] args) {
	System.out.println("20 notas generadas al azar:");
	int nota;
	int suspensos = 0;
	int suficientes = 0;
	int bien = 0;
	int notables = 0;
	int sobresalientes = 0;

	for (int i=1; i<=20; i++) {
		nota = (int)(Math.random()*10)+1;
		if (nota<5) {
			System.out.print("Suspenso	");
			suspensos++;
		} else if (nota == 5) {
			System.out.print("Suficiente	");
			suficientes++;
		} else if (nota == 6) {
			System.out.print("Bien	");
			bien++;
		} else if ((nota == 7) || (nota == 8)) {
			System.out.print("Notable	");
			notables++;
		} else if (nota > 8) {
			System.out.print("Sobresaliente	");
			sobresalientes++;
		}
    if (i%5==0) {
      System.out.println();
    }
	}
	System.out.println("\nResultados:");
	System.out.printf("Suspensos: %d\n", suspensos);
	System.out.printf("Suficientes: %d\n", suficientes);
	System.out.printf("Bien: %d\n", bien);
	System.out.printf("Notables: %d\n", notables);
	System.out.printf("Sobresalientes: %d\n", sobresalientes);

    System.out.printf("FIN\n");
   
	}
}
