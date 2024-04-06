package generalElements;

import generalElements.Commons.Color;

/*Esta classe, formará o tabuleiro */
public class Square { // Classe das Casas do tabuleiro

    private Color c_Color; //Cor da casa
    private Piece m_Piece; //Objeto do tipo peça contido no respectivo quadrado
    private boolean isFree = true; //retorna o status de ocupação da casa 

    /*
     * Retorna a peça localizada no quadrado que chama o método
     */

     
    public Piece getPiece() {
        return m_Piece;
    }


     /*
     * Define a peça localizada no quadrado que chama o método
     */
    public void setPiece(Piece m_Piece) {
        this.m_Piece = m_Piece;
    }

    /*
     * Método que define o status de ocupação da casa
     */
    public void setFree(boolean isFree) {
        this.isFree = isFree;
    }

    /*
     * Método que define a cor da casa
     */
    public void setColor(Color c_Color) {
        this.c_Color = c_Color;
    }

    /*
     * Método padrão que retorna a cor da casa
     */
    public Color getColor() {
        return c_Color;
    }

     /*
     * Método padrão que retorna o status da casa
     */
    public boolean isFree(){
        return isFree;
    }
}
