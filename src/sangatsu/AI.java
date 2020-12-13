package sangatsu;
/**
 * Inteligencia Artificial contrincante del juego.
 * @author Alex Guirao López <aguiraol2021@cepnet.net>
 */
public class AI 
{
    static int level;  //Nivel de complejidad de la inteligencia artificial.
    
    public static void setLevel(int _level)
    {
        level = _level;
    }
    
    public static int getLevel()
    {
        return level;
    }
    
    public static void Play()
    {
        int randomNum = (int) (Math.random() * 10 + 1);
        System.out.println(randomNum);//TEST ONLY
        
        switch(getLevel())
        {
            case 1: do
                        {
                            Board.setBoardPos();
                        }while();
            }
                break;
            case 2:
                break;
            case 3:
                break;
        }
    }
    
}
