package com.jad.billing.valueobject;

public final class Registration {
    private final com.jad.shared.valueobject.Registration registration;

    public Registration(final String registration) {
        this.registration = new com.jad.shared.valueobject.Registration(registration);
    }

    public String getRegistration() {
        return registration.getRegistration();
    }
}
