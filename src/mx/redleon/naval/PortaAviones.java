/*
 * 
 */

package mx.redleon.naval;

import java.util.ArrayList;

/**
 * Implementa un portaaviones
 * @author leon
 */
public class PortaAviones implements Barco{
    
    /**
     * El tamaño del barco
     */
    public static final int size = 5;
    
    private ArrayList<Coordenada> coordenadas;
    
    public PortaAviones(){
      coordenadas = new ArrayList<>();
    }
    
    @Override
    public void posicionaBarco(char posicion, Coordenada coordenada){
        int i,j;
        switch (posicion){
            case Barco.NORTH:
                coordenadas.clear();
                i = coordenada.getI();
                for(int x=0; x<size;x++){
                    // Agregamos un elemento a la collección
                  coordenadas.add(new Coordenada(i--,coordenada.getJ()));
                }
                break;
            case Barco.SOUTH:
                coordenadas.clear();
                i = coordenada.getI();
                for(int x=0; x<size;x++){
                    // Agregamos un elemento a la collección
                  coordenadas.add(new Coordenada(i++,coordenada.getJ()));
                }
                break;
            case Barco.WEST:
                coordenadas.clear();
                j = coordenada.getJ();
                for(int x=0; x<size;x++){
                    // Agregamos un elemento a la collección
                  coordenadas.add(new Coordenada(coordenada.getI(),j--));
                }
                break;
            case Barco.EAST:
                coordenadas.clear();
                j = coordenada.getJ();
                for(int x=0; x<size;x++){
                    // Agregamos un elemento a la collección
                  coordenadas.add(new Coordenada(coordenada.getI(),j++));
                }
                break;
        }
    }

    @Override
    public boolean verificaHudimiento() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean verificaDisparo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public String toString(){
        String resultado = "{";
       if (coordenadas.isEmpty()){           
           return "No se ha posicionado el barco.";
       } 
       for(Coordenada coordenada: coordenadas){
           resultado = resultado.concat(coordenada.toString());
       }
       resultado = resultado.concat("}");
       return resultado;
    }
    
    
}
