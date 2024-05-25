package Pieces;
import java.util.ArrayList;

import Board.Board;
import generalElements.*;

public class Bishop extends Piece {
    // classe dos bispos, herda os atributos e metodos da classe geral peça
	
    public Bishop(char name_piece){
        super();
        this.name_piece = name_piece;
    }
    
    @Override
    public void SetPossible_Pos(Board tab,int x, int y){

        movi_possibilityX = new ArrayList();
 	    movi_possibilityY = new ArrayList();

    	System.out.println("\u001B[31m" + "Você selecionou um BISPO!" + "\u001B[0m");
        System.out.println(RED + "As Movimentações possiveis estão marcadas em amarelo!" + ANSI_RESET);
        
        int auxX = x, auxY = y;

        while(auxX+1 <= 7 && auxY+1 <= 7){
            if(tab.board[auxX+1][auxY+1].getIsFree()){
                movi_possibilityX.add(auxX+1);
                movi_possibilityY.add(auxY+1);
            }else{
                if(tab.board[x][y].getPiece().getColor() != tab.board[auxX+1][auxY+1].getPiece().getColor()){
                    movi_possibilityX.add(auxX+1);
                    movi_possibilityY.add(auxY+1);
                    break;
                }else{
                    break;
                }
            }

            auxX++;
            auxY++;
        }

        auxX = x; auxY = y;

        while(auxX+1 <=7 && auxY-1 >= 0){
            if(tab.board[auxX+1][auxY-1].getIsFree()){
                movi_possibilityX.add(auxX+1);
                movi_possibilityY.add(auxY-1);
            }else{
                if(tab.board[x][y].getPiece().getColor() != tab.board[auxX+1][auxY-1].getPiece().getColor()){
                    movi_possibilityX.add(auxX+1);
                    movi_possibilityY.add(auxY-1);
                    break;
                }else{
                    break;
                }
            }

            auxX++;
            auxY--;
        }

        auxX = x; auxY = y;

        while(auxX-1 >= 0 && auxY+1 <= 7){
            if(tab.board[auxX-1][auxY+1].getIsFree()){
                movi_possibilityX.add(auxX-1);
                movi_possibilityY.add(auxY+1);
            }else{
                if(tab.board[x][y].getPiece().getColor() != tab.board[auxX-1][auxY+1].getPiece().getColor()){
                    movi_possibilityX.add(auxX-1);
                    movi_possibilityY.add(auxY+1);
                    break;
                }else{
                    break;
                }
            }

            auxX--;
            auxY++;
        }

        auxX = x; auxY = y;

        while(auxX-1 >= 0 && auxY-1 >= 0){
            if(tab.board[auxX-1][auxY-1].getIsFree()){
                movi_possibilityX.add(auxX-1);
                movi_possibilityY.add(auxY-1);
            }else{
                if(tab.board[x][y].getPiece().getColor() != tab.board[auxX-1][auxY-1].getPiece().getColor()){
                    movi_possibilityX.add(auxX-1);
                    movi_possibilityY.add(auxY-1);
                    break;
                }else{
                    break;
                }
            }

            auxX--;
            auxY--;
        }

        tab.Print_Board_Possibility(movi_possibilityX, movi_possibilityY);
    }
    
    // Ainda vamos fazer as peças
}
