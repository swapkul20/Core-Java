package com.techlabs.regionapp;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class RegionCountryTest {

	public static void main(String[] args) {
		List<Country> countries=Arrays.asList(new Country("IT","ITALY",1),new Country("UK","United Kingdom",1), new Country("CH","Switzerland",1),new Country("CA","CANADA",2),new Country("MX","MEXICO",2),new Country("IN","INDIA",3),new Country("JP","JAPAN",3), new Country("SG","Singapore",3),new Country("CH","China",3),new Country("ZW","Zimbabwe",4));
		List<Region> regions=Arrays.asList(new Region(1,"Europe"), new Region(2,"America"), new Region(3,"Asia"), new Region(4,"MiddleEast"));
		for(Country country:countries)
		{
			for(Region region:regions)
			     if(country.getRegionid()==region.getRegionid())
			    	 region.addCountryToRegion(country);
		}
		
			
		regions.stream().forEach(region->System.out.println(region.getRegionname()+region.getCountries()));
		regions.stream().forEach(region->System.out.println(region.getRegionname()+":"+region.getCountries().stream().count()));
		
	    countries.stream().forEach(country->System.out.println(country.getCountryid()+":"+country.getCountryname()));
	    Set<Entry<Integer, List<Country>>> entrySet = countries.stream().collect(Collectors.groupingBy(Country::getRegionid)).entrySet();
	    for(Map.Entry<Integer, List<Country>> entry:entrySet)
	    {
	    	System.out.println(entry.getKey());
	    	System.out.println(entry.getValue());
	    }
	}

}
