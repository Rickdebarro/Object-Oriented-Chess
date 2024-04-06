package main;
import java.util.Scanner;
import generalElements.*;
import generalElements.Commons.Color;
import Board.Board;

public class main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Player p1,p2;
        Board tab;

        System.out.println("Bem vindos ao Clube de Xadrez!");
        System.out.println("------------------------------");
        System.out.println("");
        System.out.println("insira o nome do Player 1: ");
        String nome_player1 = sc.nextLine();
        p1 = new Player(nome_player1, Color.WHITE);
        System.out.println("insira o nome do Player 2: ");
        String nome_player2 = sc.nextLine();
        p2 = new Player(nome_player2, Color.BLACK);

        tab = new Board(p1,p2);

        
    }
}