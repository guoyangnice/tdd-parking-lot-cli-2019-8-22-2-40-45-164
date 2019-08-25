package com.oocl.cultivation;


public class ParkingBoy {

    private final ParkingLot parkingLot;
    private String lastErrorMessage;

    public ParkingBoy(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }

    //Í£³µÈ¡Æ±
    public ParkingTicket park(Car car) {
        // TODO: Please implement the method
    	if(this.parkingLot.getAvailableParkingPosition() < 1) {
    		lastErrorMessage = "The parking lot is full.";
    		return null;
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
