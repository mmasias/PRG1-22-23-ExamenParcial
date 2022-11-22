import java.util.Scanner;

public class ExamenParcialBase {
    public static void main(String[] args){
        int casilla = 0;
        int turno = 0 ;
        int agujero;
        String posicion0 = ("[J]| ;--;'");
        String posicion1 = ("[J]|          ;--;'");
        String posicion2 = ("[J]|                    ;--;'");
        String posicion4 = ("[J]|                                        ;--;'");
        String posicion6 = ("[J]|                                                            ;--;'");

        System.out.println("---+-----------+---------+---------+---------+---------+-----------+");
        System.out.println("---| 0.........1.........2.........3.........4.........5.........6 |");
        System.out.println("---| 0123456789012345678901234567890123456789012345678901234567890 |");
        System.out.println("---+-----------+---------+---------+---------+---------+-----------+");
        System.out.println(posicion0);
        System.out.println("---+-----------+---------+---------+---------+---------+-----------+");
        System.out.println("Turno " + turno);
        Scanner entrada = new Scanner(System.in);

        do {
            System.out.println("Elija un agujero: ");
            agujero = entrada.nextInt();

            double probAgujero = (double)(Math.random()*10);

            System.out.println("---+-----------+---------+---------+---------+---------+-----------+");
            System.out.println("---| 0.........1.........2.........3.........4.........5.........6 |");
            System.out.println("---| 0123456789012345678901234567890123456789012345678901234567890 |");
            System.out.println("---+-----------+---------+---------+---------+---------+-----------+");

            if (agujero == 1 && probAgujero <= 6){
                casilla = casilla + 1;
                System.out.println(posicion1);
                System.out.println("---+-----------+---------+---------+---------+---------+-----------+");
                System.out.println("Turno " + turno + " - Avanza 1 casilla - Está en la casilla " + casilla);
            } else if (agujero == 1 && probAgujero > 6){
                System.out.println(posicion1);
                System.out.println("---+-----------+---------+---------+---------+---------+-----------+");
                System.out.println("Turno " + turno + " - No avanza ninguna casilla - Está en la casilla " + casilla);
            }

            if (agujero == 2 && probAgujero <= 4){
                casilla = casilla + 2;
                System.out.println(posicion2);
                System.out.println("---+-----------+---------+---------+---------+---------+-----------+");
                System.out.println("Turno " + turno + " - Avanza 2 casillas - Está en la casilla " + casilla);
            } else if (agujero == 2 && probAgujero > 4){
                System.out.println(posicion2);
                System.out.println("---+-----------+---------+---------+---------+---------+-----------+");
                System.out.println("Turno " + turno + " - No avanza ninguna casilla - Está en la casilla " + casilla);
            }

            if (agujero == 3 && probAgujero <= 3){
                casilla = casilla + 4;
                System.out.println(posicion4);
                System.out.println("---+-----------+---------+---------+---------+---------+-----------+");
                System.out.println("Turno " + turno + " - Avanza 4 casillas - Está en la casilla " + casilla);
            } else if (agujero == 3 && probAgujero > 3){
                System.out.println(posicion4);
                System.out.println("---+-----------+---------+---------+---------+---------+-----------+");
                System.out.println("Turno " + turno + " - No avanza ninguna casilla - Está en la casilla " + casilla);
            }

            if (agujero == 4 && probAgujero <= 1){
                casilla = casilla + 6;
                System.out.println(posicion6);
                System.out.println("---+-----------+---------+---------+---------+---------+-----------+");
                System.out.println("Turno " + turno + " - Avanza 6 casillas - Está en la casilla " + casilla);
            } else if (agujero == 4 && probAgujero > 1){
                System.out.println(posicion6);
                System.out.println("---+-----------+---------+---------+---------+---------+-----------+");
                System.out.println("Turno " + turno + " - No avanza ninguna casilla - Está en la casilla " + casilla);
            }

            turno++;

        } while (casilla<60);

        entrada.close();

        System.out.println("El juego ha terminado");    
    }
}
