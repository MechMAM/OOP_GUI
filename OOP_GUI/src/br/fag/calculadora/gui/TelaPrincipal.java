package br.fag.calculadora.gui;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class TelaPrincipal extends JFrame{
	private JTextField textField;
	private JTextField fieldInput1;
	private JTextField fieldOperator;
	private JTextField fieldInput2;
	
	
	public TelaPrincipal() {
		
		initComponents();
	}

	private void initComponents() {
		JPanel panelNorth = new JPanel();
		getContentPane().add(panelNorth, BorderLayout.NORTH);
		
		JPanel panelResults = new JPanel();
		getContentPane().add(panelResults, BorderLayout.NORTH);
		panelResults.setLayout(new BorderLayout(0, 0));
		
		JPanel panelInput = new JPanel();
		panelResults.add(panelInput, BorderLayout.NORTH);
		
		JPanel panelInput1 = new JPanel();
		panelInput1.setBorder(new TitledBorder(null, "Num 1", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelInput.add(panelInput1);
		
		fieldInput1 = new JTextField();
		panelInput1.add(fieldInput1);
		fieldInput1.setColumns(10);
		
		JPanel panelOperator = new JPanel();
		panelOperator.setBorder(new TitledBorder(null, "Opera\u00E7\u00E3o", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelInput.add(panelOperator);
		
		fieldOperator = new JTextField();
		panelOperator.add(fieldOperator);
		fieldOperator.setColumns(10);
		
		JPanel panelInput2 = new JPanel();
		panelInput2.setBorder(new TitledBorder(null, "Num 2", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelInput.add(panelInput2);
		
		fieldInput2 = new JTextField();
		panelInput2.add(fieldInput2);
		fieldInput2.setColumns(10);
		
		JPanel panelResult = new JPanel();
		panelResult.setBorder(new TitledBorder(null, "Resultado", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelResults.add(panelResult, BorderLayout.CENTER);
		panelResult.setLayout(new BorderLayout(0, 0));
		
		textField = new JTextField();
		panelResult.add(textField, BorderLayout.CENTER);
		textField.setColumns(10);
		
		JPanel panelWest = new JPanel();
		getContentPane().add(panelWest, BorderLayout.WEST);
		
		JPanel panelOperations = new JPanel();
		getContentPane().add(panelOperations, BorderLayout.EAST);
		panelOperations.setLayout(new VerticalFlowLayout());
		
		JButton btnAdd = new JButton("+");
		panelOperations.add(btnAdd);
		
		JButton btnMinus = new JButton("-");
		panelOperations.add(btnMinus);
		
		JButton btnMult = new JButton("*");
		panelOperations.add(btnMult);
		
		JButton btnDiv = new JButton("/");
		panelOperations.add(btnDiv);
		
		JPanel panelNumbers = new JPanel();
		getContentPane().add(panelNumbers, BorderLayout.CENTER);
		panelNumbers.setLayout(new VerticalFlowLayout());
		
		JPanel panelNum789 = new JPanel();
		panelNumbers.add(panelNum789);
		panelNum789.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btn7 = new JButton("7");
		panelNum789.add(btn7);
		
		JButton btn8 = new JButton("8");
		panelNum789.add(btn8);
		
		JButton btn9 = new JButton("9");
		panelNum789.add(btn9);
		
		JPanel panelNum456 = new JPanel();
		panelNumbers.add(panelNum456);
		
		JButton btn4 = new JButton("4");
		panelNum456.add(btn4);
		
		JButton btn5 = new JButton("5");
		panelNum456.add(btn5);
		
		JButton btn6 = new JButton("6");
		panelNum456.add(btn6);
		
		JPanel panelNum123 = new JPanel();
		panelNumbers.add(panelNum123);
		
		JButton btn1 = new JButton("1");
		panelNum123.add(btn1);
		
		JButton btn2 = new JButton("2");
		panelNum123.add(btn2);
		
		JButton btn3 = new JButton("3");
		panelNum123.add(btn3);
		
		JPanel panelNum0 = new JPanel();
		panelNumbers.add(panelNum0);
		
		JButton btn0 = new JButton("0");
		panelNum0.add(btn0);
		
		JButton btnDot = new JButton(".");
		panelNum0.add(btnDot);
		
		JButton btnEnter = new JButton("Enter");
		panelNum0.add(btnEnter);
	}
	
	

}
