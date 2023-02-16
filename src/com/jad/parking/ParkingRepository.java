package com.jad.parking;

import com.jad.parking.entity.Vehicle;
import com.jad.shared.repository.IBillingRepository;
import com.jad.shared.repository.IParkingRepository;
import com.jad.shared.repository.IRepository;
import com.jad.shared.repository.IRepositoryVisitor;
import com.jad.shared.valueobject.Reference;

public class ParkingRepository implements IRepository<Vehicle>, IParkingRepository {
    @Override
    public Vehicle find(final Reference reference) {
        return null;
    }

    @Override
    public Vehicle find(final int id) {
        return null;
    }

    @Override
    public Vehicle create(final Vehicle entity) {
        return null;
    }

    @Override
    public Vehicle create() {
        return null;
    }

    @Override
    public Vehicle update(final Vehicle entity) {
        return null;
    }

    @Override
    public Vehicle delete(final Vehicle entity) {
        return null;
    }

    @Override
    public boolean save(final Vehicle entity) {
        return false;
    }

    @Override
    public int count() {
        return 0;
    }
}
