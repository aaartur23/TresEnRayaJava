import java.util.Random;
import java.util.Scanner;
public class Juego {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String nplayer1 = " ";
		String nplayer2 = " ";
		
		char player1 = 'X';
		char player2 = 'O';
		char espacio = '-';
		
		String option = " ";
		
		boolean turno = true;
		
		char tablero[][] = new char[3][3];
		
		int fila, columna = 0;
		
		System.out.println("................................");
		System.out.println(":Bienvenido a 3 en raya en JAVA:");
		System.out.println(":..............................:");
		System.out.println();
		
		do {
			
			System.out.println("Vais a querer jugar? Si / No : ");
			option = sc.next().toLowerCase();
			
			if(option.equals("si")) {
				System.out.println("Empecemos !");
				
				
				
			} else if(option.equals("no")) {
				System.out.println("Has salido correctamente...");
				break;
			} else { 
				System.out.println("Opcion no valida");
			}
			
		}while(option.equals("no"));
		
		
	}

}
