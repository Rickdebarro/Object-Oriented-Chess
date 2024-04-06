package generalElements;
import generalElements.Commons;
import Pieces.*;
public class Player {

    private String name; // nome do player

    public boolean turn; // player 1 = 0, player 2 = 1, turno do jogo alterna entre 0 e 1

    private Commons.Color p_color; // m_color define a cor das peças do player como Black ou White

    private Piece pawn[] = new Pawn[8]; // criação de um vetor de peoes do player
	private Piece castle[] = new Castle[2]; // criação de um vetor de castelos do player
	private Piece bishop[] =  new Bishop[2]; // criação de um vetor de bispo do player
	private Piece horse[] = new Horse[2]; // criação de um vetor de cavalos do player
	private Piece king[] = new King[1]; // criação de um vetor de rei do player
	private Piece queen[] = new Queen[1]; // criação de um vetor de rainha do player
    
    public String getName() { // Retorna o Nome do player
        return name;
    }

    public void setNome(String nome) { // define o nome do player
        this.name = nome;
    }

    public boolean getTurno(){ // retorno o turno do player
        return turn;
    }

    public Player(String name, Commons.Color p_color){ // Construtor da classe player
        this.name = name;
        this.p_color = p_color;
    }

    public Piece getPeao(int i){
        return pawn[i];
    }

    public Piece getCastle(int i){
        return castle[i];
    }

    public Piece getBishop(int i){
        return bishop[i];
    }

    public Piece getHorse(int i){
        return horse[i];
    }

    public Piece getKing(int i){
        return king[i];
    }

    public Piece getQueen(int i){
        return queen[i];
    }

}
