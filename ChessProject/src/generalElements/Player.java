package generalElements;
import generalElements.Commons;

public class Player {

    private String name;

    public boolean turn; // player 1 = 0, player 2 = 1

    private Commons.Color m_color;
    
    public String getName() {
        return name;
    }
    public void setNome(String nome) {
        this.name = nome;
    }
    public boolean getTurno(){
        return turn;
    }

}
