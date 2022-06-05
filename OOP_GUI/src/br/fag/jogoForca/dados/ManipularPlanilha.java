package br.fag.jogoForca.dados;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ManipularPlanilha {
	private static String dados[][] = new String[150][3];

	public static void lerPlanilha() {
		try {
			Workbook workbook = Workbook.getWorkbook(new File("./OOP_GUI/src/br/fag/jogoForca/dados/palavras.xls"));
			Sheet sheet = workbook.getSheet(0);

			File arquivo = new File("./OOP_GUI/src/br/fag/jogoForca/dados/palavras.xls");
			FileReader leitura = new FileReader(arquivo);;
			BufferedReader ler = new BufferedReader(leitura);

			for (int linha = 0; linha < dados.length; linha++) {
				for (int coluna = 0; coluna < dados[linha].length; coluna++) {
					Cell celula = sheet.getCell((coluna), (linha));
					String valor = celula.getContents();
					dados[linha][coluna] = valor;
				}
			}
			workbook.close();
			ler.close();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (BiffException e) {
			e.printStackTrace();
		}	
	}
	
	public static String[][] getDados() {
		return dados;
	}

	public static void setDados(String[][] dados) {
		ManipularPlanilha.dados = dados;
	}

}
