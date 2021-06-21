package sangatsu;
/**
 * @author Alex Guirao Lopez <alexguiraolopez@gmaIl.com>
 */
public class Player 
{
    String playerName;   //Nombre del jugador.
  
    /**
     * Setter nombre del jugador.
     * @param _playerName 
     */
    public void setPlayerName(String _playerName)
    {
        playerName = _playerName;
    }
    
    /**
     * Getter nombre del jugador.
     * @return nombre del jugador.
     */
    public String getPlayerName()
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
                System.out.println("El valor introducido no pertenece a ninguna casilla.");
            }
            else if (Board.getBoardPosValue(Board.getPosIndex())!=0)    //Si la casilla seleccionada no está vacía.
            {
                System.out.println("La casilla seleccionada ya está ocupada por una ficha.");
                System.out.println("Introduce de nuevo porfavor.");
            }
        }while(Board.getPosIndex() <1 || Board.getPosIndex() >9 || Board.getBoardPosValue(Board.getPosIndex())!=0);
        
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
