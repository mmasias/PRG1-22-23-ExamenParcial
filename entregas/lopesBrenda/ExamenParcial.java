import java.util.Scanner;

public class ExamenParcial {
    public static void main(String[] args) {


        int posicionFinal = 60;
        int turno = 0;
        double probabilidadAcierto;
        int agujero; 
        try (Scanner entrada = new Scanner(System.in)) {
            final String bordeSuperior = "---+-----------+---------+---------+---------+---------+-----------+";
            final String casillas = "---| 0.........1.........2.........3.........4.........5.........6 |";
            final String casillas2  = "---| 0123456789012345678901234567890123456789012345678901234567890 |";
            final String bordeInferior = "---+-----------+---------+---------+---------+---------+-----------+";
            final String jugadorPosicion0  = "[J]| ;--;'";
            //final String jugadorPosicion27  = "[J]|                            ;--;'";
            final String jugadorAlFinal  = "[J]|                                                             ;--;'";
            final String bordeFinal = "---+-----------+---------+---------+---------+---------+-----------+";
            

            for (int posicion = 0; posicion <= posicionFinal; turno = turno +1) {
            if(turno == 0){                    
                System.out.println(bordeSuperior);
                System.out.println(casillas);
                System.out.println(casillas2);
                System.out.println(bordeInferior);
                System.out.println(jugadorPosicion0);
                System.out.println(bordeFinal);
                System.out.println("Turno " + turno);
                turno = turno+1;
            }else{
                System.out.println("");
            }

            System.out.println("Elija un agujero: ");
            agujero = entrada.nextInt();

            probabilidadAcierto = Math.random();   
            if (agujero == 1){
                if (probabilidadAcierto<=0.6) {
                    posicion = posicion + 1;

                    System.out.println("Turno " + turno +" - Avanza 1 casilla - Esta en la casilla "+ posicion);

                } else {
                    System.out.println(bordeSuperior);
                    System.out.println(casillas);
                    System.out.println(casillas2);
                    System.out.println(bordeInferior);
                    System.out.println(jugadorPosicion0);
                    System.out.println(bordeFinal);
                    System.out.println("Turno " + turno +" - No avanza ninguna casilla - Esta en la casilla " + posicion);
                }				    
            } else if (agujero == 2){
                if (probabilidadAcierto<=0.4) {
                    posicion = posicion + 2;
                    System.out.println(bordeSuperior);
                    System.out.println(casillas);
                    System.out.println(casillas2);
                    System.out.println(bordeInferior);
                    System.out.println(jugadorPosicion0);
                    System.out.println(bordeFinal);
                    System.out.println("Turno " + turno +" - Avanza 2 casilla - Esta en la casilla "+ posicion);

                } else {
                    System.out.println(bordeSuperior);
                    System.out.println(casillas);
                    System.out.println(casillas2);
                    System.out.println(bordeInferior);
                    System.out.println(jugadorPosicion0);
                    System.out.println(bordeFinal);
                    System.out.println("Turno " + turno +" - No avanza ninguna casilla - Esta en la casilla " + posicion);
                }		
            } else if (agujero == 3){
                if (probabilidadAcierto<=0.3) {
                    posicion = posicion + 4;
                    System.out.println(bordeSuperior);
                    System.out.println(casillas);
                    System.out.println(casillas2);
                    System.out.println(bordeInferior);
                    System.out.println(jugadorPosicion0);
                    System.out.println(bordeFinal);
                    System.out.println("Turno " + turno +" - Avanza 4 casilla - Esta en la casilla "+ posicion);

                } else {
                    System.out.println(bordeSuperior);
                    System.out.println(casillas);
                    System.out.println(casillas2);
                    System.out.println(bordeInferior);
                    System.out.println(jugadorPosicion0);
                    System.out.println(bordeFinal);
                    System.out.println("Turno " + turno +" - No avanza ninguna casilla - Esta en la casilla " + posicion);
                }		
            } else if (agujero == 4){
                if (probabilidadAcierto<=0.1) {
                    posicion = posicion + 6;
                    System.out.println(bordeSuperior);
                    System.out.println(casillas);
                    System.out.println(casillas2);
                    System.out.println(bordeInferior);
                    System.out.println(jugadorPosicion0);
                    System.out.println(bordeFinal);
                    System.out.println("Turno " + turno +" - Avanza 6 casilla - Esta en la casilla "+ posicion);

                } else {
                    System.out.println(bordeSuperior);
                    System.out.println(casillas);
                    System.out.println(casillas2);
                    System.out.println(bordeInferior);
                    System.out.println(jugadorPosicion0);
                    System.out.println(bordeFinal);
                    System.out.println("Turno " + turno +" - No avanza ninguna casilla - Esta en la casilla " + posicion);
                }	
            } else {System.out.println("Turno " + turno +" - Hay solamente 4 agujeros - Esta en la casilla " + posicion);}	

   

            }
            System.out.println(jugadorAlFinal);
            System.out.println(" Fin de la carrera!");
        }
        

    }
}
