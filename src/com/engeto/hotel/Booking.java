package com.engeto.hotel;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Booking {
    private Room rezervationRoom;
    private LocalDate rezervationStart;
    private LocalDate rezervationEnd;
    private List<Guest> rezervationGuests = new ArrayList<>();


    public Booking(Room rezervationRoom, LocalDate rezervationStart, LocalDate rezervationEnd, List<Guest> rezervationGuests) {
        this.rezervationRoom = rezervationRoom;
        this.rezervationStart = rezervationStart;
        this.rezervationEnd = rezervationEnd;
        this.rezervationGuests = rezervationGuests;
    }

    public Room getRezervationRoom() {
        return rezervationRoom;
    }

    public LocalDate getRezervationStart() {
        return rezervationStart;
    }

    public LocalDate getRezervationEnd() {
        return rezervationEnd;
    }

    public List<Guest> getRezervationGuests() {
        return rezervationGuests = new ArrayList<>(rezervationGuests);
    }

    public void setRezervationRoom(Room rezervationRoom) {
        this.rezervationRoom = rezervationRoom;
    }

    public void setRezervationStart(LocalDate rezervationStart) {
        this.rezervationStart = rezervationStart;
    }

    public void setRezervationEnd(LocalDate rezervationEnd) {
        this.rezervationEnd = rezervationEnd;
    }

    public void setRezervationGuests(List<Guest> rezervationGuests) {
        this.rezervationGuests = new ArrayList<>(rezervationGuests);
    }
}


