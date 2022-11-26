import java.util.Scanner;
public class Camellos {
    public static void main(String[] args) {
        int agujero1=1;
        int agujero2=2; 
        int agujero3=4;
        int agujero4=6;
        double probabilidadagujero1=0.6;
        double probabilidadagujero2=0.4;
        double probabilidadagujero3=0.3;
        double probabilidadagujero4=0.1;
        int casilla = 0;
        int tiro = 0
        int numero=0;  

        System.out.println("COMIENZA LA CARRERA DE CAMELLOS");

        System.out.println("---+-----------+---------+---------+---------+---------+-----------+");
        System.out.println("---| 0.........1.........2.........3.........4.........5.........6 |");
        System.out.println("---| 0123456789012345678901234567890123456789012345678901234567890 |");
        System.out.println("---+-----------+---------+---------+---------+---------+-----------+");
        System.out.println("[J]| ;--;'");
        System.out.println("---+-----------+---------+---------+---------+---------+-----------+");
    
            for (int i=0, int i < 61, int i++)¨{
                    if (tiro == agujero1){
                        probabilidadagujero1=Math.random();
                            if (probabilidadagujero1 < 0.61){
                             casilla=+1; 
                             System.out.println("Has avanzado 1 casilla");}
                            else {casilla=+0; 
                             System.out.println("No has avanzado casillas");} 
                            tiro++;
                            numero=casilla;
                    }                  
                        if else (tiro == agujero2){
                            probabilidadagujero1=Math.random();
                            if (probabilidadagujero1 < 0.41){
                             casilla=+2;
                             System.out.println("Has avanzado 2 casilla");}
                            else {casilla=+0; 
                             System.out.println("No has avanzado casillas");} 
                            tiro++;
                            numero=casilla;
                    }
                        if else (tiro=agujero3){
                            probabilidadagujero1=Math.random();
                            if (probabilidadagujero1 < 0.21){
                             casilla=+4; 
                             System.out.println("Has avanzado 4 casilla");}
                            else {casilla=+0; 
                             System.out.println("No has avanzado casillas");} 
                        tiro++;
                        numero=casilla;
                    }
                        if else (tiro=agujero4){
                            probabilidadagujero1=Math.random();
                            if (probabilidadagujero1 < 0.11){
                             casilla=+6; 
                             System.out.println("Has avanzado 6 casilla");}
                            else {casilla=+0; 
                             System.out.println("No has avanzado casillas");} 
                        tiro++;
                        numero=casilla;
                    }
                    
            System.out.println("Vas "+tiro+" tiros");
            System.out.println("Vas en la casilla "+numero);
            
                for (int t = 1; t < 61; t++){
                    if (k != casilla){
                        System.out.print(" ");
                    } else{
                        System.out.println(";--;'");
                        t = 60;
                    }
                }
             System.out.println("+---------+---------+---------+---------+---------+---------+");
            
            }

    System.out.println("Llegaste al final");
    System.out.println("---+-----------+---------+---------+---------+---------+-----------+");
    System.out.println("---| 0.........1.........2.........3.........4.........5.........6 |");
    System.out.println("---| 0123456789012345678901234567890123456789012345678901234567890 |");
    System.out.println("---+-----------+---------+---------+---------+---------+-----------+");
    System.out.println("[J]|                                                           ;--;'");
    System.out.println("---+-----------+---------+---------+---------+---------+-----------+");


            }



