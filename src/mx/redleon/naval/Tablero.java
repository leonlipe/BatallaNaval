/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mx.redleon.naval;

/**
 * Esta clase implementa un array bidimensional para alojar posiciones en el
 * mismo.
 * @author leon
 */
public class Tablero {
    
    private int rows;
    private int cols;
    
    private int [][] tablero;
    
    public Tablero(){
        rows = 10;
        cols = 10;
        tablero = new int[rows][cols];
    }
    
    public Tablero(int rows, int cols){
        this.rows = rows;
        this.cols = cols;
        tablero = new int[this.rows][this.cols];
    }

    /**
     * @return the tablero
     */
    public int[][] getTablero() {
        return tablero;
    }

    /**
     * @param tablero the tablero to set
     */
    public void setTablero(int[][] tablero) {
        this.tablero = tablero;
    }

    /**
     * @return the rows
     */
    public int getRows() {
        return rows;
    }

    /**
     * @return the cols
     */
    public int getCols() {
        return cols;
    }
    
}
