package GUI_Chess;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import javafx.scene.layout.GridPane;

public class GUI {

    // Atributes
    private JFrame telinha,telajogo,telainstrucao;

    private JPanel titulo, panel_start, panel_instructions;
    


    public void init() {
        initTela();
    }

    private void initTela() {
        telinha = new JFrame();
        telinha.add(new JLabel(new ImageIcon("Images\soussa.png")));
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
        JButton start = new JButton("Start");
        start.setBounds(25,25,150,50);
        start.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	telajogo = new JFrame();
            	telajogo.setVisible(true);
            	telajogo.setSize(700, 700);
            	telajogo.setLayout(null);
                telajogo.setResizable(true);
                telajogo.setLocationRelativeTo(null);
                telajogo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                telinha.dispose();
            }
        });
        JButton instruction = new JButton("Instructions");
        instruction.setBounds(25,25,150,50);
        panel_instructions = new JPanel();
        panel_instructions.setBounds(250, 200, 200, 100);
        panel_instructions.setLayout(null);
        panel_instructions.setBackground(Color.red);
        panel_instructions.add(instruction);
        
        panel_start = new JPanel();
        panel_start.setLayout(null);
        panel_start.setBounds(250, 350, 200, 100);
        panel_start.setBackground(Color.blue);
        panel_start.add(start);
       
        telinha.add(panel_start);
        telinha.add(panel_instructions);


    }

}
