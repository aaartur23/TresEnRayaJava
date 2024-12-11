import java.util.Random;
import java.util.Scanner;
public class Juego {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random rn = new Random();
		
		String nplayer1 = " ";
		String nplayer2 = " ";
		
		char player1 = 'X';
		char player2 = 'O';
		char espacio = '-';

		String option = " ";
		boolean turnoJugador1;
		boolean juegoActivo = true;
		char tablero[][] = new char[3][3];
		String ganador;
		
		System.out.println("................................");
		System.out.println(":Bienvenido a 3 en raya en JAVA:");
		System.out.println(":..............................:");
		System.out.println();
		
		do {
			
			System.out.println("Vais a querer jugar? Si / No : ");
			option = sc.next().toLowerCase();
			
			if(option.equals("si")) {
				System.out.println("Empecemos !");

				System.out.print("Introduce el nombre del Jugador 1: ");
				nplayer1 = sc.next();
				System.out.print("Introduce el nombre del Jugador 2: ");
				nplayer2 = sc.next();

				// Inicializo el tablero
				for (int i = 0; i < 3; i++) {
					for (int j = 0; j < 3; j++) {
						tablero[i][j] = espacio;
					}
				}

				// Lanzo moneda para determinar el primer turno
				turnoJugador1 = rn.nextBoolean();
				System.out.println("\n¡El sorteo ha determinado que comienza " +
						(turnoJugador1 ? nplayer1 : nplayer2) + "!\n");

				while (juegoActivo) {
					// Mostrar tablero
					System.out.println("Tablero actual:");
					for (int i = 0; i < 3; i++) {
						for (int j = 0; j < 3; j++) {
							System.out.print(tablero[i][j] + " ");
						}
						System.out.println();
					}

					// Turno del jugador actual
					System.out.println((turnoJugador1 ? nplayer1 : nplayer2) +
							", es tu turno. Introduce fila y columna (0-2):");

					int fila = sc.nextInt();
					int columna = sc.nextInt();

					// Valido movimiento
					if (fila >= 0 && fila < 3 && columna >= 0 && columna < 3 && tablero[fila][columna] == espacio) {
						tablero[fila][columna] = turnoJugador1 ? player1 : player2;

						// Compruebo si alguien ha ganado
						boolean hayGanador = false;

						// Compruebo filas
						for (int i = 0; i < 3; i++) {
							if (tablero[i][0] == tablero[i][1] && tablero[i][1] == tablero[i][2] && tablero[i][0] != espacio) {
								hayGanador = true;
							}
						}

						// Compruebo columnas
						for (int i = 0; i < 3; i++) {
							if (tablero[0][i] == tablero[1][i] && tablero[1][i] == tablero[2][i] && tablero[0][i] != espacio) {
								hayGanador = true;
							}
						}

						// Compruebo diagonales
						if (tablero[0][0] == tablero[1][1] && tablero[1][1] == tablero[2][2] && tablero[0][0] != espacio) {
							hayGanador = true;
						}
						if (tablero[0][2] == tablero[1][1] && tablero[1][1] == tablero[2][0] && tablero[0][2] != espacio) {
							hayGanador = true;
						}
				
			} else if(option.equals("no")) {
				System.out.println("Has salido correctamente...");
				break;
			} else { 
				System.out.println("Opcion no valida");
			}
			
		}while(option.equals("no"));
		
		
	}

}
