package com.techlabs.regionapp;

public class Country {
	private String countryid;
	private String countryname;
	private int regionid;
	public Country(String countryid, String countryname, int regionid) {
		super();
		this.countryid = countryid;
		this.countryname = countryname;
		this.regionid = regionid;
	}
	public String getCountryid() {
		return countryid;
	}
	public void setCountryid(String countryid) {
		this.countryid = countryid;
	}
	public String getCountryname() {
		return countryname;
	}
	public void setCountryname(String countryname) {
		this.countryname = countryname;
	}
	public int getRegionid() {
		return regionid;
	}
	public void setRegionid(int regionid) {
		this.regionid = regionid;
	}
	@Override
	public String toString() {
		return "[countryid=" + countryid + ", countryname=" + countryname + ", regionid=" + regionid + "]";
	}
	
	

}
