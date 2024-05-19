package com.engeto.hotel;

public class Room {
    int cisloPokoje;
    int pocetLukzek;
    boolean maBalkon;
    boolean maVyhledNaMore;
    int cenaPokoje;

    public Room(int cisloPokoje, int pocetLuzek, boolean maBalkon, boolean maVyhledNaMore, int cenaPokoje) {
        this.cisloPokoje = cisloPokoje;
        this.pocetLukzek = pocetLuzek;
        this.maBalkon = maBalkon;
        this.maVyhledNaMore = maVyhledNaMore;
        this.cenaPokoje = cenaPokoje;
    }

    public int getCisloPokoje() {
        return cisloPokoje;
    }

    public int getPocetLukzek() {
        return pocetLukzek;
    }
    public int getcenaPokoje() {
        return cenaPokoje;
    }

    public boolean isMaBalkon() {
        return maBalkon;
    }

    public boolean isMaVyhledNaMore() {
        return maVyhledNaMore;
    }

    public int iscenaPokoje() {
        return cenaPokoje;
    }

    public void setCisloPokoje(int cisloPokoje) {
        this.cisloPokoje = cisloPokoje;
    }

    public void setPocetLukzek(int pocetLukzek) {
        this.pocetLukzek = pocetLukzek;
    }

    public void setMaBalkon(boolean maBalkon) {
        this.maBalkon = maBalkon;
    }

    public void setMaVyhledNaMore(boolean maVyhledNaMore) {
        this.maVyhledNaMore = maVyhledNaMore;
    }
    public void setcenaPokoje(int cenaPokoje) {
        this.cenaPokoje = cenaPokoje;
    }
}
// ******************************************************************************************
