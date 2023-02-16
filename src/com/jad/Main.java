package com.jad;

import com.jad.billing.BillingRepository;
import com.jad.billing.entity.Customer;
import com.jad.billing.service.customer.CustomerService;
import com.jad.billing.valueobject.Reference;
import com.jad.parking.entity.Vehicle;
import com.jad.parking.service.Vehicle.VehicleService;

public class Main {

    public static void main(String[] args) {
        Customer jad = CustomerService.Find(new Reference(0));
        System.out.println("Dernier montant : " + jad.getLastBillAmount().getAmount());
        System.out.println(jad.TransformLastBillToPDF());

        Vehicle twingo = VehicleService.create();
        twingo.visit(new BillingRepository());
    }
}
