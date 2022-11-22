public class CarreraDeCamellosdavid {
    public static void main(String[] args) {
        int turno=0;
        int avanceagujero1=0;
        int avance=59;
        int avanceagujero2=0; 
        int avanceagujero3=0;
        int avanceagujero4=0;
        int agujero1=0;
        int agujero2=0;
        int agujero3=0;
        int agujero4=0;
        System.out.println("Elige un agujero:"+agujero1);
        System.out.println();
        for(int i = 0; i <= avance; i = i + 1){
            turno=turno+1;
            if(agujero1<=25){
                if(Math.random()*100<=60){
                    avanceagujero1=avanceagujero1+1;
                }

            }
            if(agujero2<=25){
                if(Math.random()*100<=40){
                    avanceagujero2=avanceagujero2+2;

                }

            }
            if(agujero3<=25){
                if(Math.random()*100<=30){
                    avanceagujero3=avanceagujero3+4;
                }

            }
            if(agujero4<=25){
                if(Math.random()*100<=10){
                    avanceagujero4=avanceagujero4+6;
                }

            }
            if(turno==60){
                System.out.println("El juego ha terminado: "+turno);
            }
            System.out.println("Turno"+turno);
            System.out.println("Avanza"+avance);
        }

        
    }

}
