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
import mx.redleon.naval.Tablero;

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
        PortaAviones portaAviones2 = new PortaAviones();
        portaAviones2.posicionaBarco(Barco.EAST, new Coordenada(7,5));
        System.out.println(portaAviones);
        Tablero tablero = new Tablero();
        System.out.println(tablero);
        tablero.agregaBarco(portaAviones);
        tablero.agregaBarco(portaAviones2);
        tablero.muestraMisBarcos();
        System.out.println(tablero);
        // TODO code application logic here
    }
    
}
