import java.util.Scanner;
public class CarreraDeCamellos {
    public static void main(String[] args){
        Scanner entry = new Scanner(System.in);
        int posCamello = 0, posOrdenador = 0, posFinal = 60, turnos = 0, turnosFallidos = 0, turnosMaximos = 50;
        while(posCamello<=posFinal && turnos<turnosMaximos && posOrdenador<=posFinal){
            turnos++;
            int avance = 0, avanceOrdenador = (int)(Math.random()*3)+1;
            double probabilidadAgujero = Math.random();
            double probabilidadTropezar = Math.random();
            System.out.print("¿A que agujero vas a tirar? ");
            int agujero = entry.nextInt();           

            if(agujero==1 && probabilidadAgujero<=0.6){avance=1;}
            else if(agujero==2 && probabilidadAgujero<=0.4){avance=2;}
            else if(agujero==3 && probabilidadAgujero<=0.3){avance=4;}
            else if(agujero==4 && probabilidadAgujero<=0.1){avance=6;}

            if (avance == 0){
                turnosFallidos++;
                if (turnosFallidos==3){
                    System.out.println("Has fallado tres veces seguidas, vuelves al principio");
                    posCamello=0; turnosFallidos=0;
                }
            }
            else{posCamello+=avance; turnosFallidos=0;}

            if (probabilidadTropezar<=0.1){
                System.out.println("\n¡Tu camello ha tropezado! No avanza este turno, y tiene que descansar otros dos.\n");
                posCamello-=avance; avance = 0;
            }

            posOrdenador+=avanceOrdenador;

            ///Display

            //Dibujo
            System.out.println("---+-----------+---------+---------+---------+---------+-----------+");
            System.out.println("---| 0.........1.........2.........3.........4.........5.........6 |");
            System.out.println("---| 0123456789012345678901234567890123456789012345678901234567890 |");
            System.out.println("---+-----------+---------+---------+---------+---------+-----------+");
            System.out.print("[J]| ");
            for (int i=0;i<=posFinal+3;i++){
                if (i==posCamello){System.out.print(";");}
                else if (i==posCamello+1){System.out.print("-");}
                else if (i==posCamello+2){System.out.print("-");}
                else if (i==posCamello+3){System.out.print(";");}
                else if (i==posCamello+4){System.out.print("'");}
                else {System.out.print(" ");}
            }
            System.out.println("\n---+-----------+---------+---------+---------+---------+-----------+");
            System.out.print("[O]| ");
            for (int i=0;i<=posFinal+3;i++){
                if (i==posOrdenador){System.out.print(";");}
                else if (i==posOrdenador+1){System.out.print("-");}
                else if (i==posOrdenador+2){System.out.print("-");}
                else if (i==posOrdenador+3){System.out.print(";");}
                else if (i==posOrdenador+4){System.out.print("'");}
                else {System.out.print(" ");}
            }
            System.out.println("\n---+-----------+---------+---------+---------+---------+-----------+");

            //Texto
            System.out.print("Turno["+turnos+"] - ");
            if (avance != 0){System.out.print("Avanza "+avance+" casilla/s - ");}
            else {System.out.print("No avanza ninguna casilla - ");}
            System.out.println("Esta en la casilla "+posCamello+" .");
            System.out.print("El ordenador avanza "+avanceOrdenador+" casilla/s - ");
            System.out.println("Esta en la casilla "+posOrdenador+" .");
            System.out.println("============================================");
            ///Display
            if (probabilidadTropezar<=0.1){turnos+=2;}
        }

        System.out.println("==================================");
        System.out.println("El juego ha terminado");
        if (posCamello>=60){System.out.println("Tu camello ha ganado.");}
        else if (posOrdenador>=60){System.out.println("El camello del ordenador ha ganado");}
        else {System.out.println("Os habeis quedado sin turnos");}
        System.out.println("==================================");

        entry.close();
    }
}
