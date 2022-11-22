import java.util.Scanner;
public class examenParcial {
    public static void main(String[] args) {
    int avanceAgujero1;
    avanceAgujero1= 1;
    int avanceAgujero2;
    avanceAgujero2= 2;
    int avanceAgujero3;
    avanceAgujero3= 4;
    int avanceAgujero4;
    avanceAgujero4= 6;
    int casillaInicial;
    casillaInicial= 0;
    int intentos;
    boolean continueJuego = true;
    for (int i = 1; i <=60; i=i+1){
        double probabilidadAvance1;
    probabilidadAvance1 = Math.random();
    double probabilidadAvance2;
    probabilidadAvance2 = Math.random();
    double probabilidadAvance3;
    probabilidadAvance3 = Math.random();
    double probabilidadAvance4;
    probabilidadAvance4 = Math.random();
        Scanner entrada = new Scanner(System.in);
        int pedirAgujero;
        System.out.println("A que agujero quieres probar suerte 1, que avanzas 1. 2, que avanzas 2. 3 que avanzas 4. 4 que avanzas 6 ");
        pedirAgujero = entrada.nextInt();
        if (pedirAgujero ==1 && probabilidadAvance1<=0.6){
            casillaInicial= casillaInicial+1;
            System.out.println( "[J]|"+ "" + ";--;");
    
        }else if (pedirAgujero ==2 && probabilidadAvance2<=0.4){
            casillaInicial= casillaInicial+2;
            System.out.println("[J]|"+""+ "" + ";--;");
        }else if (pedirAgujero ==3 && probabilidadAvance3<=0.3){
            casillaInicial= casillaInicial+4;
            System.out.println("[J]|"+"" + "" + ""+ "" + ";--;");
        }else if (pedirAgujero ==4 && probabilidadAvance4<=0.1){
            casillaInicial= casillaInicial+6;
            System.out.println("[J]|"+""+ "" + "" + "" + ""+ "" + ";--;");
        } else {
            System.out.println("[J]|"+";--;");

        }
        
        
    
        
        System.out.println("");
        
            
            System.out.println("---+-----------+---------+---------+---------+---------+-----------+");
            System.out.println("---| 0.........1.........2.........3.........4.........5.........6 |");
            System.out.println("---| 0123456789012345678901234567890123456789012345678901234567890 |");
            System.out.println("---+-----------+---------+---------+---------+---------+-----------+");
            
            System.out.println("---+-----------+---------+---------+---------+---------+-----------+");
            System.out.println("---+-----------+---------+---------+---------+---------+-----------+");

            
            
            if (pedirAgujero ==1 && probabilidadAvance1<=0.6 || pedirAgujero ==2 && probabilidadAvance2<=0.4 ||pedirAgujero ==3 && probabilidadAvance3<=0.3 || pedirAgujero ==4 && probabilidadAvance4<=0.1){
            
            System.out.println("Turno " + i + " - Avanzas casillas" + "-" + "Esta en la casilla " + casillaInicial);
            }else {
                System.out.println("Turno " + i + " - No avanza ninguna casilla" + "-" + "Esta en la casilla " + casillaInicial);
            }
            
            
            
        




            
             
            

            
        }
        System.out.println("Enhorabuena, has ganado");
    }
        
    }    
    

    
