import java.util.Scanner;
public class ExamenParcial1 {
    public static void main(String[] args) throws Exception {
        System.out.println("Bienvenido al juego del camello!");
        int posicion = 0;
        int turno = 0;
        int fallosSeguidos = 0;
        Scanner sc = new Scanner(System.in);
        while (posicion <= 60 && turno <= 50) {
            turno += 1;
            System.out.println("¿Donde quieres lanzar la pelota?: '1' '2' '3' '4'");
            int seleccion = sc.nextInt();
            int movimiento = 0;
            double probabilidad = Math.random();
            boolean seMueve = false;
            
            if (seleccion == 1) {
                if (probabilidad <= 0.6) {
                    movimiento = 1;
                    posicion += movimiento;
                    seMueve = true;
                    fallosSeguidos = 0;
                }
                else {
                    fallosSeguidos += 1;
                }
            }
            else if (seleccion == 2) {
                if (probabilidad <= 0.4) {
                    movimiento = 2;
                    posicion += movimiento;
                    seMueve = true;
                    fallosSeguidos = 0;
                }
                else {
                    fallosSeguidos += 1;
                }
            }
            else if (seleccion == 3) {
                if (probabilidad <= 0.3) {
                    movimiento = 4;
                    posicion += movimiento;
                    seMueve = true;
                    fallosSeguidos = 0;
                }
                else {
                    fallosSeguidos += 1;
                }
            }
            else if (seleccion == 4) {
                if (probabilidad <= 0.1) {
                    movimiento = 6;
                    posicion += movimiento;
                    seMueve = true;
                    fallosSeguidos = 0;
                }
                else {
                    fallosSeguidos += 1;
                }
            }
            else {
                System.out.println("Numero no valido.");
            }

            if (fallosSeguidos >= 3) {
                System.out.println("Fallaste 3 veces seguidas, vuelves al principio.");
                posicion = 0;
                fallosSeguidos = 0;
            }

            if (Math.random() <= 0.10 && fallosSeguidos < 3) {
                System.out.println("El camello tropezó! No avanzas y retrocedes dos casillas.");
                if (posicion <= 2) {
                    posicion = 0;
                }
                else {
                    posicion -= (2 + movimiento);
                }
            }
            
            if (seMueve) {
                System.out.println("---+-----------+---------+---------+---------+---------+-----------+");

                System.out.print("[J]|");
                for (int i = 0; i <= 60; i++) {
                    if (i < posicion) {
                        System.out.print(" ");
                    }
                }
                System.out.println(";--;'");

                System.out.println("---+-----------+---------+---------+---------+---------+-----------+");
                System.out.println("Turno: " + turno + " - Se mueve " + movimiento + " casillas - El camello se encuentra en la casilla " + posicion + "\n");
            }
            if (!seMueve) {
                System.out.println("---+-----------+---------+---------+---------+---------+-----------+");

                System.out.print("[J]|");
                for (int i = 0; i <= 60; i++) {
                    if (i < posicion) {
                        System.out.print(" ");
                    }
                }
                System.out.println(";--;'");

                System.out.println("---+-----------+---------+---------+---------+---------+-----------+");
                System.out.println("Turno: " + turno + " - El camello no se mueve - El camello se encuentra en la casilla " + posicion + "\n");
            }
        }
        if (turno >= 50) {
            System.out.println("LLegaste a 50 turnos. El juego va a finalizar. Buena suerte la proxima vez.");
        }
        if (posicion >= 60) {
            System.out.println("Felicidades! Bien jugado.");
        }
    }
}
