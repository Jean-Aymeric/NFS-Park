package com.jad.billing.service.customer;

import com.jad.billing.entity.Customer;
import com.jad.billing.valueobject.*;
import com.jad.shared.valueobject.TypeVehicleCategory;

class CustomerFind {
    public static Customer Find(final Reference reference) {
        Customer customer = new Customer();
        customer.addBill(new Address("DIET Jean-Aymeric", "115 rue des merles", "", "33620", "CEZAC"),
                new Passagers(4), new Place(1), new Flight("U24119"), new Flight("FR2230"),
                new VehicleCategory(TypeVehicleCategory.Familly), new Brand("Renault Twingo Electrique"), new Registration("GC555XQ"),
                new Date("2023-02-02"), new Duration(5));
        return customer;
    }
}
