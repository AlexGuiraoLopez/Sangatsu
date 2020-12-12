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
    
    public static void setGameFinish(boolean _gameFinish)
    {
        gameFinish = _gameFinish;
    }
    
    public static boolean getGameFinish()
    {
        return gameFinish;
    }
}
