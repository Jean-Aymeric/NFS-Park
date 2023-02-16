package com.jad.billing.service.bill;

import com.jad.billing.entity.Bill;
import com.jad.billing.entity.Vehicle;
import com.jad.billing.valueobject.*;
import com.jad.shared.valueobject.TypeVehicleCategory;

class BillFind {
    public static Bill Find(final Reference reference) {
        return new Bill(new Address("DIET Jean-Aymeric", "115 rue des merles", "", "33620", "CEZAC"),
                new Passagers(4), new Place(1), new Flight("U24119"), new Flight("FR2230"),
                new Vehicle(new VehicleCategory(TypeVehicleCategory.Familly), new Brand("Renault Twingo Electrique"), new Registration("GC555XQ")),
                new Date("2023-02-02"), new Duration(5));
    }
}
