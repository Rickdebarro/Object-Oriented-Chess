package main;
import generalElements.Commons;
import generalElements.Player;
import generalElements.Commons.Color;

import java.util.Scanner;

import Board.Board;
import Pieces.*;

public class Play {
	
	private static boolean turno = true;
	private static Player p1,p2;
	private static Board tab;
	
	public static void Jogar(Player jogador, Commons.Color p_color){	
		
		Scanner sc = new Scanner(System.in);
		
		int t1,t2;
		
		do {
			tab.print_board();
			System.out.println("\u001B[33m" +jogador.getName() + "\u001B[0m" + ", Digite a Linha da Peça que Deseja Selecionar");
			
			 t1 = sc.nextInt();	

			System.out.println(jogador.getName() + ", Digite a Coluna da Peça que Deseja Selecionar");
			
			 t2 = sc.nextInt();
			 
		}while(!ChecaCoordenada(t1, t2, jogador, p_color));
		
		 
		 
		 
		
		if(turno == true) {
			turno = false;
			Jogar(p2, Commons.Color.BLACK);
			
		}else {
			turno = true;
			Jogar(p1, Commons.Color.WHITE);
		}
			
	}
	
	public static boolean ChecaCoordenada(int t1,int t2, Player jogador, Commons.Color p_color){
		
		if(tab.board[t1][t2].getIsFree(t1,t2) == true || tab.board[t1][t2].getPiece().getColor() != p_color) {
			
			System.out.println("Coodenada Invalida!");
			
			return false;
				
		}else {
			return true;
		}
	}
	

	
	public static void Init_jogo() {
		Scanner sc = new Scanner(System.in);
	    
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
	    
	    Jogar(p1,Color.WHITE);
	}
	
}
