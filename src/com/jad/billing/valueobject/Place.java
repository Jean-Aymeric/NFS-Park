package com.jad.billing.valueobject;

public final class Place {
    private final int quantity;

    public Place(final int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }
}
