// Javier Salmerón - Sol. de https://github.com/mmasias/PRG1-22-23-ExamenParcial

import java.util.Scanner;

public class carreraCamellos {
    public static void main(String[] args) {

        // Variables para el arte ascii
        String asciiBordes = "---+-----------+---------+---------+---------+---------+-----------+\n";
        String asciiDistancia = "---| 0.........1.........2.........3.........4.........5.........6 | \n---| 0123456789012345678901234567890123456789012345678901234567890 |\n";
        String asciiCamello = ";--;'";
        String asciiPosicion = "";

        // Variables para el programa
        int posicion = 0;
        int probabilidadAcierto = 0;
        int avanceAcierto = 0;
        int carreraFinalizada = 0;
        int fallosConsecutivos = 0;

        Scanner userInput = new Scanner(System.in);

        // Que empieze el juego
        System.out.println("--------> CARRERA DE CAMELLOS <--------");
        for (int turnos = 1; turnos <= 50; turnos++) {

            // Dar informacion de partida al usuario
            System.out.print("\n" + asciiBordes + asciiDistancia + asciiBordes);
            asciiPosicion = " ".repeat(posicion); // añadir tantos espacios como avance tenga el jugador
            System.out.println(("[J]| " + asciiPosicion + asciiCamello + "\n" + asciiBordes));
            System.out.println("Turno: " + turnos + " - Esta en la casilla " + posicion);

            if (posicion >= 60) {
                carreraFinalizada++;
                System.out.println("\nFELICIDADES, HAS FINALIZADO LA CARRERA!");
            }

            if (carreraFinalizada == 0) {
                // El jugador elije un agujero
                System.out.print("Elija un agujero(1-4): ");
                int eleccionUsuario = userInput.nextInt();

                // Elegir un numero aleatorio (0-100), y si entra en la posibilidad, avanzar.
                int numeroAleatorioPelota = (int) (Math.random() * (100 - 0 + 1));

                if (eleccionUsuario == 1) {
                    probabilidadAcierto = 60;
                    avanceAcierto = 1;

                } else if (eleccionUsuario == 2) {
                    probabilidadAcierto = 40;
                    avanceAcierto = 2;

                } else if (eleccionUsuario == 3) {
                    probabilidadAcierto = 20;
                    avanceAcierto = 4;

                } else if (eleccionUsuario == 4) {
                    probabilidadAcierto = 10;
                    avanceAcierto = 6;

                } else {
                    System.out.println("Tiras a la nada.");
                    probabilidadAcierto = 0;
                }

                // Elegimos otro numero aleatorio, ya que usar el mismo seria injusto para el
                // jugador y calculamos si tropieza el camello, de lo contrario, avanza o no.
                int numeroAleatorioCamello = (int) (Math.random() * (100 - 0 + 1));

                if (numeroAleatorioCamello < 10) {
                    System.out.println("Tu camello tropieza y pierdes 2 turnos");
                    turnos += 2;

                } else if (numeroAleatorioPelota < probabilidadAcierto) {
                    System.out.println("Aciertas y avanzas " + avanceAcierto + " casillas!");
                    posicion += avanceAcierto;
                    fallosConsecutivos = 0;
                } else
                    System.out.println("Has fallado :(");
                fallosConsecutivos++;

                // Falla 3 veces, regresa al inicio.
                if (fallosConsecutivos >= 3) {
                    System.out.println("Has fallado 3 veces consecutivas, vuelves al inicio!");
                    posicion = 0;
                    fallosConsecutivos = 0;
                }

            }
        }

        userInput.close();

    }
}