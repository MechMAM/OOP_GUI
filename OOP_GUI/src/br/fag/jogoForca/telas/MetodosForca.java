package br.fag.jogoForca.telas;

import java.util.Random;

import javax.swing.JLabel;
import javax.swing.JTextField;

import br.fag.jogoForca.dados.ManipularPlanilha;
import br.fag.jogoForca.main.Forca;

public class MetodosForca {
	
	private static String[] palavraForca = new String[3];
	private static int contadorErros;
	private static Random randomizar = new Random();
	
	public static int getContadorErros() {
		return contadorErros;
	}
	public static void setContadorErros(int contadorErros) {
		MetodosForca.contadorErros = contadorErros;
	}	
	public static String[] getPalavraForca() {
		return palavraForca;
	}
	public static void setPalavraForca(String[] palavraForca) {
		MetodosForca.palavraForca = palavraForca;
	}
	
	public static int atribuirLetra(int i, char letra, JTextField campo) {
		StringBuilder palavra = new StringBuilder(campo.getText());
		int contadorPosicao = 0;
		int letrasFaltam = 0;
		boolean alterado = false;
		for (int j = 0; j < palavra.length(); j++) {
			if (palavra.charAt(j) != ' ') {
				contadorPosicao++;
			}
			if (contadorPosicao - 1 == (i) && !alterado) {
				palavra.setCharAt(j, letra);
				alterado = true;
			}
		}
		for (int j = 0; j < palavra.length(); j++) {
			if (palavra.charAt(j) == '*') {
				letrasFaltam++;
			}
		}
		campo.setText(palavra.toString());
		return letrasFaltam;
	}
	
	public static void atribuirPalavra() {
		contadorErros=0;
		int linha = randomizar.nextInt(190);
		while (Forca.getPalavrasSorteadas().contains(linha) && linha == 0) {
			linha = randomizar.nextInt(190);
		}
		Forca.getPalavrasSorteadas().add(linha);
		
		for (int i = 0; i < palavraForca.length; i++) {
			palavraForca[i] = ManipularPlanilha.getDados()[linha][i];			
		}		
	}
	
	public static void exibirDica(JLabel dica) {
		dica.setText("Dica: "+palavraForca[2]);
		dica.setVisible(true);		
	}
}