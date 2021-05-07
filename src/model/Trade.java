package model;

import java.util.Date;

public class Trade {
	
	private Ticker ticker;
	private Double purchasePrice;
	private Double acquiredPosition;
	private Date date;
	private Double tax;
	
	public Trade(Ticker ticker, Double purchasePrice, Double acquiredPosition, Date date, Double tax) {
		this.ticker = ticker;
		this.purchasePrice = purchasePrice;
		this.acquiredPosition = acquiredPosition;
		this.date = date;
		this.tax = tax;
	}
	
	public Trade() {
		
	}
	
	public Ticker getTicker() {
		return ticker;
	}
	
	public void setTicker(Ticker ticker) {
		this.ticker = ticker;
	}
	
	public Double getPurchasePrice() {
		return purchasePrice;
	}
	
	public void setPurchasePrice(Double purchasePrice) {
		this.purchasePrice = purchasePrice;
	}
	
	public Double getAcquiredPosition() {
		return acquiredPosition;
	}
	
	public void setAcquiredPosition(Double acquiredPosition) {
		this.acquiredPosition = acquiredPosition;
	}
	
	public Date getDate() {
		return date;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}

	public Double getTax() {
		return tax;
	}

	public void setTax(Double tax) {
		this.tax = tax;
	}

	@Override
	public String toString() {
		return "Trade ["
				+ "ticker=" + ticker.getIdTicker()
				+ ", purchasePrice=" + purchasePrice
				+ ", acquiredPosition=" + acquiredPosition
				+ ", date=" + date
				+ ", tax=" + tax
				+ "]";
	}

}