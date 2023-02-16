package com.jad.billing.service.bill;

import com.jad.billing.entity.Bill;

final class BillToPDF {
    public static String Get(Bill bill) {
        return bill.getDate().getDate() + " " + bill.getNum().getReference() + "\n"
                + bill.getAddress().getName() + "\n"
                + bill.getAddress().getAddress() + "\n"
                + bill.getAddress().getComplement() + "\n"
                + bill.getAddress().getPostalCode() + " " + bill.getAddress().getState() + "\n"
                + bill.getAmount().getAmount() + "€\n";
    }
}
