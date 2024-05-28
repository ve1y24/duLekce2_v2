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

        Room pokoj1 = new Room(1,1,true,true,1000);
        Room pokoj2 = new Room(2,1,true,true,1000);
        Room pokoj3 = new Room(3,3,false,true,2400);

        Print.printRoom(pokoj1);
        Print.printRoom(pokoj2);
        Print.printRoom(pokoj3);

        LocalDate datumOd1 = LocalDate.of(2021,7,19);
        LocalDate datumDo1 = LocalDate.of(2021,7,26);
        List<Guest> hosteRezervace1 = new ArrayList<>();
        hosteRezervace1.add(host1);
        Booking rezervace1 = new Booking(1, datumOd1, datumDo1, hosteRezervace1);

        List<Booking> rezervaceALL = new ArrayList<>();
        rezervaceALL.add(rezervace1);

        LocalDate datumOd2 = LocalDate.of(2021,9,1);
        LocalDate datumDo2 = LocalDate.of(2021,9,14);
        List<Guest> hosteRezervace2 = new ArrayList<>();
        hosteRezervace2.add(host1);
        hosteRezervace2.add(host2);
        Booking rezervace2 = new Booking(3, datumOd2, datumDo2, hosteRezervace2);
        rezervaceALL.add(rezervace2);

        Print.printRezervation(rezervaceALL);

    }
