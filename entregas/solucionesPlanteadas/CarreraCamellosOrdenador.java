import java.util.Scanner;
class CarreraCamellosOrdenador {
	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
		
		final String REGLETA = "---+-----------+---------+---------+---------+---------+-----------+";
		final String POSICIONES = "---| 0.........1.........2.........3.........4.........5.........6 |\n---| 0123456789012345678901234567890123456789012345678901234567890 |";
		final String CAMELLO = ";--;'";
		final int POSICION_FINAL = 60;
		final int NUMERO_TURNOS = 50;

		int posicionCamello = 0;
		int posicionOrdenador = 0;
		
		int opcionUsuario;
		int avanceUsuario, avanceOrdenador;
		double probabilidadUsuario;
		double probabilidadTropiezo;
		boolean hayGanador = false;
		boolean quedanTurnos = true;
		int conteoTurno = 0;
		int conteoFallos = 0;
		String descripcionAdicional;

		do {
			conteoTurno = conteoTurno + 1;
			
			System.out.println("Elija un agujero:");
			opcionUsuario = entrada.nextInt();
			probabilidadUsuario = Math.random();
			
			avanceUsuario = 0;
			
			if (opcionUsuario == 1 && probabilidadUsuario <= 0.6) { avanceUsuario=1; }
			if (opcionUsuario == 2 && probabilidadUsuario <= 0.4) { avanceUsuario=2; }
			if (opcionUsuario == 3 && probabilidadUsuario <= 0.3) { avanceUsuario=4; }
			if (opcionUsuario == 4 && probabilidadUsuario <= 0.1) { avanceUsuario=6; }
			
			if (avanceUsuario==0) { 
				conteoFallos = conteoFallos + 1; 
			} else { 
				conteoFallos = 0; 
			}
			
			descripcionAdicional = "";
			
			if (conteoFallos>=3) {
				posicionCamello=0;
				conteoFallos=0;
				descripcionAdicional = descripcionAdicional + " - VUELVE AL INICIO";
			}
			
			probabilidadTropiezo = Math.random();
			if (probabilidadTropiezo<=0.1) {
				avanceUsuario=0;
				conteoTurno = conteoTurno + 2;
				descripcionAdicional = descripcionAdicional + " - SE HA CAIDO Y PERDIO 3 TURNOS";
				for (int turnosPerdidos=1;turnosPerdidos<=2;turnosPerdidos++) {
					avanceOrdenador = (int)(Math.random()*3+1);
					posicionOrdenador = posicionOrdenador + avanceOrdenador;
				}
			}
			
			posicionCamello = posicionCamello + avanceUsuario;
			
			avanceOrdenador = (int)(Math.random()*3+1);
			posicionOrdenador = posicionOrdenador + avanceOrdenador;
			
			System.out.println(REGLETA);
			System.out.println(POSICIONES);
			System.out.println(REGLETA);
			
			System.out.print("[J]| ");
			for (int i=0;i<posicionCamello;i++){
				System.out.print(" ");
			}
			System.out.println(CAMELLO);
			System.out.println(REGLETA);
			
			System.out.print("[O]| ");
			for (int i=0;i<posicionOrdenador;i++){
				System.out.print(" ");
			}
			System.out.println(CAMELLO);
			System.out.println(REGLETA);
			
			System.out.println("Turno [" + conteoTurno + "] - Avanza [" + avanceUsuario + "] casillas - Esta en la casilla [" + posicionCamello + "]" + descripcionAdicional);
			
			if (posicionCamello>=POSICION_FINAL || posicionOrdenador>=POSICION_FINAL) {hayGanador=true;}
			if (conteoTurno>=NUMERO_TURNOS) {quedanTurnos = false;}
			
		} while (!hayGanador && quedanTurnos);
		
		if (!quedanTurnos) {
			descripcionAdicional = "Se han agotado los turnos!";
		} else if (posicionCamello>posicionOrdenador) {
			descripcionAdicional = "Gano el jugador!";
		} else {
			descripcionAdicional = "Gano el ordenador!";
		}
		
		System.out.println("PARTIDA TERMINADA > " + descripcionAdicional);
	}
}