import java.util.Scanner;

public class ExamenParcial {
    public static void main(String[]args){
        // Main variables
        int turno;
        int casilla = 0;
        int agujero1 = 1, agujero2 = 2, agujero3 = 4 , agujero4 = 6;
        int porcentaje1=60,porcentaje2=40,porcentaje3=30,porcentaje4=10;
        int ultimaCasilla = 60;

        // Estadisticas
        int TurnosLanzados = 0, CasillasAvanzadas = 0;

        // SuperAdmin
        boolean agujero1Estado, agujero2Estado, agujero3Estado, agujero4Estado;
        boolean ComienzoCarrera = true;

        Scanner s = new Scanner(System.in);

        System.out.println("Bienvenido a la carrera de camellos");
        System.out.println("Desea lanzar al agujero 1 (1 = Si, Otro = No)");
        if (s.nextInt() == 1) {
            agujero1Estado = true;
        } else
            agujero1Estado = false;
        System.out.println("Desea lanzar al agujero 2 (1 = Si, Otro = No)");
        if (s.nextInt() == 1) {
            agujero2Estado = true;
        } else
            agujero2Estado = false;
        System.out.println("Desea lanzar al agujero 3 (1 = Si, Otro = No)");
        if (s.nextInt() == 1) {
            agujero3Estado = true;
        } else
            agujero3Estado = false;
        System.out.println("Desea lanzar al agujero 4 (1 = Si, Otro = No)");
        if (s.nextInt() == 1) {
            agujero4Estado = true;
        } else
            agujero4Estado= false;
            if (ComienzoCarrera) {

                // Bucle Horas
                for (casilla = 0; casilla <= ultimaCasilla; casilla++) {
                    // Texto Hora
                    System.out.println("-----------------------------------------------------------------------------");
                    if (casilla == 0) {
                        System.out.println("Se encuentra en la casilla 0 ");
                    } else if (casilla == 1) {
                        System.out.println("Se encuentra en la casilla 1");
                    } else if (casilla == 2) {
                        System.out.println("Se encuentra en la casilla 2");
                    } else if (casilla == 3) {
                        System.out.println("Se encuentra en la casilla 3");
                    } else if (casilla == 4) {
                        System.out.println("Se encuentra en la casilla 4");
                    } else if (casilla == 5) {
                        System.out.println("Se encuentra en la casilla 5");
                    } else if (casilla == 6) {
                        System.out.println("Se encuentra en la casilla 6");
                    } else if (casilla == 7) {
                        System.out.println("Se encuentra en la casilla 7");
                    } else if (casilla == 8) {
                        System.out.println("Se encuentra en la casilla 8");
                    } else if (casilla == 9) {
                        System.out.println("Se encuentra en la casilla 9");
                    } else if (casilla == 10) {
                        System.out.println("Se encuentra en la casilla 10");
                    } else if (casilla == 11) {
                        System.out.println("Se encuentra en la casilla 11");
                    } else if (casilla== 12) {
                        System.out.println("Se encuentra en la casilla 12");
                    }
                }
            }
    }
}