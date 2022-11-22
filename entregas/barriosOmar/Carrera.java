package entregas.barriosOmar;

import java.util.Scanner;

public class Carrera {
    public static void main(String[] args) {

        int meta = 60;
        int turno = 0;
        int maxTurnos = 50;
        int posicionCamello = 0;
        int posicionOrdenador = 0;
        int avanceDelCamello = 0;
        int avanceAgujero1 = 1;
        int avanceAgujero2 = 2;
        int avanceAgujero3 = 4;
        int avanceAgujero4 = 6;
        int numeroNoAciertos = 0;
        double probabilidadDeAciertoOrdenador = (int) (Math.random() * 10 + 1);
        double probabilidadDeAcierto = Math.random();
        String camello = ";--;'";
        String agujero1 = " ";
        String agujero2 = "  ";
        String agujero3 = "    ";
        String agujero4 = "      ";
        String pista = "";
        String pistaOrdenador = "";
        Scanner entradaEscaner = new Scanner(System.in);

        do {
            System.out.println("---+-----------+---------+---------+---------+---------+-----------+");
            System.out.println("---| 0.........1.........2.........3.........4.........5.........6 |");
            System.out.println("---| 0123456789012345678901234567890123456789012345678901234567890 |");
            System.out.println("---+-----------+---------+---------+---------+---------+-----------+");
            System.out.println("[J]|" + pista + camello);
            System.out.println("[O]|" + pistaOrdenador + camello);
            System.out.println("---+-----------+---------+---------+---------+---------+-----------+");

            if (turno == 0) {
                System.out.println("Turno ");
            } else {
                System.out.println(
                        "Turno " + turno + " Avanza " + avanceDelCamello + " - Esta en la casilla " + posicionCamello);
            }

            System.out.println("Elija un agujero ");

            int agujeroElejido = 0;
            agujeroElejido = entradaEscaner.nextInt();

            if (agujeroElejido == 1 && probabilidadDeAcierto < 0.60) {
                posicionCamello = posicionCamello + avanceAgujero1;
                pista = pista + agujero1;
                avanceDelCamello = 1;
            } else {
                numeroNoAciertos++;
            }

            if (agujeroElejido == 2 && probabilidadDeAcierto < 0.40) {
                posicionCamello = posicionCamello + avanceAgujero2;
                pista = pista + agujero2;
                avanceDelCamello = 2;
            } else {
                numeroNoAciertos++;
            }

            if (agujeroElejido == 3 && probabilidadDeAcierto < 0.30) {
                posicionCamello = posicionCamello + avanceAgujero3;
                pista = pista + agujero3;
                avanceDelCamello = 4;
            } else {
                numeroNoAciertos++;
            }

            if (agujeroElejido == 4 && probabilidadDeAcierto < 0.10) {
                posicionCamello = posicionCamello + avanceAgujero4;
                pista = pista + agujero4;
                avanceDelCamello = 6;
            } else {
                numeroNoAciertos++;
            }

            if (numeroNoAciertos == 3) {
                posicionCamello = 0;
                numeroNoAciertos = 0;
                pista = "";
            }
            // ordenador

            if (probabilidadDeAciertoOrdenador == 1 && probabilidadDeAcierto < 0.60) {
                posicionOrdenador = posicionOrdenador + avanceAgujero1;
                pistaOrdenador = pistaOrdenador + agujero1;
            }

            if (probabilidadDeAciertoOrdenador == 2 && probabilidadDeAcierto < 0.40) {
                posicionOrdenador = posicionOrdenador + avanceAgujero2;
                pistaOrdenador = pistaOrdenador + agujero2;
            }

            if (probabilidadDeAciertoOrdenador == 3 && probabilidadDeAcierto < 0.30) {
                posicionOrdenador = posicionOrdenador + avanceAgujero3;
                pistaOrdenador = pistaOrdenador + agujero3;
            }

            turno++;
        } while ((posicionCamello <= meta) || (posicionOrdenador <= meta) || (turno <= maxTurnos));

        entradaEscaner.close();
    }
}
