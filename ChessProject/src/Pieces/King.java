package Pieces;
import java.util.ArrayList;
import java.util.Scanner;

import Board.Board;
import generalElements.*;

public class King extends Piece { // classe do rei, herda os atributos e metodos da classe geral peça
    
    public King(char name_piece){
        super();
        this.name_piece = name_piece;
    }
    
    @Override
    public void SetPossible_Pos(Board tab,int x, int y){
    	System.out.println("Você selecionou um " + ANSI_RED + "REI!" + ANSI_RESET);
        Scanner sc = new Scanner(System.in);
    	
    	 movi_possibilityX = new ArrayList();
    	 movi_possibilityY = new ArrayList();
    	
    	
    	System.out.println(ANSI_RED + "As Movimentações possiveis estão marcadas em amarelo!" + ANSI_RESET);

            if(x == 7 && y == 7){
    		    if(tab.board[x][y+1].getIsFree()){movi_possibilityX.add(x+1); movi_possibilityY.add(y+1);}
    		    if(tab.board[x-1][y].getIsFree()){movi_possibilityX.add(x-1); movi_possibilityY.add(y);}
    		    if(tab.board[x-1][y+1].getIsFree()){movi_possibilityX.add(x-1); movi_possibilityY.add(y+1);}
            }else if(x == 0 || y ==0){
                if(tab.board[x+1][y].getIsFree()){movi_possibilityX.add(x+1); movi_possibilityY.add(y);}
    		    if(tab.board[x+1][y+1].getIsFree()){movi_possibilityX.add(x+1); movi_possibilityY.add(y+1);}
    		    if(tab.board[x][y+1].getIsFree()){movi_possibilityX.add(x); movi_possibilityY.add(y+1);}
            }else if(x==0 && y == 7){
                if(tab.board[x+1][y].getIsFree()){movi_possibilityX.add(x+1); movi_possibilityY.add(y);}
    		    if(tab.board[x][y-1].getIsFree()){movi_possibilityX.add(x); movi_possibilityY.add(y-1);}
    		    if(tab.board[x+1][y-1].getIsFree()){movi_possibilityX.add(x+1); movi_possibilityY.add(y-1);}
            }else if(x==7 && y == 0){
    		    if(tab.board[x-1][y+1].getIsFree()){movi_possibilityX.add(x-1); movi_possibilityY.add(y+1);}
    		    if(tab.board[x-1][y].getIsFree()){movi_possibilityX.add(x-1); movi_possibilityY.add(y);}
    		    if(tab.board[x][y+1].getIsFree()){movi_possibilityX.add(x); movi_possibilityY.add(y);}
            }else if(x == 7){
    		    if(tab.board[x][y+1].getIsFree()){movi_possibilityX.add(x+1); movi_possibilityY.add(y+1);}
    		    if(tab.board[x][y+1].getIsFree()){ movi_possibilityX.add(y+1); movi_possibilityY.add(y);}
    		    if(tab.board[x-1][y+1].getIsFree()){movi_possibilityX.add(x-1); movi_possibilityY.add(y+1);}
    		    if(tab.board[x-1][y].getIsFree()){movi_possibilityX.add(x-1); movi_possibilityY.add(y);}
    		    if(tab.board[x-1][y].getIsFree()){movi_possibilityX.add(x-1); movi_possibilityY.add(y);}
    		    if(tab.board[x-1][y-1].getIsFree()){movi_possibilityX.add(x-1); movi_possibilityY.add(y-1);}
            }else if(x == 0){
                if(tab.board[x+1][y].getIsFree()){movi_possibilityX.add(x+1); movi_possibilityY.add(y);}
    		    if(tab.board[x+1][y+1].getIsFree()){movi_possibilityX.add(x+1); movi_possibilityY.add(y+1);}
    		    if(tab.board[x][y+1].getIsFree()){ movi_possibilityX.add(y+1); movi_possibilityY.add(y);}
    		    if(tab.board[x][y+1].getIsFree()){movi_possibilityX.add(x-1); movi_possibilityY.add(y+1);}
    		    if(tab.board[x][y].getIsFree()){movi_possibilityX.add(x-1); movi_possibilityY.add(y);}
    		    if(tab.board[x][y-1].getIsFree()){movi_possibilityX.add(x-1); movi_possibilityY.add(y-1);}
    		    if(tab.board[x][y-1].getIsFree()){movi_possibilityX.add(y-1); movi_possibilityY.add(y);}
    		    if(tab.board[x+1][y-1].getIsFree()){movi_possibilityX.add(x+1); movi_possibilityY.add(y-1);}
            }else if(y == 7){
                if(tab.board[x+1][y].getIsFree()){movi_possibilityX.add(x+1); movi_possibilityY.add(y);}
    		    if(tab.board[x][y].getIsFree()){movi_possibilityX.add(x-1); movi_possibilityY.add(y);}
    		    if(tab.board[x][y-1].getIsFree()){movi_possibilityX.add(x-1); movi_possibilityY.add(y-1);}
    		    if(tab.board[x][y-1].getIsFree()){movi_possibilityX.add(y-1); movi_possibilityY.add(y);}
    		    if(tab.board[x+1][y-1].getIsFree()){movi_possibilityX.add(x+1); movi_possibilityY.add(y-1);}

            }else if(y == 0){
                if(tab.board[x+1][y].getIsFree()){movi_possibilityX.add(x+1); movi_possibilityY.add(y);}
    		    if(tab.board[x+1][y+1].getIsFree()){movi_possibilityX.add(x+1); movi_possibilityY.add(y+1);}
    		    if(tab.board[x][y+1].getIsFree()){ movi_possibilityX.add(y+1); movi_possibilityY.add(y);}
    		    if(tab.board[x][y+1].getIsFree()){movi_possibilityX.add(x-1); movi_possibilityY.add(y+1);}
    		    if(tab.board[x][y].getIsFree()){movi_possibilityX.add(x-1); movi_possibilityY.add(y);}
            }else{
                if(tab.board[x+1][y].getIsFree()){movi_possibilityX.add(x+1); movi_possibilityY.add(y);}
    		    if(tab.board[x+1][y+1].getIsFree()){movi_possibilityX.add(x+1); movi_possibilityY.add(y+1);}
    		    if(tab.board[x][y+1].getIsFree()){ movi_possibilityX.add(x); movi_possibilityY.add(y+1);}
    		    if(tab.board[x-1][y+1].getIsFree()){movi_possibilityX.add(x-1); movi_possibilityY.add(y+1);}
    		    if(tab.board[x][y-1].getIsFree()){movi_possibilityX.add(x); movi_possibilityY.add(y-1);}
    		    if(tab.board[x-1][y-1].getIsFree()){movi_possibilityX.add(x-1); movi_possibilityY.add(y-1);}
    		    if(tab.board[x-1][y].getIsFree()){movi_possibilityX.add(x-1); movi_possibilityY.add(y);}
    		    if(tab.board[x+1][y-1].getIsFree()){movi_possibilityX.add(x+1); movi_possibilityY.add(y-1);}
            }




            tab.Print_Board_Possibility(movi_possibilityX, movi_possibilityY);

    }
    
}