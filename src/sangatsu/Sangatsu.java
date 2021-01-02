package sangatsu;
/**
 *  Simulador de juego tres en raya.
 * @author Alex Guirao López <aguiraol2021@cepnet.net>
 */
public class Sangatsu 
{
    public static void main(String[] args)
    {
        //================================CREACIÓN DE OBJETOS====================================
        Player player1 = new Player();
        Player player2 = new Player();
          
        //==================================INTRODUCCIÓN=========================================
        System.out.println("Bienvenido a CEP en ralla.");
        
        do  //El jugador elige el modo de juego.
        {
            System.out.println("> ¿En qué modalidad quieres jugar?");
            System.out.print("  1-Un jugador || 2-Multijugador: ");
            GameManager.setGameMode(Teclat.llegirInt());
            
            if (GameManager.getGameMode()<0 || GameManager.getGameMode()>2)
            {
                System.out.println("Opción incorrecta. Escoge una de las opciones.");
            }
        }while(GameManager.getGameMode()<0 || GameManager.getGameMode()>2);
        
        
        if (GameManager.getGameMode()==1)   //Si ha elegido el modo Un Jugador
        {
            System.out.print("> Introduce tu nombre."); 
            player1.setPlayerName(Teclat.llegirString()); //Introduce el nombre del jugador.
            
            do  //El jugador elige la dificultad de la inteligencia artificial.
            {
                System.out.println("¿Quién es tu rival?");
                System.out.println("1-Una paloma del parque || 2-Un estudiante || 3-Un programador");
                AI.setLevel(Teclat.llegirInt());

                // TEST ONLY No estan disponibles las dificultades 2 y 3 todavía.
                if (AI.getLevel()==2 || AI.getLevel()==3)
                {
                    System.out.println("El programador está trabajando en esta dificultad. Perdón por la espera.");
                }
            }while(AI.getLevel()!=1 /*&&AI.getLevel()!=2&&AI.getLevel()!=3*/);
        }
        else    //Si ha elegido el modo multijugador.
        {
            System.out.print("> Introduce tu nombre: ");
            player1.setPlayerName(Teclat.llegirString());  //Introduce el nombre del jugador1.
            System.out.print("> Introduce el nombre del segundo jugador: ");
            player2.setPlayerName(Teclat.llegirString());  //Introduce el nombre del jugador2.
        }
        
        Tutorial.ShowTutorial();    //Muestra el tutorial del juego.
        System.out.println("==================================================="); //Imprime separación.
        //================================EJECUCIÓN DEL JUEGO====================================
        do
        {
            Board.RunTurn(player1.getPlayerName(), player2.getPlayerName());    //Ejecuta un turno.
            GameManager.CheckBoardStatus(); //Revisa el estado del tablero.
        }while (!GameManager.getGameFinish() && (!Board.getIsFull()));  //Mientras el juego no haya terminado.
        
        //===================================RESULTADOS=========================================
        System.out.println("==================================================="); //Imprime separación.
        Board.DrawBoard(); //Dibuja el tablero final.
        
        if (GameManager.getIsTie()) //Si ha habido un empate.
        {
            System.out.println("¡Ha habido un empate!!");
        }
        else    //Si algún jugador ha ganado.
        {
            //Si es el turno del jugador1, la inteligencia artificial o el jugador 2 hicieron el último turno y por lo tanto han ganado.
            if (GameManager.getIsPlayerTurn())  
            {
                if (GameManager.getGameMode()==2)   //Si es modo multijugador.
                {
                    System.out.println("Ha ganado " + player2.getPlayerName() + ". ¡Vaya crack!" ); //Gana el jugador 2.
                }
                else    //Si es modo un jugador.
                {
                    System.out.println("Ha ganado la CPU. Tendrás que seguir entrenando.");
                }
            }
            else    //Si no es el turno del jugador1 quiere decir que el último turno fue suyo y por lo tanto ha ganado.
            {
                System.out.println("Ha ganado " + player1.getPlayerName() + ". ¡Vaya crack!" );
            }
        }
        
        //============================SELECCIÓN DE NUEVA PARTIDA================================
        
        //Pregunta si quiere volver a jugar.
        //Resetea los valores iniciales.
        //Activa la nueva partida.
        
        
        
    }
}
