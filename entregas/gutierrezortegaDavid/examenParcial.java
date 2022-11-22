import java.util.Scanner;

public class examenParcial {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int casillasTotales = 60;
        int casillaInicial = 1;
        int probabilidadTiro1 = 60;
        int probabilidadTiro2 = 40;
        int probabilidadTiro3 = 30;
        int probabilidadTiro4 = 10;
        int avancesTiro1 = 1;
        int avancesTiro2 = 2;
        int avancesTiro3 = 4;
        int avancesTiro4 = 6;
        int Tiro1 = 1;
        int Tiro2 = 2;
        int Tiro3 = 3;
        int Tiro4 = 4;
        int contadorTurno = 1;
        System.out.println(" Da comienzo la carrera de camellos");
        System.out.println("Elije el tiro del 1 al 4:");
        while (casillaInicial <= 60) {
            System.out.println( + casillaInicial);
            casillaInicial++;
       }
        Tiro1 = entrada.nextInt();
        if (probabilidadTiro1>=(int)(Math.random()*10)) {casillaInicial = casillaInicial + 1;
        }
        else if(probabilidadTiro2>=(int)(Math.random()*10)) {casillaInicial = casillaInicial + 2;
        }
        else if(probabilidadTiro3>=(int)(Math.random()*10)) {casillaInicial = casillaInicial + 4;
        }
        else if(probabilidadTiro4>=(int)(Math.random()*10)) {casillaInicial = casillaInicial + 6;
        }
        if (casillaInicial == 60 ) {
        }
    }
}
