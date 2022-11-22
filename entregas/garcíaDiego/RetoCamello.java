import java.util.Scanner;
public class RetoCamello {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        int eleccionUsuario;
        double probabilidadAcierto;
        double probabilidadCaida;
        boolean caida = false;
        int posicionCamello = 0;
        int turno = 0;
        boolean juegoEncendido = true;
        int contadorFallos = 0;
        int tiroOrdenador;
        int posicionOrdenador = 0;

        while(juegoEncendido){
        
            turno++;

            System.out.println("Elija el agujero al cual lanzar del 1 al 4: ");
            eleccionUsuario = s.nextInt();

            if(eleccionUsuario == 1){

                probabilidadCaida = Math.random();
                if(probabilidadCaida <= 0.1){
                    System.out.println("Vaya el camello se tropezo no avanzas y pierdes 2 turnos");
                    turno += 2;
                    caida = true;
                }else{

                    probabilidadAcierto = Math.random();
                    if(probabilidadAcierto <=0.6){
                        posicionCamello++;
                        System.out.println("Bien!! has acertado el tiro avanza 1 casilla");
                        contadorFallos = 0;
                    }else{
                        System.out.println("Vaya has fallado el tiro");
                        contadorFallos++;
                    }
                }

                tiroOrdenador = (int)((Math.random()*2)+1);
                System.out.println("El ordenador avanza "+ tiroOrdenador +" casillas");

                posicionOrdenador+= tiroOrdenador;

            }else if(eleccionUsuario == 2){

                probabilidadCaida = Math.random();
                if(probabilidadCaida <= 0.1){
                    System.out.println("Vaya el camello se tropezo no avanzas y pierdes 2 turnos");
                    turno += 2;
                    caida = true;
                }else{

                    probabilidadAcierto = Math.random();
                    if(probabilidadAcierto <=0.4){
                        posicionCamello+=2;
                        System.out.println("Bien!! has acertado el tiro avanza 2 casillas");
                        contadorFallos = 0;
                    }else{
                        System.out.println("Vaya has fallado el tiro");
                        contadorFallos++;
                    }
                }

                tiroOrdenador = (int)((Math.random()*2)+1);
                System.out.println("El ordenador avanza "+ tiroOrdenador +" casillas");

                posicionOrdenador+= tiroOrdenador;

            }else if(eleccionUsuario == 3){

                probabilidadCaida = Math.random();
                if(probabilidadCaida <= 0.1){
                    System.out.println("Vaya el camello se tropezo no avanzas y pierdes 2 turnos");
                    turno += 2;
                    caida = true;
                }else{

                    probabilidadAcierto = Math.random();
                    if(probabilidadAcierto <=0.3){
                        posicionCamello+=4;
                        System.out.println("Bien!! has acertado el tiro avanza 4 casillas");
                        contadorFallos = 0;
                    }else{
                        System.out.println("Vaya has fallado el tiro");
                        contadorFallos++;
                    }
                }

                tiroOrdenador = (int)((Math.random()*2)+1);
                System.out.println("El ordenador avanza "+ tiroOrdenador +" casillas");

                posicionOrdenador+= tiroOrdenador;

            }else if (eleccionUsuario == 4){

                probabilidadCaida = Math.random();
                if(probabilidadCaida <= 0.1){
                    System.out.println("Vaya el camello se tropezo no avanzas y pierdes 2 turnos");
                    turno += 2;
                    caida = true;
                }else{

                    probabilidadAcierto = Math.random();
                    if(probabilidadAcierto <=0.1){
                        posicionCamello+=6;
                        System.out.println("Bien!! has acertado el tiro avanza 6 casillas");
                        contadorFallos = 0;
                    }else{
                        System.out.println("Vaya has fallado el tiro");
                        contadorFallos++;
                    }
                }

                tiroOrdenador = (int)((Math.random()*2)+1);
                System.out.println("El ordenador avanza "+ tiroOrdenador +" casillas");

                posicionOrdenador+= tiroOrdenador;
            }

            


            if(caida){
                System.out.println("Nos vemos en el turno " + (turno+1));
                System.out.println();

                tiroOrdenador = (int)((Math.random()*5)+1);
                posicionOrdenador+= tiroOrdenador;

                System.out.println("Mientras te levantabas el ordenador ha avanzado "+ tiroOrdenador+" casillas");

               
                caida = false;
        


            }else{
                if(contadorFallos == 3){
                    posicionCamello = 0;
                    System.out.println("Vaya has fallado 3 veces seguidas el camello vuelve al inicio");
                }
                
                System.out.println();

                System.out.println("---+-----------+---------+---------+---------+---------+-----------+");
                System.out.println("---| 0.........1.........2.........3.........4.........5.........6 |");
                System.out.println("---| 0123456789012345678901234567890123456789012345678901234567890 |");
                System.out.println("---+-----------+---------+---------+---------+---------+-----------+");
                System.out.print("[J]| ");





                for(int i = 0; i < posicionCamello; i++){

                    System.out.print(" ");

                }
                
                System.out.println(";--;'");
                System.out.println("---+-----------+---------+---------+---------+---------+-----------+");


                System.out.print("[O]| ");


                for(int i = 0; i < posicionOrdenador; i++){

                    System.out.print(" ");

                }
                
                System.out.println(";--;'");
                System.out.println("---+-----------+---------+---------+---------+---------+-----------+");
                System.out.println("Turno " +turno);
                System.out.println();

            }

            if(posicionCamello >= 60 || posicionOrdenador >= 60 || turno >=50){
                juegoEncendido = false;
            }

        }

        if(turno >= 50){
            System.out.println("Vaya el juego se acabo te has quedado sin turnos");
        }else if(posicionOrdenador >= 60){
            System.out.println("Vaya el juego se acabo el ordenador gana la partida");

        }else{
            System.out.println("Bien!!! llegaste al final");
        }

        
        
        s.close();
    }
    
}
