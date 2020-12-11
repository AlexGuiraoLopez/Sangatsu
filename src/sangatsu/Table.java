package sangatsu;
/**
 * 
 * @author Alex Guirao Lopez <aguiraol2021@cepnet.net>
 */
public class Table 
{
    /*Vector que indica las casillas del tablero del tres en ralla.
    * Los índices del vector corresponden a la disposición del teclado númerico. 
    * El primer índice queda descartado ya que no usamos el 0 en el juego (por eso el vector tiene 10 posiciones).
    * El valor de los índices corresponde al valor actual de cada casilla.
    * (0 = casilla sin llenar, 1 = casilla marcada por el contrincante, 2 = casilla marcada por el jugador)
    */
    int[] boardPos= new int [10];   
    
    public void DrawTable()
    {
        if (getBoardValue(1)==2 && ((getBoardValue(2)==0)&&(getBoardValue(3)==0)&&(getBoardValue(4)==0)&&
                (getBoardValue(5)==0)&&(getBoardValue(6)==0)&&(getBoardValue(7)==0)&&(getBoardValue(8)==0)&&
                (getBoardValue(9)==0)))
        {
            System.out.println("|   |   |   |");
            System.out.println("|   |   |   |");
            System.out.println("|O|   |   |");
        }else if (getBoardValue(1)==1 && ((getBoardValue(2)==0)&&(getBoardValue(3)==0)&&(getBoardValue(4)==0)&&
                (getBoardValue(5)==0)&&(getBoardValue(6)==0)&&(getBoardValue(7)==0)&&(getBoardValue(8)==0)&&
                (getBoardValue(9)==0)))
        {
            System.out.println("|   |   |   |");
            System.out.println("|   |   |   |");
            System.out.println("|X|   |   |");
        }else if (getBoardValue(2)==2 && ((getBoardValue(1)==0)&&(getBoardValue(3)==0)&&(getBoardValue(4)==0)&&
                (getBoardValue(5)==0)&&(getBoardValue(6)==0)&&(getBoardValue(7)==0)&&(getBoardValue(8)==0)&&
                (getBoardValue(9)==0)))
        {
            System.out.println("|   |   |   |");
            System.out.println("|   |   |   |");
            System.out.println("|   |O|   |");
        }else if (getBoardValue(2)==1 && ((getBoardValue(1)==0)&&(getBoardValue(3)==0)&&(getBoardValue(4)==0)&&
                (getBoardValue(5)==0)&&(getBoardValue(6)==0)&&(getBoardValue(7)==0)&&(getBoardValue(8)==0)&&
                (getBoardValue(9)==0)))
        {
            System.out.println("|   |   |   |");
            System.out.println("|   |   |   |");
            System.out.println("|   |X|   |");
        }else if (getBoardValue(3)==2 && ((getBoardValue(1)==0)&&(getBoardValue(2)==0)&&(getBoardValue(4)==0)&&
                (getBoardValue(5)==0)&&(getBoardValue(6)==0)&&(getBoardValue(7)==0)&&(getBoardValue(8)==0)&&
                (getBoardValue(9)==0)))
        {
            System.out.println("|   |   |   |");
            System.out.println("|   |   |   |");
            System.out.println("|   |   |O|");
        }else if (getBoardValue(3)==1 && ((getBoardValue(1)==0)&&(getBoardValue(2)==0)&&(getBoardValue(4)==0)&&
                (getBoardValue(5)==0)&&(getBoardValue(6)==0)&&(getBoardValue(7)==0)&&(getBoardValue(8)==0)&&
                (getBoardValue(9)==0)))
        {
            System.out.println("|   |   |   |");
            System.out.println("|   |   |   |");
            System.out.println("|   |   |X|");
            
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
    public int getBoardValue(int _boardPos)
    {
        return boardPos[_boardPos];
    }
}
