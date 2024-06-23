package generalElements;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.*;
import java.math.*;

import Board.Board;
import Pieces.Pawn;
import generalElements.Commons.Cor;

public class Piece {

    protected Cor mCor; //Cor da peça 
    protected char name_piece; // Nome da peça
    protected JLabel png_peca; // icon da peça (Realizar)
    protected ArrayList movi_possibilityX; // Array list com as posições em X possiveis
    protected ArrayList movi_possibilityY; // Array list com as posições em Y possiveis
	
    protected static final String ANSI_YELLOW = "\u001B[33m"; 
    protected static final String ANSI_RESET = "\u001B[0m";
    protected static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    protected static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";
    protected static final String ANSI_BLACK = "\u001B[30m";
    protected static final String ANSI_RED = "\u001B[31m"; 
    

    public void Setname_piece(char name_piece){
        this.name_piece = name_piece;    
    }

    public char getName_piece(){
        return name_piece;
    }
    
    /*
     * Método padrão que retorna a cor da peça que o chama
     */
    public Cor getCor() {
        return mCor;
    }  
    
    public void setCor(Commons.Cor mCor){
        this.mCor = mCor;
    }

    /*
     * Método para realizar o movimento de uma peça, retorna se é possível mover para a cordenada designada*
     */
    public void SetPossible_Pos(Board tab,int x, int y){}
    
    public void move(Board tab,int t1, int t2, int x, int y) {

        tab.checarEvento(t1, t2, x, y);
        
    	tab.board[x][y].setPiece(tab.board[t1][t2].getPiece());
    	tab.board[t1][t2].setPiece(null);
    }
    
    //Retorna Array List que guarda as possibilidades de movimentação em X
    public ArrayList getmovi_possibilityX(){
    	return movi_possibilityX;
    }

    //Retorna Array List que guarda as possibilidades de movimentação em Y
    public ArrayList getmovi_possibilityY(){
    	return movi_possibilityY;
    }
    
    //teste de nova função para checar a possibilidade de comer, como é um teste, ainda não foi implementada na classe mãe
		public boolean checkEat(Board tab,int x,int y, Commons.Cor actual_c){
			if(tab.board[x][y].getPiece() == null) return false;            
			if(tab.board[x][y].getPiece().getCor() !=  actual_c){
				movi_possibilityX.add(x);
				movi_possibilityY.add(y);
                return true;
			}
            return false;
		}

}
