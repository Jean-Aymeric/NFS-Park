package com.jad.shared.valueobject;

public enum TypeVehicleCategory {
    Familly("Berline, Citadine, Monospace"), Truck( "Camionette, Fourgons, Pick-Up, 4×4 etc.")
    ;
    private final String label;

    TypeVehicleCategory(final String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
