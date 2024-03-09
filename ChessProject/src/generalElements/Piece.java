package generalElements;

import generalElements.Commons.Color;

public class Piece {

    private Color mColor; //Cor da peça 

    /*
     * Método padrão que retorna a cor da peça que a chama
     */
    public Color getColor() {
        return mColor;
    }
    public  boolean move(){
        /*As classes peças filhas dessa classe, terão este método reescrito para cada peça*/
        return true;
    }


}
