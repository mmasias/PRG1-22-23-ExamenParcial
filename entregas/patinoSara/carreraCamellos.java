import java.util.Scanner;

public class carreraCamellos {
    public static void main(String[] args) {
        Scanner inputUsuario = new Scanner(System.in);

        int posicionJugador = 0;
        int númeroTotalCasillas = 60;
        double acertarAgujero = Math.random();

        for (int turno = 0; turno <= 50; turno = turno + 1) {
            System.out.println("---+-----------+---------+---------+---------+---------+-----------+");
            System.out.println("---| 0.........1.........2.........3.........4.........5.........6 |");
            System.out.println("---| 0123456789012345678901234567890123456789012345678901234567890 |");
            System.out.println("---+-----------+---------+---------+---------+---------+-----------+");
            System.out.println("[J]| ;--;'                                                          ");
            System.out.println("---+-----------+---------+---------+---------+---------+-----------+");

            System.out.println("Por cual agujero lo quieres intentar meter?");
            int agujero = inputUsuario.nextInt();

            if (agujero == 1 && acertarAgujero <= .60) {
                posicionJugador = posicionJugador + 1;
                System.out.print("Avanza una casilla-- Estas en la casilla: " + posicionJugador);
            }else if(agujero == 1 && acertarAgujero > .60){
                System.out.print(" No avanza ninguna casilla-- Estas en la casilla:  " + posicionJugador);
            }
            if (agujero == 2 && acertarAgujero <= .40) {
                posicionJugador = posicionJugador + 2;
                System.out.print("Avanza dos casilla-- Estas en la casilla: " + posicionJugador);
            }else if(agujero == 2 && acertarAgujero > .40){
                System.out.print(" No avanza ninguna casilla-- Estas en la casilla:  " + posicionJugador);
            }

            if (agujero == 3 && acertarAgujero <= .30) {
                posicionJugador = posicionJugador + 4;
                System.out.print("Avanza cuatro casilla-- Estas en la casilla: " + posicionJugador);
            }else if(agujero == 3 && acertarAgujero > .30){
                System.out.print(" No avanza ninguna casilla-- Estas en la casilla:  " + posicionJugador);
            }

            if (agujero == 4 && acertarAgujero <= .10) {
                posicionJugador = posicionJugador + 6;
                System.out.print("Avanza seis casilla-- Estas en la casilla: " + posicionJugador);
            }else if(agujero == 4 && acertarAgujero > .10){
                System.out.print(" No avanza ninguna casilla-- Estas en la casilla:  " + posicionJugador);
            }

            System.out.println(" Turno: " + turno);
        }
        System.out.println("Se termino el juego");
        
    }
}
