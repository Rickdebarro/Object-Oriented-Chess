package Pieces;
import java.util.ArrayList;

import Board.Board;
import generalElements.*;

public class Queen extends Piece { // classe dos rainha, herda os atributos e metodos da classe geral peça
    
    public Queen(char name_piece){
        super();
        this.name_piece = name_piece;
    }
    
    @Override
    public void SetPossible_Pos(Board tab,int x, int y){

        movi_possibilityX = new ArrayList();
 	    movi_possibilityY = new ArrayList();

    	System.out.println("\u001B[31m" + "Você selecionou um RAINHA!" + "\u001B[0m");
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

        int dir = y,esq = y,cima = x,baixo = x;

    while(esq-1 >= 0){
        if(tab.board[x][esq-1].getIsFree()){
            movi_possibilityX.add(x);
            movi_possibilityY.add(esq-1);
        }else{
            if(tab.board[x][esq-1].getPiece().getColor() != tab.board[x][y].getPiece().getColor()){
                movi_possibilityX.add(x);
                movi_possibilityY.add(esq-1);
                break;
            }else{
                break;
            }
        }
        esq--;
    }

    while(dir+1 <= 7){
        if(tab.board[x][dir+1].getIsFree()){
            movi_possibilityX.add(x);
            movi_possibilityY.add(dir+1);
        }else{
            if(tab.board[x][dir+1].getPiece().getColor() != tab.board[x][y].getPiece().getColor()){
                movi_possibilityX.add(x);
                movi_possibilityY.add(dir+1);
                break;
            }else{
                break;
            }
        }

        dir++;
    }

    while(baixo+1 <= 7){
        if(tab.board[baixo+1][y].getIsFree()){
            movi_possibilityX.add(baixo+1);
            movi_possibilityY.add(y);
        }else{
            if(tab.board[baixo+1][y].getPiece().getColor() != tab.board[x][y].getPiece().getColor()){
                movi_possibilityX.add(baixo+1);
                movi_possibilityY.add(y);
                break;
            }else{
                break;
            }
        }
        baixo++;
    }

    while(cima-1 >= 0){
        if(tab.board[cima-1][y].getIsFree()){
            movi_possibilityX.add(cima-1);
            movi_possibilityY.add(y);
        }else{
            if(tab.board[cima-1][y].getPiece().getColor() != tab.board[x][y].getPiece().getColor()){
                movi_possibilityX.add(cima-1);
                movi_possibilityY.add(y);
                break;
            }else{
                break;
            }
        }
        cima--;
    }  

    tab.Print_Board_Possibility(movi_possibilityX, movi_possibilityY);
    }
}