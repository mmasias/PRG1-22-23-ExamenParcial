import java.util.Scanner;

public class parcialDiegoMoys{
    public static void main(String[] args) {

        final String camello = ";--;'";
        final String jugador = "[J]| ";
        final String pistaBorde =     "---+-----------+---------+---------+---------+---------+-----------+";
        final String marcadores =     "---| 0.........1.........2.........3.........4.........5.........6 |";
        final String recorrido =      "---| 0123456789012345678901234567890123456789012345678901234567890 |";
        final String separador = "********************************************";

        int opcion;
        double probabilidad1 = 0.6;
        double probabilidad2 = 0.4;
        double probabilidad3 = 0.3;
        double probabilidad4 = 0.1;
        double probabilidadAcierto;

        int posicionCamello = 0;
        int longitudPista = 60;
        int turnos = 0;
       
        Scanner entrada = new Scanner(System.in);


            while (posicionCamello < longitudPista) {

                System.out.println("> Turno: "+turnos);
                System.out.println("> La posicion alctual del camello es en la casilla: "+posicionCamello);
                System.out.println(pistaBorde);
                System.out.println(marcadores);
                System.out.println(recorrido);
                System.out.println(pistaBorde);
                System.out.print(jugador);
                System.out.println(camello);
                System.out.println(pistaBorde);
    
    
                turnos = turnos+1;

    
                probabilidadAcierto = Math.random();

    
                System.out.println(probabilidadAcierto); //utilizado para verificar y comprobar la funcionalidad del random y verificacion de la opcion a escoger
    

                System.out.println("Escoja un agujero");
                opcion = entrada.nextInt();
    

                if (opcion == 1 && probabilidadAcierto <= probabilidad1) {
                    
                    System.out.println("Has acertado, el camello avanza 1 espacio"); 
                    posicionCamello = posicionCamello+1; 
    
                }else if (opcion == 2 && probabilidadAcierto <= probabilidad2) {
                    
                    System.out.println("Has acertado, el camello avanza 2 espacios");
                    posicionCamello = posicionCamello+2;   
    
                }else if (opcion == 3 && probabilidadAcierto <= probabilidad3) {
                    
                    System.out.println("Has acertado, el camello avanza 4 espacios");  
                    posicionCamello = posicionCamello+4; 
    
                }else if (opcion == 4 && probabilidadAcierto <= probabilidad4) {
                    
                    System.out.println("Has acertado, el camello avanza 6 espacios"); 
                    posicionCamello = posicionCamello+6;   
                    
                }else {
                    System.out.println("Has fallado, el camello no se mueve"); 
                }
    
    
                System.out.println(separador);

            }

            System.out.println("FELICIDADES HAS ACABADO LA CARRERA ");     
    }
 }