package com.jad.billing.service.customer;

import com.jad.billing.valueobject.Reference;

class CustomerReference {
    private static Reference last = new Reference(1);

    public static Reference GetNew() {
        CustomerReference.last = new Reference(CustomerReference.last.getReference() + 1);
        return CustomerReference.last;
    }
}
