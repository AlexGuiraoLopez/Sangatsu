package sangatsu;
/**
 * 
 * @author Alex Guirao Lopez <aguiraol2021@cepnet.net>
 */
public class Table 
{
    final static int BOARD_HEIGHT = 3;
    final static int BOARD_WIDTH =3;
    
    /*Vector que indica las casillas del tablero del tres en ralla.
    * Los índices del vector corresponden a la disposición del teclado númerico. 
    * El primer índice queda descartado ya que no usamos el 0 en el juego (por eso el vector tiene 10 posiciones).
    * El valor de los índices corresponde al valor actual de cada casilla.
    * (0 = casilla sin llenar, 1 = casilla marcada por el contrincante, 2 = casilla marcada por el jugador)
    */
    static int[] boardPos= new int [10];   
    
    public static void DrawTable()
    {
        int checkCounter=7;
        
        for (int i = 0; i < BOARD_HEIGHT; i++ )
        {
            System.out.println("");
            for (int j = 0; j<BOARD_WIDTH;j++)
            {
                switch (boardPos[checkCounter]) 
                {
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
                
                if (checkCounter == 9 || checkCounter == 6)
                {
                    checkCounter -= 5;
                }
                else
                {
                    checkCounter++;
                }
            }
        }
        System.out.println();
    }
    
    public static void setBoardPos()
    {
        int posIndex;
        
        do{
            if (GameManager.getIsMulti())
            {
                if (GameManager.getPlayerTurn())
                {
                System.out.println("Le toca al jugador 1");
                }
                else
                {
                    System.out.println("Le toca al jugador 2");
                }
            }
            System.out.println("Introduce tu jugada.");
            posIndex = Teclat.llegirInt();
            
            if (GameManager.getPlayerTurn())
            {
                boardPos[posIndex] =  2;
                GameManager.setPlayerTurn(false);
            }
            else
            {
                boardPos[posIndex] =  1;
                GameManager.setPlayerTurn(true);
            }
        }while(posIndex <1 || posIndex >9);
    }
    
    public int getBoardValue(int _boardPos)
    {
        return boardPos[_boardPos];
    }
}
