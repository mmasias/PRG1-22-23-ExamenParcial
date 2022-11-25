import java.util.Scanner;
public class carreraCamellos {
    public static void main(String[] args) {

        int avanceTotal = 0;
        int avanceTurno = 0;
        int turno = 0;
        double probabilidad;

        final String CAPA1 = "---+-----------+---------+---------+---------+---------+-----------+";
        final String CAPA2 = "---| 0.........1.........2.........3.........4.........5.........6 |";
        final String CAPA3 = "---| 0123456789012345678901234567890123456789012345678901234567890 |";
        final String CAPA4 = "---+-----------+---------+---------+---------+---------+-----------+";
        final String CAPA5 = "[J]| ;--;'                                                          "; 
        final String CAPA6 = "---+-----------+---------+---------+---------+---------+-----------+";  

        System.out.println("\n"+CAPA1);
        System.out.println(CAPA2);
        System.out.println(CAPA3);
        System.out.println(CAPA4);
        System.out.println(CAPA5);
        System.out.println(CAPA6+"\n");


        while(avanceTotal < 61){
            turno ++;
            Scanner entrada = new Scanner(System.in);
            System.out.print( "Elige un agujero del 1 al 4: " );
            int agujero = entrada.nextInt();
             
            
            System.out.println("---+-----------+---------+---------+---------+---------+-----------+");
            System.out.println("---| 0.........1.........2.........3.........4.........5.........6 |");
            System.out.println("---| 0123456789012345678901234567890123456789012345678901234567890 |");
            System.out.println("---+-----------+---------+---------+---------+---------+-----------+");
            if(agujero == 1){
                probabilidad = Math.random()*100+0;
                probabilidad = Math.round(probabilidad);
                if(probabilidad <= 60.0){
                    avanceTurno = 1;
                    avanceTotal = avanceTotal + avanceTurno;
                    System.out.println("[J]|  ;--;'                                                         "); 
                }else{
                    System.out.println(CAPA1);
                }
            }

            if(agujero == 2){
                probabilidad = Math.random()*100+0;
                probabilidad = Math.round(probabilidad);
                if(probabilidad <= 40.0){
                    avanceTurno = 2;
                    avanceTotal = avanceTotal + avanceTurno;
                    System.out.println("[J]|   ;--;'                                                        "); 
                }
            }

            if(agujero == 3){
                probabilidad = Math.random()*100+0;
                probabilidad = Math.round(probabilidad);
                if(probabilidad <= 30.0){
                    avanceTurno = 4;
                    avanceTotal = avanceTotal + avanceTurno;
                    System.out.println("[J]|     ;--;'                                                      "); 
                }
            }
            else{
                probabilidad = Math.random()*100+0;
                probabilidad = Math.round(probabilidad);
                if(probabilidad <= 10.0){
                    avanceTurno = 6;
                    avanceTotal = avanceTotal + avanceTurno;
                    System.out.println("[J]|       ;--;'                                                    "); 
                }
            }
            System.out.println("---+-----------+---------+---------+---------+---------+-----------+");
            System.out.printf("Turno: [%d]  -  Avanza: %d  casillas  -   Esta en la casilla: %d metros \n",turno,avanceTurno,avanceTotal);
        }
    }
}
