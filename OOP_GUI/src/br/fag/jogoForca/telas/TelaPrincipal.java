package br.fag.jogoForca.telas;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Toolkit;
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
import java.awt.Color;
import java.awt.Dimension;
import java.awt.SystemColor;
import javax.swing.UIManager;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;

@SuppressWarnings("serial")
public class TelaPrincipal extends JFrame {
	
	private JTextField field_1;
	private JLabel cabeca;
	private JLabel tronco;
	private JLabel pernaEsq;
	private JLabel pernaDir;
	private JLabel bracoEsq;
	private JLabel bracoDir;
	private JLabel Dica;	
	
	public TelaPrincipal() {
		getContentPane().setBackground(Color.WHITE);
		
		setTitle("Jogo da Forca");		
		MetodosForca.atribuirPalavra();
		initComponents();
		determinarTamanho();
		
	}

	private void initComponents() {
		setResizable(false);
		getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panelLetras = new JPanel();
		panelLetras.setBackground(UIManager.getColor("InternalFrame.activeTitleGradient"));
		getContentPane().add(panelLetras, BorderLayout.SOUTH);
		panelLetras.setLayout(new BorderLayout(0, 0));
		
		JPanel panelPalavra = new JPanel();
		panelPalavra.setBorder(new LineBorder(new Color(0, 120, 215), 1, true));
		panelPalavra.setBackground(UIManager.getColor("InternalFrame.activeTitleBackground"));
		panelLetras.add(panelPalavra, BorderLayout.NORTH);
		
		field_1 = new JTextField();
		field_1.setBorder(new LineBorder(UIManager.getColor("InternalFrame.borderDarkShadow"), 1, true));
		field_1.setForeground(Color.DARK_GRAY);
		field_1.setBackground(Color.WHITE);
		field_1.setHorizontalAlignment(SwingConstants.CENTER);
		field_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		field_1.setEditable(false);
		panelPalavra.add(field_1);
		field_1.setColumns(30);
		
				
		JPanel panelTeclado = new JPanel();
		panelTeclado.setBackground(UIManager.getColor("InternalFrame.activeTitleGradient"));
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
		panelForca.setBorder(new LineBorder(new Color(0, 120, 215), 1, true));
		panelForca.setBackground(Color.WHITE);
		getContentPane().add(panelForca, BorderLayout.CENTER);
		panelForca.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.BLACK);
		panel_1.setBounds(71, 293, 91, 10);
		panelForca.add(panel_1);
		
		cabeca = new JLabel("O");
		cabeca.setFont(new Font("Tahoma", Font.PLAIN, 40));
		cabeca.setBounds(239, 130, 28, 44);
		panelForca.add(cabeca);
		cabeca.setVisible(false);
		
		tronco = new JLabel("|");
		tronco.setFont(new Font("Tahoma", Font.PLAIN, 40));
		tronco.setBounds(246, 157, 15, 56);
		panelForca.add(tronco);
		tronco.setVisible(false);
		
		pernaEsq = new JLabel("/");
		pernaEsq.setFont(new Font("Tahoma", Font.PLAIN, 40));
		pernaEsq.setBounds(236, 207, 19, 37);
		panelForca.add(pernaEsq);
		pernaEsq.setVisible(false);
		
		pernaDir = new JLabel("\\");
		pernaDir.setFont(new Font("Tahoma", Font.PLAIN, 40));
		pernaDir.setBounds(256, 207, 28, 37);
		panelForca.add(pernaDir);
		pernaDir.setVisible(false);
		
		bracoEsq = new JLabel("/");
		bracoEsq.setFont(new Font("Tahoma", Font.PLAIN, 40));
		bracoEsq.setBounds(236, 163, 15, 44);
		panelForca.add(bracoEsq);
		bracoEsq.setVisible(false);
		
		bracoDir = new JLabel("\\");
		bracoDir.setFont(new Font("Tahoma", Font.PLAIN, 40));
		bracoDir.setBounds(255, 157, 19, 56);
		panelForca.add(bracoDir);
		
		Dica = new JLabel("DICA");
		Dica.setFont(new Font("Tahoma", Font.PLAIN, 30));
		Dica.setBounds(412, 103, 329, 49);
		Dica.setVisible(false);
		panelForca.add(Dica);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(109, 68, 10, 235);
		panelForca.add(panel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.DARK_GRAY);
		panel_2.setBounds(109, 68, 150, 10);
		panelForca.add(panel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.ORANGE);
		panel_3.setBounds(250, 68, 5, 65);
		panelForca.add(panel_3);
		bracoDir.setVisible(false);
		
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setSize(800, 600);
		setVisible(true);
		centralizarTela();
	}
	
	public void centralizarTela() {
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		Dimension dw = getSize();
		setLocation((ds.width - dw.width) / 2, (ds.height - dw.height) / 2);
	}

	private void clickLetra(String letra) {
		boolean errou = true;
		int letrasFaltam = -1;
		for (int i = 0; i < MetodosForca.getPalavraForca()[1].length(); i++) {
			if (MetodosForca.getPalavraForca()[1].charAt(i) == (letra.charAt(0))) {
				letrasFaltam = MetodosForca.atribuirLetra(i, MetodosForca.getPalavraForca()[1].charAt(i),field_1);
				errou = false;
			}
		}
		if (errou) {
			MetodosForca.setContadorErros(MetodosForca.getContadorErros()+1);
			desenharForca(MetodosForca.getContadorErros());
		}
		if (letrasFaltam == 0) {
			finalizarJogo("Você ganhou! Escolha uma opção!","Tela da vitória");
		}
	}	

	private void finalizarJogo(String mensagem, String titulo) {
		Object[] options = { " Continuar Jogando ", " Fechar o jogo " };
		int opcao = JOptionPane.showOptionDialog(null, mensagem, titulo,
				JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
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
			MetodosForca.exibirDica(Dica);
			break;
		case 4:
			bracoDir.setVisible(true);
			break;
		case 5:
			pernaEsq.setVisible(true);
			break;
		case 6:
			pernaDir.setVisible(true);
			finalizarJogo("Você perdeu! A palavra era: "+MetodosForca.getPalavraForca()[0]+"\nEscolha uma opção", "Tela da vergonha");
			break;
		default:
			break;
		}
	}

	private void determinarTamanho() {
		String palavra = field_1.getText();
		for (int i = 0; i < MetodosForca.getPalavraForca()[1].length(); i++) {
			palavra += "  *  ";
		}
		field_1.setText(palavra);
	}
}
