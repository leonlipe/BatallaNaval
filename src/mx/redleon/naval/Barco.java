/*
 * 
 */

package mx.redleon.naval;

/**
 * Esta interface permite definir el comportamiento para las demás clases
 * que intervienen en el Juego
 * @author leon
 */
public interface Barco {
    
    public static final char NORTH ='n';
    public static final char SOUTH ='s';
    public static final char EAST ='e';
    public static final char WEST ='w';
    /** 
     * 
     * @return true si esta hundido el barco, false de lo contrario
     */
    public boolean verificaHudimiento();
    /**
     * 
     * @return true si el disparo dió en el blanco, false de lo contrario
     */
    public boolean verificaDisparo();
    
    public void posicionaBarco(char posicion, Coordenada coordenada);
    
}
