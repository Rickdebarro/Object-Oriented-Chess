package Pieces;
import Board.Board;
import generalElements.*;

public class Castle extends Piece { // classe dos torres, herda os atributos e metodos da classe geral peça
    
    public Castle(char name_piece){
        super();
        this.name_piece = name_piece;
    }
    
    @Override
    public void SetPossible_Pos(Board tab,int x, int y){
    	System.out.println("\u001B[31m" + "Você selecionou um CASTELO!" + "\u001B[0m");
        
    }
}
