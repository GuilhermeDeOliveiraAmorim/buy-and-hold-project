package model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Dividend {
	
	private static Double dividendTax = 0.3;
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private String idTicker;
	private Date entryDate;
	private Double dividendAmount;
	
	public Dividend(String idTicker, Date entryDate, Double dividendAmount) {
		this.idTicker = idTicker;
		this.entryDate = entryDate;
		this.dividendAmount = dividendAmount;
	}
	
	public Dividend() {
		
	}

	public static Double getDividendTax() {
		return dividendTax;
	}

	public static void setDividendTax(Double dividendTax) {
		Dividend.dividendTax = dividendTax;
	}

	public String getIdTicker() {
		return idTicker;
	}

	public void setIdTicker(String idTicker) {
		this.idTicker = idTicker;
	}

	public Date getEntryDate() {
		return entryDate;
	}

	public void setEntryDate(Date entryDate) {
		this.entryDate = entryDate;
	}

	public Double getDividendAmount() {
		return dividendAmount;
	}

	public void setDividendAmount(Double dividendAmount) {
		this.dividendAmount = dividendAmount;
	}

	@Override
	public String toString() {
		return "Dividend [idTicker=" + idTicker + ", entryDate=" + sdf.format(entryDate) + ", dividendAmount=" + dividendAmount
				+ "]";
	}
	
}