package br.fag.jogoForca.main;

import java.util.ArrayList;

import br.fag.jogoForca.dados.ManipularPlanilha;
import br.fag.jogoForca.telas.TelaPrincipal;

public class Forca {
	
	private static ArrayList<Integer> palavrasSorteadas = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		
		ManipularPlanilha.lerPlanilha();
		new TelaPrincipal();
		
	}
	
	public static ArrayList<Integer> getPalavrasSorteadas() {
		return palavrasSorteadas;
	}
	
	public static void setPalavrasSorteadas(ArrayList<Integer> palavrasSorteadas) {
		Forca.palavrasSorteadas = palavrasSorteadas;
	}
	

}
