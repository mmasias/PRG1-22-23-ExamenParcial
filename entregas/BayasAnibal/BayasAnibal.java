import java.util.Scanner; 

public class ZZZZZ {
    public static void main(String[] args) {
        System.out.println("La carrera va a dar comienzo, esta es la pista:");
        System.out.println("---+-----------+---------+---------+---------+---------+-----------+");
        System.out.println("---| 0.........1.........2.........3.........4.........5.........6 |");
        System.out.println("---| 0123456789012345678901234567890123456789012345678901234567890 |");
        System.out.println("---+-----------+---------+---------+---------+---------+-----------+");
        System.out.println("[J]| ;--;'");
        System.out.println("---+-----------+---------+---------+---------+---------+-----------+");
        
        final String BordeSuperior      = "---+-----------+---------+---------+---------+---------+-----------+";
        final String ContadorDecametros = "---| 0.........1.........2.........3.........4.........5.........6 |";
        final String ContadorMetros     = "---| 0123456789012345678901234567890123456789012345678901234567890 |";
        final String BordeMedio         = "---+-----------+---------+---------+---------+---------+-----------+";
        final String LineaCamello       ="[J]| ;--;'";
        final String BordeInferior      = "---+-----------+---------+---------+---------+---------+-----------+";
     
     
        for (int i = 0; i < 100; i = i + 1) {  
           
        Scanner entradaScanner= new Scanner(System.in);
        int dimension=2;
        int camello= 0;
        int respuesta;
        int turno=0;
        


        System.out.println("");
        System.out.print("¿A que agujero desea lanzar? ");
        
        respuesta= entradaScanner.nextInt();
        
        if(respuesta== 1){
            System.out.println("El jugador ha elegido lanzar al primer agujero");
            int probabilidad1 =  (int) (Math.random() * 11);
            System.out.println("");
            if(probabilidad1<=6){
                camello= camello+1;
                System.out.println("¡Muy bien! Has acertado, se te suma 1 punto");
                System.out.println("Turno "+turno +1);
                
            }else{
                System.out.println("¡Noo! Fallaste, a la próxima será");
                System.out.println("Turno "+turno +1);
            }
            

     
        }if(respuesta==2){
            System.out.println("El jugador ha elegido lanzar al segundo agujero");
            int probabilidad2 =  (int) (Math.random() * 11);
            System.out.println("");
            if(probabilidad2<=4){
                camello= camello+2;
                System.out.println("¡Muy bien! Has acertado, se te suman 2 puntos");
                System.out.println("Turno "+turno +1);
            }else{
                System.out.println("¡Noo! Fallaste, a la próxima será");
                System.out.println("Turno "+turno +1);
            }
            
    
    
        }if(respuesta==3){
            System.out.println("El jugador ha elegido lanzar al tercer agujero");
            int probabilidad3 =  (int) (Math.random() * 11);
            System.out.println("");
            if(probabilidad3<=3){
                camello= camello+4;
                System.out.println("¡Muy bien! Has acertado, se te suman 4 puntos");
                System.out.println("Turno "+turno +1);
            }else{
                System.out.println("¡Noo! Fallaste, a la próxima será");  
                System.out.println("Turno "+turno +1);         
            }
            
        
        
        }if(respuesta==4){
                System.out.println("El jugador ha elegido lanzar al cuarto agujero");
                int probabilidad4 =  (int) (Math.random() * 11);
                System.out.println("");
                if(probabilidad4<=1){
                    camello= camello+6;
                    System.out.println("¡Muy bien! Has acertado, se te suman 6 puntos");
                    System.out.println("Turno "+turno +1);
                }else{
                    System.out.println("¡Noo! Fallaste, a la próxima será");
                    System.out.println("Turno "+turno+1);
                }
            }
           
        
        
            if(camello >= 60){
            System.out.println("El camello acabó la carrera");
            break;
        }    
       
        }

        

    }
    
    
}
