package Pieces;
import java.util.ArrayList;
import java.util.Scanner;

import Board.Board;
import generalElements.*;

public class King extends Piece { // classe do rei, herda os atributos e metodos da classe geral peça
    
	/*
	 * Construtor de King
	 */
    public King(char name_piece){
        super();
        this.name_piece = name_piece;
    }
    
    @Override
	//Função que verifica as possibilidades de movimento para King
    public void SetPossible_Pos(Board tab,int x, int y){
    	System.out.println("Você selecionou um " + ANSI_RED + "REI!" + ANSI_RESET);
        Scanner sc = new Scanner(System.in);
    	
    	 movi_possibilityX = new ArrayList();
    	 movi_possibilityY = new ArrayList();
    	
    	
    	System.out.println(ANSI_RED + "As Movimentações possiveis estão marcadas em amarelo!" + ANSI_RESET);

			Commons.Cor actual_Cor = tab.board[x][y].getPiece().getCor();

            if(x == 7 && y == 7){
    		    if(tab.board[x][y+1].getIsFree()){movi_possibilityX.add(x+1); movi_possibilityY.add(y+1);}else checkEat(tab, x, y+1, actual_Cor);
    		    if(tab.board[x-1][y].getIsFree()){movi_possibilityX.add(x-1); movi_possibilityY.add(y);}else checkEat(tab, x-1, y, actual_Cor);
    		    if(tab.board[x-1][y+1].getIsFree()){movi_possibilityX.add(x-1); movi_possibilityY.add(y+1);}else checkEat(tab, x-1, y+1, actual_Cor);
            }else if(x == 0 || y ==0){
                if(tab.board[x+1][y].getIsFree()){movi_possibilityX.add(x+1); movi_possibilityY.add(y);}else checkEat(tab, x+1, y, actual_Cor);
    		    if(tab.board[x+1][y+1].getIsFree()){movi_possibilityX.add(x+1); movi_possibilityY.add(y+1);}else checkEat(tab, x+1, y+1, actual_Cor);
    		    if(tab.board[x][y+1].getIsFree()){movi_possibilityX.add(x); movi_possibilityY.add(y+1);}else checkEat(tab, x, y+1, actual_Cor);
            }else if(x==0 && y == 7){
                if(tab.board[x+1][y].getIsFree()){movi_possibilityX.add(x+1); movi_possibilityY.add(y);}else checkEat(tab, x+1, y, actual_Cor);
    		    if(tab.board[x][y-1].getIsFree()){movi_possibilityX.add(x); movi_possibilityY.add(y-1);}else checkEat(tab, x, y, actual_Cor);
    		    if(tab.board[x+1][y-1].getIsFree()){movi_possibilityX.add(x+1); movi_possibilityY.add(y-1);}else checkEat(tab, x, y, actual_Cor);
            }else if(x==7 && y == 0){
    		    if(tab.board[x-1][y+1].getIsFree()){movi_possibilityX.add(x-1); movi_possibilityY.add(y+1);}else checkEat(tab, x, y, actual_Cor);
    		    if(tab.board[x-1][y].getIsFree()){movi_possibilityX.add(x-1); movi_possibilityY.add(y);}else checkEat(tab, x-1, y, actual_Cor);
    		    if(tab.board[x][y+1].getIsFree()){movi_possibilityX.add(x); movi_possibilityY.add(y+1);}else checkEat(tab, x, y+1, actual_Cor);
            }else if(x == 7){
    		    if(tab.board[x][y+1].getIsFree()){movi_possibilityX.add(x); movi_possibilityY.add(y+1);}else checkEat(tab, x, y+1, actual_Cor);
    		    if(tab.board[x][y+1].getIsFree()){ movi_possibilityX.add(x); movi_possibilityY.add(y+1);}else checkEat(tab, x, y+1, actual_Cor);
    		    if(tab.board[x-1][y+1].getIsFree()){movi_possibilityX.add(x-1); movi_possibilityY.add(y+1);}else checkEat(tab, x-1, y+1, actual_Cor);
    		    if(tab.board[x-1][y].getIsFree()){movi_possibilityX.add(x-1); movi_possibilityY.add(y);}else checkEat(tab, x-1, y, actual_Cor);
    		    if(tab.board[x-1][y-1].getIsFree()){movi_possibilityX.add(x-1); movi_possibilityY.add(y-1);}else checkEat(tab, x-1, y-1, actual_Cor);
            }else if(x == 0){
                if(tab.board[x+1][y].getIsFree()){movi_possibilityX.add(x+1); movi_possibilityY.add(y);}else checkEat(tab, x+1, y, actual_Cor);
    		    if(tab.board[x+1][y+1].getIsFree()){movi_possibilityX.add(x+1); movi_possibilityY.add(y+1);}else checkEat(tab, x+1, y+1, actual_Cor);
    		    if(tab.board[x][y+1].getIsFree()){movi_possibilityX.add(x); movi_possibilityY.add(y+1);}else checkEat(tab, x, y+1, actual_Cor);
    		    if(tab.board[x][y-1].getIsFree()){movi_possibilityX.add(x); movi_possibilityY.add(y-1);}else checkEat(tab, x, y-1, actual_Cor);
    		    if(tab.board[x+1][y-1].getIsFree()){movi_possibilityX.add(x+1); movi_possibilityY.add(y-1);}else checkEat(tab, x, y, actual_Cor);
            }else if(y == 7){
                if(tab.board[x+1][y].getIsFree()){movi_possibilityX.add(x+1); movi_possibilityY.add(y);}else checkEat(tab, x+1, y, actual_Cor);
    		    if(tab.board[x][y-1].getIsFree()){movi_possibilityX.add(x); movi_possibilityY.add(y-1);}else checkEat(tab, x, y, actual_Cor);
    		    if(tab.board[x-1][y-1].getIsFree()){movi_possibilityX.add(x-1); movi_possibilityY.add(y-1);}else checkEat(tab, x-1, y-1, actual_Cor);
    		    if(tab.board[x+1][y-1].getIsFree()){movi_possibilityX.add(x+1); movi_possibilityY.add(y-1);}else checkEat(tab, x+1, y-1, actual_Cor);

            }else if(y == 0){
                if(tab.board[x+1][y].getIsFree()){movi_possibilityX.add(x+1); movi_possibilityY.add(y);}else checkEat(tab, x+1, y, actual_Cor);
    		    if(tab.board[x+1][y+1].getIsFree()){movi_possibilityX.add(x+1); movi_possibilityY.add(y+1);}else checkEat(tab, x+1, y+1, actual_Cor);
    		    if(tab.board[x][y+1].getIsFree()){ movi_possibilityX.add(x); movi_possibilityY.add(y+1);}else checkEat(tab, x, y+1, actual_Cor);
    		    if(tab.board[x][y+1].getIsFree()){movi_possibilityX.add(x-1); movi_possibilityY.add(y+1);}else checkEat(tab, x, y+1, actual_Cor);
            }else{
                if(tab.board[x+1][y].getIsFree()){movi_possibilityX.add(x+1); movi_possibilityY.add(y);}else checkEat(tab, x+1, y, actual_Cor);
    		    if(tab.board[x+1][y+1].getIsFree()){movi_possibilityX.add(x+1); movi_possibilityY.add(y+1);}else checkEat(tab, x+1, y+1, actual_Cor);
    		    if(tab.board[x][y+1].getIsFree()){ movi_possibilityX.add(x); movi_possibilityY.add(y+1);}else checkEat(tab, x, y+1, actual_Cor);
    		    if(tab.board[x-1][y+1].getIsFree()){movi_possibilityX.add(x-1); movi_possibilityY.add(y+1);}else checkEat(tab, x-1, y+1, actual_Cor);
    		    if(tab.board[x][y-1].getIsFree()){movi_possibilityX.add(x); movi_possibilityY.add(y-1);}else checkEat(tab, x, y-1, actual_Cor);
    		    if(tab.board[x-1][y-1].getIsFree()){movi_possibilityX.add(x-1); movi_possibilityY.add(y-1);}else checkEat(tab, x-1, y-1, actual_Cor);
    		    if(tab.board[x-1][y].getIsFree()){movi_possibilityX.add(x-1); movi_possibilityY.add(y);}else checkEat(tab, x-1, y, actual_Cor);
    		    if(tab.board[x+1][y-1].getIsFree()){movi_possibilityX.add(x+1); movi_possibilityY.add(y-1);}else checkEat(tab, x+1, y-1, actual_Cor);
            }


			
            tab.Print_Board_Possibility(movi_possibilityX, movi_possibilityY);
			
		}
		
		//teste de nova função para checar a possibilidade de comer, como é um teste, ainda não foi implementada na classe mãe
		public void checkEat(Board tab,int x,int y, Commons.Cor actual_c){
			//falta inserir check de defesa da peça 
			if(tab.board[x][y].getPiece().getCor() !=  actual_c && tab.board[x][y].getPiece() != null){
				movi_possibilityX.add(x);
				movi_possibilityY.add(y);
			}
		}
}