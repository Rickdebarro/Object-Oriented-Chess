package generalElements;

import generalElements.Commons.Color;

/*Esta classe, formará o tabuleiro */
public class Square {

    private Color mColor; //Cor da casa
    
    private int verticalCordinate = 0;
    private char horizontalCordinate;



    private boolean isFree = true; //retorna o status de ocupação da casa 

    /*
     * Método que define o status de ocupação da casa
     */
    public void setFree(boolean isFree) {
        this.isFree = isFree;
    }

    /*
     * Método que define a cor da casa
     */
    public void setColor(Color mColor) {
        this.mColor = mColor;
    }

    /*
     * Método padrão que retorna a cor da casa
     */
    public Color getColor() {
        return mColor;
    }

     /*
     * Método padrão que retorna o status da casa
     */
    public boolean isFree(){
        return isFree;
    }
}
