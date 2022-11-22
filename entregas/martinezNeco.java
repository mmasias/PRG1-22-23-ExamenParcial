import java.util.Scanner;
public class martinezNeco {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args){
        
        final String arriba = "---+-----------+---------+---------+---------+---------+-----------+";
        final String decimales = "---| 0.........1.........2.........3.........4.........5.........6 |";
        final String numeros = "---| 0123456789012345678901234567890123456789012345678901234567890 |";       
        final String borde = "---+-----------+---------+---------+---------+---------+-----------+";
        final String pista = "[J]| ;--;'";
        final String abajo = "---+-----------+---------+---------+---------+---------+-----------+";
        
        
        int turno;
        int presente;
        int casilla = 0;
        int numeroAleatorio;
        

        System.out.println("Turno 1 Elige un agujero al cual lanzar la bola");
        presente = entrada.nextInt ();
        if(presente == 1){
            final int NUMERO_MAXIMO = 10;
            final int NUMERO_MINIMO = 5;
            
            numeroAleatorio = (int)(Math.random() * (NUMERO_MAXIMO-NUMERO_MINIMO+1))+NUMERO_MINIMO;
        }
        if(numeroAleatorio>6){
            casilla = casilla + 0;

        }
        if (numeroAleatorio<6){
            casilla = casilla + 1;
        }
        
        
        
        
        if(presente == 2){
            final int NUMERO_MAXIMO = 10;
            final int NUMERO_MINIMO = 5;
            
            numeroAleatorio = (int)(Math.random() * (NUMERO_MAXIMO-NUMERO_MINIMO+1))+NUMERO_MINIMO;
        }
        if(numeroAleatorio>4){
            casilla = casilla + 0;

        }
        if (numeroAleatorio<4){
            casilla = casilla + 2;
        }

        

            
        if(presente == 3){
            final int NUMERO_MAXIMO = 10;
            final int NUMERO_MINIMO = 5;
            
            numeroAleatorio = (int)(Math.random() * (NUMERO_MAXIMO-NUMERO_MINIMO+1))+NUMERO_MINIMO;
        }
        if(numeroAleatorio>3){
            casilla = casilla + 0;

        }
        if (numeroAleatorio<3){
            casilla = casilla + 4;
        }




        if(presente == 2){
            final int NUMERO_MAXIMO = 10;
            final int NUMERO_MINIMO = 5;
            
            numeroAleatorio = (int)(Math.random() * (NUMERO_MAXIMO-NUMERO_MINIMO+1))+NUMERO_MINIMO;
        }
        if(numeroAleatorio>1){
            casilla = casilla + 0;

        }
        if (numeroAleatorio<1){
            casilla = casilla + 6;
        }


    }

    





}
