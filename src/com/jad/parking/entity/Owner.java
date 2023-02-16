package com.jad.parking.entity;

import com.jad.parking.valueobject.Reference;

public class Owner {
    private final Reference reference;

    public Owner(final Reference reference) {
        this.reference = reference;
    }

    public Reference getReference() {
        return reference;
    }
}
