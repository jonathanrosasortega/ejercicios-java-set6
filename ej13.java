/*Escribe un programa que simule la tirada de dos dados. El programa deberá
continuar tirando los dados una y otra vez hasta que en alguna tirada los dos
dados tengan el mismo valor.*/
public class ej13 {
	public static void main(String[] args) {
	int dado1 = 9;
	int dado2 = 0;

	while(dado1 != dado2) {
		dado1 = (int)(Math.random()*6)+1;
		dado2 = (int)(Math.random()*6)+1;
		System.out.printf("%d %d	", dado1, dado2);
	}
	
    System.out.printf("FIN\n");
   
	}
}
