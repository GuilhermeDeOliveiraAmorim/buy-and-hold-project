package model.entities;

import java.io.Serializable;
import java.util.Date;

public class Trade implements Serializable {

	private static final long serialVersionUID = 1L;
	private Long id;
	private String ticker;
	private Double price;
	private Double position;
	private Double value;
	private Date date;
	private String operation;
	
	public Trade() {
		
	}
	
	public Trade(Long id, String ticker, Double price, Double position, Double value, Date date, String operation) {
		super();
		this.id = id;
		this.ticker = ticker;
		this.price = price;
		this.position = position;
		this.value = value;
		this.date = date;
		this.operation = operation;
	}

	public Long getId() {
		return id;
	}

	public String getTicker() {
		return ticker;
	}

	public Double getPrice() {
		return price;
	}

	public Double getPosition() {
		return position;
	}

	public Date getDate() {
		return date;
	}

	public String getOperation() {
		return operation;
	}
	
	public Double getValue() {
		return value;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setTicker(String ticker) {
		this.ticker = ticker;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public void setPosition(Double position) {
		this.position = position;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}
	
	public void setValue(Double value) {
		this.value = value;
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
		Trade other = (Trade) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Trade [id=" + id + ", ticker=" + ticker + ", price=" + price + ", position=" + position + ", value=" + value + ", date="
				+ date + ", operation=" + operation + "]";
	}
	
}