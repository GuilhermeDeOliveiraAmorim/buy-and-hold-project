package view;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import model.avenue.AvenueBuy;
import model.entities.Trade;

public class Program {

	public static void main(String[] args) throws ParseException, IOException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");

		AvenueBuy ab = new AvenueBuy();
		
		ArrayList<String[]> list = ab.getAvenueBuy();
		
		ArrayList<Trade> trades = new ArrayList<Trade>();
		
		for (String[] strings : list) {
			
			Trade trade = new Trade();
			
			trade.setDatePurchase(sdf.parse(strings[0]));
			trade.setTicker(strings[2]);
			trade.setAcquiredPosition(Double.parseDouble(strings[1]));
			trade.setPurchasePrice(Double.parseDouble(strings[3]));
			trade.setOperation(strings[4]);
			
			trades.add(trade);
		}
		
		for (Trade trade : trades) {
			System.out.println(trade.toString());
		}

	}
	
	public static void sellLine(String line) {
		
		String sell = "";
		
		String dateSell = "";
		
		if(line.length() > 10) {
			
			if(line.contains("Venda de")) {
				
				String[] splitLineBuy = line.split("	");
				
				String[] splitLineBuyInfo = splitLineBuy[2].split(" ");
				
				dateSell = splitLineBuy[1] + " " + splitLineBuy[0];
			
				sell = dateSell + " " + splitLineBuyInfo[2] + " " + splitLineBuyInfo[3] + " " + splitLineBuyInfo[6];
				
				System.out.println(sell);
				
			}
			
		}

	}

}