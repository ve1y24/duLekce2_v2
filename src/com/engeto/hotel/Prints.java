package com.engeto.hotel;

import java.time.format.DateTimeFormatter;
import java.util.List;

public class Prints {

    public static void tiskHosta(Guest tiskHost) {

        DateTimeFormatter FOMATTER = DateTimeFormatter.ofPattern("dd. MM. yyyy");

        System.out.println(tiskHost.getJmenoHosta()+" "+tiskHost.getPrijmeniHosta()
                +" (datum narození: "+FOMATTER.format(tiskHost.getDatumNarozeni())+")");
    }

    public static void tiskPokoje(Room tiskPokoj) {
        String balkon;
        String vyhled;

        if (tiskPokoj.isMaBalkon()) {
            balkon="ANO";
        }
        else {
            balkon="NE";
        }

        if (tiskPokoj.isMaVyhledNaMore()) {
            vyhled="ANO";
        }
        else {
            vyhled="NE";
        }

        System.out.println(tiskPokoj.getPocetLukzek()
                +"-lůžkový pokoj č." + tiskPokoj.getCisloPokoje()
                +" za cenu " + tiskPokoj.getcenaPokoje() +" Kč, "
                +"balkón: " + balkon
                + ", výhled na moře: " + vyhled);
    }

    public static void tiskRezervaci (List<Booking> rezervaceVsechny){
        DateTimeFormatter FOMATTER = DateTimeFormatter.ofPattern("dd. MM. yyyy");
        for (Booking pomocna : rezervaceVsechny) {
            System.out.println("Pokoj č. "+pomocna.getCisloPokoje()
                    + " je rezervovaný v období od "+FOMATTER.format(pomocna.getZacatekRezervace())
                    + " do "+FOMATTER.format(pomocna.getKonecRezervace())
                    + " pro ");
            for (Guest pomocna2 : pomocna.getHosteRezervace() ) {
                System.out.print(pomocna2.getJmenoHosta()+" ");
            }
        }

    }


}
