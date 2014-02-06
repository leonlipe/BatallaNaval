/*
 * Proyecto para la clase de Estructuras de Datos
 * Batalla Naval
 * El programa ejemplifica el uso de Arrays unidimensionales y multidimensionales
 * Así como el uso de algunas implementaciones de Java Collections
 */

package batallanaval;

import mx.redleon.naval.Barco;
import mx.redleon.naval.Coordenada;
import mx.redleon.naval.PortaAviones;

/**
 *
 * @author leon
 */
public class BatallaNaval {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Juego de batalla naval");
        PortaAviones portaAviones = new PortaAviones();
        portaAviones.posicionaBarco(Barco.NORTH, new Coordenada(5,5));
        System.out.println(portaAviones);
        // TODO code application logic here
    }
    
}
