package Pieces;
import generalElements.*;

public class Castle extends Piece { // classe dos torres, herda os atributos e metodos da classe geral peça
    private char nome = 'T';
    private int movimentacao;
    
    public char GetNome(){
        return nome;
    }
}
