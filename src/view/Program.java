package view;

import java.io.IOException;
import java.text.ParseException;

import model.avenue.Util;

public class Program {

	public static void main(String[] args) throws ParseException, IOException {
		
		Util util = new Util();
		
		System.out.println(util.allTrades());
		
		System.out.println(util.allDividend());
		
		System.out.println(util.allReturnOfCapitals());
		
		System.out.println(util.allBrokerageFee());
		
	}

}