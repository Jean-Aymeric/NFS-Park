package com.jad.billing.service.customer;

import com.jad.billing.entity.Customer;
import com.jad.billing.service.bill.BillService;
import com.jad.billing.valueobject.Reference;

public class CustomerService {
    public static Customer Find(Reference reference) {
        return CustomerFind.Find(reference);
    }

    public static Reference GetNew() {
        return CustomerReference.GetNew();
    }

    public static String TransformLastBillToPDF(Customer customer) {
        return BillService.toPDF(customer.getLastBill());
    }
}
