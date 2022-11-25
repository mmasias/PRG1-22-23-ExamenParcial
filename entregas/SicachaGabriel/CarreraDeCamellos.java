import java.util.Scanner;

public class CarreraDeCamellos {
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        int agujero;
        int turno = 0;
        int posicionJugador = 0;
        int posicionOrdenador = 0;
        int avance = 0;
        int avanceOrdenador = 0;
        int posibilidad;
        int i;
        int fallo = 0;
        int tropieso;
        int tropezado = 0;
        String camello = ";--;'";


        while ((posicionJugador < 60)&&(turno <= 50 )&&(posicionOrdenador < 60)){
            System.out.println("---+-----------+---------+---------+---------+---------+-----------+");
            System.out.println("---| 0.........1.........2.........3.........4.........5.........6 |");
            System.out.println("---| 0123456789012345678901234567890123456789012345678901234567890 |");
            System.out.println("---+-----------+---------+---------+---------+---------+-----------+");
            System.out.print("[J]| ");
            for (i = 0; i< posicionJugador; i++){
                System.out.print(" ");
            }
            System.out.println(camello);
            System.out.println("---+-----------+---------+---------+---------+---------+-----------+");
            System.out.print("[O]| ");
            for (i = 0; i< posicionOrdenador; i++){
                System.out.print(" ");
            }
            System.out.println(camello);
            System.out.println("---+-----------+---------+---------+---------+---------+-----------+");


            if (turno == 0){
                System.out.println("Turno "+ turno);
            } else {
                System.out.print("Turno "+ turno +" - ");
                if (avance == 0){
                    System.out.print("No avanza ninguna casilla - ");
                } else {
                    System.out.print("Avanza "+ avance + " casillas - ");
                }
                System.out.println("Esta en la casilla "+ posicionJugador);
                System.out.print("El ordenador avanza " + avanceOrdenador + " casillas - ");
                System.out.println("Esta en la casilla "+ posicionOrdenador);
            }


            if (tropezado == 0){
                System.out.println("Elija un agujero: ");
                agujero = entrada.nextInt();
                if (agujero == 1){
                    posibilidad = (int) (Math.random()*100);
                    if (posibilidad <= 60){
                        avance = 1;
                    } else {
                        avance = 0;
                    }
                }
                if (agujero == 2){
                    posibilidad = (int) (Math.random()*100);
                    if (posibilidad <= 40){
                        avance = 2;
                    } else {
                        avance = 0;
                    }
                }
                if (agujero == 3){
                    posibilidad = (int) (Math.random()*100);
                    if (posibilidad <= 30){
                        avance = 4;
                    } else {
                        avance = 0;
                    }
                }
                if (agujero == 4){
                    posibilidad = (int) (Math.random()*100);
                    if (posibilidad <= 10){
                        avance = 6;
                    } else {
                        avance = 0;
                    }
                }
    
    
                if (avance == 0){
                    fallo = fallo + 1;
                } else {
                    fallo = 0;
                }
                if (fallo == 3) {
                    posicionJugador = 0;
                    System.out.println("Has vuelto al inicio");
                }
    
                tropieso = (int)(Math.random()*100);
                if (tropieso <= 10){
                    avance = 0;
                    tropezado = 2;
                    System.out.println("Tu camello ha tropezado. Perdiste 2 turnos!");
                }
            } else {
                tropezado = tropezado -1;
            }


            avanceOrdenador = (int) (Math.random()*3)+1;
            posicionOrdenador = posicionOrdenador + avanceOrdenador;
            posicionJugador = posicionJugador + avance;
            turno = turno +1;

        }

        System.out.println("---+-----------+---------+---------+---------+---------+-----------+");
        System.out.println("---| 0.........1.........2.........3.........4.........5.........6 |");
        System.out.println("---| 0123456789012345678901234567890123456789012345678901234567890 |");
        System.out.println("---+-----------+---------+---------+---------+---------+-----------+");
        System.out.print("[J]| ");
        for (i = 0; i< posicionJugador; i++){
            System.out.print(" ");
        }
        System.out.println(camello);
        System.out.println("---+-----------+---------+---------+---------+---------+-----------+");
        System.out.print("[O]| ");
        for (i = 0; i< posicionOrdenador; i++){
            System.out.print(" ");
        }
        System.out.println(camello);
        System.out.println("---+-----------+---------+---------+---------+---------+-----------+");

        
        System.out.println("El juego ha terminado");
        if (posicionJugador >=60){
            System.out.println("Has vencido el juego!");
        } else if (posicionOrdenador >=60){
            System.out.println("El Ordenador te ha vencido!");
        } else if (turno >=50){
            System.out.println("Han agotado sus turnos!");
        }
        entrada.close();
    }
}
