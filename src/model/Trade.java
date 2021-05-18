package model;

import java.util.Date;

public class Trade extends Ticker {

	private Double purchasePrice;
	private Double acquiredPosition;
	private Date datePurchase;
	private Double brokerageFee;
		
	public Trade(String ticker, String sector, String industry, Integer rating, Double currentPosition,
			Double averagePrice, Double totalDividendsReceived, Double purchasePrice, Double acquiredPosition,
			Date datePurchase, Double brokerageFee) {
		super(ticker, sector, industry, rating, currentPosition, averagePrice, totalDividendsReceived);
		this.purchasePrice = purchasePrice;
		this.acquiredPosition = acquiredPosition;
		this.datePurchase = datePurchase;
		this.brokerageFee = brokerageFee;
	}

	public Trade() {
		
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

	public Date getDatePurchase() {
		return datePurchase;
	}

	public void setDatePurchase(Date datePurchase) {
		this.datePurchase = datePurchase;
	}

	public Double getBrokerageFee() {
		return brokerageFee;
	}

	public void setBrokerageFee(Double brokerageFee) {
		this.brokerageFee = brokerageFee;
	}

	@Override
	public String toString() {
		return "Trade [purchasePrice=" + purchasePrice + ", acquiredPosition=" + acquiredPosition + ", datePurchase="
				+ datePurchase + ", brokerageFee=" + brokerageFee + "]";
	}
	
}