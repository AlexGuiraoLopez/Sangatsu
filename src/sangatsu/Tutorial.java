package sangatsu;
/**
 * 
 * @author Alex Guirao Lopez <aguiraol2021@cepnet.net>
 */
public class Tutorial 
{
    static String userAnswer;
    static boolean isShowed=false;

    /**
     * Retorna un valor según se haya mostrado el tutorial alguna vez durante la partida o no.
     * @return True si ya se ha mostrado el tutorial anteriormente.
     */
    public static boolean getIsShowed() 
    {
        return isShowed;
    }

    /**
     * Setter para el tutorial. Si ya ha sido mostrado pasará a true.
     * @param isShowed 
     */
    public static void setIsShowed(boolean isShowed) 
    {
        Tutorial.isShowed = isShowed;
    }
    
    /**
     * Muestra el tutorial del juego.
     */
    public static void ShowTutorial()
    {
        System.out.println("Comprueba que tu teclado tenga esta disposición numérica en la parte derecha:");
        System.out.println();
        System.out.println("|7|8|9|");
        System.out.println("|4|5|6|");
        System.out.println("|1|2|3|");
        
        System.out.println("Estas teclas con los números marcados representan el tablero del juego. \nTe servirán para escoger una casilla durante tu turno.");
        System.out.println("(Pulsa intro para continuar...)");
        Teclat.llegirChar();
    }
}
