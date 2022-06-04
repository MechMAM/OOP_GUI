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
			}
		});
		panelAI.add(btnA);
		
		JButton btnB = new JButton("B");
		btnB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String letra = btnB.getText();
				clickLetra(letra);
			}
		});
		panelAI.add(btnB);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String letra = btnC.getText();
				clickLetra(letra);
			}
		});
		panelAI.add(btnC);
		
		JButton btnD = new JButton("D");
		btnD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String letra = btnD.getText();
				clickLetra(letra);
			}
		});
		panelAI.add(btnD);
		
		JButton btnE = new JButton("E");
		btnE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String letra = btnE.getText();
				clickLetra(letra);
			}
		});
		panelAI.add(btnE);
		
		JButton btnF = new JButton("F");
		btnF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String letra = btnF.getText();
				clickLetra(letra);
			}
		});
		panelAI.add(btnF);
		
		JButton btnG = new JButton("G");
		btnG.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String letra = btnG.getText();
				clickLetra(letra);
			}
		});
		panelAI.add(btnG);
		
		JButton btnH = new JButton("H");
		btnH.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String letra = btnH.getText();
				clickLetra(letra);
			}
		});
		panelAI.add(btnH);
		
		JButton btnI = new JButton("I");
		btnI.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String letra = btnF.getText();
				clickLetra(letra);
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
			}
		});
		panelIQ.add(btnJ);
		
		JButton btnK = new JButton("K");
		btnK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String letra = btnK.getText();
				clickLetra(letra);
			}
		});
		panelIQ.add(btnK);
		
		JButton btnL = new JButton("L");
		btnL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String letra = btnL.getText();
				clickLetra(letra);
			}
		});
		panelIQ.add(btnL);
		
		JButton btnM = new JButton("M");
		btnM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String letra = btnM.getText();
				clickLetra(letra);
			}
		});
		panelIQ.add(btnM);
		
		JButton btnN = new JButton("N");
		btnN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String letra = btnN.getText();
				clickLetra(letra);
			}
		});
		panelIQ.add(btnN);
		
		JButton btnO = new JButton("O");
		btnO.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String letra = btnO.getText();
				clickLetra(letra);
			}
		});
		panelIQ.add(btnO);
		
		JButton btnP = new JButton("P");
		btnP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String letra = btnP.getText();
				clickLetra(letra);
			}
		});
		panelIQ.add(btnP);
		
		JButton btnQ = new JButton("Q");
		btnQ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String letra = btnQ.getText();
				clickLetra(letra);
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
			}
		});
		panelRZ.add(btnR);
		
		JButton btnS = new JButton("S");
		btnS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String letra = btnS.getText();
				clickLetra(letra);
			}
		});
		panelRZ.add(btnS);
		
		JButton btnT = new JButton("T");
		btnT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String letra = btnT.getText();
				clickLetra(letra);
			}
		});
		panelRZ.add(btnT);
		
		JButton btnU = new JButton("U");
		btnU.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String letra = btnU.getText();
				clickLetra(letra);
			}
		});
		panelRZ.add(btnU);
		
		JButton btnV = new JButton("V");
		btnV.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String letra = btnV.getText();
				clickLetra(letra);
			}
		});
		panelRZ.add(btnV);
		
		JButton btnW = new JButton("W");
		btnW.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String letra = btnW.getText();
				clickLetra(letra);
			}
		});
		panelRZ.add(btnW);
		
		JButton btnX = new JButton("X");
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String letra = btnX.getText();
				clickLetra(letra);
			}
		});
		panelRZ.add(btnX);
		
		JButton btnY = new JButton("Y");
		btnY.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String letra = btnY.getText();
				clickLetra(letra);
			}
		});
		panelRZ.add(btnY);
		
		JButton btnZ = new JButton("Z");
		btnZ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String letra = btnZ.getText();
				clickLetra(letra);
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
				atribuirLetra(i, letra);
			}
		}
				
	}
	
	private void atribuirLetra(int i, String letra) {
		StringBuilder palavra = new StringBuilder(field_1.getText());
		int auxiliar = 0;
		for (int j = 0; j < palavra.length(); j++) {
			
			if (palavra.charAt(j)=='*') {
				auxiliar++;							
			}
			if (auxiliar == i-1) {
				palavra.setCharAt(j, letra.charAt(0));
			}
		}
		field_1.setText(palavra.toString());
		JOptionPane.showMessageDialog(null, letra);
		
	}

	private void atribuirPalavra() {
		palavraForca = "ROMARIO";		
	}
	
	private void determinarTamanho() {
		
		for (int i = 0; i < palavraForca.length(); i++) {
			String palavra = field_1.getText();
			palavra+=" *  ";
			field_1.setText(palavra);		
		}	
	}
	

	
	
	
	
	
	
	
}
