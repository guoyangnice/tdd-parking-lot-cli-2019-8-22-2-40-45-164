package com.oocl.cultivation.test;

import org.junit.jupiter.api.Test;

import com.oocl.cultivation.Car;
import com.oocl.cultivation.ParkingBoy;
import com.oocl.cultivation.ParkingLot;
import com.oocl.cultivation.ParkingTicket;

public class SmartParkingBoyFacts {
	@Test
	void should_parking_car_to_more_parkinglot() {
		ParkingLot parkingLot = new ParkingLot();
		ParkingBoy parkingBoy = new ParkingBoy(parkingLot);
        Car car = new Car();
        ParkingTicket wrongTicket = new ParkingTicket();
	}
}
