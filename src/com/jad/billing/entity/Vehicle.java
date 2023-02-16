package com.jad.billing.entity;

import com.jad.billing.valueobject.Brand;
import com.jad.billing.valueobject.Registration;
import com.jad.billing.valueobject.VehicleCategory;

public class Vehicle {
    private VehicleCategory category;
    private Brand brand;
    private Registration registration;

    public Vehicle(final VehicleCategory category, final Brand brand, final Registration registration) {
        this.category = category;
        this.brand = brand;
        this.registration = registration;
    }

    public Vehicle() {
        this(null, null, null);
    }

    public VehicleCategory getCategory() {
        return category;
    }

    public void setCategory(final VehicleCategory category) {
        this.category = category;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(final Brand brand) {
        this.brand = brand;
    }

    public Registration getRegistration() {
        return registration;
    }

    public void setRegistration(final Registration registration) {
        this.registration = registration;
    }
}
