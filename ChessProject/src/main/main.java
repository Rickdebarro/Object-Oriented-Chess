package main;
import java.util.Scanner;
import generalElements.*;
import generalElements.Commons.Color;
import Board.Board;
import GUI_Chess.*;

public class main {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        Player p1,p2; // Objetos p1 e p2 da classe Player
        Board tab; // Objeto tab da classe Board


        System.out.println("Bem vindos ao Clube de Xadrez!");
        System.out.println("------------------------------");
        System.out.println("");
        System.out.println("insira o nome do Player 1: ");
        String nome_player1 = sc.nextLine();
        p1 = new Player(nome_player1, Color.WHITE); // Construtor de Player
        System.out.println("insira o nome do Player 2: ");
        String nome_player2 = sc.nextLine();

        p2 = new Player(nome_player2, Color.BLACK); // Construtor de Player

        System.out.println("Bom Jogo " + p1.getName() + " e " + p2.getName() + " , Que vença o melhor!");
        tab = new Board(p1,p2); // Construtor da classe Board recebe 2 players (p1,p2) e inicaliza o tabuleiro
        tab.print_board(); // Função que printa o tabuleiro 

        p1.PrintPlayer(); // Menu do objeto p1
        p2.PrintPlayer(); // Menu do objeto p2


    }
}