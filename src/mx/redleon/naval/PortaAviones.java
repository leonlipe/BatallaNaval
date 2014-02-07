/*
 * 
 */

package mx.redleon.naval;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Implementa un portaaviones
 * @author leon
 */
public class PortaAviones implements Barco{
    
    /**
     * El tamaño del barco
     */
    public static final int size = 5;
    
    private List<Coordenada> coordenadas;
    private List<Coordenada> disparos;
    
    public PortaAviones(){
      coordenadas = new ArrayList<>();
      disparos = new ArrayList<>();
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
        return disparos.containsAll(coordenadas);
    }

    @Override
    public boolean verificaDisparo(Coordenada coordenada) {
        boolean resultado = coordenadas.contains(coordenada);
        if (resultado){
            disparos.add(coordenada);
        }        
        return resultado;
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

    @Override
    public Iterator<Coordenada> iterator() {
        return coordenadas.iterator();
    }
    
    @Override
    public String letra(){
        return "P";
    }

    @Override
    public int numero() {
        return -1;
    }

   
    
    
}
