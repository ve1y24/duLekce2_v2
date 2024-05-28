package com.engeto.hotel;

import java.time.LocalDate;

public class Guest {
    String guestFirstName;
    String guestLastName;
    LocalDate guestBirthDate;

    public Guest(String guestFirstName, String guestLastName, LocalDate guestBirthDate) {
        this.guestFirstName = guestFirstName;
        this.guestLastName = guestLastName;
        this.guestBirthDate = guestBirthDate;
    }

    public String getGuestFirstName() {
        return guestFirstName;
    }

    public String getGuestLastName() {
        return guestLastName;
    }

    public LocalDate getGuestBirthDate() {
        return guestBirthDate;
    }

    public void setGuestFirstName(String guestFirstName) {
        this.guestFirstName = guestFirstName;
    }

    public void setGuestLastName(String guestLastName) {
        this.guestLastName = guestLastName;
    }

    public void setGuestBirthDate(LocalDate guestBirthDate) {
        this.guestBirthDate = guestBirthDate;
    }
}
