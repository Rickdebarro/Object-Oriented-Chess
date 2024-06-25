package Pieces;
import java.util.ArrayList;
import java.util.Scanner;
import java.math.*;
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

			for(int i = 0 ; i< 8 ; i++){
				for(int j = 0 ; j< 8 ; j++){
					if(Math.abs(x-i) == 1){ 
						if(Math.abs(y-j) == 1 || Math.abs(y-j) == 0){
							if(tab.board[i][j].getIsFree()){
								movi_possibilityX.add(i);
								movi_possibilityY.add(j);
							}else checkEat(tab, i, j, actual_Cor);
						}
					}	
				}
			}
			
            tab.Print_Board_Possibility(movi_possibilityX, movi_possibilityY);
			
		}
		
}