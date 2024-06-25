package main;
import generalElements.Arquivo;
import generalElements.Commons;
import generalElements.Player;
import generalElements.Commons.Cor;
import java.util.Scanner;
import java.io.*;
import Board.Board;
import Pieces.*;

public class Play {
	
	//Atributos das rodadas
	private static boolean turno = true;
	private static int rodada = 0;
	private static Player p1,p2;
	private static Board tab;
	private static Arquivo arquivo;
	private static int t1;
	private static int t2;
	private static int m1;
	private static int m2;
	//"\u001B[31m" - RED
	//"\u001B[0m" - RESET

	/*
	 * Função que executa uma jogada para o jogador passado para a função
	 */
	public static void Jogar(Player jogador, Commons.Cor p_Cor) throws IOException{	
			
		Scanner sc = new Scanner(System.in);
		
		tab.Verificacao(); // Verifica se as casas do tabuleiro estão ocupadas
		
		if(rodada != 0) {
			tab.print_board();
		}

		seleciona_peca(jogador,p_Cor);
		
		tab.board[t1][t2].getPiece().SetPossible_Pos(tab,t1, t2);
		
		while(tab.board[t1][t2].getPiece().getmovi_possibilityX().size() == 0 && tab.board[t1][t2].getPiece().getmovi_possibilityY().size() == 0) {
			System.out.println("\u001B[31m" + "Essa Peça não tem Jogadas Possiveis!" + "\u001B[0m");
			
			seleciona_peca(jogador, p_Cor);
			 
			tab.board[t1][t2].getPiece().SetPossible_Pos(tab,t1, t2);
		}

		seleciona_jogada(jogador, p_Cor);

		System.out.print("\033[H\033[2J"); 
		System.out.flush(); 

		tab.board[t1][t2].getPiece().move(arquivo,jogador,tab,t1,t2, m1, m2);


		String aux = jogador.getName() + ": " +  tab.board[m1][m2].getPiece().getClass().getSimpleName() + " " +  String.valueOf(t1) + "|" + String.valueOf(t2) + " -> " + String.valueOf(m1) + "|" + String.valueOf(m2) + "\n";
		arquivo.gravaBuffered(aux);
		
		rodada++;
		if(turno == true) {
			turno = false;
			Jogar(p2, Commons.Cor.BLACK);
			
		}else {
			turno = true;
			Jogar(p1, Commons.Cor.WHITE);
		}
			
	}
	
	/*
	 * Função que checa se uma cordenada passada é válida
	 */
	public static boolean ChecaCoordenada(int t1,int t2, Player jogador, Commons.Cor p_Cor){
		
		if(tab.board[t1][t2].getIsFree() == true) {

			System.out.println("\u001B[31m" + "Essa casa não possui peça! Digite um X e Y Válido!"+"\u001B[0m");
			return false;
				
		}else if(tab.board[t1][t2].getIsFree() != true && tab.board[t1][t2].getPiece().getCor() != p_Cor){

			System.out.println("\u001B[31m"+"Essa peça pertence ao outro jogador! Digite um X e Y Válido!"+"\u001B[0m");
			return false;

		}else return true;
	}

	public static void seleciona_jogada(Player jogador,Commons.Cor p_Cor){

		Scanner sc = new Scanner(System.in);

		do {
			
			System.out.println(" Digite a Linha da Posição que Deseja Jogar");
			
			 m1 = sc.nextInt();	

			System.out.println(" Digite a Coluna da Posição que Deseja Jogar");
			
			 m2 = sc.nextInt();
			 
			 if(m1 >= 8 || m2 >= 8 || m1 < 0 || m2 < 0){
				System.out.println("\u001B[31m"+" Coodenada fora do tabuleiro, Digite um X e Y Válido!"+"\u001B[0m");
				seleciona_jogada(jogador, p_Cor);
			 }else if(!tab.move_Board_Possibility(m1, m2, tab.board[t1][t2].getPiece().getmovi_possibilityX(), tab.board[t1][t2].getPiece().getmovi_possibilityY())){
				System.out.println("\u001B[31m"+" Não é possivel jogar a peça nessa casa! Digite um X e Y Válido!"+"\u001B[0m");
				seleciona_jogada(jogador, p_Cor);
			 }

		}while(!tab.move_Board_Possibility(m1, m2, tab.board[t1][t2].getPiece().getmovi_possibilityX(), tab.board[t1][t2].getPiece().getmovi_possibilityY()));
	}

	public static void seleciona_peca(Player jogador,Commons.Cor p_Cor){

		Scanner sc = new Scanner(System.in);

		do {
			//tab.print_board();
			System.out.println("\u001B[33m" +jogador.getName() + "\u001B[0m" + ", Digite a Linha da Peça que Deseja Selecionar");
			
			 t1 = sc.nextInt();	

			System.out.println("\u001B[33m" +jogador.getName() + "\u001B[0m" + ", Digite a Coluna da Peça que Deseja Selecionar");
			
			 t2 = sc.nextInt();

			if(t1 >= 8 || t2 >= 8 || t1 < 0 || t2 < 0){

				System.out.println("\u001B[31m"+" Coodenada fora do tabuleiro, Digite um X e Y Válido!"+"\u001B[0m");
				seleciona_peca(jogador, p_Cor);
			 }
			 
		}while(!ChecaCoordenada(t1, t2, jogador, p_Cor));	
	}
	

	/**
	 * Função de início de jogo
	 * @throws IOException 
	 */
	public static void Init_jogo() throws IOException {
		Scanner sc = new Scanner(System.in);
	    
	    System.out.println("Bem vindos ao Clube de Xadrez!");
	    System.out.println("------------------------------");
	    System.out.println("");
		System.out.println("Digite o Nome do Arquivo que deseja criar para obter a visualização das peças");
		String nome_arq = sc.nextLine();
		arquivo = new Arquivo(nome_arq);
		System.out.println("------------------------------");
	    System.out.println("insira o nome do Player 1: ");
	    String nome_player1 = sc.nextLine();
	    p1 = new Player(nome_player1, Cor.WHITE); // Construtor de Player
	    System.out.println("insira o nome do Player 2: ");
	    String nome_player2 = sc.nextLine();
	    arquivo.gravaBuffered("Bem vindos " + nome_player1 + " & " + nome_player2 + "! "+"\n" + "Abaixo está listado as jogadas realizadas por cada jogador!" + "\n" + "-----------------------" + "\n");
	    p2 = new Player(nome_player2, Cor.BLACK); // Construtor de Player

	    System.out.println("Bom Jogo " + p1.getName() + " e " + p2.getName() + " , Que vença o melhor!");
	    tab = new Board(p1,p2); // Construtor da classe Board recebe 2 players (p1,p2) e inicaliza o tabuleiro
	    tab.print_board(); // Função que printa o tabuleiro 
	    
	    p1.PrintPlayer(); // Menu do objeto p1
	    p2.PrintPlayer(); // Menu do objeto p2
	    
	    Jogar(p1,Cor.WHITE);
	}

	
	
}
