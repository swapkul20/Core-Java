package com.techlabs.regionapp;

import java.util.ArrayList;
import java.util.List;

public class Region {
	private int regionid;
	private String regionname;
	private List<Country> countries;

	public Region(int regionid, String regionname) {
		super();
		this.regionid = regionid;
		this.regionname = regionname;
		this.countries = new ArrayList<Country>();
	}

	public int getRegionid() {
		return regionid;
	}

	public void setRegionid(int regionid) {
		this.regionid = regionid;
	}

	public String getRegionname() {
		return regionname;
	}

	public void setRegionname(String regionname) {
		this.regionname = regionname;
	}

	public List<Country> getCountries() {
		return countries;
	}

	public void setCountries(List<Country> countries) {
		this.countries = countries;
	}
	
	public void addCountryToRegion(Country country) {
		countries.add(country);
	}

	public void display() {
		System.out.println(countries);
	}

}
