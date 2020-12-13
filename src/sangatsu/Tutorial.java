package sangatsu;
/**
 * 
 * @author Alex Guirao Lopez <aguiraol2021@cepnet.net>
 */
public class Tutorial 
{
    static String userAnswer;
    
    public static void ShowTutorial()
    {
        System.out.println("Bienvenido a CEP en ralla.");
        System.out.println("Comprueba que tu teclado tenga esta disposición numérica en la parte derecha:");
        System.out.println();
        System.out.println("|7|8|9|");
        System.out.println("|4|5|6|");
        System.out.println("|1|2|3|");
        
        System.out.println("Estas teclas con los números marcados representan el tablero del juego. \nTe servirán para escoger una casilla durante tu turno.");
        /*
        do{
            System.out.println("¿Tienes estás teclas?");
            userAnswer = Teclat.llegirString();

            if (userAnswer.equalsIgnoreCase("si"))
            {
                System.out.println("¡Perfecto! Estás listo para empezar la partida.");
            }
            else if (userAnswer.equalsIgnoreCase("no"))
            {
                System.out.println("Tendrás que conseguir otro teclado para jugar cómodo.");
            }else{
                System.out.println("No he entendido tu respuesta.");
            }
        }while (!(userAnswer.equalsIgnoreCase("si"))&&!(userAnswer.equalsIgnoreCase("no")));
        */
        
    }
}
