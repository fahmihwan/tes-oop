package com.lawencon.ojol.service;

import com.lawencon.ojol.model.Driver;

public interface RideService {

	Driver findDriver();

	double calculatePrice(String from, String to);
}
