package com.jad.parking.valueobject;

import com.jad.shared.valueobject.TypeVehicleCategory;

public final class VehicleCategory {
    private final com.jad.shared.valueobject.VehicleCategory category;

    public VehicleCategory(final TypeVehicleCategory category) {
        this.category = new com.jad.shared.valueobject.VehicleCategory(category);
    }

    public TypeVehicleCategory getCategory() {
        return category.getCategory();
    }
}
