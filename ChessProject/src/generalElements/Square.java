package generalElements;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.*;
import generalElements.Commons.Cor;
import java.awt.*;
/*Esta classe, formará o tabuleiro */
public class Square extends JPanel{ // Classe das Casas do tabuleiro

    //Atributes
    private Cor c_Cor; //Cor da casa
    private Piece m_Piece; //Objeto do tipo peça contido no respectivo quadrado
    private boolean isFree = true; //retorna o status de ocupação da casa 
    
     public Square(){
        super();
    }
     
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
    public void setCor(Cor c_Cor) {
        this.c_Cor = c_Cor;
    }

    /*
     * Método padrão que retorna a cor da casa
     */
    public Cor getCor() {
        return c_Cor;
    }

     /*
     * Método padrão que retorna o status da casa
     */
    public boolean getIsFree(){
        return isFree;
    }
    
    @Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		draw(g);
	}
	
	public void draw(Graphics g) {
		Image image = new ImageIcon("PeaoPreto.png").getImage();
		g.drawImage(image,40,40,80,80,null);
	}

    
}
