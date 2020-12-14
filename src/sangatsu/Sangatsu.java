package sangatsu;
/**
 *  Simulador de juego tres en raya.
 * @author Alex Guirao López <aguiraol2021@cepnet.net>
 */
public class Sangatsu 
{
    public static void main(String[] args)
    {
        //==================================INTRODUCCIÓN===========================================
        Tutorial.ShowTutorial();    //Muestra el tutorial del juego.
        
        do  //El jugador elige el modo de juego.
        {
            System.out.println("¿En qué modalidad quieres jugar?");
            System.out.println("1-Un jugador || 2-Multijugador");
            GameManager.setGameMode(Teclat.llegirInt());
            
            if (GameManager.getGameMode()<0 || GameManager.getGameMode()>2)
            {
                System.out.println("Opción incorrecta. Escoge una de las opciones.");
            }
        }while(GameManager.getGameMode()<0 || GameManager.getGameMode()>2);
        
        
        if (GameManager.getGameMode()==1)   //Si ha elegido el modo Un Jugador
        {
            System.out.println("Introduce tu nombre."); 
            Player player1 = new Player(Teclat.llegirString()); //Crea un objeto para el jugador e introduce su nombre.
            
            do  //El jugador elige la dificultad de la inteligencia artificial.
            {
            System.out.println("¿Quién es tu rival?");
            System.out.println("1-Una paloma del parque || 2-Un estudiante || 3-Un programador");
            AI.setLevel(Teclat.llegirInt());
            }while(AI.getLevel()!=1&&AI.getLevel()!=2&&AI.getLevel()!=3);
        }
        else    //Si ha elegido el modo multijugador.
        {
            System.out.println("Jugador 1 introduce tu nombre:");
            Player player1 = new Player(Teclat.llegirString());  //Crea un objeto para el jugador 1 e introduce su nombre.
            System.out.println("Jugador 2 introduce tu nombre:");
            Player player2 = new Player(Teclat.llegirString());  //Crea un objeto para el jugador 2 e introduce su nombre.
        }
        
        //==============================EJECUCIÓN DEL JUEGO======================================
        do
        {
            Board.setBoardPos();
            GameManager.CheckBoardStatus();
        }while (!GameManager.getGameFinish());
        
        //===================================RESULTADOS==========================================
        Board.DrawBoard(); //Dibuja el tablero final.
        System.out.println("Ha ganado un jugador. ¿Quién es? Eso hay que programarlo todavía.");
    }
}
