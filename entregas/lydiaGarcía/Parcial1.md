    import java.util.Scanner;public class Parcial1{
 
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        String Agujero = "";
        int agujero=0;

        int CasillasRestantes1=0;
        int CasillasRestantes2=0;
        int CasillasRestantes3=0;
        int CasillasRestantes4=0;
        int CasillaInicial=0;
        int CasillaFinal=60;
        int AvanceA1=1;
        int AvanceA2=2;
        int AvanceA3=4;
        int AvanceA4=6;
        CasillasRestantes1= CasillaFinal - AvanceA1;
        CasillasRestantes2= CasillaFinal - AvanceA2;
        CasillasRestantes3= CasillaFinal - AvanceA3;
        CasillasRestantes4= CasillaFinal - AvanceA4;


        AvanceA1 = (int)(Math.random() * (7)+1);
        AvanceA2 = (int)(Math.random() * (5)+1);
        AvanceA3 = (int)(Math.random() * (4)+1);
        AvanceA4 = (int)(Math.random() * (2)+1);

        do{
            int AvancePorcentaje =(int) (Math.random()*100);
        

        System.out.print("¿Qué agujero has escogido?: ");
        agujero = entrada.nextInt();
        System.out.println("");

        if(agujero ==1){
  
            if(AvanceA1<=60){
            System.out.print("Has acertado, el camello avanza 1 casilla, casillas restantes;" + CasillasRestantes1 );}
             else if (AvanceA1>=60){
            System.out.print("Has fallado, el camello no avanza");}

        else if(agujero ==2){
  
            if(AvanceA1<=40){
            System.out.print("Has acertado, el camello avanza 2 casillas, casillas restantes;" + CasillasRestantes2 );}
            else if (AvanceA1>=40){
            System.out.print("Has fallado, el camello no avanza");}

        else if(agujero ==3){
  
            if(AvanceA1<=30){
            System.out.print("Has acertado, el camello avanza 4 casillas, casillas restantes;" + CasillasRestantes3 );}
            else if (AvanceA1>=30){
            System.out.print("Has fallado, el camello no avanza");}

        else if(agujero ==4){
  
            if(AvanceA1<=10){
            System.out.print("Has acertado, el camello avanza 6 casillas, casillas restantes;" + CasillasRestantes4 );}
            else if (AvanceA1>=10){
            System.out.print("Has fallado, el camello no avanza");}

            else {
                System.out.println("El agujero que ha elegido no existe"); }
        
        if((CasillasRestantes1 | CasillasRestantes2 | CasillasRestantes3 | CasillasRestantes4) ==0);
        System.out.println("El juego ha acabado");


        }
