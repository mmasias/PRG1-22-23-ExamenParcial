import java.util.Scanner;

public class carreraCamellos {
    public static void main(String[] args) {
        Scanner inputUsuario = new Scanner(System.in);

        int posicionJugador = 0;
        int posicionOrdenador = 0;
        int numeroTotalCasillas = 60;
        double acertarAgujero = Math.random();
        double agujeroOrdenador = Math.random();
        //String bordes = "---+-----------+---------+---------+---------+---------+-----------+";
        //String casilla1 = "---| 0.........1.........2.........3.........4.........5.........6 |";
        //String casilla2 = "---| 0123456789012345678901234567890123456789012345678901234567890 |";
        //String posicionCamello = "[J]| ;--;'";

        for (int turno = 0; turno <= 50; turno = turno + 1) {

            System.out.println("Por cual agujero lo quieres intentar meter?");
            int agujero = inputUsuario.nextInt();

            if(posicionJugador>numeroTotalCasillas || posicionOrdenador> numeroTotalCasillas){
                System.out.println("Se termino el juego");
            }

            
            if (agujero == 1 && acertarAgujero <= .60 && posicionJugador<=60) {
                posicionJugador = posicionJugador + 1;
                System.out.print("Avanza una casilla-- Estas en la casilla: " + posicionJugador);
            }else if(agujero == 1 && acertarAgujero > .60 && posicionJugador<=60){
                System.out.print(" No avanza ninguna casilla-- Estas en la casilla:  " + posicionJugador);
            }

            if(posicionJugador<=.25 && acertarAgujero <=.60 && posicionOrdenador<= 60){
                posicionOrdenador = posicionOrdenador + 1;
                System.out.print("el ordenador avanzo dos casilla-- Esta en la casilla: " + posicionOrdenador);
            }else if(posicionJugador<=.25 && acertarAgujero > .40 && posicionOrdenador <= 60){
                System.out.print(" No avanzo ninguna casilla el ordenador -- Esta en la casilla:  " + posicionOrdenador);
            }

            if (agujero == 2 && acertarAgujero <= .40 && posicionJugador<=60) {
                posicionJugador = posicionJugador + 2;
                System.out.print("Avanza dos casilla-- Estas en la casilla: " + posicionJugador);
            }else if(agujero == 2 && acertarAgujero > .40 && posicionJugador<=60){
                System.out.print(" No avanza ninguna casilla-- Estas en la casilla:  " + posicionJugador);
            }
            if(posicionJugador<=50 && acertarAgujero <=.40 && posicionOrdenador<= 60){
                posicionOrdenador = posicionOrdenador + 1;
                System.out.print("el ordenador avanzo dos casilla-- Esta en la casilla: " + posicionOrdenador);
            }else if(posicionJugador<=.50 && acertarAgujero > .40 && posicionOrdenador <= 60){
                System.out.print(" No avanzo ninguna casilla el ordenador -- Esta en la casilla:  " + posicionOrdenador);
            }

            if (agujero == 3 && acertarAgujero <= .30 && posicionJugador<=60) {
                posicionJugador = posicionJugador + 4;
                System.out.print("Avanza cuatro casilla-- Estas en la casilla: " + posicionJugador);
            }else if(agujero == 3 && acertarAgujero > .30 && posicionJugador<=60){
                System.out.print(" No avanza ninguna casilla-- Estas en la casilla:  " + posicionJugador);
            }
            if(posicionJugador<=.75 && acertarAgujero <=.30 && posicionOrdenador<= 60){
                posicionOrdenador = posicionOrdenador + 1;
                System.out.print("el ordenador avanzo dos casilla-- Esta en la casilla: " + posicionOrdenador);
            }else if(posicionJugador<=.75 && acertarAgujero > .30 && posicionOrdenador <= 60){
                System.out.print(" No avanzo ninguna casilla el ordenador -- Esta en la casilla:  " + posicionOrdenador);
            }

            if (agujero == 4 && acertarAgujero <= .10 && posicionJugador<=60) {
                posicionJugador = posicionJugador + 6;
                System.out.print("Avanza seis casilla-- Estas en la casilla: " + posicionJugador);
            }else if(agujero == 4 && acertarAgujero > .10 && posicionJugador<=60){
                System.out.print(" No avanza ninguna casilla-- Estas en la casilla:  " + posicionJugador);
            }
            if(posicionJugador<=1 && acertarAgujero <=.10 && posicionOrdenador<= 60){
                posicionOrdenador = posicionOrdenador + 1;
                System.out.print("el ordenador avanzo dos casilla-- Esta en la casilla: " + posicionOrdenador);
            }else if(posicionJugador<=.25 && acertarAgujero > .10 && posicionOrdenador <= 60){
                System.out.print(" No avanzo ninguna casilla el ordenador -- Esta en la casilla:  " + posicionOrdenador);
            }

            System.out.println(" Turno: " + turno);
        }
        System.out.println("Se termino el juego");
        
    }
}
