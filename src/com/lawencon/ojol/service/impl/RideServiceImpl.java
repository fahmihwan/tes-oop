package com.lawencon.ojol.service.impl;

import com.lawencon.ojol.model.Driver;
import com.lawencon.ojol.service.RideService;

public class RideServiceImpl implements RideService {

	private static final int DEFAULT_PRICE = 15000;
	
	@Override
	public Driver findDriver() {
		final Driver john = new Driver();
		john.setFullName("John Doe");
		john.setHp("081111111");
		john.setPlatNo("B 123 ABC");
		return john;
	}

	@Override
	public double calculatePrice(String from, String to) {
		double result = DEFAULT_PRICE + (from.length() * to.length());
		return result;
	}

}
