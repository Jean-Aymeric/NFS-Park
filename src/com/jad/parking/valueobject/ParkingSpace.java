package com.jad.parking.valueobject;

public class ParkingSpace {
    private final String sector;
    private final int row;
    private final int column;

    public ParkingSpace(final String sector, final int row, final int column) {
        this.sector = sector;
        this.row = row;
        this.column = column;
    }

    public String getSector() {
        return sector;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }
}
