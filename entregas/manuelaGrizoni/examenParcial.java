public class examenParcial {
    public static void main(String[] args){

        double agujero1 = 0.6;
        double agujero2 = 0.4;
        double agujero3 = 0.3; 
        double agujero4 = 0.1;
        int casillasTotal = 60;


        final String bordeSuperior;
        bordeSuperior= "---+-----------+---------+---------+---------+---------+-----------+";

        final String bordeMedio1;
        bordeMedio1= "---| 0.........1.........2.........3.........4.........5.........6 |";

        final String bordeMedio2; 
        bordeMedio2= "---| 0123456789012345678901234567890123456789012345678901234567890 |";

        final String bordeMedio3;
        bordeMedio3 = "---+-----------+---------+---------+---------+---------+-----------+ ";

        final String bordeMedio4;
        bordeMedio4 = "[J]| ;--;'                                                           ";

        final String bordeInferior;
        bordeInferior= "---+-----------+---------+---------+---------+---------+-----------+";

        System.out.println(bordeSuperior);
        System.out.println(bordeMedio1);
        System.out.println(bordeMedio2);
        System.out.println(bordeMedio3);
        System.out.println(bordeMedio4);
        System.out.println(bordeInferior);

        int agujeroEligido; 
        agujeroEligido = ((int) (Math.random()*4)+1); 
        

        
        double probabilidadAgujero;
        probabilidadAgujero = ((int) (Math.random()*11)+1); 



        for (int casillas=1; casillas <= casillasTotal; casillas = casillas + 1) {
            if (agujeroEligido == 1)  {
                if (probabilidadAgujero <= agujero1) {
                    System.out.println("avanza 1 casilla"); 
                   
                }

                if (agujeroEligido == 2) {
                    if (probabilidadAgujero <= agujero2) {
                        System.out.println ("avanza 2 casillas"); 
                        
                        
                    }
                }
       
                if (agujeroEligido == 3){
                    if (probabilidadAgujero <= agujero3){
                        System.out.println ("avanza 4 casillas");
                   
                    }
                }


                if (agujeroEligido == 4) {
                    if (probabilidadAgujero <= agujero4){
                        System.out.println ("avanza 6 casillas");
                        
                    }
                }

        } 
        
    }
        
        System.out.println("fin de juego"); 
       

       


     
        
           


        



        

    }

}
    