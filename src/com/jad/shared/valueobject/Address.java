package com.jad.shared.valueobject;

public final class Address {
    private final String address;
    private final String complement;
    private final String postalCode;
    private final String state;

    public Address(final String address, final String complement, final String postalCode, final String state) {
        this.address = address;
        this.complement = complement;
        this.postalCode = postalCode;
        this.state = state;
    }

    public String getAddress() {
        return address;
    }

    public String getComplement() {
        return complement;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getState() {
        return state;
    }
}
