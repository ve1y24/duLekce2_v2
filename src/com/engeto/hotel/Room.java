package com.engeto.hotel;

public class Room {
    int roomNumber;
    int numberOfBeds;
    boolean hasBalkoon;
    boolean hasSeeView;
    int roomPrice;

    public Room(int roomNumber, int numberOfBeds, boolean hasBalkoon, boolean hasSeeView, int roomPrice) {
        this.roomNumber = roomNumber;
        this.numberOfBeds = numberOfBeds;
        this.hasBalkoon = hasBalkoon;
        this.hasSeeView = hasSeeView;
        this.roomPrice = roomPrice;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }
    public int getcenaPokoje() {
        return roomPrice;
    }

    public boolean isHasBalkoon() {
        return hasBalkoon;
    }

    public boolean isHasSeeView() {
        return hasSeeView;
    }

    public int iscenaPokoje() {
        return roomPrice;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public void setHasBalkoon(boolean hasBalkoon) {
        this.hasBalkoon = hasBalkoon;
    }

    public void setHasSeeView(boolean hasSeeView) {
        this.hasSeeView = hasSeeView;
    }
    public void setcenaPokoje(int cenaPokoje) {
        this.roomPrice = cenaPokoje;
    }
}
