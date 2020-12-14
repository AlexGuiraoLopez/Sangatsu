package sangatsu;
/**
 * 
 * @author Alex Guirao Lopez <aguiraol2021@cepnet.net>
 */
public class Player 
{
    static String playerName;   //Nombre del jugador.
    
    /**
     * Constructor del jugador.
     * @param _playerName 
     */
    public Player(String _playerName)
    {
        playerName = _playerName;
    }
    
    /**
     * Setter nombre del jugador.
     */
    public static void setPlayerName()
    {
        System.out.println("Introduce tu nombre:");
        playerName = Teclat.llegirString();
    }
    
    /**
     * Getter nombre del jugador.
     * @return nombre del jugador.
     */
    public static String getPlayerName()
    {
        return playerName;
    }
    
    /**
    * El jugador efectúa su jugada.
    */
    public static void Play()
    {
        do{
            Board.setPosIndex(Teclat.llegirInt());  //Asigna la posición del tablero a rellenar.

            if (Board.getPosIndex() <1 || Board.getPosIndex() >9)   //Si la posición no se encuentra en rango válido.
            {
                System.out.println("El valor introducido no es correcto.");
            }
        }while(Board.getPosIndex() <1 || Board.getPosIndex() >9);
        
        if (GameManager.getIsPlayerTurn())  //Si es el turno del Jugador 1...
        {
            Board.setBoardPosValue(Board.getPosIndex(), 2);    //Asigna la casilla seleccionada con el valor de la ficha del Jugador 1.
            GameManager.setIsPlayerTurn(false); //El turno del jugador 1 termina.
        }
        else if (GameManager.getGameMode()==2)
        {
            Board.setBoardPosValue(Board.getPosIndex(), 1);    //Asigna la casilla seleccionada con el valor de la ficha del Jugador 2.
            GameManager.setIsPlayerTurn(true);  //El turno del jugador 2 termina.
        }
    }
}
