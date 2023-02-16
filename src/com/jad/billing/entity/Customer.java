package com.jad.billing.entity;

import com.jad.billing.service.customer.CustomerService;
import com.jad.billing.valueobject.*;

import java.util.ArrayList;

public class Customer {
    private Reference reference;
    private ArrayList<Bill> bills;

    public Customer() {
        this.reference = CustomerService.GetNew();
        this.bills = new ArrayList<>();
    }

    public Reference getReference() {
        return reference;
    }

    private void addBill(final Bill bill) {
        this.bills.add(bill);
    }

    public void addBill(final Address address, final Passagers passagers, final Place place, final Flight flightDeparture, final Flight flightArrival, final VehicleCategory category, final Brand brand, final Registration registration, final Date date, final Duration duration) {
        this.bills.add(new Bill(address, passagers, place, flightDeparture, flightArrival, new Vehicle(category, brand, registration), date, duration));
    }

    public Bill getLastBill() {
        if(this.bills.size() == 0) {
            return null;
        }
        return this.bills.get(this.bills.size()-1);
    }

    public String TransformLastBillToPDF() {
        return CustomerService.TransformLastBillToPDF(this);
    }

    public Amount getLastBillAmount() {
        return this.getLastBill().getAmount();
    }
}
