package com.jad.billing.valueobject;

public final class Flight {
    private final String number;

    public Flight(final String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }
}
