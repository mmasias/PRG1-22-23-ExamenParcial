import java.util.Scanner;

public class RasillaJoseManuel {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int p1 = 60, p2 = 40, p3 = 30, p4 = 10;
        int av1 = 1, av2 = 2, av3 = 4, av4 = 6;
        int paux = 0, avaux = 0;

        int pos = 0;
        int intentos = 0;

        int fallos = 0;
        int pTrop = 10;

        int maxTurn = 50;

        int avIA = 0;
        int posIA = 0;

        for (int i = 1; pos < 60 && intentos <= maxTurn && posIA < 60; i++) {
            // Jugador In
            System.out.println("Escoja un agujero (1 a 4)");
            int eleccion = s.nextInt();
            if (eleccion == 1) {
                System.out.println("Ha elegido el agujero 1, tiene " + p1 + "% de posibilidades de avanzar " + av1);
                paux = p1;
                avaux = av1;
            } else if (eleccion == 2) {
                System.out.println("Ha elegido el agujero 2, tiene " + p2 + "% de posibilidades de avanzar " + av2);
                paux = p2;
                avaux = av2;
            } else if (eleccion == 3) {
                System.out.println("Ha elegido el agujero 3, tiene " + p3 + "% de posibilidades de avanzar " + av3);
                paux = p3;
                avaux = av3;
            } else if (eleccion == 4) {
                System.out.println("Ha elegido el agujero 4, tiene " + p4 + "% de posibilidades de avanzar " + av4);
                paux = p4;
                avaux = av4;
            } else {
                eleccion = 1;
                System.out.println("Su eleccion no ha sido valida, se le asigna el agujero 1");
                System.out.println("El agujero 1, tiene " + p1 + "% de posibilidades de avanzar " + av1);
                paux = p1;
                avaux = av1;
            }
            // IA In
            avIA = (int) ((Math.random() * 3) + 1);
            posIA += avIA;

            // Jugador Mov
            int rnTrop = (int) (Math.random() * 100);
            if (rnTrop >= pTrop) {

                int rnd = (int) (Math.random() * 100);
                if (rnd <= paux) {
                    pos += avaux;
                    fallos = 0;
                } else {
                    fallos++;
                    avaux = 0;
                }

                if (fallos >= 3) {
                    pos = 0;
                    fallos = 0;

                    System.out.println("---+-----------+---------+---------+---------+---------+-----------+");
                    System.out.println("|           HA FALLADO 3 VECES, VUELVE AL INICIO, SUERTE           |");
                    System.out.println("---+-----------+---------+---------+---------+---------+-----------+");
                }

                if (pos < 60 && posIA < 60) {
                    System.out.println("---+-----------+---------+---------+---------+---------+-----------+");
                    System.out.println("---| 0.........1.........2.........3.........4.........5.........6 |");
                    System.out.println("---| 0123456789012345678901234567890123456789012345678901234567890 |");
                    System.out.println("---+-----------+---------+---------+---------+---------+-----------+");
                    // Camello Jugador
                    System.out.print("[J]|+ ");
                    for (int j = 0; j < 60; j++) {
                        if (j != pos) {
                            System.out.print(" ");
                        } else {
                            System.out.println(";--;'");
                            j = 60;
                        }
                    }
                    // Camello IA
                    System.out.print("[0]|+ ");
                    for (int j = 0; j < 60; j++) {
                        if (j != posIA) {
                            System.out.print(" ");
                        } else {
                            System.out.println(";--;'");
                            j = 60;
                        }
                    }
                    System.out.println("---+-----------+---------+---------+---------+---------+-----------+");

                    System.out.println("---+-----------+---------+---------+---------+---------+-----------+");
                    if (avaux != 0) {
                        System.out.println(
                                "Turno " + (i) + " - Acierta, avanza " + avaux
                                        + " casillas - Esta en la casilla "
                                        + pos);
                    } else {
                        System.out.println(
                                "Turno " + (i) + " - Falla, no hay avance - Esta en la casilla " + pos);
                    }
                    System.out.println(
                            "El ordenador avanza " + avIA + " casillas - Esta en la casilla "
                                    + posIA);
                } 

            } else {
                if(posIA<60){
                    System.out.println("\n---+-----------+---------+---------+---------+---------+-----------+");
                    System.out.println("|    EL CAMELLO HA TROPEZADO, LOS PROXIMOS 2 TURNOS ESTA QUIETO    |");
                    System.out.println("---+-----------+---------+---------+---------+---------+-----------+\n");
                    i ++;
                }
            }

            if (pos >= 60) {
                System.out.println("---+-----------+---------+---------+---------+---------+-----------+");
                System.out.println("|      EL CAMELLO HA LLEGADO AL FINAL DEL CAMINO, ENHORABUENA      |");
                System.out.println("---+-----------+---------+---------+---------+---------+-----------+");
                System.out.println("Tras " + (i) + " intentos, el camello llego al final del camino");
            } else if (posIA >= 60) {
                System.out.println("---+-----------+---------+---------+---------+---------+-----------+");
                System.out.println("|       EL ORDENADOR HA LLEGADO AL FINAL DEL CAMINO, PIERDES       |");
                System.out.println("---+-----------+---------+---------+---------+---------+-----------+");
                System.out.println("Tras " + (i) + " intentos, el ordenador llego al final del camino");
            }

            intentos = i;
        }

        if (intentos > maxTurn) {
            System.out.println("\n---+-----------+---------+---------+---------+---------+-----------+");
            System.out.println("|          EL NUMERO MAXIMO DE INTENTOS HA SIDO ALCANZADO          |");
            System.out.println("---+-----------+---------+---------+---------+---------+-----------+");
        }

        s.close();
    }

}