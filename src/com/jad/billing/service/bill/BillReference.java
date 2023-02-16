package com.jad.billing.service.bill;

import com.jad.billing.valueobject.Reference;

final class BillReference {
    private static Reference last = new Reference(1);

    public static Reference GetNew() {
        BillReference.last = new Reference(BillReference.last.getReference() + 1);
        return BillReference.last;
    }
}
