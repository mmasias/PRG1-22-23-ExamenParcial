import java.util.Scanner;
public class Examenparcial {
    public static void main(String []args){
       Scanner sc=new Scanner(System.in);
        int numerodeagujero;
        double agujero1=0.1;
        double agujero2=0.2;
        double agujero3=0.3;
        double agujero4=0.4;
        double probabilidaddeagujero1;
        double probablidadadeagujero2;
        double probabilidaddeagujero3;
        double probabilidaddeagujero4;
        double carrera=6.0;
        double camellojugador=0;
        int turnojugador=0;
        
        
        while (carrera<=6.0){
         System.out.println("Ingrese el numero de agujero que quiere utilizar:");
         numerodeagujero=sc.nextInt();

         if(numerodeagujero==1){
         probabilidaddeagujero1=Math.random();
        if(probabilidaddeagujero1<=0.6){
            System.out.println("Perfecto,tu caballo se movio 1 casilla");
            camellojugador=camellojugador+agujero1;
            turnojugador=+1;
        }else{
            System.out.println("Que lastima, no lograste avanzar");
            turnojugador=+1;
        }   
         }else if(numerodeagujero==2){
          probablidadadeagujero2=Math.random();
        if(probablidadadeagujero2<=0.4){
            System.out.println("Perfecto,tu caballo se movio 2 casillas");
            camellojugador=camellojugador+agujero2;
            turnojugador=+1;
        }else{
            System.out.println("Que lastima, no lograste avanzar");
            turnojugador=+1;   
        }
        }else if(numerodeagujero==3){
           probabilidaddeagujero3=Math.random();
        if(probabilidaddeagujero3<=0.3){
            System.out.println("Perfecto,tu caballo se movio 4 casillas");
            camellojugador=camellojugador+agujero3;
            turnojugador=+1;
        }else{
            System.out.println("Que lastima, no lograste avanzar");
            turnojugador=+1;
        }  
        }else if(numerodeagujero==4){
        probabilidaddeagujero4=Math.random();
        if(probabilidaddeagujero4<=0.1){
            System.out.println("Perfecto,tu caballo se movio 6 casillas");
            camellojugador=camellojugador+agujero4;
            turnojugador=+1;
        }else{
            System.out.println("Que lastima, no lograste avanzar");
            turnojugador=+1;    
        }
        }
        for (int i=0;i <= carrera;i++){
            
            if ((int)camellojugador==i){
                 System.out.print("[J]| ;--;'");
            }else if (i >= (int)carrera){
                System.out.println("---| 0.........1.........2.........3.........4.........5.........6 |");
                System.out.println("---| 0123456789012345678901234567890123456789012345678901234567890 |");
        }
    }
        System.out.print("---+-----------+---------+---------+---------+---------+-----------+");
        System.out.print("Turno:"+turnojugador+"-"+"Esta en la casilla"+camellojugador);

        if(camellojugador>=carrera){
            System.out.println("Se ha terminado");
        }

    }
}
}
