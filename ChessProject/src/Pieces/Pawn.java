package Pieces;
import generalElements.*;
import generalElements.Commons.Color;

import java.util.ArrayList;
import java.util.List;

import Board.Board;

public class Pawn extends Piece { // classe dos peoes, herda os atributos e metodos da classe geral peça
    
    public Pawn(char name_piece){
        super();
        this.name_piece = name_piece;
    }
    
    @Override
    public boolean move(Board tab,int x, int y){
    	
    	ArrayList movi_possibilityX = new ArrayList();
    	ArrayList movi_possibilityY = new ArrayList();
    	
    	System.out.println(RED + "Você selecionou um PEAO!" + ANSI_RESET);
    	System.out.println(RED + "As Movimentações possiveis estão marcadas em amarelo!" + ANSI_RESET);
    	
    	if(tab.board[x][y].getPiece().getColor() == Commons.Color.WHITE){
    		if(x == 1){
    			if(tab.board[x][y].getIsFree(x, y))
    			movi_possibilityX.add(x+1);
    			movi_possibilityY.add(y);
    			movi_possibilityX.add(x+2);
    			movi_possibilityY.add(y);
    		}else {
    			movi_possibilityX.add(x+1);
    			movi_possibilityY.add(y);
    		}
    		if(tab.board[x][y].getPiece() != null && tab.board[x][y].getPiece().getColor() == Commons.Color.BLACK) {
    			
    		}
    	}
        return true;
    }
    
    public boolean Possible_pos(int x, int y){
    	
    	return true;
    }
    
    
    
}
