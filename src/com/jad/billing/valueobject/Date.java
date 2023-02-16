package com.jad.billing.valueobject;

public final class Date {
    private final com.jad.shared.valueobject.Date date;

    public Date(String date) {
        this.date = new com.jad.shared.valueobject.Date(date);
    }

    public String getDate() {
        return this.date.getStrDate();
    }
}
