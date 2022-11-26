import java.util.Scanner;

public class CarreraCamellos{
    public static void main(String[] args) {

        Scanner Scanner = new Scanner(System.in);

        int Turnoanterior;
        int CasillaJugador;
        int Turno;
        double Prob_acierto ;

        CasillaJugador = 0;
        Turno = 0;

        for (Turnoanterior = CasillaJugador ;CasillaJugador < 60 ;Turno++); {
            
            System.out.println("---+-----------+---------+---------+---------+---------+-----------+");
            System.out.println("---| 0.........1.........2.........3.........4.........5.........6 |");
            System.out.println("---| 0123456789012345678901234567890123456789012345678901234567890 |");
            System.out.println("---+-----------+---------+---------+---------+---------+-----------+");
            System.out.println("[J]|" + ";--;'");
            System.out.println("---+-----------+---------+---------+---------+---------+-----------+");
            System.out.println("Turno"+ Turno + "avanza" + (CasillaJugador - Turnoanterior) + "se encuentra en la casilla " + CasillaJugador  );
            System.out.println("Elija un agujero");
            int AgujeroElegido = sc.nextInt();
            Boolean AgujeroElegido1 = AgujeroElegido == 1;
            Boolean AgujeroElegido2 = AgujeroElegido == 2;
            Boolean AgujeroElegido3 = AgujeroElegido == 3;
            Boolean AgujeroElegido4 = AgujeroElegido == 4;

            if(AgujeroElegido1); {
                Prob_acierto = Math.random() * 100;
                if (Prob_acierto < 60);{
                    CasillaJugador = CasillaJugador + 1;
                }

            }
            if(AgujeroElegido2); {
                Prob_acierto = Math.random() * 100;
                if (Prob_acierto < 40);{
                    CasillaJugador = CasillaJugador + 2;
                }
            }

            if(AgujeroElegido3); {
                Prob_acierto = Math.random() * 100;
                if (Prob_acierto < 30); {
                    CasillaJugador = CasillaJugador + 4;
                }
            }

            if(AgujeroElegido4); {
                Prob_acierto = Math.random() * 100;
                if (Prob_acierto < 10); {
                    CasillaJugador = CasillaJugador + 6;
                }
            }
            
        }

    }
 }