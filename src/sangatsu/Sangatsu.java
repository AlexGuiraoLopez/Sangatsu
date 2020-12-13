package sangatsu;
/**
 *
 * @author Alex Guirao López <aguiraol2021@cepnet.net>
 */
public class Sangatsu 
{

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args)
    {
        Tutorial.ShowTutorial();
        
        System.out.println("¿En qué modalidad quieres jugar?");
        do
        {
            System.out.println("1-Un jugador || 2-Multijugador");
            GameManager.setGameMode(Teclat.llegirInt());
            
            if (GameManager.getGameMode()<0 || GameManager.getGameMode()>2)
            {
                System.out.println("Opción incorrecta. Escoge una de las opciones.");
            }
        }while(GameManager.getGameMode()<0 || GameManager.getGameMode()>2);
        
        
        if (GameManager.getGameMode()==1)
        {
            do
            {
            System.out.println("¿Quién es tu rival?");
            System.out.println("1-Una paloma del parque || 2-Un estudiante || 3-Un programador");
            AI.setLevel(Teclat.llegirInt());
            }while(AI.getLevel()!=1&&AI.getLevel()!=2&&AI.getLevel()!=3);
        }
        
        do
        {
            Board.setBoardPos();
            GameManager.CheckBoardStatus();
        }while (!GameManager.getGameFinish());
        
    }
}
