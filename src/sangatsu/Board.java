package sangatsu;
/**
 * Tablero de juego.
 * @author Alex Guirao Lopez <aguiraol2021@cepnet.net>
 */
public class Board 
{
    final static int BOARD_HEIGHT = 3;  //Alto del tablero (en número de casillas).
    final static int BOARD_WIDTH =3;    //Ancho del tablero (en número de casillas).
    
    /*Vector que indica las casillas del tablero.
    * Los índices del vector corresponden a la disposición del teclado númerico. 
    * No se utilizará el primer índice (0) del vector ya que no figura en el tablero.
    * Cada valor de cada uno de los índices corresponde al valor actual de cada casilla.
    * (0 = casilla sin llenar, 1 = casilla marcada por el contrincante, 2 = casilla marcada por el jugador)
    */
    static int[] boardPos= new int [10];   
    
    static int posIndex;   //Posición de la casilla a asignar.
    
    /**
     * Dibuja el tablero en la consola.
     */
    public static void DrawBoard()
    {
        int checkCounter=7; //Contador de la casilla actual a revisar.
        
        for (int i = 0; i < BOARD_HEIGHT; i++ )
        {
            System.out.println(""); //Imprime salto de linea.
            for (int j = 0; j<BOARD_WIDTH;j++)
            {
                switch (boardPos[checkCounter]) 
                {
                    //Imprime el valor correspondiente para la casilla actual.
                    case 1:
                        System.out.print("|X|");
                        break;
                    case 2:
                        System.out.print("|O|");
                        break;
                    default:
                        System.out.print("| |");
                        break;
                }
                
                if (checkCounter == 9 || checkCounter == 6) //Si la casilla actual corresponde a la 9 o a la 6...
                {
                    checkCounter -= 5;  //Modifica el valor del contador para empezar a revisar la siguiente linea.
                }
                else
                {
                    checkCounter++; //Pasa a la siguiente casilla de la misma linea.
                }
            }
        }
        System.out.println();   //Imprime salto de linea para no solapar el tablero con el siguiente texto.
    }
    
    /**
     * Setter posición de la casilla a asignar.
     * @param _posIndex 
     */
    public static void setPosIndex(int _posIndex)
    {
        posIndex = _posIndex;
    }
    
    /**
     * Getter posición de la casilla a asignar.
     * @return posición de la casilla a asignar (Del 1 al 9 correspondiendo con la distribución del teclado númerico).
     */
    public static int getPosIndex()
    {
        return posIndex;
    }
    
    /**
     * Getter valor de la casilla individual del tablero.
     * @param _posIndex
     * @return valor de la casilla del tablero. (0 = casilla sin llenar, 1 = casilla marcada por el contrincante, 2 = casilla marcada por el jugador)
     */
    public static int getBoardPosValue(int _posIndex)
    {
        return boardPos[_posIndex];
    }
    
    public static void setBoardPosValue(int _posIndex, int _value)
    {
        boardPos[_posIndex] = _value;
    }
    
    
    /**
     * Setter marca un valor en la posición del tablero seleccionada.
     */
    public static void setBoardPos()
    {
        if (GameManager.getGameMode()==2)    //Si el juego se ha seleccionado en modo multijugador.
        {
            if (GameManager.getIsPlayerTurn())  //Si es el turno del jugador 1.
            {
                System.out.println("Le toca al jugador 1");
            }
            else    //Si es el turno del jugador 2.
            {
                System.out.println("Le toca al jugador 2");
            }

            System.out.println("Introduce tu jugada.");
            DrawBoard();    //Dibuja el tablero para que el jugador pueda decidir donde colocar su tirada.
            
            Player.Play();  //El jugador efectúa su jugada.

            
        }
        else //Está seleccionado el modo Un Jugador.
        {  
            DrawBoard();    //Dibuja el tablero.
            
            if (GameManager.getIsPlayerTurn())  //Si es el turno del jugador.
            {
                System.out.println("¡Adelante " + Player.getPlayerName() + " te toca!");
                Player.Play();  //El jugador realiza efectúa su jugada.
            }
            else //Si es el turno de la inteligencia artificial.
            {
                System.out.println("El contrincante efetúa su jugada.");
                Time.WaitForSeconds(1000);
                AI.Play(AI.getLevel()); //La inteligencia artificial efectúa su jugada.
            }
        }
           
    }
}
