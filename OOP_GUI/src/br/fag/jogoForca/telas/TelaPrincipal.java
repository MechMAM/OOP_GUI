package br.fag.jogoForca.telas;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import br.fag.calculadora.gui.VerticalFlowLayout;

@SuppressWarnings("serial")
public class TelaPrincipal extends JFrame {
	
	private JTextField field_1;
	private JLabel cabeca;
	private JLabel tronco;
	private JLabel pernaEsq;
	private JLabel pernaDir;
	private JLabel bracoEsq;
	private JLabel bracoDir;
	private String palavraForca;
	private int contadorErros;
	
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
		
		JPanel panelPalavra = new JPanel();
		panelLetras.add(panelPalavra, BorderLayout.NORTH);
		
		field_1 = new JTextField();
		field_1.setHorizontalAlignment(SwingConstants.CENTER);
		field_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		field_1.setEditable(false);
		panelPalavra.add(field_1);
		field_1.setColumns(30);
		
				
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
				btnA.setEnabled(false);
			}
		});
		panelAI.add(btnA);
		
		JButton btnB = new JButton("B");
		btnB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String letra = btnB.getText();
				clickLetra(letra);
				btnB.setEnabled(false);
			}
		});
		panelAI.add(btnB);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String letra = btnC.getText();
				clickLetra(letra);
				btnC.setEnabled(false);
			}
		});
		panelAI.add(btnC);
		
		JButton btnD = new JButton("D");
		btnD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String letra = btnD.getText();
				clickLetra(letra);
				btnD.setEnabled(false);
			}
		});
		panelAI.add(btnD);
		
		JButton btnE = new JButton("E");
		btnE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String letra = btnE.getText();
				clickLetra(letra);
				btnE.setEnabled(false);
			}
		});
		panelAI.add(btnE);
		
		JButton btnF = new JButton("F");
		btnF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String letra = btnF.getText();
				clickLetra(letra);
				btnF.setEnabled(false);
			}
		});
		panelAI.add(btnF);
		
		JButton btnG = new JButton("G");
		btnG.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String letra = btnG.getText();
				clickLetra(letra);
				btnG.setEnabled(false);
			}
		});
		panelAI.add(btnG);
		
		JButton btnH = new JButton("H");
		btnH.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String letra = btnH.getText();
				clickLetra(letra);
				btnH.setEnabled(false);
			}
		});
		panelAI.add(btnH);
		
		JButton btnI = new JButton("I");
		btnI.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String letra = btnI.getText();
				clickLetra(letra);
				btnI.setEnabled(false);
			}
		});
		panelAI.add(btnI);
		
		JPanel panelIQ = new JPanel();
		panelTeclado.add(panelIQ);
		
		JButton btnJ = new JButton("J");
		btnJ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String letra = btnJ.getText();
				clickLetra(letra);
				btnJ.setEnabled(false);
			}
		});
		panelIQ.add(btnJ);
		
		JButton btnK = new JButton("K");
		btnK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String letra = btnK.getText();
				clickLetra(letra);
				btnK.setEnabled(false);
			}
		});
		panelIQ.add(btnK);
		
		JButton btnL = new JButton("L");
		btnL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String letra = btnL.getText();
				clickLetra(letra);
				btnL.setEnabled(false);
			}
		});
		panelIQ.add(btnL);
		
		JButton btnM = new JButton("M");
		btnM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String letra = btnM.getText();
				clickLetra(letra);
				btnM.setEnabled(false);
			}
		});
		panelIQ.add(btnM);
		
		JButton btnN = new JButton("N");
		btnN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String letra = btnN.getText();
				clickLetra(letra);
				btnN.setEnabled(false);
			}
		});
		panelIQ.add(btnN);
		
		JButton btnO = new JButton("O");
		btnO.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String letra = btnO.getText();
				clickLetra(letra);
				btnO.setEnabled(false);
			}
		});
		panelIQ.add(btnO);
		
		JButton btnP = new JButton("P");
		btnP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String letra = btnP.getText();
				clickLetra(letra);
				btnP.setEnabled(false);
			}
		});
		panelIQ.add(btnP);
		
		JButton btnQ = new JButton("Q");
		btnQ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String letra = btnQ.getText();
				clickLetra(letra);
				btnQ.setEnabled(false);
			}
		});
		panelIQ.add(btnQ);
		
		JPanel panelRZ = new JPanel();
		panelTeclado.add(panelRZ);
		
		JButton btnR = new JButton("R");
		btnR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String letra = btnR.getText();
				clickLetra(letra);
				btnR.setEnabled(false);
			}
		});
		panelRZ.add(btnR);
		
		JButton btnS = new JButton("S");
		btnS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String letra = btnS.getText();
				clickLetra(letra);
				btnS.setEnabled(false);
			}
		});
		panelRZ.add(btnS);
		
		JButton btnT = new JButton("T");
		btnT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String letra = btnT.getText();
				clickLetra(letra);
				btnT.setEnabled(false);
			}
		});
		panelRZ.add(btnT);
		
		JButton btnU = new JButton("U");
		btnU.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String letra = btnU.getText();
				clickLetra(letra);
				btnU.setEnabled(false);
			}
		});
		panelRZ.add(btnU);
		
		JButton btnV = new JButton("V");
		btnV.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String letra = btnV.getText();
				clickLetra(letra);
				btnV.setEnabled(false);
			}
		});
		panelRZ.add(btnV);
		
		JButton btnW = new JButton("W");
		btnW.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String letra = btnW.getText();
				clickLetra(letra);
				btnW.setEnabled(false);
			}
		});
		panelRZ.add(btnW);
		
		JButton btnX = new JButton("X");
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String letra = btnX.getText();
				clickLetra(letra);
				btnX.setEnabled(false);
			}
		});
		panelRZ.add(btnX);
		
		JButton btnY = new JButton("Y");
		btnY.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String letra = btnY.getText();
				clickLetra(letra);
				btnY.setEnabled(false);
			}
		});
		panelRZ.add(btnY);
		
		JButton btnZ = new JButton("Z");
		btnZ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String letra = btnZ.getText();
				clickLetra(letra);
				btnZ.setEnabled(false);
			}
		});
		panelRZ.add(btnZ);
		
		JPanel panelNorte = new JPanel();
		getContentPane().add(panelNorte, BorderLayout.NORTH);
		
		JPanel panelForca = new JPanel();
		getContentPane().add(panelForca, BorderLayout.CENTER);
		panelForca.setLayout(null);
		
		cabeca = new JLabel("O");
		cabeca.setFont(new Font("Tahoma", Font.PLAIN, 30));
		cabeca.setBounds(244, 135, 27, 28);
		panelForca.add(cabeca);
		cabeca.setVisible(false);
		
		tronco = new JLabel("|");
		tronco.setFont(new Font("Tahoma", Font.PLAIN, 30));
		tronco.setBounds(249, 157, 15, 37);
		panelForca.add(tronco);
		tronco.setVisible(false);
		
		pernaEsq = new JLabel("/");
		pernaEsq.setFont(new Font("Tahoma", Font.PLAIN, 30));
		pernaEsq.setBounds(244, 190, 15, 28);
		panelForca.add(pernaEsq);
		pernaEsq.setVisible(false);
		
		pernaDir = new JLabel("\\");
		pernaDir.setFont(new Font("Tahoma", Font.PLAIN, 30));
		pernaDir.setBounds(253, 190, 15, 28);
		panelForca.add(pernaDir);
		pernaDir.setVisible(false);
		
		bracoEsq = new JLabel("/");
		bracoEsq.setFont(new Font("Tahoma", Font.PLAIN, 30));
		bracoEsq.setBounds(244, 161, 15, 28);
		panelForca.add(bracoEsq);
		bracoEsq.setVisible(false);
		
		bracoDir = new JLabel("\\");
		bracoDir.setFont(new Font("Tahoma", Font.PLAIN, 30));
		bracoDir.setBounds(254, 161, 15, 28);
		panelForca.add(bracoDir);
		bracoDir.setVisible(false);
		
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
//		setLocationRelativeTo(null);
		setSize(800, 600);
		setVisible(true);
	}

	private void clickLetra(String letra) {
		boolean acertou = false;
		int letrasFaltam = -1;
		for (int i = 0; i < palavraForca.length(); i++) {
			if (palavraForca.charAt(i)==(letra.charAt(0))) {
				letrasFaltam = atribuirLetra(i, letra);
				acertou = true;
			}
		}
		if(!acertou) {
			contadorErros++;
			desenharForca(contadorErros);
		}
		if (letrasFaltam == 0) {
			ganhouJogo();
		}
	}
	
	private void ganhouJogo() {
		Object[] options = { " Continuar Jogando ", " Fechar o jogo " };			
		int opcao = JOptionPane.showOptionDialog(null, "Você ganhou! Escolha uma opção!", "Tela da vitória",JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,null, options, options[0]);
		System.out.println(opcao);		
		switch (opcao) {
		case 0:
			this.dispose();
			new TelaPrincipal();				
			break;
		case 1:
			this.dispose();
			break;
		default:
			break;
		}		
	}

	private void desenharForca(int erros) {
		
		switch (erros) {
		case 1:
			cabeca.setVisible(true);
			break;
		case 2:
			tronco.setVisible(true);
			break;
		case 3:
			bracoEsq.setVisible(true);
			break;
		case 4:
			bracoDir.setVisible(true);
			break;
		case 5:
			pernaEsq.setVisible(true);
			break;
		case 6:
			pernaDir.setVisible(true);			
			Object[] options = { " Continuar Jogando ", " Fechar o jogo " };			
			int opcao = JOptionPane.showOptionDialog(null, "Você perdeu! Escolha uma opção", "Tela da vergonha",JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,null, options, options[0]);
			System.out.println(opcao);
			
			switch (opcao) {
			case 0:
				this.dispose();
				new TelaPrincipal();				
				break;
			case 1:
				this.dispose();
				break;
			default:
				break;
			}
			
			break;
		default:
			break;
		}
	}

	private int atribuirLetra(int i, String letra) {
		StringBuilder palavra = new StringBuilder(field_1.getText());
		int contadorPosicao = 0;
		int letrasFaltam = 0;
		boolean alterado = false;
		for (int j = 0; j < palavra.length(); j++) {			
			if (palavra.charAt(j)!=' ') {
				contadorPosicao++;							
			}			
			if (contadorPosicao-1 == (i) && !alterado) {
				palavra.setCharAt(j, letra.charAt(0));
				alterado = true;
			}
		}
		for (int j = 0; j < palavra.length(); j++) {
			if (palavra.charAt(j)=='*') {
				letrasFaltam++;				
			}			
		}
		field_1.setText(palavra.toString());
		return letrasFaltam;
	}

	private void atribuirPalavra() {
		palavraForca = "ROMARIO";		
	}
	
	private void determinarTamanho() {
		
		String palavra = field_1.getText();
		for (int i = 0; i < palavraForca.length(); i++) {
			palavra+="  *  ";
		}	
		field_1.setText(palavra);		
	}
	

	
	
	
	
	
	
	
}
