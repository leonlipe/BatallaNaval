/*
 * 
 */

package mx.redleon.naval;

import java.util.Iterator;

/**
 * Implementa un barco de batalla
 * @author leon
 */
public class BarcoBatalla implements Barco{

    /**
     * El tamaño del barco
     */
    public static final int size = 4;
    
    @Override
    public boolean verificaHudimiento() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean verificaDisparo(Coordenada coordenada) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void posicionaBarco(char posicion, Coordenada coordenada) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 @Override
    public String letra(){
        return "P";
    }    

    @Override
    public Iterator<Coordenada> iterator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int numero() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
}
