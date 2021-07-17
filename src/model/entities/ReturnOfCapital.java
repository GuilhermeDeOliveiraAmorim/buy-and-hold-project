package model.entities;

import java.io.Serializable;
import java.util.Date;

public class ReturnOfCapital implements Serializable {

	private static final long serialVersionUID = 1L;
	private Long id;
	private Date date;
	private String ticker;
	private Double value;
	
	public ReturnOfCapital() {

	}
	
	public ReturnOfCapital(Long id, Date date, String ticker, Double value) {
		super();
		this.id = id;
		this.date = date;
		this.ticker = ticker;
		this.value = value;
	}

	public Long getId() {
		return id;
	}

	public Date getDate() {
		return date;
	}

	public String getTicker() {
		return ticker;
	}

	public Double getValue() {
		return value;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public void setTicker(String ticker) {
		this.ticker = ticker;
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
		ReturnOfCapital other = (ReturnOfCapital) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ReturnOfCapital [id=" + id + ", date=" + date + ", ticker=" + ticker + ", value=" + value + "]";
	}
	
}