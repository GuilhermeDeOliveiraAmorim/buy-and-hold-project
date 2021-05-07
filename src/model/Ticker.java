package model;

public class Ticker {
	
	private String idTicker;
	private String sector;
	private String industry;
	private Integer rating;
	private Double currentPosition;
	private Double averagePrice;
	
	public Ticker(String idTicker, String sector, String industry, Integer rating, Double currentPosition,
			Double averagePrice) {
		this.idTicker = idTicker;
		this.sector = sector;
		this.industry = industry;
		this.rating = rating;
		this.currentPosition = currentPosition;
		this.averagePrice = averagePrice;
	}
	
	public Ticker() {

	}

	public String getIdTicker() {
		return idTicker;
	}

	public void setIdTicker(String idTicker) {
		this.idTicker = idTicker;
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

	@Override
	public String toString() {
		return "Ticker [idTicker=" + idTicker + ", sector=" + sector + ", industry=" + industry + ", rating=" + rating
				+ ", currentPosition=" + currentPosition + ", averagePrice=" + averagePrice + "]";
	}
	
	public void updateAveragePrice(Trade newTrade) {
		double totalPurchased = newTrade.getAcquiredPosition() * newTrade.getPurchasePrice();
		double totalInPortfolio = this.getCurrentPosition() * this.getAveragePrice();
		double totalCurrentPosition = this.getCurrentPosition() + newTrade.getAcquiredPosition();
		double newAveragePrice = (totalPurchased + totalInPortfolio) / (newTrade.getAcquiredPosition() + this.getCurrentPosition());
		
		this.setCurrentPosition(totalCurrentPosition);
		this.setAveragePrice(newAveragePrice);
	}
	
}