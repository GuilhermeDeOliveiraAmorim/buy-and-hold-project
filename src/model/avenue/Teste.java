package model.avenue;

import java.io.BufferedReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import model.entities.BrokerageFee;
import model.entities.Dividend;
import model.entities.ReturnOfCapital;
import model.entities.Trade;

public class Teste {
	
	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private AvenueData data = new AvenueData();
	
	public void writingDatabase() throws IOException, ParseException {
		
		BufferedReader br = data.getAvenueData();
		
		String dataLine = br.readLine();
        
        while ((dataLine = br.readLine()) != null) {
        	
        	if (splitDataLine(dataLine) != null) {
        		
        		print(isReturnOfCapital(dataLine));
        		
        	}
        	
        }
		
	}
	
	public void print(Object obj) {
		
		if (obj != null) {
			
			System.out.println(obj.toString());
			
		}
		
	}
	
	public ArrayList<String> splitDataLine(String dataLine) {
		
		if (dataLine.length() > 10) {
			
			String[] split = dataLine.split("	");
			
			ArrayList<String> splitList = new ArrayList<String>();
			
			for (String string : split) {
				
				splitList.add(string);
				
			}
			
			return splitList;
			
		} else {
			
			return null;
			
		}
		
	}
	
	public Dividend isDividend(String dataLine) throws ParseException {
		
		if (dataLine.contains("Dividendos") && !dataLine.contains("Reten") && !dataLine.contains("return") && !dataLine.contains("Estorno") && !dataLine.contains("CONVERSION")) {
						
			ArrayList<String> splitDataLine = splitDataLine(dataLine);
			
			Date date = sdf.parse(splitDataLine.get(1));
			String ticker = splitDataLine.get(2).split(" ")[1].replace(".", "");
			Double value = Double.parseDouble(splitDataLine.get(3).replace("U$ ", "").replace(",", "."));
			
			return new Dividend(null, date, ticker, value);
			
		} else {
			
			return null;
			
		}
		
	}
	
	public BrokerageFee isBrokerageFee(String dataLine) throws ParseException {
		
		if (dataLine.contains("Corretagem")) {
			
			ArrayList<String> splitDataLine = splitDataLine(dataLine);
			
			Date date = sdf.parse(splitDataLine.get(1));
			String ticker = splitDataLine.get(2).split(" ")[1];
			Double value = Double.parseDouble(splitDataLine.get(3).replace("U$ ", "").replace(",", ".").replace("-", ""));
			
			return new BrokerageFee(null, date, ticker, value);
			
		} else {
			
			return null;
			
		}
		
	}
	
	public ReturnOfCapital isReturnOfCapital(String dataLine) throws ParseException {
		
		if (dataLine.contains("Dividendos") && !dataLine.contains("Reten") && dataLine.contains("return") && !dataLine.contains("Estorno") && !dataLine.contains("CONVERSION")) {
			
			ArrayList<String> splitDataLine = splitDataLine(dataLine);
			
			Date date = sdf.parse(splitDataLine.get(1));
			String ticker = splitDataLine.get(2).split(" ")[1].replace(".", "");
			Double value = Double.parseDouble(splitDataLine.get(3).replace("U$ ", "").replace(",", "."));
			
			return new ReturnOfCapital(null, date, ticker, value);
			
		} else {
			
			return null;
			
		}
		
	}
	
	public Trade isTrade(String dataLine) throws ParseException {
		
		if (dataLine.contains("Compra de")) {
			
			ArrayList<String> splitDataLine = splitDataLine(dataLine);
			
			Date date = sdf.parse(splitDataLine.get(1));
			String ticker = splitDataLine.get(2).split(" ")[3];
			Double position = Double.parseDouble(splitDataLine.get(2).split(" ")[2]);
			Double price = Double.parseDouble(splitDataLine.get(2).split(" ")[6]);
			Double value = Double.parseDouble(splitDataLine.get(3).replace("U$ ", "").replace(",", ".").replace("-", ""));
			
			return new Trade(null, ticker, price, position, value, date, "BUY");
			
		} else if (dataLine.contains("Venda de"))  {
			
			ArrayList<String> splitDataLine = splitDataLine(dataLine);
			
			Date date = sdf.parse(splitDataLine.get(1));
			String ticker = splitDataLine.get(2).split(" ")[3];
			Double position = Double.parseDouble(splitDataLine.get(2).split(" ")[2]);
			Double price = Double.parseDouble(splitDataLine.get(2).split(" ")[6]);
			Double value = Double.parseDouble(splitDataLine.get(3).replace("U$ ", "").replace(",", ".").replace("-", ""));
			
			return new Trade(null, ticker, price, position, value, date, "SELL");
			
		} else {
			
			return null;
			
		}
		
	}

}
