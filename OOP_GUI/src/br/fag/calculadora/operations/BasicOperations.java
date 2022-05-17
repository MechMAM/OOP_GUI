package br.fag.calculadora.operations;

public class BasicOperations {
	
	double num1;
	double num2;
	
	public double getNum1() {
		return num1;
	}
	public void setNum1(double num1) {
		this.num1 = num1;
	}
	public double getNum2() {
		return num2;
	}
	public void setNum2(double num2) {
		this.num2 = num2;
	}
	
	public double add() {
		return num1+num2;		
	}
	
	public double minus() {
		return num1-num2;
	}
	
	public double mult() {
		return num1*num2;
	}
	
	public double div() {
		return num1/num2;
	}

}
