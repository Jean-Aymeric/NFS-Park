package com.jad.billing.valueobject;

public final class Reference {
    private final com.jad.shared.valueobject.Reference reference;

    public Reference(final int reference) {
        this(new com.jad.shared.valueobject.Reference(reference));
    }

    public Reference(final com.jad.shared.valueobject.Reference reference) {
        this.reference = reference;
    }

    public int getReference() {
        return reference.getReference();
    }
}
