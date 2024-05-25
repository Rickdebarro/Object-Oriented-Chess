package Pieces;
import generalElements.*;
import generalElements.Commons.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Board.Board;

public class Pawn extends Piece { // classe dos peoes, herda os atributos e metodos da classe geral peça
    
    public Pawn(char name_piece){
        super();
        this.name_piece = name_piece;
    }
    
    @Override
    public void SetPossible_Pos(Board tab,int x, int y){
    	
    	Scanner sc = new Scanner(System.in);
    	
    	 movi_possibilityX = new ArrayList();
    	 movi_possibilityY = new ArrayList();
    	
    	 System.out.println("Você selecionou um " + RED + "PEAO!" + ANSI_RESET);
    	System.out.println(RED + "As Movimentações possiveis estão marcadas em amarelo!" + ANSI_RESET);
    	
    	if(tab.board[x][y].getPiece().getColor() == Commons.Color.WHITE){
    		
    		if(x != 7) {
    			if(tab.board[x+1][y].getIsFree()){
    				if(x == 1 && tab.board[x+2][y].getIsFree()){
    					movi_possibilityX.add(x+1);
    	    			movi_possibilityY.add(y);
    	    			movi_possibilityX.add(x+2);
    	    			movi_possibilityY.add(y);
    				}else {
    					movi_possibilityX.add(x+1);
    	    			movi_possibilityY.add(y);
    				}
    		}
    		if(y == 0) {
    			if(tab.board[x+1][y+1].getPiece() != null && tab.board[x+1][y+1].getPiece().getColor() == Commons.Color.BLACK) {
    				movi_possibilityX.add(x+1);
	    			movi_possibilityY.add(y+1);
        		}
    		}else if(y == 7) {
    			if(tab.board[x+1][y-1].getPiece() != null && tab.board[x+1][y-1].getPiece().getColor() == Commons.Color.BLACK) {
    				movi_possibilityX.add(x+1);
	    			movi_possibilityY.add(y-1);
        		}
    		}else {
    			if(tab.board[x+1][y+1].getPiece() != null && tab.board[x+1][y+1].getPiece().getColor() == Commons.Color.BLACK) {
    				movi_possibilityX.add(x+1);
	    			movi_possibilityY.add(y+1);
        		}
    			if(tab.board[x+1][y-1].getPiece() != null && tab.board[x+1][y-1].getPiece().getColor() == Commons.Color.BLACK) {
    				movi_possibilityX.add(x+1);
	    			movi_possibilityY.add(y-1);
        		}
    		}
    	}
    	}else {
    		if(x != 0) {
    			if(tab.board[x-1][y].getIsFree()){
    				if(x == 6 && tab.board[x-2][y].getIsFree()){
    					movi_possibilityX.add(x-1);
    	    			movi_possibilityY.add(y);
    	    			movi_possibilityX.add(x-2);
    	    			movi_possibilityY.add(y);
    				}else {
    					movi_possibilityX.add(x-1);
    	    			movi_possibilityY.add(y);
    				}
    		}
    		if(y == 0) {
    			if(tab.board[x-1][y+1].getPiece() != null && tab.board[x-1][y+1].getPiece().getColor() == Commons.Color.WHITE) {
    				movi_possibilityX.add(x-1);
	    			movi_possibilityY.add(y+1);
        		}
    		}else if(y == 7) {
    			if(tab.board[x-1][y-1].getPiece() != null && tab.board[x-1][y-1].getPiece().getColor() == Commons.Color.WHITE) {
    				movi_possibilityX.add(x-1);
	    			movi_possibilityY.add(y-1);
        		}
    		}else {
    			if(tab.board[x-1][y+1].getPiece() != null && tab.board[x-1][y+1].getPiece().getColor() == Commons.Color.WHITE) {
    				movi_possibilityX.add(x-1);
	    			movi_possibilityY.add(y+1);
        		}
    			if(tab.board[x-1][y-1].getPiece() != null && tab.board[x-1][y-1].getPiece().getColor() == Commons.Color.WHITE) {
    				movi_possibilityX.add(x-1);
	    			movi_possibilityY.add(y-1);
        		}
    		}
    	}	
    	}
    	
    	tab.Print_Board_Possibility(movi_possibilityX, movi_possibilityY);
    	
    }
    
   
    
    
    
}
