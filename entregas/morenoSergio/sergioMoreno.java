import java.util.Scanner;

public class sergioMoreno {
    public static void main(String[] args){

    Scanner x = new Scanner(System.in);

    int agujero = 0;
    int casilla = 0;
    int agujero1 = 1;
    int agujero2 = 2;
    int agujero3 = 3;
    int agujero4 = 4;
    int probabilidadAgujero1 = 0;
    int probabilidadAgujero2 = 0;
    int probabilidadAgujero3 = 0;
    int probabilidadAgujero4 = 0;
    int avanceAgujero1 = 1;
    int avanceAgujero2 = 2;
    int avanceAgujero3 = 4;
    int avanceAgujero4 = 6;
    int turnos = 0;

    System.out.println("-----------------------------");
    System.out.println("Bienvenido al juego");
    System.out.println("Empiezas en la casilla 0");
    System.out.println("-----------------------------");

    System.out.println("---+-----------+---------+---------+---------+---------+-----------+");
    System.out.println("---| 0.........1.........2.........3.........4.........5.........6 |");
    System.out.println("---| 0123456789012345678901234567890123456789012345678901234567890 |");
    System.out.println("---+-----------+---------+---------+---------+---------+-----------+");
    System.out.println("[J]| ;--;'");
    System.out.println("---+-----------+---------+---------+---------+---------+-----------+");

    while (casilla < 60){

        turnos++;

        System.out.println("¿En que agujero quieres lanzar la pelota?");
        System.out.println("Agujero 1 = 1");
        System.out.println("Agujero 2 = 2");
        System.out.println("Agujero 3 = 3");
        System.out.println("Agujero 4 = 4");
        agujero = x.nextInt();
        System.out.println("");

        if (agujero == agujero1){
            System.out.println("Has elegido el agujero 1");
            probabilidadAgujero1 = (int)(Math.random()*10+1);

            if (probabilidadAgujero1 <= 6){
                casilla = casilla + avanceAgujero1;
                System.out.println("Has acertado, avanzas una casilla");
                System.out.println("Turno: " + turnos + " " + "Casilla: " + casilla);
                System.out.println("");
            } else{
                System.out.println("No has acertado, te quedas donde estas");
                System.out.println("Turno: " + turnos + " " + "Casilla: " + casilla);
                System.out.println("");
            }
        
        }

        if (agujero == agujero2){
            System.out.println("Has elegido el agujero 2");
            probabilidadAgujero2 = (int)(Math.random()*10+1);

            if (probabilidadAgujero2 <= 4){
                casilla = casilla + avanceAgujero2;
                System.out.println("Has acertado, avanzas una casilla");
                System.out.println("Turno: " + turnos + " " + "Casilla: " + casilla);
                System.out.println("");
            } else{
                System.out.println("No has acertado, te quedas donde estas");
                System.out.println("Turno: " + turnos + " " + "Casilla: " + casilla);
                System.out.println("");
            }
        
        }

        if (agujero == agujero3){
            System.out.println("Has elegido el agujero 3");
            probabilidadAgujero3 = (int)(Math.random()*10+1);

            if (probabilidadAgujero3 <= 3){
                casilla = casilla + avanceAgujero3;
                System.out.println("Has acertado, avanzas una casilla");
                System.out.println("Turno: " + turnos + " " + "Casilla: " + casilla);
                System.out.println("");
            } else{
                System.out.println("No has acertado, te quedas donde estas");
                System.out.println("Turno: " + turnos + " " + "Casilla: " + casilla);
                System.out.println("");
            }
        
        }

        if (agujero == agujero4){
            System.out.println("Has elegido el agujero 4");
            probabilidadAgujero4 = (int)(Math.random()*10+1);

            if (probabilidadAgujero4 <= 1){
                casilla = casilla + avanceAgujero4;
                System.out.println("Has acertado, avanzas una casilla");
                System.out.println("Turno: " + turnos + " " + "Casilla: " + casilla);
                System.out.println("");
            } else{
                System.out.println("No has acertado, te quedas donde estas");
                System.out.println("Turno: " + turnos + " " + "Casilla: " + casilla);
                System.out.println("");
            }
        
        }

        System.out.println("---+-----------+---------+---------+---------+---------+-----------+");
        System.out.println("---| 0.........1.........2.........3.........4.........5.........6 |");
        System.out.println("---| 0123456789012345678901234567890123456789012345678901234567890 |");
        System.out.println("---+-----------+---------+---------+---------+---------+-----------+");

        System.out.println("[J]|");

        for (int k = 1; k <= 60; k++){
            if (k != casilla){
                System.out.print(" ");
            } else{
                System.out.println(";--;'");
                k = 60;
            }
        }

        System.out.println("---+-----------+---------+---------+---------+---------+-----------+");

    }

    System.out.println(" ");
    System.out.println("Has llegado a la casilla 60");
    System.out.println("El juego ha acabado");

    x.close();

    }
}