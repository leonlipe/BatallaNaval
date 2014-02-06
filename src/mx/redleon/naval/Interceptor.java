/*
 * 
 */

package mx.redleon.naval;

/**
 * Implementa un interceptor
 * @author leon
 */
public class Interceptor implements Barco{
    
    /**
     * El tamaño del barco
     */
    public static final int size = 2;
    

    @Override
    public boolean verificaHudimiento() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean verificaDisparo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void posicionaBarco(char posicion, Coordenada coordenada) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
