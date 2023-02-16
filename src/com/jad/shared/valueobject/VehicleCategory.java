package com.jad.shared.valueobject;

public final class VehicleCategory {
    private final TypeVehicleCategory category;

    public VehicleCategory(final TypeVehicleCategory category) {
        this.category = category;
    }

    public TypeVehicleCategory getCategory() {
        return category;
    }
}
