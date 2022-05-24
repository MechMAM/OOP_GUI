package br.fag.jogoForca.telas;

import javax.swing.JFrame;
import javax.swing.JPanel;

import br.fag.calculadora.gui.VerticalFlowLayout;

import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.Rectangle;
import java.awt.ComponentOrientation;
import java.awt.Font;
import java.awt.Canvas;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class TelaPrincipal extends JFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	public TelaPrincipal() {
		setResizable(false);
		getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panelLetras = new JPanel();
		getContentPane().add(panelLetras, BorderLayout.SOUTH);
		panelLetras.setLayout(new BorderLayout(0, 0));
		
		JPanel panelPalavra = new JPanel();
		panelLetras.add(panelPalavra, BorderLayout.NORTH);
		
		textField = new JTextField();
		textField.setEditable(false);
		panelPalavra.add(textField);
		textField.setColumns(2);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		panelPalavra.add(textField_1);
		textField_1.setColumns(2);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		panelPalavra.add(textField_2);
		textField_2.setColumns(2);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		panelPalavra.add(textField_3);
		textField_3.setColumns(2);
		
		textField_4 = new JTextField();
		textField_4.setEditable(false);
		panelPalavra.add(textField_4);
		textField_4.setColumns(2);
		
		textField_5 = new JTextField();
		textField_5.setEditable(false);
		panelPalavra.add(textField_5);
		textField_5.setColumns(2);
		
		textField_6 = new JTextField();
		textField_6.setEditable(false);
		panelPalavra.add(textField_6);
		textField_6.setColumns(2);
		
		textField_7 = new JTextField();
		textField_7.setEditable(false);
		panelPalavra.add(textField_7);
		textField_7.setColumns(2);
		
		textField_8 = new JTextField();
		textField_8.setEditable(false);
		panelPalavra.add(textField_8);
		textField_8.setColumns(2);
		
		textField_9 = new JTextField();
		textField_9.setEditable(false);
		panelPalavra.add(textField_9);
		textField_9.setColumns(2);
		
		textField_10 = new JTextField();
		textField_10.setEditable(false);
		panelPalavra.add(textField_10);
		textField_10.setColumns(2);
		
		JPanel panelTeclado = new JPanel();
		panelLetras.add(panelTeclado);
		panelTeclado.setLayout(new VerticalFlowLayout());

		
		JPanel panelAI = new JPanel();
		panelTeclado.add(panelAI);
		
		JButton btnA = new JButton("A");
		panelAI.add(btnA);
		
		JButton btnB = new JButton("B");
		panelAI.add(btnB);
		
		JButton btnC = new JButton("C");
		panelAI.add(btnC);
		
		JButton btnD = new JButton("D");
		panelAI.add(btnD);
		
		JButton btnE = new JButton("E");
		panelAI.add(btnE);
		
		JButton btnF = new JButton("F");
		panelAI.add(btnF);
		
		JButton btnG = new JButton("G");
		panelAI.add(btnG);
		
		JButton btnH = new JButton("H");
		panelAI.add(btnH);
		
		JButton btnI = new JButton("I");
		panelAI.add(btnI);
		
		JPanel panelIQ = new JPanel();
		panelTeclado.add(panelIQ);
		
		JButton btnJ = new JButton("J");
		panelIQ.add(btnJ);
		
		JButton btnK = new JButton("K");
		panelIQ.add(btnK);
		
		JButton btnL = new JButton("L");
		panelIQ.add(btnL);
		
		JButton btnM = new JButton("M");
		panelIQ.add(btnM);
		
		JButton btnN = new JButton("N");
		panelIQ.add(btnN);
		
		JButton btnO = new JButton("O");
		panelIQ.add(btnO);
		
		JButton btnP = new JButton("P");
		panelIQ.add(btnP);
		
		JButton btnQ = new JButton("Q");
		panelIQ.add(btnQ);
		
		JPanel panelRZ = new JPanel();
		panelTeclado.add(panelRZ);
		
		JButton btnR = new JButton("R");
		panelRZ.add(btnR);
		
		JButton btnS = new JButton("S");
		panelRZ.add(btnS);
		
		JButton btnT = new JButton("T");
		panelRZ.add(btnT);
		
		JButton btnU = new JButton("U");
		panelRZ.add(btnU);
		
		JButton btnV = new JButton("V");
		panelRZ.add(btnV);
		
		JButton btnW = new JButton("W");
		panelRZ.add(btnW);
		
		JButton btnX = new JButton("X");
		panelRZ.add(btnX);
		
		JButton btnY = new JButton("Y");
		panelRZ.add(btnY);
		
		JButton btnZ = new JButton("Z");
		panelRZ.add(btnZ);
		
		JPanel panelNorte = new JPanel();
		getContentPane().add(panelNorte, BorderLayout.NORTH);
		
		JPanel panelForca = new JPanel();
		getContentPane().add(panelForca, BorderLayout.CENTER);
		panelForca.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("|");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel_1.setBounds(249, 157, 15, 37);
		panelForca.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("O");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel.setBounds(244, 135, 27, 28);
		panelForca.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("/");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel_2.setBounds(244, 190, 15, 28);
		panelForca.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("\\");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel_2_1.setBounds(253, 190, 15, 28);
		panelForca.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("/");
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel_2_2.setBounds(244, 161, 15, 28);
		panelForca.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("\\");
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel_2_1_1.setBounds(254, 161, 15, 28);
		panelForca.add(lblNewLabel_2_1_1);
		
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
//		setLocationRelativeTo(null);
		setSize(800, 600);
		setVisible(true);
	}
}
