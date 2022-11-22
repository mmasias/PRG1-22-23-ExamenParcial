# Examen parcial Óscar Santamaría

import java.util.Scanner;

public class Programacion {
    public static void main(String[] args) {

        int turno;
        int agujero;
        int turnototal=50;
        double probabilidadAcierto;
        
        
        for (turno = 0; turno <= turnototal; turno = turno + 1){
             
        
        String colado = Scanner.nextInt ("Elija un agujero: ");

        probabilidadAcierto = Math.random ();
            if(agujero=1){
              
                if (probabilidadAcierto <= 0.6) {
                    System.out.println("Avanza el camello 1 casilla");
                    System.out.println("|       ;--;'");
                }else{
                    System.out.print("");
                }
            }
       

        turno = turno +1; 
        String agujeroString = Scanner.nextInt("Elija un agujero: ");


        if (probabilidadAcierto <= 0.6) {
            System.out.println("Avanza el camello 1 casilla");
            System.out.println("|       ;--;'");
        }else{
            System.out.print("");
        }

        }

        turno = turno +1;
    
    }
}
