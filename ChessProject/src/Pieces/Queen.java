package Pieces;
import Board.Board;
import generalElements.*;

public class Queen extends Piece { // classe dos rainha, herda os atributos e metodos da classe geral peça
    
    public Queen(char name_piece){
        super();
        this.name_piece = name_piece;
    }
    
    @Override
    public boolean move(Board tab,int x, int y){
    	System.out.println("\u001B[31m" + "Você selecionou um RAINHA!" + "\u001B[0m");
        return true;
    }
}