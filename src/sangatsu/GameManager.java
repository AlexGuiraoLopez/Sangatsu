/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sangatsu;

/**
 * 
 * @author Alex Guirao López <aguiraol2021@cepnet.net>
 */
public class GameManager 
{
    static boolean playerTurn = true;
    static boolean isMulti = true;
    static boolean gameFinish = false;
    static int gameMode;
    static boolean isPlayerTurn;
    
    public static void CheckBoardStatus()
    {
        if ((Board.getBoardPos(1)==1 && Board.getBoardPos(2)==1 && Board.getBoardPos(3)==1) ||
               (Board.getBoardPos(1)==2 && Board.getBoardPos(2)==2 && Board.getBoardPos(3)==2))
        {
            System.out.println("itsme!");
        }else if ((Board.getBoardPos(1)==1 && Board.getBoardPos(5)==1 && Board.getBoardPos(9)==1) ||
               (Board.getBoardPos(1)==2 && Board.getBoardPos(5)==2 && Board.getBoardPos(9)==2))
        {
            System.out.println("itsme!");
        }else if ((Board.getBoardPos(1)==1 && Board.getBoardPos(4)==1 && Board.getBoardPos(7)==1) ||
               (Board.getBoardPos(1)==2 && Board.getBoardPos(4)==2 && Board.getBoardPos(7)==2))
        {
            System.out.println("itsme!");
        }else if ((Board.getBoardPos(2)==1 && Board.getBoardPos(5)==1 && Board.getBoardPos(8)==1) ||
               (Board.getBoardPos(2)==2 && Board.getBoardPos(5)==2 && Board.getBoardPos(8)==2))
        {
            System.out.println("itsme!");
        }else if ((Board.getBoardPos(3)==1 && Board.getBoardPos(5)==1 && Board.getBoardPos(7)==1) ||
               (Board.getBoardPos(3)==2 && Board.getBoardPos(5)==2 && Board.getBoardPos(7)==2))
        {
            System.out.println("itsme!");
        }else if ((Board.getBoardPos(3)==1 && Board.getBoardPos(6)==1 && Board.getBoardPos(9)==1) ||
               (Board.getBoardPos(3)==2 && Board.getBoardPos(6)==2 && Board.getBoardPos(9)==2))
        {
            
        }else if ((Board.getBoardPos(4)==1 && Board.getBoardPos(5)==1 && Board.getBoardPos(6)==1) ||
               (Board.getBoardPos(4)==2 && Board.getBoardPos(5)==2 && Board.getBoardPos(6)==2))
        {
            System.out.println("itsme!");
        }else if ((Board.getBoardPos(7)==1 && Board.getBoardPos(8)==1 && Board.getBoardPos(9)==1) ||
               (Board.getBoardPos(7)==2 && Board.getBoardPos(8)==2 && Board.getBoardPos(9)==2))
        {
            System.out.println("itsme!");
        }
        
    }
    
    public static void setIsPlayerTurn(boolean _isPlayerTurn)
    {
        isPlayerTurn = _isPlayerTurn;
    }
    
    public static boolean getIsPlayerTurn()
    {
        return isPlayerTurn;
    }
    
    public static boolean getPlayerTurn()
    {
        return playerTurn;
    }
    
    public static void setPlayerTurn(boolean _playerTurn)
    {
        playerTurn = _playerTurn;
    }
    
    public static void setIsMulti(boolean _isMulti)
    {
        isMulti = _isMulti;
    }
    
    public static boolean getIsMulti()
    {
        return isMulti;
    }
    
    public static void setGameMode(int _gameMode)
    {
        gameMode = _gameMode;
    }
    
    public static int getGameMode()
    {
        return gameMode;
    }
    
    public static void setGameFinish(boolean _gameFinish)
    {
        gameFinish = _gameFinish;
    }
    
    public static boolean getGameFinish()
    {
        return gameFinish;
    }
}
