package GUI_Chess;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.*;

import javafx.scene.layout.GridPane;

public class GUI {

    // Atributes
    private JFrame telinha;

    private JPanel titulo, panel_start, panel_instructions;
    


    public void init() {
        initTela();
    }

    private void initTela() {
        telinha = new JFrame();
        telinha.setVisible(true);
        telinha.setSize(700, 700);
        telinha.setLayout(null);
        telinha.setResizable(true);
        telinha.setLocationRelativeTo(null);
        telinha.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initTitle();
    }

    private void initTitle() {
        titulo = new JPanel();
        titulo.setSize(700, 100);
        titulo.setBackground(Color.orange);
        JLabel bem_vindo = new JLabel("Bem vindos ao Clube de Xadrez!");

        bem_vindo.setFont(new Font("Arial", Font.BOLD, 24));
        bem_vindo.setSize(30, 30);
        bem_vindo.setOpaque(true);
        bem_vindo.setBackground(Color.orange);
        titulo.add(bem_vindo);
        telinha.add(titulo);
        initButtons();
    }

    private void initButtons(){
        JButton start = new JButton();
        JButton instruction = new JButton();

        start.setSize(5000,5000);
        instruction.setSize(50000,5000);


        panel_instructions = new JPanel();
        panel_instructions.setLayout(new GridPane());
        panel_start = new JPanel();
        
        panel_start.add(start);
        panel_instructions.setBounds(175, 175, 200, 200);
        panel_instructions.add(instruction);
        panel_instructions.setBackground(Color.black);

        telinha.add(panel_start);
        telinha.add(panel_instructions);


    }

}
