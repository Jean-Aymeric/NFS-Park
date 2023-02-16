package com.jad.billing.valueobject;

public final class Address {
    private final com.jad.shared.valueobject.Address address;
    private final String name;

    public Address(final String name, final String address, final String complement, final String postalCode, final String state) {
        this.address = new com.jad.shared.valueobject.Address(address, complement, postalCode, state);
        this.name = name;
    }

    public String getAddress() {
        return this.address.getAddress();
    }

    public String getComplement() {
        return this.address.getComplement();
    }

    public String getPostalCode() {
        return this.address.getPostalCode();
    }

    public String getState() {
        return this.address.getState();
    }

    public String getName() {
        return name;
    }
}
