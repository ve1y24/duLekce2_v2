package com.engeto.hotel;

import java.time.format.DateTimeFormatter;
import java.util.List;

public class Print {

    public static void printGuest(Guest printGuest) {

        DateTimeFormatter FOMATTER = DateTimeFormatter.ofPattern("dd. MM. yyyy");

        System.out.println(printGuest.getGuestFirstName()+" "+printGuest.getGuestLastName()
                +" (datum narození: "+FOMATTER.format(printGuest.getGuestBirthDate())+")");
    }

    public static void printRoom(Room tiskPokoj) {
        String balkon;
        String vyhled;

        if (tiskPokoj.isHasBalkoon()) {
            balkon="ANO";
        }
        else {
            balkon="NE";
        }

        if (tiskPokoj.isHasSeeView()) {
            vyhled="ANO";
        }
        else {
            vyhled="NE";
        }

        System.out.println(tiskPokoj.getNumberOfBeds()
                +"-lůžkový pokoj č." + tiskPokoj.getRoomNumber()
                +" za cenu " + tiskPokoj.getRoomPrice() +" Kč, "
                +"balkón: " + balkon
                + ", výhled na moře: " + vyhled);
    }

    public static void printRezervation(List<Booking> rezervationALL){
        DateTimeFormatter FOMATTER = DateTimeFormatter.ofPattern("dd. MM. yyyy");
        for (Booking x1 : rezervationALL) {
            System.out.println("Pokoj č. "+x1.getRezervationRoom()
                    + " je rezervovaný v období od "+FOMATTER.format(x1.getRezervationStart())
                    + " do "+FOMATTER.format(x1.getRezervationEnd())
                    + " pro ");
            for (Guest x2 : x1.getRezervationGuests() ) {
                System.out.print(x2.getGuestFirstName()+" ");
            }
        }

    }


}
