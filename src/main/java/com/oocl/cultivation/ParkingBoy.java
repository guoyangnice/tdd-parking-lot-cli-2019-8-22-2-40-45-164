package com.oocl.cultivation;

import java.util.ArrayList;
import java.util.List;

public class ParkingBoy {

    private ParkingLot parkingLot = new ParkingLot();
    private List<ParkingLot> parkingLots;
    
    private String lastErrorMessage;

    public ParkingBoy(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }

    public ParkingBoy(List<ParkingLot> parkingLots) {
		this.parkingLots = parkingLots;
	}

	//Í£³µÈ¡Æ±
    public ParkingTicket park(Car car) {
        // TODO: Please implement the method
    	if(this.parkingLot.getAvailableParkingPosition() < 1) {
    		lastErrorMessage = "The parking lot is full.";
    		return null;
    	}
    	//story3
    	for(int i = 0 ; i< parkingLots.size();i++) {
//    		if(parkingLots.get(i).getAvailableParkingPosition() < 1) {
//    			lastErrorMessage = "The parking lot is full.";
//    			return null;
//    		}
    		
    		if(parkingLots.get(i) .getAvailableParkingPosition() < 1) {
    			lastErrorMessage = "The " + i + "parking lot is full,will park car in " + (i+1) + "parking lot" ;
    		}
    		ParkingTicket parkingTicket = parkingLots.get(i+1).park(car);
    		if(parkingTicket != null) {
    			lastErrorMessage = null;
    		}
    		return parkingTicket;
    	}
    	
    	ParkingTicket parkingTicket = parkingLot.park(car);
    	if(parkingTicket != null) {
    		lastErrorMessage = null;
    	}
    	return parkingTicket;
    }

    public Car fetch(ParkingTicket ticket) {
        // TODO: Please implement the method
    	if(ticket == null) {
    		lastErrorMessage = "Please provide your parking ticket.";
    		return null;
    	}
    	
    	Car car = parkingLot.fetch(ticket);
    	if(car == null) {
    		lastErrorMessage = "Unrecognized parking ticket.";
    	}
    	return car;
    }

    public String getLastErrorMessage() {
        return lastErrorMessage;
    }
}
