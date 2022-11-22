import java.util.Scanner;
public class Parcial22{
	public static void main(String[] args){
        Scanner entrada=new Scanner(System.in);
        int fallosSeguidos=0;
        int fallos=0;
        int casillaActual=0;
        double porbAgujero1=0;
        double porbAgujero2=0;
        double porbAgujero3=0;
        double porbAgujero4=0;
        int casillasAvanzadas=0;
        int elejirAgujeroM=0;
        int casillaActualM=0;
        int turnos=0;
        double tropiezo=0;
        while (casillaActual<60 && turnos<50 && casillaActualM<60 ){
            casillaActualM=(int)(Math.random()*2);
            if (elejirAgujeroM==0){casillaActualM=casillaActualM+1;} 
            if (elejirAgujeroM==1){casillaActualM=casillaActualM+2;}
            if (elejirAgujeroM==2){casillaActualM=casillaActualM+3;}
            else {casillaActualM=casillaActualM;}
        tropiezo=Math.random();
        if (tropiezo>0.1){
        turnos++;
        if (fallosSeguidos==3){fallosSeguidos=0; casillaActual=0;}
        System.out.println("---+-----------+---------+---------+---------+---------+-----------+");
        System.out.println("---| 0.........1.........2.........3.........4.........5.........6 |");
        System.out.println("---| 0123456789012345678901234567890123456789012345678901234567890 |");
        System.out.print("[J]|");
        for (int i=0;i<casillaActual;i++) {
			System.out.print(" "); 
		}
        System.out.print(" ;--;'");
        System.out.println(" ");
        System.out.println("---+-----------+---------+---------+---------+---------+-----------+");
        System.out.print("[O]|");
        for (int i=0;i<casillaActualM;i++) {
			System.out.print(" "); 
		}
        System.out.print(" ;--;'");
        System.out.println(" ");
        System.out.println("---+-----------+---------+---------+---------+---------+-----------+");
        System.out.print("Turno: "+ turnos+ " - " + "Avanzas " + casillasAvanzadas + " - " + 
        "Está en la casilla: " + casillaActual);
        System.out.println(" ");
        System.out.println("Elija un agujero: ");
        casillasAvanzadas=0;
        int elejirAgujero=entrada.nextInt();
            if (elejirAgujero==1){porbAgujero1=Math.random();
                if (porbAgujero1<=0.6){casillaActual++;casillasAvanzadas=1; fallosSeguidos=0;} 
                else {fallos++; fallosSeguidos++;}}
                else if (elejirAgujero==2){porbAgujero2=Math.random();
                if (porbAgujero2<=0.4){casillaActual=casillaActual+2; casillasAvanzadas=2; fallosSeguidos=0;} 
                else {fallos++; fallosSeguidos++;}}
                else if (elejirAgujero==3){porbAgujero3=Math.random();
                if (porbAgujero3<=0.3){casillaActual=casillaActual+4; casillasAvanzadas=4; fallosSeguidos=0;} 
                else {fallos++; fallosSeguidos++;}}
                else if (elejirAgujero==4){porbAgujero4=Math.random();
                if (porbAgujero4<=0.1){casillaActual=casillaActual+6;  casillasAvanzadas=6; fallosSeguidos=0;} 
                else {fallos++; fallosSeguidos++;}}
              

            } else {for (int i=0; i<=1; i++){turnos++;
                System.out.println("Turno: "+ turnos+ " - Has tropezado");}}
            }
        
    
    }

	}