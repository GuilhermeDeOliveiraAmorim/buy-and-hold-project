package view;

import java.io.IOException;
import java.text.ParseException;

import model.avenue.Teste;

public class Program {

	public static void main(String[] args) throws ParseException, IOException {
		
		Teste teste = new Teste();
		
		teste.writingDatabase();
		
	}

}