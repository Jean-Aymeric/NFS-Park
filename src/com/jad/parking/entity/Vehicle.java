package com.jad.parking.entity;

import com.jad.parking.valueobject.Registration;
import com.jad.parking.valueobject.VehicleCategory;
import com.jad.parking.valueobject.VehicleKeys;
import com.jad.shared.repository.IBillingRepository;
import com.jad.shared.repository.IParkingRepository;
import com.jad.shared.repository.IRepositoryVisitor;

public class Vehicle implements IRepositoryVisitor {
    private VehicleCategory category;
    private Registration registration;
    private VehicleKeys keys;
    private Location location;
    private final Owner owner;

    public Vehicle(final VehicleCategory category, final Registration registration, final VehicleKeys keys, final Location location, final Owner owner) {
        this.category = category;
        this.registration = registration;
        this.keys = keys;
        this.location = location;
        this.owner = owner;
    }

    public Vehicle() {
        this(null, null, null, null, null);
    }

    public VehicleCategory getCategory() {
        return category;
    }

    public void setCategory(final VehicleCategory category) {
        this.category = category;
    }

    public Registration getRegistration() {
        return registration;
    }

    public void setRegistration(final Registration registration) {
        this.registration = registration;
    }

    public VehicleKeys getKeys() {
        return keys;
    }

    public void setKeys(final VehicleKeys keys) {
        this.keys = keys;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(final Location location) {
        this.location = location;
        if (this.location.getVehicle() != this) {
            this.location.setVehicle(this);
        }
    }

    public Owner getOwner() {
        return owner;
    }

    public void leave() {

    }

    @Override
    public void visit(final IBillingRepository visitor) {
        visitor.create(this.getOwner().getReference().getShared());
    }

    @Override
    public void visit(final IParkingRepository visitor) {
        // Nop
    }
}
