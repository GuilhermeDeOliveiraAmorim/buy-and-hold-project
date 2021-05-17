package view;

import java.text.ParseException;
import java.text.SimpleDateFormat;

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
		
		System.out.println(newJPM.toString());
		
	}

}