package model.entities;

import java.util.Date;

public class Trade extends Ticker {

	private Double price;
	private Double position;
	private Date date;
	private Double brokerageFee;
	private String operation;

	public Trade(String ticker, String sector, String industry, Integer rating, Double currentPosition,
			Double averagePrice, Double totalDividendsReceived, Double purchasePrice, Double acquiredPosition,
			Date datePurchase, Double brokerageFee, String operation) {
		super(ticker, sector, industry, rating, currentPosition, averagePrice, totalDividendsReceived);
		this.price = purchasePrice;
		this.position = acquiredPosition;
		this.date = datePurchase;
		this.brokerageFee = brokerageFee;
		this.operation = operation;
	}

	public Trade() {
		
	}
	
	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	public Double getPurchasePrice() {
		return price;
	}

	public void setPurchasePrice(Double purchasePrice) {
		this.price = purchasePrice;
	}

	public Double getAcquiredPosition() {
		return position;
	}

	public void setAcquiredPosition(Double acquiredPosition) {
		this.position = acquiredPosition;
	}

	public Date getDatePurchase() {
		return date;
	}

	public void setDatePurchase(Date datePurchase) {
		this.date = datePurchase;
	}

	public Double getBrokerageFee() {
		return brokerageFee;
	}

	public void setBrokerageFee(Double brokerageFee) {
		this.brokerageFee = brokerageFee;
	}

	@Override
	public String toString() {
		return "Trade [operation=" + operation + ", ticker=" + getTicker() + ", price=" + price + ", position=" + position + ", date="
				+ date + ", brokerageFee=" + brokerageFee + "]";
	}
	
}