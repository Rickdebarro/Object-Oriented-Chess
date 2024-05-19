package Board;
import generalElements.Commons.Color;
import generalElements.*;

public class Board { // Classe do tabuleriro


    public Player p1,p2; // Tabuleiro recebe 2 players, p1 White, p2 Black

    public Square board[][] = new Square[8][8]; // Tabuleiro = matriz de Square (casa)
    private boolean flag = true; // Atributo que alterna entre 0 e 1 para definir a cor das casas
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";
    public static final String BLACK = "\u001B[30m";
    public void CheckFree(int x, int y){
    	if(board[x][y].getPiece() != null){
    		board[x][y].setFree(false);
    	}else {
    		board[x][y].setFree(true);
    	}
    }
    public Board(Player p1, Player p2){ // Construtor de Board que inicializa o tabuleiro
        
        for(int i = 0 ; i<8 ; i++){ // Loop que define as casas como Black or White
            for(int j = 0 ; j<8 ; j++)
            initSquare(i,j); 
        }

        p1.InicializaPecas(); // Inicializa cada peça de p1
        p2.InicializaPecas(); // Inicializa cada peça de p2

        for(int i = 0;i<8;i++){  //Loop que insere os peoes brancos e pretos no tabuleiro

            board[1][i] = new Square();
            board[6][i] = new Square();
            board[1][i].setPiece(p1.getPeao(i));
            board[1][i].getPiece().setColor(Color.WHITE);
            board[6][i].setPiece(p2.getPeao(i));
            board[6][i].getPiece().setColor(Color.BLACK);
        }

        for(int i = 0, j = 0;i<8 && j<2;i = i+7,j++){ //Loop que insere as torres brancas e pretas no tabuleiro
            board[0][i] = new Square();
            board[0][i].setPiece(p1.getCastle(j));
            board[0][i].getPiece().setColor(Color.WHITE);
            board[7][i] = new Square();
            board[7][i].setPiece(p2.getCastle(j));
            board[7][i].getPiece().setColor(Color.BLACK);
        }

        for(int i = 1, j = 0;i<7 && j < 2;i = i+5,j++){ //Loop que insere os cavalos brancos e pretos no tabuleiro
            board[0][i] = new Square();
            board[0][i].setPiece(p1.getHorse(j));
            board[0][i].getPiece().setColor(Color.WHITE);
            board[7][i] = new Square();
            board[7][i].setPiece(p2.getHorse(j));
            board[7][i].getPiece().setColor(Color.BLACK);
        }

        for(int i = 2, j = 0;i<6 && j < 2; i = i+3,j++){ //Loop que insere os bispos brancos e pretos no tabuleiro
            board[0][i] = new Square();
            board[0][i].setPiece(p1.getBishop(j));
            board[0][i].getPiece().setColor(Color.WHITE);
            board[7][i] = new Square();
            board[7][i].setPiece(p2.getBishop(j));
            board[7][i].getPiece().setColor(Color.BLACK);
        }
        board[0][3] = new Square();
        board[0][3].setPiece(p1.getKing(0)); // Insere o rei branco no tabuleiro
        board[0][3].getPiece().setColor(Color.WHITE);
        board[7][3] = new Square();
        board[7][3].setPiece(p2.getKing(0)); // Insere o rei preto no tabuleiro
        board[7][3].getPiece().setColor(Color.BLACK);
        
        board[0][4] = new Square();
        board[0][4].setPiece(p1.getQueen(0)); // Insere a rainha branca no tabuleiro
        board[0][4].getPiece().setColor(Color.WHITE);
        board[7][4] = new Square();
        board[7][4].setPiece(p2.getQueen(0)); // Insere a rainha preta no tabuleiro
        board[7][4].getPiece().setColor(Color.BLACK);

        for(int i = 0;i<8;i++){ // Loop que define inicialmente as linhas 0 e 1 como ocupadas
            for(int j = 0;j<8;j++){
                CheckFree(i, j);
            }
        }
    }

    public void print_board() { // Função de print do tabuleiro
		for(int i = 0;i<8;i++) {
			System.out.printf("|");
			for(int j = 0;j<8;j++) {
                if(board[i][j].getIsFree(i,j) == true){
                    System.out.printf(" ");
                }else{
                	if(board[i][j].getPiece().getColor() == Color.BLACK) {
                		System.out.print(ANSI_BLACK_BACKGROUND + board[i][j].getPiece().getName_piece() + ANSI_RESET);
                	}else {
                		System.out.print(BLACK + ANSI_WHITE_BACKGROUND + board[i][j].getPiece().getName_piece() + ANSI_RESET); // Printa o nome da peça
                	}
                }

				System.out.print("|");

			}
			System.out.printf("\n");
		}
	}
	

     private void initSquare(int x,int y){ // Define as casas como White or Black


        board[x][y] = new Square();

        if(flag){
            board[x][y].setColor(Color.WHITE);
            flag = false;
        }else{
            board[x][y].setColor(Color.BLACK);
            flag = true;
        }
        if(y == 7){
            flag = !flag;
        }
    }
}

