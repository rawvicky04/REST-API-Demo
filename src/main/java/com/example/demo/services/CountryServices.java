package com.example.demo.services;

import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Component;

import java.util.ArrayList;

import com.example.demo.beans.Country;

@Component
public class CountryServices {
	
	HashMap<Integer,Country> map;
	
	public CountryServices(){
		map = new HashMap<Integer, Country>();
		
		Country country1 = new Country(1, "India", "Delhi");
		Country country2 = new Country(2, "USA", "Washington");
		Country country3 = new Country(3, "Australia", "Sydney");

		map.put(1, country1);
		map.put(2, country2);
		map.put(3, country3);

	}
	
	
	public List<Country> getAllCountry() {
		
		List<Country> list = new ArrayList<Country>(map.values());
		return list;
	}
	
	public Country getCountryByID(int id) {
		return map.get(id);
	}
	
	public Country getCountryByName(String name) {
		for(Integer i: map.keySet()) {
			if(map.get(i).getName().equals(name)) {
				return map.get(i);
			}
		}
		return null;
	}
	
	public Country addCountry(Country country) {
		country.setId(getId());
		map.put(getId(),country );
		return country;
	}
	
	public int getId() {
		int max = 0;
		for(int i : map.keySet()) {
			if(i > max) {
				max = i;
			}
		}
		return max+1;
	}
	
	public Country updateCountry(Country country) {
		int id = 0;
		for(Integer i : map.keySet()) {
			if(map.get(i).getName().equals(country.getName())) {
				id = i;
			}
		}
		country.setId(id);
		map.put(id, country);
		return country;
	}
	
	public String deleteCountry(int id) {
		map.remove(id);
		return id + " has been removed.";
	}

}
