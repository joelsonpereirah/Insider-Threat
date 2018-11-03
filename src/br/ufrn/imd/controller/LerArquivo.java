package br.ufrn.imd.controller;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class LerArquivo {
	public LerArquivo() {}

	public ArrayList<String> leitura(String arquivo){
		String tmp;
		ArrayList<String> dados = new ArrayList<String> (); 
		
		try {
			BufferedReader leitor = new BufferedReader(new FileReader(arquivo));
			
			tmp = leitor.readLine();
			
			while((tmp = leitor.readLine()) != null) {
				dados.add(tmp);
			}
			
			leitor.close();
			
		}
		catch(FileNotFoundException erro) {
			erro.printStackTrace();
		}
		catch (IOException erro) {
	        erro.printStackTrace();
	    }

		return dados;
	}
}
