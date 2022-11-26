import java.util.Scanner;

public class examen {
    public static void main(String[] args) {

        String bar = "---+-----------+---------+---------+---------+---------+-----------+\n";
        String secondabar = "---| 0.........1.........2.........3.........4.........5.........6 | \n";
        String midbar = "---| 0123456789012345678901234567890123456789012345678901234567890 |\n";
        String camello2 = ";--;'";
        String Posicion2 = "";
        int posicion = 0;
        int probabilidadAcierto = 0;
        int avanceAcierto = 0;
        int carreraFinalizada = 0;
        int fallosConsecutivos = 0;
        int contfallo = 0;

        Scanner tecladout = new Scanner(System.in);

        for (int turnos = 1; turnos <= 60; turnos++) {
            System.out.print("\n" + bar + secondabar + midbar + bar);
            Posicion2 = " ".repeat(posicion);
            System.out.print(("[J]| " + Posicion2 + camello2 + "\n" + bar));
            System.out.println ("  ");
            System.out.print("Turno: " + turnos + " - Esta en la casilla " + posicion + "Fallaste" + contfallo);
            if (posicion >= 60) {
                carreraFinalizada++;
                System.exit(0);
            }

            if (carreraFinalizada == 0) {
                System.out.print("Elija a donde tirar!: ");
                int eleccionUsuario = tecladout.nextInt();
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
                int numeroAleatorioCamello = (int) (Math.random() * (100 - 0 + 1));
                if (numeroAleatorioCamello < 10) {
                    System.out.println("Tu camello tropieza y pierdes 2 turnos");
                    turnos += 2;
                } else if (numeroAleatorioPelota < probabilidadAcierto) {
                    System.out.println("Aciertas y avanzas " + avanceAcierto + " casillas!");
                    posicion += avanceAcierto;
                    fallosConsecutivos = 0;
                } else
                    contfallo = contfallo + 1;
            }
        }

        tecladout.close();

    }
}
