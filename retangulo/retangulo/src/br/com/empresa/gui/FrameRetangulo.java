package br.com.empresa.gui;

import java.awt.TextField;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class FrameRetangulo {
	
	public void criarTela() {
		
//		***Construir a Tela***
		JFrame tela = new JFrame();
		tela.setTitle("Calculos com retângulo");
		tela.setSize(600, 400);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setLayout(null);
		
//		***Construir a Tela***
		JLabel labelAltura = new JLabel();
		labelAltura.setText("Altura");
		labelAltura.setBounds(10, 10, 60, 30);
		
//		***Construir um JTextFild***
		JTextField textAltura = new JTextField();
		textAltura.setBounds(70, 10, 60, 30);
		tela.getContentPane().add(labelAltura);
		tela.getContentPane().add(textAltura);
		
		tela.setVisible(true);
	}
}
