import java.util.Scanner;
public class examenParcial {
    public static void main(String[] args) {

         int jugadorCasilla;
         int agujero;
         int totalDeCasillas = 60;
         int agujero1 = 1;
         int agujero2 = 2;
         int agujero3 = 3;
         int agujero4 = 4;
         double probabilidadAcierto1;
         double probabilidadAcierto2;
         double probabilidadAcierto3;
         double probabilidadAcierto4;
         int turnos; 
         turnos = 50;
         jugadorCasilla = 0;
         int dimensionCasillas;
         dimensionCasillas = 6;
        
    
         final String turno0           = "[Turno 0]             ";
         final String borde_Superior = "---+-----------+---------+---------+---------+---------+-----------+";
         final String casillas         = "---| 0.........1.........2.........3.........4.........5.........6 |";
         final String tercera_Linea       = "---| 0123456789012345678901234567890123456789012345678901234567890 |";
         final String cuarta_Linea        = "---+-----------+---------+---------+---------+---------+-----------+";
         final String jugador = "[J]| ;--;'";   
         final String ultima_Linea     = "---+-----------+---------+---------+---------+---------+-----------+";
        
         String imprimir;
         System.out.println(turno0);
         System.out.println(ultima_Linea);
         System.out.println(borde_Superior);
        
         for( int turno = 0; turno <= turnos; turno = turno ++) {
            for( int avanceCasilla = 1; avanceCasilla <= dimensionCasillas; avanceCasilla = avanceCasilla + 1 ){

                try (Scanner entrada = new Scanner(System.in)) {
                    System.out.println();
                    System.out.print("Turno:  ");
                    System.out.println(turnos);
                    
                    System.out.println("Elija un agujero: ");
                    agujero = entrada.nextInt();
                } 
                
                if( agujero == 1 && probabilidadAcierto1 <= 40 ) {

                    imprimir = jugador;
                    System.out.println("El jugador avanza 1 casilla: ");
                }
                    
                    
                    
                }
            }
                
                

        }







    }
    


        
            
       


     
        
               
