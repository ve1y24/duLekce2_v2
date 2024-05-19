package com.engeto.hotel;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Booking {
    int cisloPokoje;
    LocalDate zacatekRezervace;
    LocalDate konecRezervace;
    List<Guest> hosteRezervace = new ArrayList<>();


    public Booking(int cisloPokoje, LocalDate zacatekRezervace, LocalDate konecRezervace, List<Guest> hosteRezervace) {
        this.cisloPokoje = cisloPokoje;
        this.zacatekRezervace = zacatekRezervace;
        this.konecRezervace = konecRezervace;
        this.hosteRezervace = hosteRezervace;
    }

    public int getCisloPokoje() {
        return cisloPokoje;
    }

    public LocalDate getZacatekRezervace() {
        return zacatekRezervace;
    }

    public LocalDate getKonecRezervace() {
        return konecRezervace;
    }

    public List<Guest> getHosteRezervace() {
        return hosteRezervace;
    }

    public void setCisloPokoje(int cisloPokoje) {
        this.cisloPokoje = cisloPokoje;
    }

    public void setZacatekRezervace(LocalDate zacatekRezervace) {
        this.zacatekRezervace = zacatekRezervace;
    }

    public void setKonecRezervace(LocalDate konecRezervace) {
        this.konecRezervace = konecRezervace;
    }

    public void setHosteRezervace(List<Guest> hosteRezervace) {
        this.hosteRezervace = hosteRezervace;
    }
}


