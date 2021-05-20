package model.entities;

import java.util.Date;

public class Dividend extends Ticker {
	
	private static Double dividendTax = 0.3;
	
	private Date receiptDate;
	private Double dividendAmount;
	
	public Dividend(String ticker, String sector, String industry, Integer rating, Double currentPosition,
			Double averagePrice, Double totalDividendsReceived, Date receiptDate, Double dividendAmount) {
		super(ticker, sector, industry, rating, currentPosition, averagePrice, totalDividendsReceived);
		this.receiptDate = receiptDate;
		this.dividendAmount = dividendAmount;
	}

	public Dividend() {
		
	}

	public Date getReceiptDate() {
		return receiptDate;
	}

	public void setReceiptDate(Date receiptDate) {
		this.receiptDate = receiptDate;
	}

	public Double getDividendAmount() {
		return dividendAmount;
	}

	public void setDividendAmount(Double dividendAmount) {
		double cut = dividendAmount * dividendTax;
		this.dividendAmount = dividendAmount - cut;
	}

	@Override
	public String toString() {
		return "Dividend [receiptDate=" + receiptDate + ", dividendAmount=" + dividendAmount + "]";
	}
	
}