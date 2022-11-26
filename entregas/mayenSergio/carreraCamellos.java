package entregas.mayenSergio;
import java.util.Scanner;

public class carreraCamellos {
    public static void main(String[] args){

        Scanner siguiente = new Scanner(System.in);
        final int posicionTotal = 1;
        int posicionCamello = 1, turno = 0, respuesta = 0, movimientoDerecha = 0;
        double agujero = 0;
        boolean terminoJuego = false;
        
        final String BORDE_SUPERIOR = "---+-----------+---------+---------+---------+---------+-----------+";
        final String DISTANCIA = "---| 0.........1.........2.........3.........4.........5.........6 |";
        final String DISTANCIA_2  = "---| 0123456789012345678901234567890123456789012345678901234567890 |";
        final String CAMELLO = " ;--;' ";

        String queImprimir;

        do {
            movimientoDerecha =  (int)Math.floor(Math.random()* (2 - 0)) + 0;
            System.out.println(BORDE_SUPERIOR);
            System.out.println(DISTANCIA);
            System.out.println(DISTANCIA_2);
            System.out.println(BORDE_SUPERIOR);
            for (int posicion = 1; posicion <= posicionTotal; posicion ++) {
                if (posicion == posicionCamello) {
                    posicionCamello = posicionCamello + movimientoDerecha;
                    queImprimir = CAMELLO;
                }
                System.out.println(queImprimir = CAMELLO);
            }
            System.out.println(BORDE_SUPERIOR);

            agujero = Math.random();
            turno = turno ++;
            System.out.println("Turno " + turno);
            System.out.println("Elije el agujero 1 - 2 - 3 - 4");
            respuesta = siguiente.nextInt();            
            
            if(respuesta == 1 && agujero >= 0.60){
                movimientoDerecha = 1;
            }else if(respuesta == 2 && agujero <= 0.40){
                movimientoDerecha = 2;
            }else if(respuesta == 3 && agujero <= 0.30){
                movimientoDerecha = 3;
            }else if(respuesta == 4 && agujero <= 0.10){
                movimientoDerecha = 4;
            }
            siguiente.nextLine();

        }while(turno < 15);{
            System.out.println("El juego termino"); 
        }  
    }    
}
