package model;

import java.util.Date;

public class Trade {
	
	private Ticker ticker;
	private Double purchasePrice;
	private Double acquiredPosition;
	private Date datePurchase;
	private Double brokerageFee;
	
	public Trade(Ticker ticker, Double purchasePrice, Double acquiredPosition, Date date, Double brokerageFee) {
		this.ticker = ticker;
		this.purchasePrice = purchasePrice;
		this.acquiredPosition = acquiredPosition;
		this.datePurchase = date;
		this.brokerageFee = brokerageFee;
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
		return datePurchase;
	}
	
	public void setDate(Date date) {
		this.datePurchase = date;
	}

	public Double getBrokerageFee() {
		return brokerageFee;
	}

	public void setBrokerageFee(Double brokerageFee) {
		this.brokerageFee = brokerageFee;
	}

	@Override
	public String toString() {
		return "Trade ["
				+ "ticker=" + ticker.getTicker()
				+ ", purchasePrice=" + purchasePrice
				+ ", acquiredPosition=" + acquiredPosition
				+ ", date=" + datePurchase
				+ ", brokerageFee=" + brokerageFee
				+ "]";
	}

}