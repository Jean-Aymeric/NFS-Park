package com.jad.shared.repository;

import com.jad.shared.valueobject.Reference;

public interface IBillingRepository extends IVisitedRepository {
    boolean create(Reference reference);
}
