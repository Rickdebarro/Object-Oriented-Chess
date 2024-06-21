package main;
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
	private static File arq;
	private static String Nome_do_Arquivo;
	
	
	public static void abreArquivo() throws IOException{
		
		File arq = new File(Nome_do_Arquivo);
		
		if(arq.createNewFile()) {
			System.out.println("Arquivo criado: "+ arq.getName()+ " com qtde de bytes: "+ arq.length());
		} else {
			System.out.println("Arquivo já existe "+ arq.getAbsoluteFile());
		}
	}

	/*
	 * Função que executa uma jogada para o jogador passado para a função
	 */
	public static void Jogar(Player jogador, Commons.Cor p_Cor) throws IOException{	
		
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
			 
			 if(t1 >= 8 || t2 >= 8){
				System.out.println(" Coodenada Invalida, Digite um X e Y Válido!");
				continue;
			 }
		}while(!ChecaCoordenada(t1, t2, jogador, p_Cor));
		
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
		
		String aux = jogador.getName() + ": " +  tab.board[m1][m2].getPiece().getClass().getSimpleName() + " " +  String.valueOf(m1) + "|" + String.valueOf(m2) + "\n";
		gravaBuffered(aux);
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
	 * Fubnção que checa se uma cordenada passada é válida
	 */
	public static boolean ChecaCoordenada(int t1,int t2, Player jogador, Commons.Cor p_Cor){
		
		if(tab.board[t1][t2].getIsFree() == true || tab.board[t1][t2].getPiece().getCor() != p_Cor) {
			
			System.out.println("Coodenada Invalida!");
			
			return false;
				
		}else {
			return true;
		}
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
		Nome_do_Arquivo = sc.nextLine();
		abreArquivo();
		System.out.println("");
		System.out.println("------------------------------");
	    System.out.println("insira o nome do Player 1: ");
	    String nome_player1 = sc.nextLine();
	    p1 = new Player(nome_player1, Cor.WHITE); // Construtor de Player
	    System.out.println("insira o nome do Player 2: ");
	    String nome_player2 = sc.nextLine();
	    gravaBuffered(nome_player1 + " " + nome_player2 + "\n" + "------------------------------" + "\n");
	    p2 = new Player(nome_player2, Cor.BLACK); // Construtor de Player

	    System.out.println("Bom Jogo " + p1.getName() + " e " + p2.getName() + " , Que vença o melhor!");
	    tab = new Board(p1,p2); // Construtor da classe Board recebe 2 players (p1,p2) e inicaliza o tabuleiro
	    tab.print_board(); // Função que printa o tabuleiro 
	    
	    p1.PrintPlayer(); // Menu do objeto p1
	    p2.PrintPlayer(); // Menu do objeto p2
	    
	    Jogar(p1,Cor.WHITE);
	}

	public static void gravaBuffered(String grava) throws IOException{
		BufferedWriter b = new BufferedWriter(new FileWriter(Nome_do_Arquivo, true));
		
		b.write(grava + "\n");
		
		b.close();
		
	}

	public static void leBuffered() throws IOException {
		BufferedReader b = new BufferedReader(new FileReader(Nome_do_Arquivo));
		
		String linha = "--------\n";
		System.out.println(linha);
		
		while((linha=b.readLine())!= null) {
			System.out.println(linha);
		}
		b.close();
	}
	
}
