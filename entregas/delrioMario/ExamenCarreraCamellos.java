import java.util.Scanner;

public class ExamenCarreraCamellos {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int agujero1 = 0;
        int agujero2 = 0;
        int agujero3 = 0;
        int agujero4 = 0;
        int probabilidadAgujero1 = 0;
        int probabilidadAgujero2 = 0;
        int probabilidadAgujero3 = 0;
        int probabilidadAgujero4 = 0;
        int probabilidadTropiezo =0;
        int avanceCamello = 0;
        int posicionCamello = 0;
        int respuestaUsuario = 0;
        boolean llegadaMeta = true;
        boolean juegoSi = true;
        int turnos = 0;
        int contadorCasillas = 0;
        int contadorFallos=0;

        probabilidadAgujero1 = (int) (Math.random() * 10) + 1;
        for (; llegadaMeta;) {

            System.out.println("---+-----------+---------+---------+---------+---------+-----------+");
            System.out.println("---| 0.........1.........2.........3.........4.........5.........6 |");
            System.out.println("---| 0123456789012345678901234567890123456789012345678901234567890 |");
            System.out.println("---+-----------+---------+---------+---------+---------+-----------+");

            System.out.println("[J]| ;--;'");

            System.out.println("---+-----------+---------+---------+---------+---------+-----------+");
            if (posicionCamello == 0) {
                System.out.println("Turno " + turnos);

            } else {

                System.out.println("Turno " + turnos + " - Avanza " + contadorCasillas + " casillas - Esta en la casilla " + posicionCamello);

            }
            contadorCasillas = 0;
            System.out.println("A donde desea tirar la bola 1-agujero1 2-agujero2 3-agujero3 4-agujero4");
            respuestaUsuario = entrada.nextInt();
            System.out.println("");
            System.out.println("");
            probabilidadTropiezo= (int) (Math.random() * 10) + 1;
            if(probabilidadTropiezo<=9){
                System.out.println("El camello se ha tropezado y se ha caido has perdido dos tunos");
                turnos=turnos+2;

            }else{
                if (respuestaUsuario == 1) {
                    probabilidadAgujero1 = (int) (Math.random() * 10) + 1;
                    if (probabilidadAgujero1 <= 6) {
                        System.out.println("Enhorabuena has acertado tu disparo en la casilla 1");
                        posicionCamello = posicionCamello + 1;
                        contadorCasillas = 1;
                    } else {
                        System.out.println("Ohhhhh has fallado");
                        contadorFallos++;
                    }
                }
                if (respuestaUsuario == 2) {
                    probabilidadAgujero2 = (int) (Math.random() * 10) + 1;
                    if (probabilidadAgujero2 <= 4) {
                        System.out.println("Enhorabuena has acertado tu disparo en la casilla 2");
                        posicionCamello = posicionCamello + 2;
                        contadorCasillas = 2;
                    } else {
                        System.out.println("Ohhhhh has fallado");
                        contadorFallos++;
                    }
                }
                if (respuestaUsuario == 3) {
                    probabilidadAgujero3 = (int) (Math.random() * 10) + 1;
                    if (probabilidadAgujero3 <= 3) {
                        System.out.println("Enhorabuena has acertado tu disparo en la casilla 3");
                        posicionCamello = posicionCamello + 4;
                        contadorCasillas = 4;
                    } else {
                        System.out.println("Ohhhhh has fallado");
                        contadorFallos++;
                    }
                }
                if (respuestaUsuario == 4) {
                    probabilidadAgujero4 = (int) (Math.random() * 10) + 1;
                    if (probabilidadAgujero4 <= 1) {
                        System.out.println("Enhorabuena has acertado tu disparo en la casilla 4");
                        posicionCamello = posicionCamello + 6;
                        contadorCasillas = 6;
                    } else {
                        System.out.println("Ohhhhh has fallado");
                        contadorFallos++;
                    }
                }
                if(contadorFallos==3){
    
                    System.out.println("Lo siento has fallado 3 veces empiezas de nuevo");
                    posicionCamello=0;
    
                }

            }           

            turnos++;
            if (posicionCamello >= 60) {
                System.out.println("Enhorabuena has ganado el juego en [" + turnos + "] turnos");
                llegadaMeta = false;
            }
        }

    }
}
