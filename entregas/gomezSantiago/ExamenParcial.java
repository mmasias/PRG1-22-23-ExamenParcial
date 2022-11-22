import java.util.Scanner;

public class ExamenParcial {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //Variables
        int turno = 0;
        int casillas = 0;
        int numCasilla = 0;
        String avanzarCasillas = " ";
        int casillasOrdenado = 0;
        int numCasillaOrdenador = 0;
        String ganador;
        

        
        do {
            //Tabla de probabilidad
            System.out.println("+--------------------------------------------------------+");
            System.out.println("| Agujero | Probabilidad de acierto | Avance del camello |");
            System.out.println("|    1    |           60%           |         1          |");
            System.out.println("|    2    |           40%           |         2          |");
            System.out.println("|    3    |           30%           |         4          |");
            System.out.println("|    4    |           10%           |         6          |");
            System.out.println("+--------------------------------------------------------+");
            System.out.println("");



            //Indice del juego de la carrera
            System.out.println("---+-----------+---------+---------+---------+---------+-----------+");
            System.out.println("---| 0.........1.........2.........3.........4.........5.........6 |");
            System.out.println("---| 0123456789012345678901234567890123456789012345678901234567890 |");
            System.out.println("[J]| ;--;'");
            System.out.println("---+-----------+---------+---------+---------+---------+-----------+");
            System.out.println("[O]| ;--;'");
            System.out.println("---+-----------+---------+---------+---------+---------+-----------+");
            System.out.println("| Turno: " + turno +" - " +avanzarCasillas+ " - Esta en la casilla ["+numCasilla+"]           |");
            System.out.println("| El ordenador avanza ["+casillasOrdenado+"] - Esta en la casilla ["+numCasillaOrdenador+"] - |");
            System.out.println("+---------------------------------------------------------------+");
            System.out.println(" ");
            System.out.println("+-------------------+");
            System.out.println("| Elija un agujero: |");

            int agujero = sc.nextInt();
            
            //Denotacion de los agujeros
            if (agujero == 1){
                double probAgujero = Math.random()*10;
                if (probAgujero<=6){
                    casillas = 1;
                    System.out.println("Muy bien, avanza tu camello");
                    turno = turno +1;
                } else {
                    System.out.println("No avanza tu camello");
                    casillas = 0;
                    turno = turno +1;
                }
            } else if (agujero == 2){
                double probAgujero = Math.random()*10;
                if (probAgujero<=4){
                    casillas = 2;
                    System.out.println("Muy bien, avanza tu camello");
                    turno = turno +1;
                } else {
                    System.out.println("No avanza tu camello");
                    casillas = 0;
                    turno = turno +1;
                }
            }else if (agujero == 3){
                double probAgujero = Math.random()*10;
                if (probAgujero<=3){
                    casillas = 4;
                    System.out.println("Muy bien, avanza tu camello");
                    turno = turno +1;
                } else {
                    System.out.println("No avanza tu camello");
                    casillas = 0;
                    turno = turno +1;
                }
            }else if (agujero == 4){
                double probAgujero = Math.random()*10;
                if (probAgujero<=1){
                    casillas = 6;
                    System.out.println("Muy bien, avanza tu camello");
                    turno = turno +1;
                } else {
                    System.out.println("No avanza tu camello");
                    casillas = 0;
                    turno = turno +1;
                }
            } else {
                System.out.println("No existe esa opcion");
            }

            //RETO AMPLIADO - juega el ordenador
            double moverCasillasOrdenador = Math.random()*10;
            if (moverCasillasOrdenador <=2){
                casillasOrdenado = 3;
            } else if (moverCasillasOrdenador >2 && moverCasillasOrdenador<=5){
                casillasOrdenado = 2;
            }else if (moverCasillasOrdenador > 5 && moverCasillasOrdenador <=10){
                casillasOrdenado = 1;
            }

            //RETO EXTENDIDO - tropieza el camello
            double tropiezaCamello = Math.random()*10;
            if (tropiezaCamello<=1){
                System.out.println("Se ha tropezado el camello, pierdes 2 turnos");
                turno = turno +2;
                casillas = 0;
            }

            //Se escribe si avanza la casilla o no
            if (casillas==0){
                avanzarCasillas = ("No avanza ninguna casilla");
            } else if (casillas > 0){
                avanzarCasillas = ("Avanza ["+casillas+"] casillas");
            }

            
            
            //RETO EXTENDIDO - maximo 50 turnos
            if (turno == 50){
                numCasilla = 60;
                System.out.println("+------------------------------------+");
                System.out.println("| Has llegado a los intentos maximos |");
                System.out.println("+------------------------------------+");
            }

            ////////////////////////////////////////////////////////////////
            turno = turno;
            numCasilla = numCasilla + casillas;
            numCasillaOrdenador = numCasillaOrdenador + casillasOrdenado;
            ////////////////////////////////////////////////////////////////

        } while(numCasilla<60 && numCasillaOrdenador<60);
        
        System.out.println("+-----------------------+");
        System.out.println("| Ha terminado el juego |");
        System.out.println("+-----------------------+");


    }
}
