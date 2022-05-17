package br.fag.calculadora.main;

import br.fag.calculadora.gui.Calculator;
import br.fag.calculadora.operations.BasicOperations;

public class Main {
	
	public static void main(String[] args) {
		
		new Calculator();
		
	}
	
	public static double operations(String input1, String input2, String op) {
		
		BasicOperations inputs = new BasicOperations();
		inputs.setNum1(Double.parseDouble(input1));
		inputs.setNum2(Double.parseDouble(input2));
		double result = 0;
		switch (op) {
		case "+":
			result = inputs.add();			
			break;
		case "-":
			result = inputs.minus();			
			break;
		case "*":
			result = inputs.mult();		
			break;
		case "/":
			result = inputs.div();			
			break;
		default:
			break;
		}
		return result;
	}
	
	public void subtract() {
		
	}
	
	public void mult() {
		
	}
	
	public void div() {
		
	}

}
