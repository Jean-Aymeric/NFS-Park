package com.jad.billing.entity;

import com.jad.billing.service.bill.BillService;
import com.jad.billing.valueobject.*;
import com.jad.shared.valueobject.TypeVehicleCategory;

public class Bill {
    private final Reference num;
    private Address address;
    private Amount amount;
    private Passagers passagers;
    private Place place;
    private Flight flightDeparture;
    private Flight flightArrival;
    private Vehicle vehicle;
    private Date date;
    private Duration duration;

    public Bill(final Address address, final Passagers passagers, final Place place, final Flight flightDeparture, final Flight flightArrival, final Vehicle vehicle, final Date date, final Duration duration) {
        this.num = BillService.getNew();
        this.address = address;
        this.amount = new Amount(0);
        this.passagers = passagers;
        this.place = place;
        this.flightDeparture = flightDeparture;
        this.flightArrival = flightArrival;
        this.vehicle = vehicle;
        this.date = date;
        this.duration = duration;
        Bill.CalculateAmount(this);
    }

    public Bill() {
        this(null, null, null, null, null, null, null, null);
    }

    public Reference getNum() {
        return num;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(final Address address) {
        this.address = address;
    }

    public Amount getAmount() {
        return amount;
    }

    public Passagers getPassagers() {
        return passagers;
    }

    public void setPassagers(final Passagers passagers) {
        this.passagers = passagers;
        Bill.CalculateAmount(this);
    }

    public Place getPlace() {
        return place;
    }

    public void setPlace(final Place place) {
        this.place = place;
    }

    public Flight getFlightDeparture() {
        return flightDeparture;
    }

    public void setFlightDeparture(final Flight flightDeparture) {
        this.flightDeparture = flightDeparture;
    }

    public Flight getFlightArrival() {
        return flightArrival;
    }

    public void setFlightArrival(final Flight flightArrival) {
        this.flightArrival = flightArrival;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(final Vehicle vehicle) {
        this.vehicle = vehicle;
        Bill.CalculateAmount(this);
    }

    public Date getDate() {
        return date;
    }

    public void setDate(final Date date) {
        this.date = date;
    }

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(final Duration duration) {
        this.duration = duration;
        Bill.CalculateAmount(this);
    }

    private static void CalculateAmount(Bill bill) {
        float amount = 0;
        if (bill.getPassagers().getNumber() > 4) {
            amount += 7.5;
        }
        if (bill.getVehicle().getCategory().getCategory() == TypeVehicleCategory.Truck) {
            amount += 20;
        }
        amount += 25 * bill.getDuration().getDuration();
        bill.amount = new Amount(amount);
    }
}
