package sangatsu;
/**
 * 
 * @author Alex Guirao López <aguiraol2021@cepnet.net>
 */
public class GameManager 
{
    static boolean gameFinish = false;  //Juego terminado.
    static int gameMode;    //Modo de juego.
    static boolean isPlayerTurn;    //Turno del jugador (en el caso de que sea multijugador se refiere al jugador 1).
    static boolean isFirstRun = true; //Indicador de primera tirada del juego.
    
    /**
     * Revisa el estado del tablero para comprobar si hay alguna linea completada y ha ganado uno de los jugadores.
     */
    public static void CheckBoardStatus()
    {
        if ((Board.getBoardPosValue(1)==1 && Board.getBoardPosValue(2)==1 && Board.getBoardPosValue(3)==1) ||
               (Board.getBoardPosValue(1)==2 && Board.getBoardPosValue(2)==2 && Board.getBoardPosValue(3)==2))
        {
            GameManager.setGameFinish(true);
        }else if ((Board.getBoardPosValue(1)==1 && Board.getBoardPosValue(5)==1 && Board.getBoardPosValue(9)==1) ||
               (Board.getBoardPosValue(1)==2 && Board.getBoardPosValue(5)==2 && Board.getBoardPosValue(9)==2))
        {
            GameManager.setGameFinish(true);
        }else if ((Board.getBoardPosValue(1)==1 && Board.getBoardPosValue(4)==1 && Board.getBoardPosValue(7)==1) ||
               (Board.getBoardPosValue(1)==2 && Board.getBoardPosValue(4)==2 && Board.getBoardPosValue(7)==2))
        {
            GameManager.setGameFinish(true);
        }else if ((Board.getBoardPosValue(2)==1 && Board.getBoardPosValue(5)==1 && Board.getBoardPosValue(8)==1) ||
               (Board.getBoardPosValue(2)==2 && Board.getBoardPosValue(5)==2 && Board.getBoardPosValue(8)==2))
        {
            GameManager.setGameFinish(true);
        }else if ((Board.getBoardPosValue(3)==1 && Board.getBoardPosValue(5)==1 && Board.getBoardPosValue(7)==1) ||
               (Board.getBoardPosValue(3)==2 && Board.getBoardPosValue(5)==2 && Board.getBoardPosValue(7)==2))
        {
            GameManager.setGameFinish(true);
        }else if ((Board.getBoardPosValue(3)==1 && Board.getBoardPosValue(6)==1 && Board.getBoardPosValue(9)==1) ||
               (Board.getBoardPosValue(3)==2 && Board.getBoardPosValue(6)==2 && Board.getBoardPosValue(9)==2))
        {
            GameManager.setGameFinish(true);
        }else if ((Board.getBoardPosValue(4)==1 && Board.getBoardPosValue(5)==1 && Board.getBoardPosValue(6)==1) ||
               (Board.getBoardPosValue(4)==2 && Board.getBoardPosValue(5)==2 && Board.getBoardPosValue(6)==2))
        {
            GameManager.setGameFinish(true);
        }else if ((Board.getBoardPosValue(7)==1 && Board.getBoardPosValue(8)==1 && Board.getBoardPosValue(9)==1) ||
               (Board.getBoardPosValue(7)==2 && Board.getBoardPosValue(8)==2 && Board.getBoardPosValue(9)==2))
        {
            GameManager.setGameFinish(true);
        }
    }
    
    /**
     * Setter activar el turno del jugador.
     * @param _isPlayerTurn 
     */
    public static void setIsPlayerTurn(boolean _isPlayerTurn)
    {
        isPlayerTurn = _isPlayerTurn;
    }
    
    /**
     * Getter turno del jugador.
     * @return Turno del jugador.
     */
    public static boolean getIsPlayerTurn()
    {
        return isPlayerTurn;
    }
    
    /**
     * Getter primera tirada de la partida.
     * @return 
     */
    public static boolean getIsFirstRun()
    {
        return isFirstRun;
    }
    
    /**
     * Setter primera tirada de la partida.
     * @param _isFirstRun 
     */
    public static void setIsFirstRun(boolean _isFirstRun)
    {
        isFirstRun = _isFirstRun;
    }
    
    
    /**
     * Setter modo de juego (1= Un jugador, 2= Multijugador).
     * @param _gameMode 
     */
    public static void setGameMode(int _gameMode)
    {
        gameMode = _gameMode;
    }
    
    /**
     * Getter modo de juego.
     * @return  modo de juego (1= Un jugador, 2= Multijugador).
     */
    public static int getGameMode()
    {
        return gameMode;
    }
    
    /**
     * Setter juego terminado.
     * @param _gameFinish 
     */
    public static void setGameFinish(boolean _gameFinish)
    {
        gameFinish = _gameFinish;
    }
    
    /**
     * Getter juego terminado.
     * @return El juego ha terminado.
     */
    public static boolean getGameFinish()
    {
        return gameFinish;
    }
}
