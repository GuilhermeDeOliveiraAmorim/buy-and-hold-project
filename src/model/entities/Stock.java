package model.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class Stock implements Serializable {

	private static final long serialVersionUID = 1L;
	private Long id;
	private String name;
	private String ticker;
	private String type;
	private String sector;
	private String industry;
	private Integer rating;
	
	private Set<Dividend> dividends = new HashSet<Dividend>();
	private Set<BrokerageFee> brokerageFees = new HashSet<BrokerageFee>();
	private Set<Trade> trades = new HashSet<Trade>();
	private Set<ReturnOfCapital> returnOfCapital = new HashSet<ReturnOfCapital>();
	
	public Stock() {
		
	}
	
	public Stock(Long id, String name, String ticker, String type, String sector, String industry, Integer rating,
			Set<Dividend> dividends, Set<BrokerageFee> brokerageFees, Set<Trade> trades, Set<ReturnOfCapital> returnOfCapital) {
		super();
		this.id = id;
		this.name = name;
		this.ticker = ticker;
		this.type = type;
		this.sector = sector;
		this.industry = industry;
		this.rating = rating;
		this.dividends = dividends;
		this.brokerageFees = brokerageFees;
		this.trades = trades;
		this.returnOfCapital = returnOfCapital;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getTicker() {
		return ticker;
	}

	public String getType() {
		return type;
	}

	public String getSector() {
		return sector;
	}

	public String getIndustry() {
		return industry;
	}

	public Integer getRating() {
		return rating;
	}

	public Set<ReturnOfCapital> getReturnOfCapital() {
		return returnOfCapital;
	}

	public Set<Dividend> getDividends() {
		return dividends;
	}

	public Set<BrokerageFee> getBrokerageFees() {
		return brokerageFees;
	}

	public Set<Trade> getTrades() {
		return trades;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setTicker(String ticker) {
		this.ticker = ticker;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}

	public void setIndustry(String industry) {
		this.industry = industry;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Stock other = (Stock) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Stock [id=" + id + ", name=" + name + ", ticker=" + ticker + ", type=" + type + ", sector=" + sector
				+ ", industry=" + industry + ", rating=" + rating + ", dividends=" + dividends + ", brokerageFees="
				+ brokerageFees + ", trades=" + trades + ", returnOfCapital=" + returnOfCapital + "]";
	}
	
}