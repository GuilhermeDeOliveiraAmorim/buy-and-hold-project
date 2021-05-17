package view;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import model.Dividend;
import model.Ticker;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Ticker newJPM = new Ticker();
		
		newJPM.setIdTicker("JPM");
		newJPM.setSector("Financial Services");
		newJPM.setIndustry("Banks - Diversified");
		newJPM.setRating(11);
		newJPM.setCurrentPosition(0.6330);
		newJPM.setAveragePrice(154.50);
		
		Dividend dividendJPM = new Dividend();
		
		dividendJPM.setIdTicker(newJPM.getIdTicker());
		dividendJPM.setDividendAmount(0.55);
		dividendJPM.setEntryDate(sdf.parse("17/05/2021"));
		
		System.out.println(dividendJPM.toString());
		
	}

}