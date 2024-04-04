package generalElements;
import generalElements.Commons;
import Pieces.*;
public class Player {

    private String name;

    public boolean turn; // player 1 = 0, player 2 = 1

    private Commons.Color m_color;

    private Pawn pawn[] = new Pawn[8];
	private Castle castle[] = new Castle[2];
	private Bishop bishop[] =  new Bishop[2];
	private Horse horse[] = new Horse[2];
	private King king[] = new King[1];
	private Queen queen[] = new Queen[1];
    
    public String getName() {
        return name;
    }

    public void setNome(String nome) {
        this.name = nome;
    }

    public boolean getTurno(){
        return turn;
    }

    public Player(String name, Commons.Color m_color){
        this.name = name;
        this.m_color = m_color;
    }

}
