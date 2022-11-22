public class examenParcial {

    public static void main(String[] args) {

        int eleccionJugador;
        int agujero1 = 1;
        int agujero2 = 2;
        int agujero3 = 4;
        int agujero4 = 6;
        int casillaCamello = 0;
        int turnos;
        int probabilidad = (int) Math.random();

        while (casillaCamello <= 60) {

            for (turnos = 0; turnos == casillaCamello; turnos = turnos + 1)
                ;

            eleccionJugador = (int) (Math.random() * 4) + 1;
            if (probabilidad == 0.6) {
                System.out.println("eleccion usuario" + eleccionJugador);
                eleccionJugador = agujero1;
                casillaCamello = casillaCamello + eleccionJugador;

            }

            if (probabilidad == 0.4) {
                eleccionJugador = agujero2;
                casillaCamello = casillaCamello + eleccionJugador;
            }

            if (probabilidad == 0.3) {
                eleccionJugador = agujero3;
                casillaCamello = casillaCamello + eleccionJugador;
            }

            if (probabilidad == 0.1) {
                eleccionJugador = agujero4;
                casillaCamello = casillaCamello + eleccionJugador;

            }

        }

    }
}
