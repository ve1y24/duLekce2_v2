package com.engeto.hotel;

import java.time.format.DateTimeFormatter;
import java.util.List;

public class Print {

    public static void printGuest(Guest tiskHost) {

        DateTimeFormatter FOMATTER = DateTimeFormatter.ofPattern("dd. MM. yyyy");

        System.out.println(tiskHost.getGuestFirstName()+" "+tiskHost.getGuestLastName()
                +" (datum narození: "+FOMATTER.format(tiskHost.getGuestBirthDate())+")");
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
                +" za cenu " + tiskPokoj.getcenaPokoje() +" Kč, "
                +"balkón: " + balkon
                + ", výhled na moře: " + vyhled);
    }

    public static void printRezervation(List<Booking> rezervaceVsechny){
        DateTimeFormatter FOMATTER = DateTimeFormatter.ofPattern("dd. MM. yyyy");
        for (Booking pomocna : rezervaceVsechny) {
            System.out.println("Pokoj č. "+pomocna.getrezervationRoom()
                    + " je rezervovaný v období od "+FOMATTER.format(pomocna.getRezervationStart())
                    + " do "+FOMATTER.format(pomocna.getRezervationEnd())
                    + " pro ");
            for (Guest pomocna2 : pomocna.getRezervationGuests() ) {
                System.out.print(pomocna2.getGuestFirstName()+" ");
            }
        }

    }


}
