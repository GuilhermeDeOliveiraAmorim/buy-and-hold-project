package model.avenue;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

public class AvenueBuy {

	public AvenueBuy() {

	}

	public ArrayList<String[]> getAvenueBuy() throws UnsupportedEncodingException, FileNotFoundException {
		
		AvenueData ad = new AvenueData();
		
		BufferedReader br = ad.getAvenueData();
		
		ArrayList<String[]> buyLine = new ArrayList<String[]>();
		
		String[] arraySplitLine;
		
		try {
			
			String line = br.readLine();
			
			while(line != null) {
				
				arraySplitLine = splitLine(line);
				
				if(arraySplitLine != null) {
					
					buyLine.add(arraySplitLine);
					
				}
				
				line = br.readLine();
				
			}

		} catch(IOException e) {

			System.out.println(e);

		} finally {

			try {

				if(br != null) {
					
					br.close();
					
				}

			} catch(IOException e) {

				System.out.println(e);

			}

		}
		
		return buyLine;
	}
	
	public String[] splitLine(String line) {
		
		if((line.length() > 10) && (line.contains("Compra de"))) {
				
			String[] splitLineBuy = line.split("	");
			
			String[] splitLineBuyInfo = splitLineBuy[2].split(" ");
			
			String dateBuy = splitLineBuy[1] + " " + splitLineBuy[0];
			
			String[] aux = {dateBuy, splitLineBuyInfo[2], splitLineBuyInfo[3], splitLineBuyInfo[6], "buy"};
			
			return aux;
			
		} else {
			
			return null;
			
		}
		
	}
	
}