package view;

import java.text.ParseException;

import model.Dividend;
import model.Ticker;
import model.Trade;

public class Program {

	public static void main(String[] args) throws ParseException {

		Ticker JPM = new Ticker();
		Trade trade = new Trade();
		Dividend dividend = new Dividend();
		
		JPM.setTicker("JPM");
		JPM.setSector("Financial Services");
		JPM.setIndustry("Banks - Diversified");
		JPM.setRating(11);
		
		System.out.println(JPM.toString());
		
		trade.setAcquiredPosition(10.00);
		trade.setPurchasePrice(100.00);
		
		JPM.buyStock(trade);
		
		System.out.println(JPM.toString());
		
		dividend.setDividendAmount(3.00);
		
		JPM.addDividend(dividend);
		
		System.out.println(JPM.toString());
		
		dividend.setDividendAmount(5.00);
		
		JPM.addDividend(dividend);
		
		System.out.println(JPM.toString());
		
		trade.setAcquiredPosition(10.00);
		trade.setPurchasePrice(100.00);
		
		JPM.buyStock(trade);
		
		System.out.println(JPM.toString());
		
		dividend.setDividendAmount(15.00);
		
		JPM.addDividend(dividend);
		
		System.out.println(JPM.toString());
		
		trade.setAcquiredPosition(50.00);
		trade.setPurchasePrice(200.00);
		
		JPM.buyStock(trade);
		
		System.out.println(JPM.toString());
		
	}

}