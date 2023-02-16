package com.jad.shared.repository;

import com.jad.shared.valueobject.Reference;

public interface IRepository<E> {
    E find(Reference reference);
    E find(int id);
    E create(E entity);
    E create();
    E update(E entity);
    E delete(E entity);
    boolean save(E entity);
    int count();
}
