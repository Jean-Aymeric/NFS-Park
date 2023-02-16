package com.jad.shared.repository;

public interface IVisitedRepository {
    void accept(IRepositoryVisitor visitor);
}
