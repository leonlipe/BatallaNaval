/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mx.redleon.naval;

import java.util.ArrayList;

/**
 * Esta clase implementa un array bidimensional para alojar posiciones en el
 * mismo.
 * @author leon
 */
public class Tablero {
    
    public static final int VACIO=0;
    public static final int BARCO_PORTAAVIONES=-1;
    
    private int rows;
    private int cols;
    
    private int [][] tablero;
    private ArrayList<Barco> barcos;
    
    public Tablero(){
        rows = 10;
        cols = 10;
        tablero = new int[rows][cols];
        barcos = new ArrayList<>();
    }
    
    public Tablero(int rows, int cols){
        this.rows = rows;
        this.cols = cols;
        tablero = new int[this.rows][this.cols];
        barcos = new ArrayList<>();
    }
    
    public boolean agregaBarco(Barco barco){
        for(Barco barcoItem: barcos){
            //TODO: Verificar colisiones
        }
        return barcos.add(barco);
    }
    
    public void muestraMisBarcos(){
        for(Barco barcoItem: barcos){
            for(Coordenada coordenadaItem: barcoItem){
                tablero[coordenadaItem.getI()][coordenadaItem.getJ()]=barcoItem.numero();
            }
        }
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
    
    private String graficaTablero(int [][] tableroAGraficar){
    String resultado = generaBarra();
           for(int i=-1;i<rows;i++){
               if (i==-1){
                 resultado = resultado + generaCabecera();  
               }else {
                   for(int j=-1;j<cols;j++){
                       resultado = resultado + muestraCelda(j==-1?i+1:tableroAGraficar[i][j]);
                   }
                   resultado = resultado +  "|";
               }
               resultado = resultado +  "\n"+generaBarra();
           }
           return resultado;        
    }
    
    @Override
    public String toString(){
        return graficaTablero(tablero);
       
    }

    private String muestraCelda(int i) {
        String resultado = null;
        switch(i){
            case Tablero.VACIO:
                resultado = "|    ";
                break;
            case Tablero.BARCO_PORTAAVIONES:
                resultado = "|  P ";
                break;            default:
                resultado = "| "+(i/10>0?i:i+" ")+" ";
                break;
        }
        return resultado;
    }
   
    private String generaBarra(){
        String resultado = "";
        for(int x=0;x<11;x++){
            resultado = resultado + "+----";
        }
        return resultado+"+\n";
    }

    private String generaCabecera() {
         String resultado = "|    ";
        for(int x=65;x<75;x++){
            resultado = resultado + "| "+(char)x+"  ";
        }
        return resultado + "|";
    }
    
    
    
}
