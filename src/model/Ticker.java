package model;

public class Ticker {
	
	private String ticker;
	private String sector;
	private String industry;
	private Integer rating;
	private Double currentPosition;
	private Double averagePrice;
	private Dividend totalDividendsReceived;
	
	public Ticker(String ticker, String sector, String industry, Integer rating, Double currentPosition,
			Double averagePrice, Dividend totalDividendsReceived) {
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

	public void setCurrentPosition(Double currentPosition) {
		this.currentPosition = currentPosition;
	}

	public Double getAveragePrice() {
		return averagePrice;
	}

	public void setAveragePrice(Double averagePrice) {
		this.averagePrice = averagePrice;
	}

	public Dividend getTotalDividendsReceived() {
		return totalDividendsReceived;
	}

	public void setTotalDividendsReceived(Dividend totalDividendsReceived) {
		this.totalDividendsReceived = totalDividendsReceived;
	}
	
	@Override
	public String toString() {
		return "Ticker [ticker=" + ticker + ", sector=" + sector + ", industry=" + industry + ", rating=" + rating
				+ ", currentPosition=" + currentPosition + ", averagePrice=" + averagePrice
				+ ", totalDividendsReceived=" + totalDividendsReceived + "]";
	}

	public void addStock(Trade trade) {
		double totalPurchased = trade.getAcquiredPosition() * trade.getPurchasePrice();
		double totalInPortfolio = this.getCurrentPosition() * this.getAveragePrice();
		double totalCurrentPosition = this.getCurrentPosition() + trade.getAcquiredPosition();
		double newAveragePrice = (totalPurchased + totalInPortfolio) / (trade.getAcquiredPosition() + this.getCurrentPosition());
		
		this.currentPosition = totalCurrentPosition;
		this.averagePrice = newAveragePrice;
	}
	
	public void delStock(Trade trade) {
		double totalPurchased = trade.getAcquiredPosition() * trade.getPurchasePrice();
		double totalInPortfolio = this.getCurrentPosition() * this.getAveragePrice();
		double totalCurrentPosition = this.getCurrentPosition() + trade.getAcquiredPosition();
		double newAveragePrice = (totalPurchased + totalInPortfolio) / (trade.getAcquiredPosition() + this.getCurrentPosition());
		
		this.currentPosition = totalCurrentPosition;
		this.averagePrice = newAveragePrice;
	}
	
	public void addTotalDividendsReceived(Dividend dividend) {
		
	}
	
	public void delTotalDividendsReceived(Dividend dividend) {
		
	}
}