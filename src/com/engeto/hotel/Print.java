package com.engeto.hotel;

import java.time.format.DateTimeFormatter;
import java.util.List;

public class Print {

    public static void printGuest(Guest printGuest) {

        DateTimeFormatter FOMATTER = DateTimeFormatter.ofPattern("dd. MM. yyyy");

        System.out.println(printGuest.getGuestFirstName()+" "+printGuest.getGuestLastName()
                +" (datum narození: "+FOMATTER.format(printGuest.getGuestBirthDate())+")");
    }

    public static void PrintRoom(Room printRoom) {
        String balcoon;
        String view;

        if (printRoom.isHasBalkoon()) {
            balcoon="ANO";
        }
        else {
            balcoon="NE";
        }

        if (printRoom.isHasSeeView()) {
            view="ANO";
        }
        else {
            view="NE";
        }

        System.out.println(printRoom.getNumberOfBeds()
                +"-lůžkový pokoj č." + printRoom.getRoomNumber()
                +" za cenu " + printRoom.getRoomPrice() +" Kč, "
                +"balkón: " + balcoon
                + ", výhled na moře: " + view);
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
