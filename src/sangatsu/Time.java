package sangatsu;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Tiempo de ejecución del programa.
 * @author Alex Guirao  (aguiraol2021@cepnet.net)
 */
public class Time 
{
    /**
     * Espera  un tiempo antes de seguir ejecutando el código (tiempo en milisegundos).
     * @param _milliSeconds 
     */
    public static void WaitForSeconds(int _milliSeconds)
    {
        try {
            Thread.sleep(_milliSeconds);
        } catch (InterruptedException ex) {
            Logger.getLogger(Time.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
