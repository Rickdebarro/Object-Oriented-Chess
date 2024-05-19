package generalElements;
import javax.swing.*;

import generalElements.Commons.Color;

public class Piece {

    protected Color mColor; //Cor da peça 
    protected char name_piece; // Nome da peça
    protected JLabel png_peca; // icon da peça (Realizar)
    protected static final String ANSI_YELLOW = "\u001B[33m"; 
    protected static final String ANSI_RESET = "\u001B[0m";
    
    public void Setname_piece(char name_piece){
        this.name_piece = name_piece;    
    }
    
    //Cordenadas da peça
    private int verticalCordinate = 0;
    private int horizontalCordinate = 0;
    
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
    public boolean move(int x, int y){
        /*As classes peças filhas dessa classe, terão este método reescrito para cada peça*/
        return true;
    }

    public char getName_piece(){
        return name_piece;
    }
    
}
