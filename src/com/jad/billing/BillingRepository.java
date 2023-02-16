package com.jad.billing;

import com.jad.billing.entity.Customer;
import com.jad.billing.service.customer.CustomerService;
import com.jad.shared.repository.IBillingRepository;
import com.jad.shared.repository.IRepository;
import com.jad.shared.repository.IRepositoryVisitor;
import com.jad.shared.valueobject.Reference;

public final class BillingRepository implements IRepository<Customer>, IBillingRepository {
    @Override
    public Customer find(final Reference reference) {
        return CustomerService.Find(new com.jad.billing.valueobject.Reference(reference));
    }

    @Override
    public Customer find(final int id) {
        return CustomerService.Find(new com.jad.billing.valueobject.Reference(id));
    }

    @Override
    public Customer create(final Customer entity) {
        return null;
    }

    @Override
    public Customer create() {
        return null;
    }

    @Override
    public Customer update(final Customer entity) {
        return null;
    }

    @Override
    public Customer delete(final Customer entity) {
        return null;
    }

    @Override
    public boolean save(final Customer entity) {
        return false;
    }

    @Override
    public int count() {
        return 0;
    }

    @Override
    public void accept(final IRepositoryVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public boolean create(final com.jad.shared.valueobject.Reference reference) {
        System.out.println("Création d'une facture à partir de la référence " + reference.getReference());
        return true;
    }
}
