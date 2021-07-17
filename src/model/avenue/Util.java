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

/**
 * This is a Javadoc
 */
public class Util {

	/**
	 * This is a Javadoc
	 */
	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	/**
	 * This is a Javadoc
	 */
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

	/**
	 * This is a Javadoc
	 */
	public Dividend isDividend(String dataLine) throws ParseException {

		if (dataLine.contains("Dividendos") && !dataLine.contains("Reten") && !dataLine.contains("return")
				&& !dataLine.contains("Estorno") && !dataLine.contains("CONVERSION")) {

			ArrayList<String> splitDataLine = splitDataLine(dataLine);

			Date date = sdf.parse(splitDataLine.get(1));
			String ticker = splitDataLine.get(2).split(" ")[1].replace(".", "");
			Double value = Double.parseDouble(splitDataLine.get(3).replace("U$ ", "").replace(",", "."));

			return new Dividend(null, date, ticker, value);

		} else {

			return null;

		}

	}
	
	/**
	 * This is a Javadoc
	 */
	public ArrayList<Object> allDividend() throws IOException, ParseException {
		
		AvenueData data = new AvenueData();

		BufferedReader br = data.getAvenueData();

		String dataLine = br.readLine();
		
		ArrayList<Object> listObjects = new ArrayList<Object>();

		while ((dataLine = br.readLine()) != null) {
			
			if (isDividend(dataLine) != null) {
				
				listObjects.add(isDividend(dataLine));

			}

		}
		
		return listObjects;

	}

	/**
	 * This is a Javadoc
	 */
	public BrokerageFee isBrokerageFee(String dataLine) throws ParseException {

		if (dataLine.contains("Corretagem")) {

			ArrayList<String> splitDataLine = splitDataLine(dataLine);

			Date date = sdf.parse(splitDataLine.get(1));
			String ticker = splitDataLine.get(2).split(" ")[1];
			Double value = Double
					.parseDouble(splitDataLine.get(3).replace("U$ ", "").replace(",", ".").replace("-", ""));

			return new BrokerageFee(null, date, ticker, value);

		} else {

			return null;

		}

	}
	
	/**
	 * This is a Javadoc
	 */
	public ArrayList<Object> allBrokerageFee() throws IOException, ParseException {
		
		AvenueData data = new AvenueData();

		BufferedReader br = data.getAvenueData();

		String dataLine = br.readLine();
		
		ArrayList<Object> listObjects = new ArrayList<Object>();

		while ((dataLine = br.readLine()) != null) {
			
			if (isBrokerageFee(dataLine) != null) {
				
				listObjects.add(isBrokerageFee(dataLine));

			}

		}
		
		return listObjects;

	}

	/**
	 * This is a Javadoc
	 */
	public ReturnOfCapital isReturnOfCapital(String dataLine) throws ParseException {

		if (dataLine.contains("Dividendos") && !dataLine.contains("Reten") && dataLine.contains("return")
				&& !dataLine.contains("Estorno") && !dataLine.contains("CONVERSION")) {

			ArrayList<String> splitDataLine = splitDataLine(dataLine);

			Date date = sdf.parse(splitDataLine.get(1));
			String ticker = splitDataLine.get(2).split(" ")[1].replace(".", "");
			Double value = Double.parseDouble(splitDataLine.get(3).replace("U$ ", "").replace(",", "."));

			return new ReturnOfCapital(null, date, ticker, value);

		} else {

			return null;

		}

	}
	
	/**
	 * This is a Javadoc
	 */
	public ArrayList<Object> allReturnOfCapitals() throws IOException, ParseException {
		
		AvenueData data = new AvenueData();

		BufferedReader br = data.getAvenueData();

		String dataLine = br.readLine();
		
		ArrayList<Object> listObjects = new ArrayList<Object>();

		while ((dataLine = br.readLine()) != null) {
			
			if (isReturnOfCapital(dataLine) != null) {
				
				listObjects.add(isReturnOfCapital(dataLine));

			}

		}
		
		return listObjects;

	}

	/**
	 * The method searches in the txt line if there is the expression "Compra de" or
	 * if there is the expression "Venda de". If there is "Compra de", it returns an
	 * object of type Trade with "BUY" in the attribute operation. If there is
	 * "Venda de", it returns an object of type Trade with "SELL" in the attribute
	 * operation. If neither of the two options exists, it returns null.
	 * 
	 * @param String dataLine
	 * @return Trade
	 */
	public Trade isTrade(String dataLine) throws ParseException {

		if (dataLine.contains("Compra de")) {

			ArrayList<String> splitDataLine = splitDataLine(dataLine);

			Date date = sdf.parse(splitDataLine.get(1));
			String ticker = splitDataLine.get(2).split(" ")[3];
			Double position = Double.parseDouble(splitDataLine.get(2).split(" ")[2]);
			Double price = Double.parseDouble(splitDataLine.get(2).split(" ")[6]);
			Double value = Double
					.parseDouble(splitDataLine.get(3).replace("U$ ", "").replace(",", ".").replace("-", ""));

			return new Trade(null, ticker, price, position, value, date, "BUY");

		} else if (dataLine.contains("Venda de")) {

			ArrayList<String> splitDataLine = splitDataLine(dataLine);

			Date date = sdf.parse(splitDataLine.get(1));
			String ticker = splitDataLine.get(2).split(" ")[3];
			Double position = Double.parseDouble(splitDataLine.get(2).split(" ")[2]);
			Double price = Double.parseDouble(splitDataLine.get(2).split(" ")[6]);
			Double value = Double
					.parseDouble(splitDataLine.get(3).replace("U$ ", "").replace(",", ".").replace("-", ""));

			return new Trade(null, ticker, price, position, value, date, "SELL");

		} else {

			return null;

		}

	}
	
	/**
	 * This is a Javadoc
	 */
	public ArrayList<Object> allTrades() throws IOException, ParseException {
		
		AvenueData data = new AvenueData();

		BufferedReader br = data.getAvenueData();

		String dataLine = br.readLine();
		
		ArrayList<Object> listObjects = new ArrayList<Object>();

		while ((dataLine = br.readLine()) != null) {
			
			if (isTrade(dataLine) != null) {
				
				listObjects.add(isTrade(dataLine));

			}

		}
		
		return listObjects;

	}

}
