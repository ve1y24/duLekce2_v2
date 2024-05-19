package com.engeto.hotel;

import java.time.LocalDate;

public class Guest {
    String jmenoHosta;
    String prijmeniHosta;
    LocalDate datumNarozeni;

    public Guest(String jmenoHosta, String prijmeniHosta, LocalDate datumNarozeni) {
        this.jmenoHosta = jmenoHosta;
        this.prijmeniHosta = prijmeniHosta;
        this.datumNarozeni = datumNarozeni;
    }

    public String getJmenoHosta() {
        return jmenoHosta;
    }

    public String getPrijmeniHosta() {
        return prijmeniHosta;
    }

    public LocalDate getDatumNarozeni() {
        return datumNarozeni;
    }

    public void setJmenoHosta(String jmenoHosta) {
        this.jmenoHosta = jmenoHosta;
    }

    public void setPrijmeniHosta(String prijmeniHosta) {
        this.prijmeniHosta = prijmeniHosta;
    }

    public void setDatumNarozeni(LocalDate datumNarozeni) {
        this.datumNarozeni = datumNarozeni;
    }
}
