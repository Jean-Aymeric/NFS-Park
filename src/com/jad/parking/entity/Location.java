package com.jad.parking.entity;

import com.jad.parking.valueobject.ParkingSpace;

public class Location {
    private ParkingSpace parkingSpace;
    private Vehicle vehicle;

    public Location(final ParkingSpace parkingSpace) {
        this.parkingSpace = parkingSpace;
    }

    public ParkingSpace getParkingSpace() {
        return parkingSpace;
    }

    public void setParkingSpace(final ParkingSpace parkingSpace) {
        this.parkingSpace = parkingSpace;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(final Vehicle vehicle) {
        this.vehicle = vehicle;
        if (this.vehicle.getLocation() != this) {
            this.vehicle.setLocation(this);
        }
    }
}
