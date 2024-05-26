package Pieces;
import java.util.ArrayList;

import Board.Board;
import generalElements.*;

public class Castle extends Piece { // classe dos torres, herda os atributos e metodos da classe geral peça

//Variável de controle da mocimentação
private int dir;
private int esq;
private int cima;
private int baixo;

/*
 * Construtor de Castle
 */
public Castle(char name_piece){
    super();
    this.name_piece = name_piece;
}

@Override
//Função que verifica as possibilidades de movimento para Castle
public void SetPossible_Pos(Board tab,int x, int y){
	movi_possibilityX = new ArrayList();
 	movi_possibilityY = new ArrayList();
 	
	System.out.println("Você selecionou uma " + ANSI_RED + "TORRE!" + ANSI_RESET);
	System.out.println(ANSI_RED + "As Movimentações possiveis estão marcadas em amarelo!" + ANSI_RESET);
	
    dir = y;esq = y;cima = x;baixo = x;

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