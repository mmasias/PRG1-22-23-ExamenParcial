import java.util.Scanner;

public class EXAMEN {
    public static void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        int turno;
        int dimension = 6;
        double casilla;
        int casillaActual;
        int avanceCamello;
        int camello;
        double probabilidadAcierto1;
        double probabilidadAcierto2;
        double probabilidadAcierto3;
        double probabilidadAcierto4;
        probabilidadAcierto1 = Math.random();
        probabilidadAcierto2 = Math.random();
        probabilidadAcierto3 = Math.random();
        probabilidadAcierto4 = Math.random();
        int agujero1 = 1;
        int agujero2 = 2;
        int agujero3 = 3;
        int agujero4 = 4;
        
         System.out.println("Introduzca la casilla a la que quiere lanzar");
              casilla = entrada.nextDouble(); 
        
                for (casilla = 1){
                   if (probabilidadAcierto1 <= 0.6){
                 System.out.println("El usuario ha acertado en el agujero 1");
                 turno++;
                 avanceCamello++;
                 }else{
                    System.out.println("El usuario ha fallado");
                }

                for (casilla = 2){
                   if (probabilidadAcierto1 <= 0.4){
                 System.out.println("El usuario ha acertado en el agujero 2");
                 turno = turno++;
                 avanceCamello = avanceCamello + 2;
                  }else {
                     System.out.println("El usuario ha fallado");
                  
                 for (casilla = 3){
                      if (probabilidadAcierto3 <= 0.3){
                        System.out.println(" El usuario ha acertado en el agujero 3");
                        turno++;
                        avanceCamello = avanceCamello + 4;
                        }else {
                            System.out.println("El usuario ha fallado");
                        }



                    }
                for (casilla = 4){
                        if (probabilidadAcierto4 <= 0.1){
                            System.out.println("El usuario ha acertado en el agujero 4");
                            turno++;
                            avanceCamello = avanceCamello + 6; 

                        }else{
                            System.out.println("El usuario ha fallado");
                        }
                    }

                 
                    
                 } casillaActual = avanceCamello;
                 System.out.println(" El usuario está en el turno: " +turno);
                 System.out.println("Su casilla actual es la : " +casillaActual);
                

            }
        
            
   
    


            

                 

              
              
                   
                
             
             
            

    
}           
