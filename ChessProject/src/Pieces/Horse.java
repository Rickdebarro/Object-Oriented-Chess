package Pieces;
import java.util.ArrayList;

import Board.Board;
import generalElements.*;
import generalElements.Commons.Cor;

public class Horse extends Piece { // classe dos cavalos, herda os atributos e metodos da classe geral peça
    
	/*
	*  Construtor de Horse
	 */
    public Horse(char name_piece){
        super();
        this.name_piece = name_piece;
    }
    
    @Override
	//Função que verifica as possibilidades de movimento para Horse
    public void SetPossible_Pos(Board tab,int x, int y){
    	
    	movi_possibilityX = new ArrayList();
   	 	movi_possibilityY = new ArrayList();
   	 	
    	System.out.println("Você selecionou um " + ANSI_RED + "CAVALO!" + ANSI_RESET);
    	System.out.println(ANSI_RED + "As Movimentações possiveis estão marcadas em amarelo!" + ANSI_RESET);
    	  	
		Commons.Cor actual_Cor = tab.board[x][y].getPiece().getCor();
	

		for(int i = 0 ; i< 8 ; i++){
			for(int j = 0 ; j< 8 ; j++){
				if((Math.abs(x-i) == 1 && Math.abs(y-j) == 2) || (Math.abs(x-i) == 2 && Math.abs(y-j) == 1)){
						if(tab.board[i][j].getIsFree()){
							movi_possibilityX.add(i);
							movi_possibilityY.add(j);
						}else checkEat(tab, i, j, actual_Cor);
					
				}	
			}
		}

    	// if(tab.board[x][y].getPiece().getCor() == Commons.Cor.WHITE){
    	// 	if(x-2 >= 0) {
    	// 		if(y-1 >= 0) {
    	// 			if(tab.board[x-2][y-1].getIsFree()) {
    	// 				movi_possibilityX.add(x-2);
        // 				movi_possibilityY.add(y-1);
    	// 			}else if(tab.board[x-2][y-1].getPiece().getCor() == Commons.Cor.BLACK ){
    	// 				movi_possibilityX.add(x-2);
        // 				movi_possibilityY.add(y-1);
    	// 			}
    	// 		}
    	// 		if(y+1 <= 7) {
    	// 			if(tab.board[x-2][y+1].getIsFree()) {
    	// 			movi_possibilityX.add(x-2);
    	// 			movi_possibilityY.add(y+1);
    	// 			}else if(tab.board[x-2][y+1].getPiece().getCor() == Commons.Cor.BLACK) {
    	// 				movi_possibilityX.add(x-2);
        // 				movi_possibilityY.add(y+1);
    	// 			}
    	// 		}
    	// 	}
    	// 	if(y+2 <= 7) {
    	// 		if(x-1 >= 0) {
    	// 			if( tab.board[x-1][y+2].getIsFree()) {
    	// 				movi_possibilityX.add(x-1);
        // 				movi_possibilityY.add(y+2);
    	// 			}else if(tab.board[x-1][y+2].getPiece().getCor() == Commons.Cor.BLACK) {
    	// 				movi_possibilityX.add(x-1);
        // 				movi_possibilityY.add(y+2);
    	// 			}
    	// 		}
    	// 		if(x+1 <= 7){
    	// 			if(tab.board[x+1][y+2].getIsFree()) {
    	// 				movi_possibilityX.add(x+1);
    	// 				movi_possibilityY.add(y+2);
    	// 			}else if(tab.board[x+1][y+2].getPiece().getCor() == Commons.Cor.BLACK) {
    	// 				movi_possibilityX.add(x+1);
    	// 				movi_possibilityY.add(y+2);
    	// 			}
    	// 		}
    	// 	}
    	// 	if(y-2 >= 0) {
    	// 		if(x-1 >= 0) {
    	// 			if(tab.board[x-1][y-2].getIsFree()) {
    	// 				movi_possibilityX.add(x-1);
    	// 				movi_possibilityY.add(y-2);
    	// 			}else if(tab.board[x-1][y-2].getPiece().getCor() == Commons.Cor.BLACK) {
    	// 				movi_possibilityX.add(x-1);
    	// 				movi_possibilityY.add(y-2);
    	// 			}
    	// 		}
    	// 		if(x+1 <= 7){
    	// 			if(tab.board[x+1][y-2].getIsFree()) {
    	// 				movi_possibilityX.add(x+1);
    	// 				movi_possibilityY.add(y-2);
    	// 			}else if(tab.board[x+1][y-2].getPiece().getCor() == Commons.Cor.BLACK) {
    	// 				movi_possibilityX.add(x+1);
    	// 				movi_possibilityY.add(y-2);
    	// 			}
    	// 		}
    	// 	}
    	// 	if(x+2 <= 7) {
    	// 		if(y-1 >= 0) {
    	// 			if(tab.board[x+2][y-1].getIsFree()) {
    	// 				movi_possibilityX.add(x+2);
    	// 				movi_possibilityY.add(y-1);
    	// 			}else if(tab.board[x+2][y-1].getPiece().getCor() == Commons.Cor.BLACK) {
    	// 				movi_possibilityX.add(x+2);
    	// 				movi_possibilityY.add(y-1);
    	// 			}
    	// 		}
    	// 		if(y+1 <= 7) {
    	// 			if(tab.board[x+2][y+1].getIsFree()) {
    	// 				movi_possibilityX.add(x+2);
    	// 				movi_possibilityY.add(y+1);
    	// 			}else if(tab.board[x+2][y+1].getPiece().getCor() == Commons.Cor.BLACK) {
    	// 				movi_possibilityX.add(x+2);
    	// 				movi_possibilityY.add(y+1);
    	// 			}
    	// 		}
    	// 	}
    	// }else if(tab.board[x][y].getPiece().getCor() == Commons.Cor.BLACK) {
    	// 	if(x-2 >= 0) {
    	// 		if(y-1 >= 0) {
    	// 			if( tab.board[x-2][y-1].getIsFree()) {
    	// 				movi_possibilityX.add(x-2);
        // 				movi_possibilityY.add(y-1);
    	// 			}else if(tab.board[x-2][y-1].getPiece().getCor() == Commons.Cor.WHITE) {
    	// 				movi_possibilityX.add(x-2);
        // 				movi_possibilityY.add(y-1);
    	// 			}
    	// 		}
    	// 		if(y+1 <= 7) {
    	// 			if( tab.board[x-2][y+1].getIsFree()) {
    	// 				movi_possibilityX.add(x-2);
    	// 				movi_possibilityY.add(y+1);
    	// 			}else if(tab.board[x-2][y+1].getPiece().getCor() == Commons.Cor.WHITE) {
    	// 				movi_possibilityX.add(x-2);
    	// 				movi_possibilityY.add(y+1);
    	// 			}
    	// 		}
    	// 	}
    	// 	if(y+2 <= 7) {
    	// 		if(x-1 >= 0) {
    	// 			if( tab.board[x-1][y+2].getIsFree()) {
    	// 				movi_possibilityX.add(x-1);
        // 				movi_possibilityY.add(y+2);
    	// 			}else if(tab.board[x-1][y+2].getPiece().getCor() == Commons.Cor.WHITE) {
    	// 				movi_possibilityX.add(x-1);
        // 				movi_possibilityY.add(y+2);
    	// 			}
    	// 		}
    	// 		if(x+1 <= 7){
    	// 			if( tab.board[x+1][y+2].getIsFree()) {
    	// 				movi_possibilityX.add(x+1);
    	// 				movi_possibilityY.add(y+2);
    	// 			}else if(tab.board[x+1][y+2].getPiece().getCor() == Commons.Cor.WHITE) {
    	// 				movi_possibilityX.add(x+1);
    	// 				movi_possibilityY.add(y+2);
    	// 			}
    	// 		}
    	// 	}
    	// 	if(y-2 >= 0) {
    	// 		if(x-1 >= 0) {
    	// 			if( tab.board[x-1][y-2].getIsFree()) {
    	// 				movi_possibilityX.add(x-1);
    	// 				movi_possibilityY.add(y-2);
    	// 			}else if(tab.board[x-1][y-2].getPiece().getCor() == Commons.Cor.WHITE) {
    	// 				movi_possibilityX.add(x-1);
    	// 				movi_possibilityY.add(y-2);
    	// 			}
    	// 		}
    	// 		if(x+1 <= 7){
    	// 			if( tab.board[x+1][y-2].getIsFree()) {
    	// 				movi_possibilityX.add(x+1);
    	// 				movi_possibilityY.add(y-2);
    	// 			}else if(tab.board[x+1][y-2].getPiece().getCor() == Commons.Cor.WHITE) {
    	// 				movi_possibilityX.add(x+1);
    	// 				movi_possibilityY.add(y-2);
    	// 			}
    	// 		}
    	// 	}
    	// 	if(x+2 <= 7) {
    	// 		if(y-1 >= 0) {
    	// 			if( tab.board[x+2][y-1].getIsFree()) {
    	// 				movi_possibilityX.add(x+2);
    	// 				movi_possibilityY.add(y-1);
    	// 			}else if(tab.board[x+2][y-1].getPiece().getCor() == Commons.Cor.WHITE) {
    	// 				movi_possibilityX.add(x+2);
    	// 				movi_possibilityY.add(y-1);
    	// 			}
    	// 		}
    	// 		if(y+1 <= 7) {
    	// 			if( tab.board[x+2][y+1].getIsFree()) {
    	// 				movi_possibilityX.add(x+2);
    	// 				movi_possibilityY.add(y+1);
    	// 			}else if(tab.board[x+2][y+1].getPiece().getCor() == Commons.Cor.WHITE) {
    	// 				movi_possibilityX.add(x+2);
    	// 				movi_possibilityY.add(y+1);
    	// 			}
    	// 		}
    	// 	}
    	// }
    		
    	tab.Print_Board_Possibility(movi_possibilityX, movi_possibilityY);
    }
    
}