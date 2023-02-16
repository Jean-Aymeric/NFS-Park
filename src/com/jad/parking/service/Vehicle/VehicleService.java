package com.jad.parking.service.Vehicle;

import com.jad.parking.entity.Location;
import com.jad.parking.entity.Owner;
import com.jad.parking.entity.Vehicle;
import com.jad.parking.valueobject.*;
import com.jad.shared.valueobject.TypeVehicleCategory;

public final class VehicleService {
    public static Vehicle create() {
        Vehicle vehicle = new Vehicle(new VehicleCategory(TypeVehicleCategory.Familly), new Registration("12345"),
                new VehicleKeys(1), new Location(new ParkingSpace("C", 12,15)),
                new Owner(new Reference(123)));
        return vehicle;
    }
}
