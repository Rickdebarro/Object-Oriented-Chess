package Pieces;
import Board.Board;
import generalElements.*;

public class Bishop extends Piece {
    // classe dos bispos, herda os atributos e metodos da classe geral peça
	
    public Bishop(char name_piece){
        super();
        this.name_piece = name_piece;
    }
    
    @Override
    public void SetPossible_Pos(Board tab,int x, int y){
    	System.out.println("\u001B[31m" + "Você selecionou um BISPO!" + "\u001B[0m");
        
    }
    
    // Ainda vamos fazer as peças
}
