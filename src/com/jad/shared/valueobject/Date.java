package com.jad.shared.valueobject;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public final class Date {
    private final LocalDate date;

    public Date(String date) {
        this.date = LocalDate.parse(date);
    }

    public LocalDate getDate() {
        return date;
    }

    public String getStrDate() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return date.format(formatter);
    }
}
