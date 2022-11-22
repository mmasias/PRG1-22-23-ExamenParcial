import java.util.Scanner;
public class parcial1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // Declaracion de variables 
        double probabilidadDeAciertoAgujero1 = 0.6;
        double probabilidadDeAciertoAgujero2 = 0.4;
        double probabilidadDeAciertoAgujero3 = 0.3;
        double probabilidadDeAciertoAgujero4 = 0.1;
        int posicionDelJugador = 0;
        int contTurnosEmpleados = 0;
        int fallos = 0; 
        int intentosMaximos = 50;

       // Ejecucion de codigo
       while ( posicionDelJugador <= 60 && intentosMaximos > 0) {
            for (int intentos = 1; intentos <= 50; intentos++) {
                System.out.println("Intentos jugados: " + intentos); 
                intentosMaximos = intentosMaximos - intentos;
                System.out.println("Le quedan: " +  intentosMaximos); 
                System.out.println("Elija un agujero: "); 
                System.out.println("Agujero 1 con 60% de posibilidades, si acierta avanza 1 espacio"); 
                System.out.println("Agujero 2 con 40% de posibilidades, si acierta avanza 2 espacio"); 
                System.out.println("Agujero 3 con 30% de posibilidades, si acierta avanza 4 espacio"); 
                System.out.println("Agujero 4 con 10% de posibilidades, si acierta avanza 6 espacio"); 
                System.out.println("PD: Si falla tres veces seguidas volvera a la casilla 0"); 
                int agujeroElegido = entrada.nextInt(); 

                // Condiciones 
                double probabilidadDeAcierto = Math.random();
                //Agujero 1
                if ( agujeroElegido == 1 ) {
                    if ( probabilidadDeAcierto < probabilidadDeAciertoAgujero1 ) {
                        System.out.println(" El jugador avanca 1 casilla");
                        posicionDelJugador = posicionDelJugador + 1;
                        contTurnosEmpleados ++; 
                        System.out.println(" La posicion del camello es: " + posicionDelJugador);
                    } else {
                        System.out.println(" No ha acertado, el jugador no avanza ninguna casilla");
                        fallos++;
                        if( fallos >= 3 ) {
                            System.out.println("La cantidad de fallos es: " + fallos + " vuelve a la casilla 0");
                            posicionDelJugador = 0;
                            fallos = 0;
                        }
                    }
                }

                //Agujero 2
                if ( agujeroElegido == 2 ) {
                    if ( probabilidadDeAcierto < probabilidadDeAciertoAgujero2 ) {
                        System.out.println(" El jugador avanza 2 casilla");
                        posicionDelJugador = posicionDelJugador + 2;
                        contTurnosEmpleados ++; 
                        System.out.println(" La posicion del camello es: " + posicionDelJugador);
                    } else {
                        System.out.println(" No ha acertado, el jugador no avanza ninguna casilla");
                        fallos++;
                        if( fallos >= 3 ) {
                            System.out.println("La cantidad de fallos es: " + fallos + " vuelve a la casilla 0");
                            posicionDelJugador = 0;
                            fallos = 0;
                        }
                    }
                }

                //Agujero 3
                if ( agujeroElegido == 3 ) {
                    if ( probabilidadDeAcierto < probabilidadDeAciertoAgujero3 ) {
                        System.out.println(" El jugador avanza 4 casilla");
                        posicionDelJugador = posicionDelJugador + 4;
                        contTurnosEmpleados ++;
                        System.out.println(" La posicion del camello es: " + posicionDelJugador);
                    } else {
                        System.out.println(" No ha acertado, el jugador no avanza ninguna casilla");
                        fallos++;
                        if( fallos >= 3 ) {
                            System.out.println("La cantidad de fallos es: " + fallos + " vuelve a la casilla 0");
                            posicionDelJugador = 0;
                            fallos = 0;
                        }
                    }
                }

                //Agujero 4
                if ( agujeroElegido == 4 ) {
                    if ( probabilidadDeAcierto < probabilidadDeAciertoAgujero4 ) {
                        System.out.println(" El jugador avanza 6 casilla");
                        posicionDelJugador = posicionDelJugador + 6;
                        contTurnosEmpleados ++; 
                        System.out.println(" La posicion del camello es: " + posicionDelJugador);
                    } else {
                        System.out.println(" No ha acertado, el jugador no avanza ninguna casilla");
                        fallos++;
                        if( fallos >= 3 ) {
                            System.out.println("La cantidad de fallos es: " + fallos + " vuelve a la casilla 0");
                            posicionDelJugador = 0;
                            fallos = 0;
                        }
                    }
                }
            }
        }
       System.out.println(" La cantidad de turnos jugados fue de: " + contTurnosEmpleados);
       System.out.println("Se le acabaron los intentos para jugar: "); 
    }
}