package sangatsu;
/**
 * 
 * @author Alex Guirao Lopez <aguiraol2021@cepnet.net>
 */
public class Player 
{
    static String playerName;
    
    public static void setPlayerName()
    {
        playerName = Teclat.llegirString();
    }
    
    public static String getPlayerName()
    {
        return playerName;
    }
}
