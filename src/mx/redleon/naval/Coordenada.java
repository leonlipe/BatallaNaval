/*
 * 
 */

package mx.redleon.naval;

/**
 * Esta clase representa una coordenada para verificar
 * @author leon
 */
public class Coordenada {
    
    public Coordenada(){
        
    }
    
    public Coordenada(int i, int j){
        this.i = i;
        this.j = j;
    }
    
    /**
     * Representa a el numero de fila
     */
    private int i;
    /**
     * Representa a el numero de columna
     */
    private int j;

    /**
     * @return the i
     */
    public int getI() {
        return i;
    }

    /**
     * @param i the i to set
     */
    public void setI(int i) {
        this.i = i;
    }

    /**
     * @return the j
     */
    public int getJ() {
        return j;
    }

    /**
     * @param j the j to set
     */
    public void setJ(int j) {
        this.j = j;
    }
    
    @Override
    public String toString(){
        return "("+i+","+j+")";
    }
    
}
