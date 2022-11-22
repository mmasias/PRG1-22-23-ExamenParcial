import java.util.Scanner;

public class CarreraCamellos {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        int turnos = 0; 
        int turnosMax = 50;
        int posicion = 0;
        int intentos = 0;
        int fallos = 0;
        int posicionCasillas = 0;


        double agujeroAciertoProbabilidad = Math.random();

        String vallaPistaSuperior = "---+-----------+---------+---------+---------+---------+-----------+";
        String vallaPistaInferior = "---+-----------+---------+---------+---------+---------+-----------+";
        String pistaNumeroCasillasSimplificado = "---| 0.........1.........2.........3.........4.........5.........6 |";
        String pistaNumeroCasillas = "---| 0123456789012345678901234567890123456789012345678901234567890 |";
        String camello = "[J]| ;--;'";

        do {



        // Display de la carrera

        System.out.println(vallaPistaSuperior);
        System.out.println(pistaNumeroCasillasSimplificado);
        System.out.println(pistaNumeroCasillas);
        System.out.println(camello);
        System.out.println(vallaPistaInferior);

        // Display de acciones

        System.out.print("Turno ");
        System.out.print(turnos);
        System.out.print(" Avanza " + posicion);
        System.out.println(" Estas en la casilla " + posicionCasillas);

        int agujeroEscogido;
        System.out.println("Elija un agujero:");
        agujeroEscogido = sc.nextInt();

            if (agujeroEscogido == 1) {

                turnos = turnos +1;

                if (agujeroAciertoProbabilidad < 0.6){
                   
                    posicionCasillas = posicionCasillas +1;
                   posicion = +1;

                }

            }

            if (agujeroEscogido == 2) {

                turnos = turnos +1;

                if (agujeroAciertoProbabilidad < 0.4){
                   
                    posicionCasillas = posicionCasillas +2;
                    posicion =+2;

                }

            }

            if (agujeroEscogido == 3) {

                turnos = turnos +1;

                if (agujeroAciertoProbabilidad < 0.3){
                   
                    posicionCasillas = posicionCasillas +3;
                    posicion = +3;

                }
            }

            if (agujeroEscogido == 4) {

                turnos = turnos +1;

                if (agujeroAciertoProbabilidad < 0.1){
                   
                    posicionCasillas = posicionCasillas +4;
                    posicion = +4;

                }
            }
        
        
            if (posicionCasillas == 60) {

                System.out.println("HAZ GANADO!!");
            }
 
        } while (posicionCasillas < 60);



        sc.close();

    }

}
