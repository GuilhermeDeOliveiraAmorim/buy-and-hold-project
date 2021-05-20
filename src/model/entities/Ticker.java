package model.entities;

public class Ticker {
	
	private String ticker;
	private String sector;
	private String industry;
	private Integer rating;
	private Double currentPosition = 0.00;
	private Double averagePrice = 0.00;
	private Double totalDividendsReceived = 0.00;
	
	public Ticker(String ticker, String sector, String industry, Integer rating, Double currentPosition,
			Double averagePrice, Double totalDividendsReceived) {
		this.ticker = ticker;
		this.sector = sector;
		this.industry = industry;
		this.rating = rating;
		this.currentPosition = currentPosition;
		this.averagePrice = averagePrice;
		this.totalDividendsReceived = totalDividendsReceived;
	}

	public Ticker() {

	}
	
	public String getTicker() {
		return ticker;
	}

	public void setTicker(String ticker) {
		this.ticker = ticker;
	}

	public String getSector() {
		return sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}

	public String getIndustry() {
		return industry;
	}

	public void setIndustry(String industry) {
		this.industry = industry;
	}

	public Integer getRating() {
		return rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
	}

	public Double getCurrentPosition() {
		return currentPosition;
	}

	public Double getAveragePrice() {
		return averagePrice;
	}

	public Double getTotalDividendsReceived() {
		return totalDividendsReceived;
	}
	
	@Override
	public String toString() {
		return "Ticker [ticker=" + ticker + ", sector=" + sector + ", industry=" + industry + ", rating=" + rating
				+ ", currentPosition=" + currentPosition + ", averagePrice=" + averagePrice
				+ ", totalDividendsReceived=" + totalDividendsReceived + "]";
	}

	public void buyStock(Trade trade) {
		double oldPosition = this.getCurrentPosition();
		double oldAverage = this.getAveragePrice();
		double amountSpent = (oldPosition * oldAverage);
		
		double newPosition = trade.getAcquiredPosition();
		double newAverage = trade.getPurchasePrice();
		double newAmountSpent = newPosition * newAverage;
		
		double position = oldPosition + newPosition;
		double average = (amountSpent + newAmountSpent) / position;

		this.averagePrice = average;
		this.currentPosition = position;
	}
	
	public void sellStock(Trade trade) {
		double oldPosition = this.getCurrentPosition();
		double oldAverage = this.getAveragePrice();
		double amountSpent = oldPosition * oldAverage;
		
		double shortPosition = trade.getAcquiredPosition();
		double shortAverage = trade.getPurchasePrice();
		double shortAmountSold = shortPosition * shortAverage;
		
		double position = oldPosition - shortPosition;
		double average = (amountSpent - shortAmountSold) / position;
		
		this.averagePrice = average;
		this.currentPosition = position;
	}
	
	public void addDividend(Dividend dividend) {
		double oldDividends = this.getTotalDividendsReceived();
		double oldPosition = this.getCurrentPosition();
		
		double dividendAmount = dividend.getDividendAmount();
		double updateDividends = (oldPosition * dividendAmount) + oldDividends;
		
		this.totalDividendsReceived = updateDividends;
		this.averagePrice = ((oldPosition * this.averagePrice) - this.totalDividendsReceived)/ oldPosition;
	}
	
	public void delDividend(Dividend dividend) {
		
	}
	
}