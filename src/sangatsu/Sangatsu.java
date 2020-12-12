package sangatsu;
/**
 *
 * @author Alex Guirao López <aguiraol2021@cepnet.net>
 */
public class Sangatsu 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Tutorial.ShowTutorial();
        
        while (!GameManager.getGameFinish())
        {
            Table.setBoardPos();
            Table.DrawTable();
        }
        
        
    }
}
