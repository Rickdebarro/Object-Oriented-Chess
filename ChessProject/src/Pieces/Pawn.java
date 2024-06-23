package Pieces;
import generalElements.*;
import generalElements.Commons.Cor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Board.Board;

public class Pawn extends Piece { // classe dos peoes, herda os atributos e metodos da classe geral peça
    
	/*
	 * Construtor de Pawn
	 */
    public Pawn(char name_piece){
        super();
        this.name_piece = name_piece;
    }
    
	boolean firstMove = true;

    @Override
	//Função que verifica as possibilidades de movimento para Pawn
    public void SetPossible_Pos(Board tab,int x, int y){
    	
    	Scanner sc = new Scanner(System.in);
    	
    	 movi_possibilityX = new ArrayList();
    	 movi_possibilityY = new ArrayList();
    	
    	 System.out.println("Você selecionou um " + ANSI_RED + "PEAO!" + ANSI_RESET);
    	System.out.println(ANSI_RED + "As Movimentações possiveis estão marcadas em amarelo!" + ANSI_RESET);
    	
		Commons.Cor actual_Cor = tab.board[x][y].getPiece().getCor();

		if(actual_Cor == Cor.WHITE){
			if(tab.board[x+1][y].getIsFree() && tab.isinside(x+1, y)){
				movi_possibilityX.add(x+1);
				movi_possibilityY.add(y);
			}
			if(firstMove){
				if(tab.board[x+2][y].getIsFree()){
					movi_possibilityX.add(x+2);
					movi_possibilityY.add(y);
					firstMove = false;
				}
			}
			checkEat(tab, x+1, y+1, actual_Cor);
			checkEat(tab, x+1, y-1, actual_Cor);
		}else if(actual_Cor == Cor.BLACK){
			if(tab.board[x-1][y].getIsFree() && tab.isinside(x-1, y)){
				movi_possibilityX.add(x-1);
				movi_possibilityY.add(y);
			}
			if(firstMove){
				if(tab.board[x-2][y].getIsFree()){
					movi_possibilityX.add(x-2);
					movi_possibilityY.add(y);
					firstMove = false;
				}
			}
			checkEat(tab, x-1, y-1, actual_Cor);
			checkEat(tab, x-1, y+1, actual_Cor);
		}

    	tab.Print_Board_Possibility(movi_possibilityX, movi_possibilityY);
    	
		
    }
    
   
    
    

}
