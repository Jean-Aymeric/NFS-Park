package com.jad.billing.service.bill;

import com.jad.billing.entity.Bill;
import com.jad.billing.valueobject.Reference;

public class BillService {
    public static Bill find(Reference reference) {
        return BillFind.Find(reference);
    }

    public static Reference getNew() {
        return BillReference.GetNew();
    }

    public static String toPDF(final Bill bill) {
        return BillToPDF.Get(bill);
    }
}
