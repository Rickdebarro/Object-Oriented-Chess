package Board;
import generalElements.Commons.Color;
import generalElements.*;

public class Board { // Classe do tabuleriro


    Player p1,p2; // Tabuleiro recebe 2 players, p1 White, p2 Black

    

    Square board[][] = new Square[8][8]; // Tabuleiro = matriz de casas
    private boolean flag = true; // Atributo que alterna entre 0 e 1 para definir a cor das casas

    public Board(Player p1, Player p2){ // Função de inicialização do tabuleiro
        
        for(int i = 0 ; i<8 ; i++){
            for(int j = 0 ; j<8 ; j++)
            initSquare(i,j);
        }

        p1.InicializaPecas();
        p2.InicializaPecas();

        for(int i = 0;i<8;i++){  //Loop que insere os peoes brancos e pretos no tabuleiro
            board[1][i].setPiece(p1.getPeao(i));
            board[6][i].setPiece(p2.getPeao(i));
        }

        for(int i = 0, j = 0;i<8 && j<2;i = i+7,j++){ //Loop que insere as torres brancas e pretas no tabuleiro
            board[0][i].setPiece(p1.getCastle(i));

            board[7][i].setPiece(p2.getCastle(i));
        }

        for(int i = 1, j = 0;i<7 && j < 2;i = i+5,j++){ //Loop que insere os cavalos brancos e pretos no tabuleiro
            board[0][i].setPiece(p1.getHorse(j));

            board[7][i].setPiece(p2.getHorse(j));
        }

        for(int i = 2, j = 0;i<6 && j < 2; i = i+3,j++){ //Loop que insere os bispos brancos e pretos no tabuleiro
            board[0][i].setPiece(p1.getBishop(j));

            board[7][i].setPiece(p2.getBishop(j));
        }

        board[0][3].setPiece(p1.getKing(0)); // Insere o rei branco no tabuleiro
        board[7][3].setPiece(p2.getKing(0)); // Insere o rei preto no tabuleiro
        
        board[0][4].setPiece(p1.getQueen(0)); // Insere a rainha branca no tabuleiro
        board[7][4].setPiece(p2.getQueen(0)); // Insere a rainha preta no tabuleiro
    }

    public void print_board() { // Função de print do tabuleiro
		for(int i = 0;i<8;i++) {
			System.out.println("| ");
			for(int j = 0;j<8;j++) {
				 System.out.println(board[i][j].getName_piece());
				System.out.println("|");
			}
			System.out.println("|\n");
		}
	}
	

     private void initSquare(int x,int y){ // Defini as casas como White or Black
        if(flag){
            board[x][y].setColor(Color.WHITE);
            flag = false;
        }else{
            board[x][y].setColor(Color.BLACK);
            flag = true;
        }
    }
}

