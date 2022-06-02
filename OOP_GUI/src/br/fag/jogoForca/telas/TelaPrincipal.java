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
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class TelaPrincipal extends JFrame {
	
	JPanel panelPalavra;
	private JTextField field_1;
	private JTextField field_2;
	private JTextField field_3;
	private JTextField field_4;
	private JTextField field_5;
	private JTextField field_6;
	private JTextField field_7;
	private JTextField field_8;
	private JTextField field_9;
	private JTextField field_10;
	private JTextField field_11;
	private String palavraForca;
	
	public TelaPrincipal() {
		
		atribuirPalavra();
		initComponents();
		determinarTamanho();
		
	}

	private void initComponents() {
		setResizable(false);
		getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panelLetras = new JPanel();
		getContentPane().add(panelLetras, BorderLayout.SOUTH);
		panelLetras.setLayout(new BorderLayout(0, 0));
		
		panelPalavra = new JPanel();
		panelLetras.add(panelPalavra, BorderLayout.NORTH);
		
		field_1 = new JTextField();
		field_1.setEditable(false);
		field_1.setVisible(false);
		panelPalavra.add(field_1);
		field_1.setColumns(2);
		
		field_2 = new JTextField();
		field_2.setEditable(false);
		field_2.setVisible(false);
		panelPalavra.add(field_2);
		field_2.setColumns(2);
		
		field_3 = new JTextField();
		field_3.setEditable(false);
		field_3.setVisible(false);
		panelPalavra.add(field_3);
		field_3.setColumns(2);
		
		field_4 = new JTextField();
		field_4.setEditable(false);
		field_4.setVisible(false);
		panelPalavra.add(field_4);
		field_4.setColumns(2);
		
		field_5 = new JTextField();
		field_5.setEditable(false);
		field_5.setVisible(false);
		panelPalavra.add(field_5);
		field_5.setColumns(2);
		
		field_6 = new JTextField();
		field_6.setEditable(false);
		field_6.setVisible(false);
		panelPalavra.add(field_6);
		field_6.setColumns(2);
		
		field_7 = new JTextField();
		field_7.setEditable(false);
		field_7.setVisible(false);
		panelPalavra.add(field_7);
		field_7.setColumns(2);
		
		field_8 = new JTextField();
		field_8.setEditable(false);
		field_8.setVisible(false);
		panelPalavra.add(field_8);
		field_8.setColumns(2);
		
		field_9 = new JTextField();
		field_9.setEditable(false);
		field_9.setVisible(false);
		panelPalavra.add(field_9);
		field_9.setColumns(2);
		
		field_10 = new JTextField();
		field_10.setEditable(false);
		field_10.setVisible(false);
		panelPalavra.add(field_10);
		field_10.setColumns(2);
		
		field_11 = new JTextField();
		field_11.setEditable(false);
		field_11.setVisible(false);
		panelPalavra.add(field_11);
		field_11.setColumns(2);
		
				
		JPanel panelTeclado = new JPanel();
		panelLetras.add(panelTeclado);
		panelTeclado.setLayout(new VerticalFlowLayout());

		
		JPanel panelAI = new JPanel();
		panelTeclado.add(panelAI);
		
		JButton btnA = new JButton("A");
		btnA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String letra = btnA.getText();
				clickLetra(letra);
			}
		});
		panelAI.add(btnA);
		
		JButton btnB = new JButton("B");
		btnB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panelAI.add(btnB);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panelAI.add(btnC);
		
		JButton btnD = new JButton("D");
		btnD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panelAI.add(btnD);
		
		JButton btnE = new JButton("E");
		btnE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panelAI.add(btnE);
		
		JButton btnF = new JButton("F");
		btnF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panelAI.add(btnF);
		
		JButton btnG = new JButton("G");
		btnG.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panelAI.add(btnG);
		
		JButton btnH = new JButton("H");
		btnH.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panelAI.add(btnH);
		
		JButton btnI = new JButton("I");
		btnI.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panelAI.add(btnI);
		
		JPanel panelIQ = new JPanel();
		panelTeclado.add(panelIQ);
		
		JButton btnJ = new JButton("J");
		btnJ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panelIQ.add(btnJ);
		
		JButton btnK = new JButton("K");
		btnK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panelIQ.add(btnK);
		
		JButton btnL = new JButton("L");
		btnL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panelIQ.add(btnL);
		
		JButton btnM = new JButton("M");
		btnM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panelIQ.add(btnM);
		
		JButton btnN = new JButton("N");
		btnN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panelIQ.add(btnN);
		
		JButton btnO = new JButton("O");
		btnO.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panelIQ.add(btnO);
		
		JButton btnP = new JButton("P");
		btnP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panelIQ.add(btnP);
		
		JButton btnQ = new JButton("Q");
		btnQ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panelIQ.add(btnQ);
		
		JPanel panelRZ = new JPanel();
		panelTeclado.add(panelRZ);
		
		JButton btnR = new JButton("R");
		btnR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panelRZ.add(btnR);
		
		JButton btnS = new JButton("S");
		btnS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panelRZ.add(btnS);
		
		JButton btnT = new JButton("T");
		btnT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panelRZ.add(btnT);
		
		JButton btnU = new JButton("U");
		btnU.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panelRZ.add(btnU);
		
		JButton btnV = new JButton("V");
		btnV.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panelRZ.add(btnV);
		
		JButton btnW = new JButton("W");
		btnW.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panelRZ.add(btnW);
		
		JButton btnX = new JButton("X");
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panelRZ.add(btnX);
		
		JButton btnY = new JButton("Y");
		btnY.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panelRZ.add(btnY);
		
		JButton btnZ = new JButton("Z");
		btnZ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
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

	private void clickLetra(String letra) {
		
		for (int i = 0; i < palavraForca.length(); i++) {
			if (palavraForca.charAt(i)==(letra.charAt(0))) {
//				panelPalavra.getComponent(i).;				
			}
		}
				
	}
	
	private void atribuirPalavra() {
		palavraForca = "Romario";		
	}
	
	private void determinarTamanho() {
		
		for (int i = 0; i < palavraForca.length(); i++) {			
			panelPalavra.getComponent(i).setVisible(true);			
		}	
	}
	

	
	
	
	
	
	
	
}
