package generalElements;
import java.util.ArrayList;

import javax.swing.*;

import Board.Board;
import generalElements.Commons.Color;

public class Piece {

    protected Color mColor; //Cor da peça 
    protected char name_piece; // Nome da peça
    protected JLabel png_peca; // icon da peça (Realizar)
    protected ArrayList movi_possibilityX; // Array list com as posições em X possiveis
    protected ArrayList movi_possibilityY; // Array list com as posições em Y possiveis
	
    protected static final String ANSI_YELLOW = "\u001B[33m"; 
    protected static final String ANSI_RESET = "\u001B[0m";
    protected static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    protected static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";
    protected static final String BLACK = "\u001B[30m";
    protected static final String RED = "\u001B[31m"; 
    
    //Cordenadas da peça
    private int verticalCordinate = 0;
    private int horizontalCordinate = 0;
    
    public void Setname_piece(char name_piece){
        this.name_piece = name_piece;    
    }
    
    /*
     * Método que define a cordenada onde uma determinada peça está localizada
     */
    public void setCordinates(int horizontalCordinate, int verticalCordinate) {
        this.verticalCordinate = verticalCordinate;
        this.horizontalCordinate = horizontalCordinate;
    }

    /*
     * Método padrão que retorna a cor da peça que o chama
     */
    public Color getColor() {
        return mColor;
    }  
    
    public void setColor(Commons.Color mcolor){
        this.mColor = mcolor;
    }

    /*
     * Método para realizar o movimento de uma peça, retorna se é possível mover para a cordenada designada*
     */
    public void SetPossible_Pos(Board tab,int x, int y){
        
    }
    
    public void move(Board tab,int t1, int t2, int x, int y) {
    	
    }
    

    public char getName_piece(){
        return name_piece;
    }
    
    
    public ArrayList getmovi_possibilityX(){
    	return movi_possibilityX;
    }
    
    public ArrayList getmovi_possibilityY(){
    	return movi_possibilityY;
    }
    
}
