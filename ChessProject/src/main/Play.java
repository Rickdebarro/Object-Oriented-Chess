package main;
import generalElements.Commons;
import generalElements.Player;
import generalElements.Commons.Color;

import java.util.Scanner;

import Board.Board;
import Pieces.*;

public class Play {
	
	//Atributos das rodadas
	private static boolean turno = true;
	private static int rodada = 0;
	private static Player p1,p2;
	private static Board tab;
	

	/*
	 * Função que executa uma jogada para o jogador passado para a função
	 */
	public static void Jogar(Player jogador, Commons.Color p_color){	
		
		Scanner sc = new Scanner(System.in);
		
		//variáveis de gerenciamento das jogadas
		int t1,t2;
		int m1,m2;
		
		tab.Verificacao();
		
		if(rodada != 0) {
			tab.print_board();
		}
		do {
			//tab.print_board();
			System.out.println("\u001B[33m" +jogador.getName() + "\u001B[0m" + ", Digite a Linha da Peça que Deseja Selecionar");
			
			 t1 = sc.nextInt();	

			System.out.println(jogador.getName() + ", Digite a Coluna da Peça que Deseja Selecionar");
			
			 t2 = sc.nextInt();
			 
		}while(!ChecaCoordenada(t1, t2, jogador, p_color));
		
		tab.board[t1][t2].getPiece().SetPossible_Pos(tab,t1, t2);
		
		while(tab.board[t1][t2].getPiece().getmovi_possibilityX().size() == 0) {
			System.out.println("Essa Peça não tem Jogadas Possiveis!");
			
			System.out.println("\u001B[33m" +jogador.getName() + "\u001B[0m" + ", Digite a Linha da Peça que Deseja Selecionar");
			
			 t1 = sc.nextInt();	

			System.out.println(jogador.getName() + ", Digite a Coluna da Peça que Deseja Selecionar");
			
			 t2 = sc.nextInt();
			 
			 tab.board[t1][t2].getPiece().SetPossible_Pos(tab,t1, t2);
		}
		do {
			//tab.print_board();
			System.out.println(" Digite a Linha da Posição que Deseja Jogar");
			
			 m1 = sc.nextInt();	

			System.out.println(" Digite a Coluna da Posição que Deseja Jogar");
			
			 m2 = sc.nextInt();
			 
		}while(!tab.move_Board_Possibility(m1, m2, tab.board[t1][t2].getPiece().getmovi_possibilityX(), tab.board[t1][t2].getPiece().getmovi_possibilityY()));
		
		tab.board[t1][t2].getPiece().move(tab,t1,t2, m1, m2);
		
		rodada++;
		if(turno == true) {
			turno = false;
			Jogar(p2, Commons.Color.BLACK);
			
		}else {
			turno = true;
			Jogar(p1, Commons.Color.WHITE);
		}
			
	}
	
	/*
	 * Fubnção que checa se uma cordenada passada é válida
	 */
	public static boolean ChecaCoordenada(int t1,int t2, Player jogador, Commons.Color p_color){
		
		if(tab.board[t1][t2].getIsFree() == true || tab.board[t1][t2].getPiece().getColor() != p_color) {
			
			System.out.println("Coodenada Invalida!");
			
			return false;
				
		}else {
			return true;
		}
	}
	

	/**
	 * Função de início de jogo
	 */
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
