package com.jad.shared.repository;

public interface IRepositoryVisitor {
    void visit(IBillingRepository visitor);
    void visit(IParkingRepository visitor);
}
