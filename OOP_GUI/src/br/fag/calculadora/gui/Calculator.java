package br.fag.calculadora.gui;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import br.fag.calculadora.main.Main;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import java.awt.Font;

@SuppressWarnings("serial")
public class Calculator extends JFrame{
	private JTextField fieldInput1;
	
	private boolean hasInput1 = true;
	private boolean hasInput2 = true;
	private boolean hasOperator = true;
	private String value;
	private boolean hasDot = true;
	
	private String input1;
	private String input2;
	private String operator;
	
	private double result;
	
	
	public Calculator() {
		
		initComponents();
	}

	private void initComponents() {
		JPanel panelSouth = new JPanel();
		getContentPane().add(panelSouth, BorderLayout.SOUTH);
		panelSouth.setLayout(new BorderLayout(0, 0));
		
		JButton btnClear = new JButton("Limpar");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clickClear();
				
			}
		});
		panelSouth.add(btnClear, BorderLayout.NORTH);
		
		JPanel panelResults = new JPanel();
		getContentPane().add(panelResults, BorderLayout.NORTH);
		panelResults.setLayout(new BorderLayout(0, 0));
		
		JPanel panelInput = new JPanel();
		panelResults.add(panelInput, BorderLayout.NORTH);
		panelInput.setLayout(new BorderLayout(0, 0));
		
		JPanel panelInput1 = new JPanel();
		panelInput1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Visor", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panelInput.add(panelInput1);
		panelInput1.setLayout(new BorderLayout(0, 0));
		
		fieldInput1 = new JTextField();
		fieldInput1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		fieldInput1.setEditable(false);
		panelInput1.add(fieldInput1);
		fieldInput1.setColumns(10);
		
		JPanel panelWest = new JPanel();
		getContentPane().add(panelWest, BorderLayout.WEST);
		
		JPanel panelOperations = new JPanel();
		getContentPane().add(panelOperations, BorderLayout.EAST);
		panelOperations.setLayout(new VerticalFlowLayout());
		
		JButton btnAdd = new JButton("+");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clickPlus();
			}
		});
		panelOperations.add(btnAdd);
		
		JButton btnMinus = new JButton("-");
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clickMinus();
			}
		});
		panelOperations.add(btnMinus);
		
		JButton btnMult = new JButton("*");
		btnMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clickMult();
			}
		});
		panelOperations.add(btnMult);
		
		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clickDiv();
			}
		});
		panelOperations.add(btnDiv);
		
		JPanel panelNumbers = new JPanel();
		getContentPane().add(panelNumbers, BorderLayout.CENTER);
		panelNumbers.setLayout(new VerticalFlowLayout());
		
		JPanel panelNum789 = new JPanel();
		panelNumbers.add(panelNum789);
		panelNum789.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btn7 = new JButton("7");
		btn7.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				click7();				
			}
		});
		panelNum789.add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				click8();
			}
		});
		panelNum789.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				click9();
			}
		});
		panelNum789.add(btn9);
		
		JPanel panelNum456 = new JPanel();
		panelNumbers.add(panelNum456);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				click4();
			}
		});
		panelNum456.add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				click5();
			}
		});
		panelNum456.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				click6();
			}
		});
		panelNum456.add(btn6);
		
		JPanel panelNum123 = new JPanel();
		panelNumbers.add(panelNum123);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				click1();
			}			
		});
		panelNum123.add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				click2();
			}
		});
		panelNum123.add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				click3();
			}
		});
		panelNum123.add(btn3);
		
		JPanel panelNum0 = new JPanel();
		panelNumbers.add(panelNum0);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				click0();
			}
		});
		panelNum0.add(btn0);
		
		JButton btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clickDot();
			}
		});
		panelNum0.add(btnDot);
		
		JButton btnEnter = new JButton("=");
		btnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clickEnter();
			}

		});
		panelNum0.add(btnEnter);
		
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setSize(400, 300);
		setVisible(true);		
	}
	
	
	
	private void click1() {
		value = fieldInput1.getText();
		fieldInput1.setText(value+"1");		
	}
	
	private void click2() {
		value = fieldInput1.getText();
		fieldInput1.setText(value+"2");		
						
	}
	
	private void click3() {
		value = fieldInput1.getText();
		fieldInput1.setText(value+"3");			
	}
	
	private void click4() {
		value = fieldInput1.getText();
		fieldInput1.setText(value+"4");					
	}
	
	private void click5() {
		value = fieldInput1.getText();
		fieldInput1.setText(value+"5");		
	}
	
	private void click6() {
		value = fieldInput1.getText();
		fieldInput1.setText(value+"6");		
	}
	
	private void click7() {
		value = fieldInput1.getText();
		fieldInput1.setText(value+"7");		
	}
	
	private void click8() {
		value = fieldInput1.getText();
		fieldInput1.setText(value+"8");		
	}
	
	private void click9() {
		value = fieldInput1.getText();
		fieldInput1.setText(value+"9");		
	}
	
	private void click0() {
		value = fieldInput1.getText();
		fieldInput1.setText(value+"0");		
	}
	
	private void clickDot() {
		if (hasDot) {
			value = fieldInput1.getText();
			fieldInput1.setText(value+".");
			hasDot = false;
		}
	}
	
	private void clickEnter() {
		input2 = fieldInput1.getText();
		result = Main.operations(input1, input2, operator);
		fieldInput1.setText(" "+result);
		hasInput2 = false;				
	}
	
	private void clickPlus() {
		input1 = fieldInput1.getText();
		fieldInput1.setText("");
		operator = "+";
	}
	
	private void clickMinus() {
		input1 = fieldInput1.getText();
		fieldInput1.setText("");
		operator = "-";
	}
	
	private void clickMult() {
		input1 = fieldInput1.getText();
		fieldInput1.setText("");
		operator = "*";
	}
	
	private void clickDiv() {
		input1 = fieldInput1.getText();
		fieldInput1.setText("");
		operator = "/";
	}
	
	private void clickClear() {
		fieldInput1.setText("");
		hasDot = true;
		input1 = "";
		input2 = "";
		operator = "";
	}
	
	
	

}
