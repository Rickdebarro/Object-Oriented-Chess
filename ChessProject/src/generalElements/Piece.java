package generalElements;

import generalElements.Commons.Color;

public class Piece {

    private Color mColor; //Cor da peça 

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

    /*
     * Método para realizar o movimento de uma peça, retorna se é possível mover para a cordenada designada*
     */
    public boolean move(int x, int y){
        /*As classes peças filhas dessa classe, terão este método reescrito para cada peça*/
        return true;
    }



}
