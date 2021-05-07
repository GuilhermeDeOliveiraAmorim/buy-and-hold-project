package view;

import java.util.ArrayList;
import java.util.List;

import model.Ticker;

public class Program {

	public static void main(String[] args) {
		
		List<Ticker> tickers = new ArrayList<Ticker>();

		Ticker newJPM = new Ticker();
		
		newJPM.setIdTicker("JPM");
		newJPM.setSector("Financial Services");
		newJPM.setIndustry("Banks - Diversified");
		newJPM.setRating(11);
		newJPM.setCurrentPosition(0.6330);
		newJPM.setAveragePrice(154.50);
		
		tickers.add(newJPM);

		Ticker newAMZN = new Ticker();
		
		newAMZN.setIdTicker("AMZN");
		newAMZN.setSector("Consumer Cyclical");
		newAMZN.setIndustry("Internet Retail");
		newAMZN.setRating(11);
		newAMZN.setCurrentPosition(0.02827000);
		newAMZN.setAveragePrice(3445.91);
		
		tickers.add(newAMZN);
		
		Ticker newAVGO = new Ticker();
		
		newAVGO.setIdTicker("AVGO");
		newAVGO.setSector("Healthcare");
		newAVGO.setIndustry("Healthcare Plans");
		newAVGO.setRating(11);
		newAVGO.setCurrentPosition(0.21520000);
		newAVGO.setAveragePrice(458.02);
		
		tickers.add(newAVGO);
		
		Ticker newMSFT = new Ticker();
		
		newMSFT.setIdTicker("MSFT");
		newMSFT.setSector("Technology");
		newMSFT.setIndustry("Software - Infrastructure");
		newMSFT.setRating(11);
		newMSFT.setCurrentPosition(0.38930000);
		newMSFT.setAveragePrice(252.31);
		
		tickers.add(newMSFT);
		
		Ticker newUNH = new Ticker();
		
		newUNH.setIdTicker("UNH");
		newUNH.setSector("Healthcare");
		newUNH.setIndustry("Healthcare Plans");
		newUNH.setRating(11);
		newUNH.setCurrentPosition(0.24500000);
		newUNH.setAveragePrice(402.61);
		
		tickers.add(newUNH);

		for (Ticker ticker : tickers) {
			System.out.println(ticker.toString());
		}
	}

}