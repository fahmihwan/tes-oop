package com.lawencon.ojol.view;

import java.util.Scanner;

import com.lawencon.ojol.service.RideService;
import com.lawencon.ojol.service.impl.RideServiceImpl;

public class MainView {

	public void show() {
		System.out.println("===== Ojol Uye =====");
		System.out.println("1. Ride");
		System.out.println("2. Send");
		System.out.println("3. Food");
		System.out.print("Choose ? ");

		final Scanner scan = new Scanner(System.in);
		final byte option = scan.nextByte();
		if (option == 1) {
			final RideService rideService = 
					new RideServiceImpl();
			final RideView rideView = new RideView(rideService);
			rideView.show();
		}
		
		show();
	}
}
