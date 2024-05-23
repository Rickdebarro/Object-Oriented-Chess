package Pieces;
import java.util.ArrayList;

import Board.Board;
import generalElements.*;
import generalElements.Commons.Color;

public class Horse extends Piece { // classe dos cavalos, herda os atributos e metodos da classe geral peça
    
    public Horse(char name_piece){
        super();
        this.name_piece = name_piece;
    }
    
    @Override
    public void SetPossible_Pos(Board tab,int x, int y){
    	
    	movi_possibilityX = new ArrayList();
   	 	movi_possibilityY = new ArrayList();
   	 	
    	System.out.println("Você selecionou um " + RED + "CAVALO!" + ANSI_RESET);
    	System.out.println(RED + "As Movimentações possiveis estão marcadas em amarelo!" + ANSI_RESET);
    	  	
    	if(tab.board[x][y].getPiece().getColor() == Commons.Color.WHITE){
    		if(x-2 >= 0) {
    			if(y-1 >= 0) {
    				if(tab.board[x-2][y-1].getIsFree()) {
    					movi_possibilityX.add(x-2);
        				movi_possibilityY.add(y-1);
    				}else if(tab.board[x-2][y-1].getPiece().getColor() == Commons.Color.BLACK ){
    					movi_possibilityX.add(x-2);
        				movi_possibilityY.add(y-1);
    				}
    			}
    			if(y+1 <= 7) {
    				if(tab.board[x-2][y+1].getIsFree()) {
    				movi_possibilityX.add(x-2);
    				movi_possibilityY.add(y+1);
    				}else if(tab.board[x-2][y+1].getPiece().getColor() == Commons.Color.BLACK) {
    					movi_possibilityX.add(x-2);
        				movi_possibilityY.add(y+1);
    				}
    			}
    		}
    		if(y+2 <= 7) {
    			if(x-1 >= 0) {
    				if( tab.board[x-1][y+2].getIsFree()) {
    					movi_possibilityX.add(x-1);
        				movi_possibilityY.add(y+2);
    				}else if(tab.board[x-1][y+2].getPiece().getColor() == Commons.Color.BLACK) {
    					movi_possibilityX.add(x-1);
        				movi_possibilityY.add(y+2);
    				}
    			}
    			if(x+1 <= 7){
    				if(tab.board[x+1][y+2].getIsFree()) {
    					movi_possibilityX.add(x+1);
    					movi_possibilityY.add(y+2);
    				}else if(tab.board[x+1][y+2].getPiece().getColor() == Commons.Color.BLACK) {
    					movi_possibilityX.add(x+1);
    					movi_possibilityY.add(y+2);
    				}
    			}
    		}
    		if(y-2 >= 0) {
    			if(x-1 >= 0) {
    				if(tab.board[x-1][y-2].getIsFree()) {
    					movi_possibilityX.add(x-1);
    					movi_possibilityY.add(y-2);
    				}else if(tab.board[x-1][y-2].getPiece().getColor() == Commons.Color.BLACK) {
    					movi_possibilityX.add(x-1);
    					movi_possibilityY.add(y-2);
    				}
    			}
    			if(x+1 <= 7){
    				if(tab.board[x+1][y-2].getIsFree()) {
    					movi_possibilityX.add(x+1);
    					movi_possibilityY.add(y-2);
    				}else if(tab.board[x+1][y-2].getPiece().getColor() == Commons.Color.BLACK) {
    					movi_possibilityX.add(x+1);
    					movi_possibilityY.add(y-2);
    				}
    			}
    		}
    		if(x+2 <= 7) {
    			if(y-1 >= 0) {
    				if(tab.board[x+2][y-1].getIsFree()) {
    					movi_possibilityX.add(x+2);
    					movi_possibilityY.add(y-1);
    				}else if(tab.board[x+2][y-1].getPiece().getColor() == Commons.Color.BLACK) {
    					movi_possibilityX.add(x+2);
    					movi_possibilityY.add(y-1);
    				}
    			}
    			if(y+1 <= 7) {
    				if(tab.board[x+2][y+1].getIsFree()) {
    					movi_possibilityX.add(x+2);
    					movi_possibilityY.add(y+1);
    				}else if(tab.board[x+2][y+1].getPiece().getColor() == Commons.Color.BLACK) {
    					movi_possibilityX.add(x+2);
    					movi_possibilityY.add(y+1);
    				}
    			}
    		}
    	}else if(tab.board[x][y].getPiece().getColor() == Commons.Color.BLACK) {
    		if(x-2 >= 0) {
    			if(y-1 >= 0) {
    				if( tab.board[x-2][y-1].getIsFree()) {
    					movi_possibilityX.add(x-2);
        				movi_possibilityY.add(y-1);
    				}else if(tab.board[x-2][y-1].getPiece().getColor() == Commons.Color.WHITE) {
    					movi_possibilityX.add(x-2);
        				movi_possibilityY.add(y-1);
    				}
    			}
    			if(y+1 <= 7) {
    				if( tab.board[x-2][y+1].getIsFree()) {
    					movi_possibilityX.add(x-2);
    					movi_possibilityY.add(y+1);
    				}else if(tab.board[x-2][y+1].getPiece().getColor() == Commons.Color.WHITE) {
    					movi_possibilityX.add(x-2);
    					movi_possibilityY.add(y+1);
    				}
    			}
    		}
    		if(y+2 <= 7) {
    			if(x-1 >= 0) {
    				if( tab.board[x-1][y+2].getIsFree()) {
    					movi_possibilityX.add(x-1);
        				movi_possibilityY.add(y+2);
    				}else if(tab.board[x-1][y+2].getPiece().getColor() == Commons.Color.WHITE) {
    					movi_possibilityX.add(x-1);
        				movi_possibilityY.add(y+2);
    				}
    			}
    			if(x+1 <= 7){
    				if( tab.board[x+1][y+2].getIsFree()) {
    					movi_possibilityX.add(x+1);
    					movi_possibilityY.add(y+2);
    				}else if(tab.board[x+1][y+2].getPiece().getColor() == Commons.Color.WHITE) {
    					movi_possibilityX.add(x+1);
    					movi_possibilityY.add(y+2);
    				}
    			}
    		}
    		if(y-2 >= 0) {
    			if(x-1 >= 0) {
    				if( tab.board[x-1][y-2].getIsFree()) {
    					movi_possibilityX.add(x-1);
    					movi_possibilityY.add(y-2);
    				}else if(tab.board[x-1][y-2].getPiece().getColor() == Commons.Color.WHITE) {
    					movi_possibilityX.add(x-1);
    					movi_possibilityY.add(y-2);
    				}
    			}
    			if(x+1 <= 7){
    				if( tab.board[x+1][y-2].getIsFree()) {
    					movi_possibilityX.add(x+1);
    					movi_possibilityY.add(y-2);
    				}else if(tab.board[x+1][y-2].getPiece().getColor() == Commons.Color.WHITE) {
    					movi_possibilityX.add(x+1);
    					movi_possibilityY.add(y-2);
    				}
    			}
    		}
    		if(x+2 <= 7) {
    			if(y-1 >= 0) {
    				if( tab.board[x+2][y-1].getIsFree()) {
    					movi_possibilityX.add(x+2);
    					movi_possibilityY.add(y-1);
    				}else if(tab.board[x+2][y-1].getPiece().getColor() == Commons.Color.WHITE) {
    					movi_possibilityX.add(x+2);
    					movi_possibilityY.add(y-1);
    				}
    			}
    			if(y+1 <= 7) {
    				if( tab.board[x+2][y+1].getIsFree()) {
    					movi_possibilityX.add(x+2);
    					movi_possibilityY.add(y+1);
    				}else if(tab.board[x+2][y+1].getPiece().getColor() == Commons.Color.WHITE) {
    					movi_possibilityX.add(x+2);
    					movi_possibilityY.add(y+1);
    				}
    			}
    		}
    	}
    		
    	if(movi_possibilityX.size() == 0){
    		
    	}
    		
    	tab.Print_Board_Possibility(movi_possibilityX, movi_possibilityY);
    }
    
    @Override
    public void move(Board tab,int t1, int t2, int x, int y) {
    	
    	tab.board[x][y].setPiece(tab.board[t1][t2].getPiece());
    	tab.board[t1][t2].setPiece(null);
    }
    
}