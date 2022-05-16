package br.fag.tela;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Color;

public class Tela extends JFrame{

	private JTextField textFieldNome;
	private JTextField textFieldEndereco;
	private JLabel lblNome;
	private JLabel lblEndereco;
	private JTextField textFieldCodigo;
	private JTextField textFieldDescricao;
	private JTextField textFieldIPI;

	public Tela() {
		setTitle("Meu primeiro programa com tela");
		initComponents();
	}

	private void initComponents() {
		getContentPane().setLayout(new BorderLayout(0, 0));
		JPanel panelNorte = new JPanel();
		getContentPane().add(panelNorte, BorderLayout.NORTH);
		panelNorte.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		lblNome = new JLabel("Nome");
		panelNorte.add(lblNome);

		textFieldNome = new JTextField();
		textFieldNome.setText("Elenilton ");
		panelNorte.add(textFieldNome);
		textFieldNome.setColumns(10);

		lblEndereco = new JLabel("Endere\u00e7o");
		panelNorte.add(lblEndereco);

		textFieldEndereco = new JTextField();
		panelNorte.add(textFieldEndereco);
		textFieldEndereco.setColumns(10);

		JLabel lblOutro = new JLabel("Outro label");
		panelNorte.add(lblOutro);

		JPanel panelSul = new JPanel();
		getContentPane().add(panelSul, BorderLayout.SOUTH);

		JButton btnOk = new JButton("Ok");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clicarOK();
			}
		});
		panelSul.add(btnOk);

		JButton btnNewButton = new JButton("Cancelar");
		panelSul.add(btnNewButton);

		JButton btnLimpar = new JButton("Limpar");
		panelSul.add(btnLimpar);

		JPanel panelOeste = new JPanel();
		getContentPane().add(panelOeste, BorderLayout.WEST);

		JPanel panelLeste = new JPanel();
		getContentPane().add(panelLeste, BorderLayout.EAST);

		JPanel panelCentro = new JPanel();
		getContentPane().add(panelCentro);
		panelCentro.setLayout(new VerticalFlowLayout());

		JPanel panelCodigo = new JPanel();
		panelCodigo.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "C\u00F3digo", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panelCentro.add(panelCodigo);
		panelCodigo.setLayout(new BorderLayout(0, 0));

		textFieldCodigo = new JTextField();
		panelCodigo.add(textFieldCodigo, BorderLayout.CENTER);
		textFieldCodigo.setColumns(10);

		JPanel panelDescricao = new JPanel();
		panelDescricao.setBorder(new TitledBorder(null, "Descri\u00E7\u00E3o", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelCentro.add(panelDescricao);
		panelDescricao.setLayout(new BorderLayout(0, 0));

		textFieldDescricao = new JTextField();
		panelDescricao.add(textFieldDescricao);
		textFieldDescricao.setColumns(10);

		JPanel panelIPIExterno = new JPanel();
		panelCentro.add(panelIPIExterno);
		panelIPIExterno.setLayout(new BorderLayout(0, 0));

		JPanel panelIPI = new JPanel();
		panelIPI.setBorder(new TitledBorder(null, "% IPI", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelIPIExterno.add(panelIPI, BorderLayout.WEST);
		panelIPI.setLayout(new BorderLayout(0, 0));

		textFieldIPI = new JTextField();
		panelIPI.add(textFieldIPI, BorderLayout.WEST);
		textFieldIPI.setColumns(10);

		JPanel panelICMS = new JPanel();
		panelCentro.add(panelICMS);

		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
//		setLocationRelativeTo(null);
		setSize(800, 600);
		setVisible(true);

	}

	private void clicarOK() {
		JOptionPane.showMessageDialog(null, "Voc� clicou no bot�o ok");
	}

	public static void main(String[] args) {
		new Tela();
	}
}
