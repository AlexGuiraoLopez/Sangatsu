package sangatsu;
/**
 * Inteligencia Artificial contrincante del juego.
 * @author Alex Guirao López <aguiraol2021@cepnet.net>
 */
public class AI 
{
    static int level;  //Nivel de complejidad de la inteligencia artificial.
    
    /**
     * Setter nivel de la inteligencia artificial. 
     * @param _level 
     */
    public static void setLevel(int _level)
    {
        level = _level;
    }
    
    /**
     * Getter nivel de la inteligencia artificial.
     * @return número del nivel de la inteligencia artificial (1 = fácil, 2 = normal, 3 = difícil).
     */
    public static int getLevel()
    {
        return level;
    }
    
    /**
     * La inteligencia artificial efectúa su turno.
     * @param _level 
     */
    public static void Play(int _level)
    {
        switch (_level)
        {
            case 1: 
                do{ //Genera un número aleatorio mientras la casilla seleccionada ya tenga un valor asignado.
                Board.setPosIndex((int)(Math.random()*9+1));

                }while (Board.getBoardPosValue(Board.getPosIndex())!=0 );

                Board.setBoardPosValue(Board.getPosIndex(),1); //Asigna valor a la casilla elegida aleatóriamente.
                break;
            case 2: 
                break;
            case 3: 
                break;
        }
        
        GameManager.setIsPlayerTurn(true);
    }
}
