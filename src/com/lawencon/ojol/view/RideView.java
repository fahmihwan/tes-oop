package com.lawencon.ojol.view;

import java.util.Scanner;

import com.lawencon.ojol.model.Driver;
import com.lawencon.ojol.service.RideService;

public class RideView {
	
	private final RideService rideService;
	
	public RideView(RideService rideService) {
		this.rideService = rideService;
	}

	void show() {
		System.out.println("===== Ride Uye =====");
		
		final Scanner scan = new Scanner(System.in);
		
		System.out.print("From :");
		final String optionFrom = scan.nextLine();
		
		System.out.print("To :");
		final String optionTo = scan.nextLine();
		
		final double totalPrice = rideService.calculatePrice(optionFrom, optionTo);
		final Driver driver = rideService.findDriver();
		
		System.out.println("===== Details =====");
		System.out.println("=== Driver ===");
		System.out.println("Nama : "+driver.getFullName());
		System.out.println("Plat No : "+driver.getPlatNo());
		System.out.println("Hp : "+driver.getHp());
		
		System.out.println("=== Price ===");
		System.out.println("Rp."+totalPrice);
		
		System.out.println("=== Location ===");
		System.out.println("From : "+optionFrom);
		System.out.println("To : "+optionTo);
	}
	
}
