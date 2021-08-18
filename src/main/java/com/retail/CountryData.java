package com.retail;

public class CountryData {
	private String year;
	private String country;
	private String dataType;
	private String total;
	private String description;
	private String deaths;
	private String optional;
	
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getDataType() {
		return dataType;
	}
	public void setDataType(String dataType) {
		this.dataType = dataType;
	}
	public String getTotal() {
		return total;
	}
	public void setTotal(String total) {
		this.total = total;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDeaths() {
		return deaths;
	}
	public void setDeaths(String deaths) {
		this.deaths = deaths;
	}
	public String getOptional() {
		return optional;
	}
	public void setOptional(String optional) {
		this.optional = optional;
	}
	
	@Override
	public String toString() {
		return "CountryData [year=" + year + ", country=" + country + ", dataType=" + dataType + ", total=" + total
				+ ", description=" + description + ", deaths=" + deaths + ", optional=" + optional + "]";
	}
	
	
}
