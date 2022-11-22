import java.util.Scanner;
public class ExamenCesar {
    public static void main(String args[]) {

        Scanner entrada = new Scanner(System.in);
        int agujero = 0;
        int posicion = 0;
        int turno = 0;
        String caballo = ";--;'";
        String n1 = " ";
        String n2 = "  ";
        String n3 = "    ";
        String n4 = "      ";
        do {

            System.out.println("---+-----------+---------+---------+---------+---------+-----------+");
            System.out.println("---| 0.........1.........2.........3.........4.........5.........6 |");
            System.out.println("---| 0123456789012345678901234567890123456789012345678901234567890 |");
            System.out.println("---+-----------+---------+---------+---------+---------+-----------+");
            System.out.println("[J]| " + caballo);
            System.out.println("---+-----------+---------+---------+---------+---------+-----------+");
            System.out.println("Turno " + turno);
            System.out.println("Casilla " + posicion);
            System.out.println("Elija un agujero:");
            agujero = entrada.nextInt();
            turno = turno + 1;

            int probabilidad1 = (int)(Math.random() * 100)+1;
            int probabilidad2 = (int)(Math.random() * 100)+1;
            int probabilidad3 = (int)(Math.random() * 100)+1;
            int probabilidad4 = (int)(Math.random() * 100)+1;

            if (agujero == 1){
                if (probabilidad1 <= 60) {
                    System.out.println("¡Ha acertado! Avanza 1 casilla");
                    caballo = caballo.replace(caballo, n1 + caballo);
                    posicion = posicion + 1;
                }   else {
                    System.out.println("Ha fallado");
                }
            }   else if (agujero == 2){
                    if (probabilidad2 <= 40) {
                        System.out.println("¡Ha acertado! Avanza 2 casillas");
                        caballo = caballo.replace(caballo, n2 + caballo);
                        posicion = posicion + 2;
                    }   else {
                        System.out.println("Ha fallado");
                }
            }   else if (agujero == 3){
                    if (probabilidad3 <= 30) {
                        System.out.println("¡Ha acertado! Avanza 3 casillas");
                        caballo = caballo.replace(caballo, n3 + caballo);
                        posicion = posicion + 4;
                    }   else {
                        System.out.println("Ha fallado");
                }
            }   else if (agujero == 4){
                    if (probabilidad4 <= 10) {
                        System.out.println("¡Ha acertado! Avanza 4 casillas");
                        caballo = caballo.replace(caballo, n4 + caballo);
                        posicion = posicion + 6;
                    }   else {
                        System.out.println("Ha fallado");
                }
            }   else {
                System.out.println("Usted ha escogido mal, el juego se cancela...");
                break;
            }   if (turno >= 50) {
                System.out.println("¡Usted se ha quedado sin turnos!");
            }
        } while(posicion <= 60 && turno <= 50);
        if (posicion >= 60) {
            System.out.println("---+-----------+---------+---------+---------+---------+-----------+");
            System.out.println("---| 0.........1.........2.........3.........4.........5.........6 |");
            System.out.println("---| 0123456789012345678901234567890123456789012345678901234567890 |");
            System.out.println("---+-----------+---------+---------+---------+---------+-----------+");
            System.out.println("[J]|                                                              ;--;'");
            System.out.println("---+-----------+---------+---------+---------+---------+-----------+");
            System.out.println("¡Usted ha ganado!");
        }
    }
}
