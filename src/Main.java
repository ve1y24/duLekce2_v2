import com.engeto.hotel.Guest;
import com.engeto.hotel.Room;
import com.engeto.hotel.Booking;
import com.engeto.hotel.Print;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

    public static void main(String[] args) {

        Guest host1 = new Guest("Adéla","Malíková",LocalDate.of(1993, 3, 13));
        Guest host2 = new Guest("Jana","Dvořáčka",LocalDate.of(1995, 5, 5));

        Print.printGuest(host1);
        Print.printGuest(host2);

        Room room1 = new Room(1,1,true,true,1000);
        Room room2 = new Room(2,1,true,true,1000);
        Room room3 = new Room(3,3,false,true,2400);

        Print.printRoom(room1);
        Print.printRoom(room2);
        Print.printRoom(room3);

        LocalDate dateFrom1 = LocalDate.of(2021,7,19);
        LocalDate dateTo1 = LocalDate.of(2021,7,26);
        List<Guest> rezervation1Guests = new ArrayList<>();
        rezervation1Guests.add(host1);
        Booking rezervation1 = new Booking(room1, dateFrom1, dateTo1, rezervation1Guests);

        List<Booking> rezervationAll = new ArrayList<>();
        rezervationAll.add(rezervation1);

        LocalDate dateFrom2 = LocalDate.of(2021,9,1);
        LocalDate dateTo2 = LocalDate.of(2021,9,14);
        List<Guest> rezervation2Guests = new ArrayList<>();
        rezervation2Guests.add(host1);
        rezervation2Guests.add(host2);

        Booking rezervace2 = new Booking(room3, dateFrom2, dateTo2, rezervation2Guests);
        rezervationAll.add(rezervace2);

        Print.printRezervation(rezervationAll);

    }
