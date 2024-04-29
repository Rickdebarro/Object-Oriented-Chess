package GUI_Chess;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.*;

public class GUI {
    public static void main(String[] args) {
       JFrame telinha = new JFrame();
       telinha.setVisible(true);
       telinha.setSize(700,700);
       telinha.setResizable(true);
       telinha.setLocationRelativeTo(null);
       telinha.setLayout(null);
       telinha.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

       JPanel titulo = new JPanel();
       titulo.setSize(700,100);
       titulo.setBackground(Color.orange);
		telinha.add(titulo);

       JLabel bem_vindo = new JLabel("Bem vindos ao Clube de Xadrez!");

       bem_vindo.setFont(new Font("Arial",Font.BOLD, 24));
       bem_vindo.setSize(30,30);
       bem_vindo.setOpaque(true);
       bem_vindo.setBackground(Color.orange);
	   titulo.add(bem_vindo);
        
    }
}
