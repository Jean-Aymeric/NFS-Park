package com.jad.billing.valueobject;

public final class Amount {
    private final float amount;

    public Amount(final float amount) {
        this.amount = amount;
    }

    public float getAmount() {
        return amount;
    }
}
